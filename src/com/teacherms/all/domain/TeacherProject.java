package com.teacherms.all.domain;

import javax.persistence.*;

/**
 * TeacherProject entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher_project")
public class TeacherProject implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROJECT_ID")
	private String projectId;

	//用户ID
	@Column(name = "USER_ID")
	private String userId;

	//项目名称
	@Column(name = "PROJECT_NAME")
	private String projectName;

	//项目来源
	@Column(name = "PROJECT_SOURCE")
	private String projectSource;

	//成员姓名
	@Column(name = "PROJECT_MEMBER_NAMES")
	private String projectUserNames;

	//成员工号_排名
	@Column(name = "PROJECT_MEMBER_IDS")
	private String projectUserIds;

	//立项编号或批准文号
	@Column(name = "PROJECT_NO")
	private String projectNo;

	//项目类别
	@Column(name = "PROJECT_TYPE")
	private String projectType;

	//立项日期
	@Column(name = "APPROVAL_DATE")
	private String approvalDate;

	//结题验收或鉴定日期
	@Column(name = "END_UP_DATE")
	private String endUpDate;

	//经费（万元）
	@Column(name = "FUNDS")
	private Integer funds;

	//参与教师数
	@Column(name = "MEMBER_NUM")
	private Integer memberNum;

	//级别
	@Column(name = "LEVEL")
	private String level;

	//是否重点
	@Column(name = "IS_IMPORTANT")
	private String isImportant;

	//附件地址
	@Column(name = "ATTACHMENT_PATH")
	private String attachmentPath;

	//数据状态
	@Column(name = "DATA_STATUS")
	private String dataStatus;

	//创建时间
	@Column(name = "CREATE_TIME")
	private String createTime;

	// Constructors

	/** default constructor */
	public TeacherProject() {
	}

	/** minimal constructor */
	public TeacherProject(String projectId) {
		this.projectId = projectId;
	}

	/** full constructor */
	public TeacherProject(String projectId, String userId, String projectName, String projectSource,
			String projectUserNames, String projectUserIds, String projectNo, String projectType, String approvalDate,
			String endUpDate, Integer funds, Integer memberNum, String level, String isImportant, String attachmentPath,
			String dataStatus, String createTime) {
		super();
		this.projectId = projectId;
		this.userId = userId;
		this.projectName = projectName;
		this.projectSource = projectSource;
		this.projectUserNames = projectUserNames;
		this.projectUserIds = projectUserIds;
		this.projectNo = projectNo;
		this.projectType = projectType;
		this.approvalDate = approvalDate;
		this.endUpDate = endUpDate;
		this.funds = funds;
		this.memberNum = memberNum;
		this.level = level;
		this.isImportant = isImportant;
		this.attachmentPath = attachmentPath;
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectSource() {
		return this.projectSource;
	}

	public void setProjectSource(String projectSource) {
		this.projectSource = projectSource;
	}

	public String getProjectUserNames() {
		return projectUserNames;
	}

	public void setProjectUserNames(String projectUserNames) {
		this.projectUserNames = projectUserNames;
	}

	public String getProjectUserIds() {
		return projectUserIds;
	}

	public void setProjectUserIds(String projectUserIds) {
		this.projectUserIds = projectUserIds;
	}

	public String getProjectNo() {
		return this.projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getApprovalDate() {
		return this.approvalDate;
	}

	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getEndUpDate() {
		return this.endUpDate;
	}

	public void setEndUpDate(String endUpDate) {
		this.endUpDate = endUpDate;
	}

	public Integer getFunds() {
		return this.funds;
	}

	public void setFunds(Integer funds) {
		this.funds = funds;
	}

	public Integer getMemberNum() {
		return this.memberNum;
	}

	public void setMemberNum(Integer memberNum) {
		this.memberNum = memberNum;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getIsImportant() {
		return this.isImportant;
	}

	public void setIsImportant(String isImportant) {
		this.isImportant = isImportant;
	}

	public String getAttachmentPath() {
		return this.attachmentPath;
	}

	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
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