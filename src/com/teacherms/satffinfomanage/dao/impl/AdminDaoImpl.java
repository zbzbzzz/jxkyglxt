package com.teacherms.satffinfomanage.dao.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teacherms.all.domain.*;
import com.teacherms.satffinfomanage.dao.AdminDao;
import com.teacherms.satffinfomanage.vo.TableInfoAndUserVo;

@SuppressWarnings("unchecked")
@Component
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private SessionFactory sessionFactory;

	

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public Long getInformationCount(String tableName, String status) {
		String hql = "select count(*) from " + tableName + " where dataStatus= '" + status + "'";
		return (Long) getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public List<Object> getAllStatusInfo(String table, String time, String status, String collegeName,
			String multi_condition, String fuzzy,int toindex,int pageSize) {
		String hql = getHql(table, time, status, collegeName, multi_condition, fuzzy);
		hql = hql + " order by t.createTime desc";
		//解决N+1问题（在缓存中取数据）
		List<Object> list=new ArrayList<Object>();
		Query query=getSession().createQuery(hql);
		query.setFirstResult(toindex);
		query.setMaxResults(pageSize);
		Iterator<Object> it= query.iterate();
		while(it.hasNext()){
			list.add(it.next());
		}
		return list;
	}

	private String getHql(String table, String time, String status, String collegeName, String multi_condition, String fuzzy) {
		String hql = "select t,u from " + table
				+ " t,User u,Department d where u.userId=t.userId and u.departmentId=d.departmentId and d.departmentName like '"
				+ collegeName + "' and t.dataStatus = '" + status + "'" + time + multi_condition + fuzzy;
		if ("TeacherInfo".equals(table)) {
			hql += " and u.roleId!='20'";
		}
		return hql;
	}

	@Override
	public int getAllStatusInfoTotalSize(String table, String time, String status, String collegeName, String multi_condition, String fuzzy, int i, int x) {
		String hql = getHql(table, time, status, collegeName, multi_condition, fuzzy);
		hql ="select count(*) "+hql.substring(hql.indexOf("from"),hql.length());
		Query query=getSession().createQuery(hql);
		return ((Number)query.uniqueResult()).intValue();
	}

	@Override
	public User getUserById(String UserID) {
		String hql = "from User where userId = '" + UserID + "'";
		return (User) getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public TableInfoAndUserVo getInfoById(String tableName, String IdName, String tableId) {
		String hql = "select new com.teacherms.satffinfomanage.vo.TableInfoAndUserVo(t,u) from " + tableName
				+ " t,User u where t.userId=u.userId and t." + IdName + " = '" + tableId + "'";
		return (TableInfoAndUserVo) getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public Object getAInfomationByTableId(String tableName, String tableInfoIdName, String string) {
		String hql = " from " + tableName + " where " + tableInfoIdName + " = '" + string + "'";
		return getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public List<Object> export_getAInfomationByTableId(String tableName, String tableInfoIdName, String query_id) {
		String hql = "from " + tableName + query_id;
		return getSession().createQuery(hql).list();
	}

	@Override
	public boolean updateInfo(Object obj) {
		boolean flag = true;
		try {
			getSession().merge(obj);
			getSession().saveOrUpdate(obj);
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Department getDepartmentById(String departmentId) {
		String hql = " from Department where departmentId = " + departmentId;
		return (Department) getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public String addInfo(Object obj) {
		System.out.println(obj.toString());
		return getSession().save(obj).toString();
	}

	@Override
	public List<String> getUserIdByUserName(String name) {
		String hql = "select u.userId from User u where u.userName like '%" + name + "%'";
		return getSession().createQuery(hql).list();
	}

	@Override
	public Introduction getOneOfIntroduction(String tableId) {
		String hql = "from Introduction where introductionId='" + tableId + "'";
		return (Introduction) getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public boolean modifyIntroduction(Introduction introduction) {
		boolean flag = true;
		try {
			getSession().merge(introduction);
			getSession().saveOrUpdate(introduction);
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteInfo(Introduction introduction) {
		boolean flag = true;
		try {
			getSession().delete(introduction);
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

}
