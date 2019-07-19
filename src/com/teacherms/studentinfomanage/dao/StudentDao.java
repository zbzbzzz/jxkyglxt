package com.teacherms.studentinfomanage.dao;

import java.util.List;

import com.teacherms.all.domain.Department;
import com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo;

public interface StudentDao {

	public boolean setInfo(Object InfoObject);

	public boolean updateInfo(Object InfoObject);

	public Object getInfoById(String tableName, String idName, String idValue);

	public boolean deleteInfo(Object infoById);

	public StudentInfoAndOtherInfo getStudentOneInfo(String tableName, String iDName, String iDValue);

	public List<StudentInfoAndOtherInfo> getStudentAllInfo(String tableName);

	public Object getAInfomationByTableId(String tableName, String tableInfoIdName, String tableId);

	public List<Object> export_getAInfomationByTableId(String tableName, String tableInfoIdName, String queryInfo);

	public Department getDepartmentById(String departmentId);

	public List<Object> getAllStatusInfo(String tableName, String time_interval, String dataState, String collegeName,
			String string, String string2,int i,int x);

	public boolean updateInfo(Object infoObject, String string);
	public int getAllStatusInfoTotalSize(String tableName, String time_interval, String dataState, String collegeName,
										 String string, String string2,int i,int x);

}
