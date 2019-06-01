package com.teacherms.studentinfomanage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teacherms.all.domain.Department;
import com.teacherms.studentinfomanage.dao.StudentDao;
import com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo;

@Component
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public boolean setInfo(Object InfoObject) {
		try {
			getSession().save(InfoObject);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateInfo(Object InfoObject) {
		try {
			Session session = getSession();
			session.merge(InfoObject);
			session.saveOrUpdate(InfoObject);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateInfo(Object infoObject, String hql) {
		boolean falg = true;
		try {
//			System.out.println(hql);
			Session session = getSession();
			Query queryupdate = session.createQuery(hql);
			int ret = queryupdate.executeUpdate();
			if (ret != 1) {
				falg = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			falg = false;
		}
		return falg;
	}

	@Override
	public Object getInfoById(String tableName, String idName, String idValue) {
		return getSession().createQuery("from " + tableName + " where " + idName + " = ?").setString(0, idValue)
				.uniqueResult();
	}

	@Override
	public boolean deleteInfo(Object obj) {
		try {
			getSession().delete(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public StudentInfoAndOtherInfo getStudentOneInfo(String tableName, String iDName, String iDValue) {
		String hql = null;

		if ("StudentClass".equals(tableName)) {
			hql = "select new com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo(t) from StudentClass t where t."
					+ iDName + " = '" + iDValue + "'";
		} else {
			hql = "select new com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo(t,u) from " + tableName
					+ " t,StudentInfo u where u.studentId=t.studentId and t." + iDName + " = '" + iDValue + "'";
		}
//		System.out.println(hql);
		return (StudentInfoAndOtherInfo) getSession().createQuery(hql).uniqueResult();
		/*
		 * return (StudentInfoAndOtherInfo)
		 * getSession().createCriteria(hql).setString(1, iDName).setString(2,
		 * iDValue) .uniqueResult();
		 */
	}

	@Override
	public List<StudentInfoAndOtherInfo> getStudentAllInfo(String tableName) {
		String hql = "";
		if (!"StudentClass".equals(tableName)) {
			hql = "select new com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo(t,u) from " + tableName
					+ " t,StudentInfo u where t.studentId=u.studentId and t.dataStatus='" + 3 + "'";

		} else {
			hql = " from " + tableName;
		}
		return getSession().createQuery(hql).list();
	}

	@Override
	public Object getAInfomationByTableId(String tableName, String tableInfoIdName, String tableId) {
		String hql = " from " + tableName + " where " + tableInfoIdName + " = '" + tableId + "'";
		return getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public List<Object> export_getAInfomationByTableId(String tableName, String tableInfoIdName, String query_id) {
		String hql = "from " + tableName + query_id;
		return getSession().createQuery(hql).list();
	}

	@Override
	public Department getDepartmentById(String departmentId) {
		String hql = " from Department where departmentId = " + departmentId;
		return (Department) getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public List<Object> getAllStatusInfo(String table, String time, String status, String collegeName,
			String multi_condition, String fuzzy) {
		String hql = "";
		if ("StudentInfo".equals(table)) {
			hql = "select new com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo(u) from " + table
					+ " t,StudentInfo u,Department d where u.studentId=t.studentId and u.departmentId=d.departmentId and d.departmentName like '"
					+ collegeName + "' and t.dataStatus like '" + status + "'" + time + multi_condition + fuzzy;
		} else if (!"StudentClass".equals(table)) {
			hql = "select new com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo(t,u) from " + table
					+ " t,StudentInfo u,Department d where u.studentId=t.studentId and u.departmentId=d.departmentId and d.departmentName like '"
					+ collegeName + "' and t.dataStatus like '" + status + "'" + time + multi_condition + fuzzy;
		}else if("StudentClass".equals(table)){
			hql = "select new com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo(t,u) from " + table
					+ " t,StudentInfo u,Department d where u.studentId=t.userId and u.departmentId=d.departmentId and d.departmentName like '"
					+ collegeName + "' and t.dataStatus like '" + status + "'" + time + multi_condition + fuzzy;
		}
		hql = hql + " order by t.createTime desc";
//		System.out.println(hql);
		return getSession().createQuery(hql).list();
	}

}
