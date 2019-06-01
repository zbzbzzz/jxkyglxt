package com.teacherms.studentinfomanage.service;

import java.util.ResourceBundle;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.teacherms.all.domain.User;
import com.teacherms.studentinfomanage.vo.StudentInfoAndOtherInfo;

import util.PageVO;

public interface StudentService {
	static final String propertiesPath = ResourceBundle.getBundle("_path").getString("filePath");

	public String setStudentAllInfo(Object InfoObject) throws Exception;

	public String updateStudentAllInfo(Object InfoObject) throws Exception;

	public String deleteStudentInfo(Object InfoObject) throws Exception;

	public StudentInfoAndOtherInfo getStudentOneInfo(String tableName, String tableId) throws Exception;

	public PageVO<StudentInfoAndOtherInfo> getStudentAllInfo(String InfoName, String page) throws Exception;

	public String LiftCuring(String tableName, String tableId, String dataState);

	public XSSFWorkbook getExcel(String export_name, String tableName, String export_id);

	public String getDepartmentNameByDepartmentId(String departmentId, String what);

	public PageVO<Object> getSpecifiedInformationByPaging(String tableName, String string, String time_interval,
			String dataState, String secondaryCollegeInfo, Object infoObjectBytableName, User user, String fuzzy_query);

	public String curingInfomation(Object infoObjectBytableName);
}
