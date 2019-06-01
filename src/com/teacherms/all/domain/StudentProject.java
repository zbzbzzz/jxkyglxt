package com.teacherms.all.domain;

/**
 * StudentProject entity. @author MyEclipse Persistence Tools
 */

public class StudentProject implements java.io.Serializable {

	// Fields

	private String projectId;
	private String projectName;
	private String studentId;
	private String studentName;
	private String projectLeading;
	private String userId;
	private String userName;
	private String dataStatus;
	private String createTime;

	// Constructors

	/** default constructor */
	public StudentProject() {
	}

	/** minimal constructor */
	public StudentProject(String projectId) {
		this.projectId = projectId;
	}

	/** full constructor */
	public StudentProject(String projectId, String projectName, String studentId, String studentName,
			String projectLeading, String userId, String userName, String dataStatus, String createTime) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.studentId = studentId;
		this.studentName = studentName;
		this.projectLeading = projectLeading;
		this.userId = userId;
		this.userName = userName;
		this.dataStatus = dataStatus;
		this.createTime = createTime;
	}

	// Property accessors

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getProjectLeading() {
		return this.projectLeading;
	}

	public void setProjectLeading(String projectLeading) {
		this.projectLeading = projectLeading;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDataStatus() {
		return this.dataStatus;
	}

	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "StudentProject [projectId=" + projectId + ", projectName=" + projectName + ", studentId=" + studentId
				+ ", studentName=" + studentName + ", projectLeading=" + projectLeading + ", userId=" + userId
				+ ", userName=" + userName + ", dataStatus=" + dataStatus + ", createTime=" + createTime + "]";
	}

}