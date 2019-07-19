package com.teacherms.all.domain;

import javax.persistence.*;

/**
 * StudentPatent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student_patent")
public class StudentPatent implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PATENT_ID")
	private String patentId;

	//名称
	@Column(name = "PATENT_NAME")
	private String patentName;

	//学号
	@Column(name = "STUDENT_ID")
	private String studentId;

	//学生名字
	@Column(name = "STUDENT_NAME")
	private String studentName;

	//类别
	@Column(name = "PATENT_CLASS")
	private String patentClass;

	//授权号
	@Column(name = "AUTHORIZATION_NO")
	private String authorizationNo;

	//获批时间
	@Column(name = "TIME")
	private String time;

	//是否第一发明人
	@Column(name = "FIRST_PATENT")
	private String firstPatent;

    //数据状态
	@Column(name = "DATA_STATUS")
	private String dataStatus;

	//修改时间
	@Column(name = "CREATE_TIME")
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