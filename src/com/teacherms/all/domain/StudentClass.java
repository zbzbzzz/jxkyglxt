package com.teacherms.all.domain;

/**
 * StudentClass entity. @author MyEclipse Persistence Tools
 */

public class StudentClass implements java.io.Serializable {

	// Fields

	private String classId;
	private String className;
	private String userId;
	private String dataStatus;
	private String createTime;

	// Constructors

	/** default constructor */
	public StudentClass() {
	}

	/** minimal constructor */
	public StudentClass(String classId) {
		this.classId = classId;
	}

	/** full constructor */
	public StudentClass(String classId, String className, String userId, String dataStatus, String createTime) {
		this.classId = classId;
		this.className = className;
		this.userId = userId;
		this.dataStatus = dataStatus;
		this.createTime = createTime;
	}

	// Property accessors

	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

}