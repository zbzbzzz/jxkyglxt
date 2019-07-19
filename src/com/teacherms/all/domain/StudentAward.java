package com.teacherms.all.domain;

import javax.persistence.*;

/**
 * StudentAward entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student_award")
public class StudentAward implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AWARD_ID")
	private String awardId;

	//名称
	@Column(name = "AWARD_NAME")
	private String awardName;

	//学号
	@Column(name = "STUDENT_ID")
	private String studentId;

	//学生名称
	@Column(name = "STUDENT_NAME")
	private String studentName;

	//类别
	@Column(name = "AWARD_CLASS")
	private String awardClass;

	//授权号
	@Column(name = "AUTHORIZATION_NO")
	private String authorizationNo;

	//获批时间
	@Column(name = "TIME")
	private String time;

	//是否第一发明人
	@Column(name = "FIRST_AWARD")
	private String firstAward;

	//数据状态
	@Column(name = "DATA_STATUS")
	private String dataStatus;

	//修改时间
	@Column(name = "CREATE_TIME")
	private String createTime;

	// Constructors

	/** default constructor */
	public StudentAward() {
	}

	/** minimal constructor */
	public StudentAward(String awardId) {
		this.awardId = awardId;
	}

	/** full constructor */
	public StudentAward(String awardId, String awardName, String studentId, String studentName, String awardClass,
			String authorizationNo, String time, String firstAward, String dataStatus, String createTime) {
		this.awardId = awardId;
		this.awardName = awardName;
		this.studentId = studentId;
		this.studentName = studentName;
		this.awardClass = awardClass;
		this.authorizationNo = authorizationNo;
		this.time = time;
		this.firstAward = firstAward;
		this.dataStatus = dataStatus;
		this.createTime = createTime;
	}

	// Property accessors

	public String getAwardId() {
		return this.awardId;
	}

	public void setAwardId(String awardId) {
		this.awardId = awardId;
	}

	public String getAwardName() {
		return this.awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
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

	public String getAwardClass() {
		return this.awardClass;
	}

	public void setAwardClass(String awardClass) {
		this.awardClass = awardClass;
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

	public String getFirstAward() {
		return this.firstAward;
	}

	public void setFirstAward(String firstAward) {
		this.firstAward = firstAward;
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
		return "StudentAward [awardId=" + awardId + ", awardName=" + awardName + ", studentId=" + studentId
				+ ", studentName=" + studentName + ", awardClass=" + awardClass + ", authorizationNo=" + authorizationNo
				+ ", time=" + time + ", firstAward=" + firstAward + ", dataStatus=" + dataStatus + ", createTime="
				+ createTime + "]";
	}

}