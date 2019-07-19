package com.teacherms.all.domain;

import javax.persistence.*;

/**
 * TeacherPatent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher_patent")
public class TeacherPatent implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PATENT_ID")
	private String patentId;

	//用户ID
	@Column(name = "USER_ID")
	private String userId;

	//名称
	@Column(name = "PATENT_NAME")
	private String patentName;

	//作者
	@Column(name = "AUTHOR_USER_NAMES")
	private String authorUserNames;

	//作者工号_排名
	@Column(name = "AUTHOR_USER_IDS")
	private String authorUserIds;

	//专利类型
	@Column(name = "PATENT_TYPE")
	private String patentType;

	//授权号
	@Column(name = "AUTHORIZATION_NO")
	private String authorizationNo;

	//获批日期
	@Column(name = "APPROVED_DATE")
	private String approvedDate;

	//是否应用
	@Column(name = "IS_APPLICATION")
	private String isApplication;

	//是否行业联合专利（著作权）
	@Column(name = "SFHYLH")
	private String sfhylh;

	//数据状态
	@Column(name = "DATA_STATUS")
	private String dataStatus;

	//创建时间
	@Column(name = "CREATE_TIME")
	private String createTime;

	// Constructors

	/** default constructor */
	public TeacherPatent() {
	}

	/** minimal constructor */
	public TeacherPatent(String patentId) {
		this.patentId = patentId;
	}

	/** full constructor */
	public TeacherPatent(String patentId, String userId, String patentName, String authorUserNames,
			String authorUserIds, String patentType, String authorizationNo, String approvedDate, String isApplication,
			String sfhylh, String dataStatus, String createTime) {
		this.patentId = patentId;
		this.userId = userId;
		this.patentName = patentName;
		this.authorUserNames = authorUserNames;
		this.authorUserIds = authorUserIds;
		this.patentType = patentType;
		this.authorizationNo = authorizationNo;
		this.approvedDate = approvedDate;
		this.isApplication = isApplication;
		this.sfhylh = sfhylh;
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPatentName() {
		return this.patentName;
	}

	public void setPatentName(String patentName) {
		this.patentName = patentName;
	}

	public String getAuthorUserNames() {
		return this.authorUserNames;
	}

	public void setAuthorUserNames(String authorUserNames) {
		this.authorUserNames = authorUserNames;
	}

	public String getAuthorUserIds() {
		return this.authorUserIds;
	}

	public void setAuthorUserIds(String authorUserIds) {
		this.authorUserIds = authorUserIds;
	}

	public String getPatentType() {
		return this.patentType;
	}

	public void setPatentType(String patentType) {
		this.patentType = patentType;
	}

	public String getAuthorizationNo() {
		return this.authorizationNo;
	}

	public void setAuthorizationNo(String authorizationNo) {
		this.authorizationNo = authorizationNo;
	}

	public String getApprovedDate() {
		return this.approvedDate;
	}

	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getIsApplication() {
		return this.isApplication;
	}

	public void setIsApplication(String isApplication) {
		this.isApplication = isApplication;
	}

	public String getSfhylh() {
		return this.sfhylh;
	}

	public void setSfhylh(String sfhylh) {
		this.sfhylh = sfhylh;
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