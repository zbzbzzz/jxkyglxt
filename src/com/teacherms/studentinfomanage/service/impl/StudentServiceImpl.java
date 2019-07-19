package com.teacherms.studentinfomanage.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacherms.all.domain.Department;
import com.teacherms.all.domain.StudentAward;
import com.teacherms.all.domain.User;
import com.teacherms.studentinfomanage.dao.StudentDao;
import com.teacherms.studentinfomanage.service.StudentService;
import com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo;

import util.ExcelHead;
import util.ExportExcelCollection;
import util.MapUtil;
import util.PageVO;
import util.TimeUtil;
import util.uuid;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	
	@Override
	public String setStudentAllInfo(Object InfoObject) throws Exception {
		
		Class<? extends Object> infoClass = InfoObject.getClass();
		
		// 获取ID并赋值
		/*Field InfoId = infoClass.getDeclaredFields()[0];
		InfoId.setAccessible(true);
		InfoId.set(InfoObject, uuid.getUuid());*/

		// 获取日期并赋值
		Field time = infoClass.getDeclaredField("createTime");
		time.setAccessible(true);
		time.set(InfoObject, TimeUtil.getStringDay());

		// 设置数据状态，初始状态为10
		Field dataStatus = infoClass.getDeclaredField("dataStatus");
		dataStatus.setAccessible(true);
		dataStatus.set(InfoObject, "10");

		return studentDao.setInfo(InfoObject) ? "success" : "error";
	}

	@Override
	public String updateStudentAllInfo(Object InfoObject) throws Exception {
		String res = null;
		Object obj0 = null;
		Class<? extends Object> cla = InfoObject.getClass();
		try {
			// 获取第一个id属性值
			Field f = InfoObject.getClass().getDeclaredFields()[0];
			// 设置可用
			f.setAccessible(true);
			// 获得id值
			String id = (String) f.get(InfoObject);
			if ("".equals(id) || id == null) {
				f.set(InfoObject, uuid.getUuid());
				Field createTime = cla.getDeclaredField("createTime");
				createTime.setAccessible(true);
				createTime.set(InfoObject, TimeUtil.getStringDay());
				obj0 = InfoObject;
			} else {
				obj0 = studentDao.getInfoById(cla.getName(), f.getName(), id);
				Object value_obj = null;
				Object value_obj0 = null;
				for (Field f0 : cla.getDeclaredFields()) {
					f0.setAccessible(true);
					value_obj = f0.get(InfoObject);
					value_obj0 = f0.get(obj0);
					if (!"".equals(value_obj) && value_obj != null && !value_obj.equals(value_obj0)) {
						// 不用value_obj，存在类型转换错误
						f0.set(obj0, f0.get(InfoObject));
					}
				}
			}
			res = studentDao.updateInfo(obj0) ? "success" : "error";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
		// return studentDao.updateInfo(InfoObject,
		// HQL.toString().replaceFirst(",", "")) ? "success" : "error";
	}

	@Override
	public String deleteStudentInfo(Object InfoObject) throws Exception {
		Class<? extends Object> infoClass = InfoObject.getClass();
		// 获取ID并赋值
		Field InfoId = infoClass.getDeclaredFields()[0];
		InfoId.setAccessible(true);
		String idName = InfoId.getName();
		String idValue = (String) InfoId.get(InfoObject);
		String tableName = infoClass.getName();
		return studentDao.deleteInfo(studentDao.getInfoById(tableName, idName, idValue)) ? "success" : "error";
	}

	@Override
	public StudentInfoAndOtherInfo getStudentOneInfo(String tableName, String tableId) throws Exception {
		return studentDao.getStudentOneInfo(tableName, getTableInfoIdName(tableName), tableId);
	}

	@Override
	public PageVO<StudentInfoAndOtherInfo> getStudentAllInfo(String InfoName, String page) throws Exception {
		// 每页记录数
		int pageSize = 10;
		// 页数
		int pageIndex = Integer.parseInt(page);
		// 查询长度
		int toindex = pageSize;
		List<StudentInfoAndOtherInfo> list = studentDao.getStudentAllInfo(InfoName);
		// 总记录数
		int totalSize = list.size();
		// 当所要显示的最大值大于记录数最大值时，每页记录设置为不超过记录数值
		if (pageIndex * pageSize > totalSize) {
			toindex = totalSize - (pageIndex - 1) * pageSize;
		}
		// 设置VO内参数页码，每页记录数，总记录数
		PageVO<StudentInfoAndOtherInfo> pageVO = new PageVO<StudentInfoAndOtherInfo>(pageIndex, pageSize, totalSize);
		pageVO.setObjDatas(list.subList((pageIndex - 1) * pageSize, (pageIndex - 1) * pageSize + toindex));
		return pageVO;
	}


	/**
	 * ---通过查询信息表名字，获取信息表中第一个参数(****Id)的Name
	 * 
	 * @param tableName
	 *            持久层类名称
	 * @return 第一个参数的Name
	 */
	private String getTableInfoIdName(String tableName) {
		String idname = null;
		if (("StudentAward").equals(tableName)) {
			idname = "awardId";
		}
		if (("StudentInfo").equals(tableName)) {
			idname = "studentId";
		}
		if (("StudentPaper").equals(tableName)) {
			idname = "paperId";
		}
		if (("StudentPatent").equals(tableName)) {
			idname = "patentId";
		}
		if (("StudentProject").equals(tableName)) {
			idname = "projectId";
		}
		if (("StudentClass").equals(tableName)) {
			idname = "classId";
		}
		return idname;
	}

	@Override
	public String LiftCuring(String tableName, String tableId, String dataState) {
		Object obj = studentDao.getAInfomationByTableId(tableName, getTableInfoIdName(tableName), tableId);
		try {
			Field f = obj.getClass().getDeclaredField("dataStatus");
			f.setAccessible(true);
			f.set(obj, dataState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		boolean flag = studentDao.updateInfo(obj);
		return flag ? "success" : "error";
	}

	@Override
	public XSSFWorkbook getExcel(String export_name, String tableName, String export_id) {
		String queryInfo = " where " + getTableInfoIdName(tableName) + " in (";
		if ("".equals(export_id) || null != export_id) {
			int index = 0;
			// 分割所要查询的信息表ID
			String[] exportid_arr = export_id.split(",");
			for (String str : exportid_arr) {
				exportid_arr[index] = "'" + str + "'";
				index++;
			}
			queryInfo += Arrays.toString(exportid_arr).replaceAll("[\\[\\]]", "") + ")";
		} else {
			queryInfo = "";
		}

		List<Object> list_all = studentDao.export_getAInfomationByTableId(tableName, null, queryInfo);

		/**
		 * 1.query_num：传入所需要查询的字段
		 * 2.ExcelHead.getExcelHeadArray(tableName)：依据tablename传入表格头信息
		 * 3.MapUtil.java2Map(list_all):将list_all中的对象全部用MapUtil封装到List<Map<String,String>>中
		 * 返回一个execl表
		 */
		XSSFWorkbook workbook = ExportExcelCollection.exportExcel(export_name, ExcelHead.getExcelHeadArray(tableName),
				MapUtil.java2Map(list_all, export_name));
		return workbook;
	}

	@Override
	public String getDepartmentNameByDepartmentId(String departmentId, String what) {
		Department department = studentDao.getDepartmentById(departmentId);
		if ("name".equals(what)) {
			return department.getDepartmentName();
		} else if ("id".equals(what)) {
			return department.getDepartmentId();
		} else
			return department.getDepartmentId();

	}

	@Override
	public PageVO<Object> getSpecifiedInformationByPaging(String tableName, String page, String time_interval,
			String dataState, String collegeName, Object obj, User user, String fuzzy_query) {
		// 每页记录数
		int pageSize = 10;
		// 页数
		int pageIndex = Integer.parseInt(page);
		// 查询坐标
		int toindex = (pageIndex-1)*pageSize;
		// 总记录数
		int totalSize=0;
		// 创建list
		List<Object> list = new ArrayList<Object>();
		// 设置查询时间区间，如果time_interval为空则不执行
		if (!"".equals(time_interval) && time_interval != null) {
			time_interval = "and t.createTime between '" + time_interval.split(",")[0] + "' and '"
					+ time_interval.split(",")[1] + "'";
		}
		// 条件查询块----------------
		boolean haveMulti_condition = false;// 是否包含指定查询的内容,用来判断是否执行模糊查询
		StringBuilder Multi_condition = new StringBuilder();// 指定查询中的字符串
		StringBuffer fuzzy = new StringBuffer();// 模糊查询字符串

		String field_value = "";// 属性中的值
		String field_name = "";// 属性名字
		// 多条件查询
		try {
			if (obj != null) {
				fuzzy.append(" and (");// （模糊查询中or与and混合使用）or使用前先添加and
				Field[] fields = obj.getClass().getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true);
					field_name = field.getName();
					field_value = (String) field.get(obj);
					// 模糊查询
					fuzzy.append(" or t." + field_name + " like '%" + fuzzy_query + "%'");
					// 属性值为空则跳过本次循环
					if ("".equals(field_value) || null == field_value) {
						continue;
					}
					// 判断是否为时间区间
					if (field_name.contains("Date")) {
						Multi_condition.append(" and t." + field_name + " between " + field_value.split(",")[0]
								+ " and " + field_value.split(",")[1]);
					} else {
						Multi_condition.append(" and t." + field_name + "='" + field_value + "'");
					}
					if (!haveMulti_condition) {
						haveMulti_condition = true;
					}
				}
				// 模糊查询用户名称
				fuzzy.append("or u.studentName like '%" + fuzzy_query + "%')");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 用户名字作为单独的一个对象判断
		if (user != null && !"".equals(user.getUserName()) && user.getUserName() != null) {
			Multi_condition.append(" and u.studentName='" + user.getUserName() + "' ");
		}
		// 若用户为系统管理员，则查看所有教师的信息
		if ("萍乡学院".equals(collegeName)) {
			collegeName = "%";
		}
		// 最后判断如果fuzzy_query为空或是null，则不做模糊查询
		if (null == fuzzy_query || "".equals(fuzzy_query)) {
			haveMulti_condition = true;
		}
		// 获取所有信息表中未审核的信息
		if (!"".equals(tableName) && tableName != null) {
			// 指定条件tableName查询
			// haveMulti_condition?"":fuzzy.toString().replaceFirst(" or","")
			// 三目运算，如果已经含有了指定查询内容，则不查询模糊查询内容，反则如果模糊查询有值，进行模糊查询
			// 在之前循环过程中，首位添加or，所以第一位or为多余，应当去掉
			list = studentDao.getAllStatusInfo(tableName, time_interval, dataState, collegeName,
					Multi_condition.toString(), haveMulti_condition ? "" : fuzzy.toString().replaceFirst(" or", ""),toindex,pageSize);
			// 总记录数
			totalSize = studentDao.getAllStatusInfoTotalSize(tableName, time_interval, dataState, collegeName,
					Multi_condition.toString(), haveMulti_condition ? "" : fuzzy.toString().replaceFirst(" or", ""),toindex,pageSize);
		}
		// 设置VO内参数页码，每页记录数，总记录数
		PageVO<Object> pageVO = new PageVO<Object>(pageIndex, pageSize, totalSize);
		pageVO.setObjDatas(list);
		return pageVO;
	}

	@Override
	public String curingInfomation(Object obj) {
		String res = null;
		Object obj0 = null;
		Class<? extends Object> cla = obj.getClass();
		try {
			// 获取第一个id属性值
			Field f = obj.getClass().getDeclaredFields()[0];
			// 设置可用
			f.setAccessible(true);
			// 获得id值
			String id = (String) f.get(obj);
			if ("".equals(id) || id == null) {
				f.set(obj, uuid.getUuid());
				Field createTime = cla.getDeclaredField("createTime");
				createTime.setAccessible(true);
				createTime.set(obj, TimeUtil.getStringDay());
				obj0 = obj;
			} else {
				obj0 = studentDao.getInfoById(cla.getName(), f.getName(), id);
				Object value_obj = null;
				Object value_obj0 = null;
				for (Field f0 : cla.getDeclaredFields()) {
					f0.setAccessible(true);
					value_obj = f0.get(obj);
					value_obj0 = f0.get(obj0);
					if (!"".equals(value_obj) && value_obj != null && !value_obj.equals(value_obj0)) {
						// 不用value_obj，存在类型转换错误
						f0.set(obj0, f0.get(obj));
					}
				}
			}
			res = studentDao.updateInfo(obj0) ? "success" : "error";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
