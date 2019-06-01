package com.teacherms.all.domain;

/**
 * StudentPatent entity. @author MyEclipse Persistence Tools
 */

public class StudentPatent implements java.io.Serializable {

	// Fields

	private String patentId;
	private String patentName;
	private String studentId;
	private String studentName;
	private String patentClass;
	private String authorizationNo;
	private String time;
	private String firstPatent;
	private String dataStatus;
	private String createTime;

	// Constructors

	/** default constructor */
	public StudentPatent() {
	}

	/** minimal constructor */
	public StudentPatent(String patentId) {
		this.patentId = patentId;
	}

	/** full constructor */
	public StudentPatent(String patentId, String patentName, String studentId, String studentName, String patentClass,
			String authorizationNo, String time, String firstPatent, String dataStatus, String createTime) {
		this.patentId = patentId;
		this.patentName = patentName;
		this.studentId = studentId;
		this.studentName = studentName;
		this.patentClass = patentClass;
		this.authorizationNo = authorizationNo;
		this.time = time;
		this.firstPatent = firstPatent;
		this.dataStatus = dataStatus;
		this.createTime = createTime;
	}

	// Property accessors

	public String getPatentId() {
		return this.patentId;
	}

	public void setPatentId(String patentId) {
		this.patentId = patentId;
	}

	public String getPatentName() {
		return this.patentName;
	}

	public void setPatentName(String patentName) {
		this.patentName = patentName;
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

	public String getPatentClass() {
		return this.patentClass;
	}

	public void setPatentClass(String patentClass) {
		this.patentClass = patentClass;
	}

	public String getAuthorizationNo() {
		return this.authorizationNo;
	}

	public void setAuthorizationNo(String authorizationNo) {
		this.authorizationNo = authorizationNo;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFirstPatent() {
		return this.firstPatent;
	}

	public void setFirstPatent(String firstPatent) {
		this.firstPatent = firstPatent;
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
		return "StudentPatent [patentId=" + patentId + ", patentName=" + patentName + ", studentId=" + studentId
				+ ", studentName=" + studentName + ", patentClass=" + patentClass + ", authorizationNo="
				+ authorizationNo + ", time=" + time + ", firstPatent=" + firstPatent + ", dataStatus=" + dataStatus
				+ ", createTime=" + createTime + "]";
	}

}