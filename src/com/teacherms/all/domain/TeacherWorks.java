package com.teacherms.all.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * TeacherWorks entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher_works")
public class TeacherWorks implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "WORKS_ID")
	private String worksId;

	//用户ID
	@Column(name = "USER_ID")
	private String userId;

	//著作（专著）名称
	@Column(name = "WORKS_NAME")
	private String worksName;

	//著作类别
	@Column(name = "WORKS_TYPE")
	private String worksType;

	//出版社
	@Column(name = "PRESS")
	private String press;

	//ISBN
	@Column(name = "ISBN")
	private String isbn;

	//出版时间
	@Column(name = "PUBLISH_TIME")
	private String publishTime;

	//入选情况
	@Column(name = "SELECTED_SITUATION")
	private String selectedSituation;

	//入选时间
	@Column(name = "SELECTED_DATE")
	private String selectedDate;

	//主编（作者）
	@Column(name = "EDITOR_USER_NAMES")
	private String editorUserNames;

	//主编工号（多个以逗号隔开）_排
	@Column(name = "EDITOR_USER_IDS")
	private String editorUserIds;

	//副主编
	@Column(name = "SUB_EDITOR_USER_NAMES")
	private String subEditorUserNames;

	//副主编工号（多个以逗号隔开）_排名
	@Column(name = "SUB_EDITOR_USER_IDS")
	private String subEditorUserIds;

	//参编
	@Column(name = "ASSOCIATE_EDITOR_USER_NAMES")
	private String associateEditorUserNames;

	//参编工号（多个以逗号隔开）_排名
	@Column(name = "ASSOCIATE_EDITOR_USER_IDS")
	private String associateEditorUserIds;

	//数据状态
	@Column(name = "DATA_STATUS")
	private String dataStatus;

	//创建时间
	@Column(name = "CREATE_TIME")
	private String createTime;

	// Constructors

	/** default constructor */
	public TeacherWorks() {
	}

	/** minimal constructor */
	public TeacherWorks(String worksId) {
		this.worksId = worksId;
	}

	/** full constructor */
	public TeacherWorks(String worksId, String userId, String worksName, String worksType, String press, String isbn,
			String publishTime, String selectedSituation, String selectedDate, String editorUserNames,
			String editorUserIds, String subEditorUserNames, String subEditorUserIds, String associateEditorUserNames,
			String associateEditorUserIds, String dataStatus, String createTime) {
		this.worksId = worksId;
		this.userId = userId;
		this.worksName = worksName;
		this.worksType = worksType;
		this.press = press;
		this.isbn = isbn;
		this.publishTime = publishTime;
		this.selectedSituation = selectedSituation;
		this.selectedDate = selectedDate;
		this.editorUserNames = editorUserNames;
		this.editorUserIds = editorUserIds;
		this.subEditorUserNames = subEditorUserNames;
		this.subEditorUserIds = subEditorUserIds;
		this.associateEditorUserNames = associateEditorUserNames;
		this.associateEditorUserIds = associateEditorUserIds;
		this.dataStatus = dataStatus;
		this.createTime = createTime;
	}

	// Property accessors

	public String getWorksId() {
		return this.worksId;
	}

	public void setWorksId(String worksId) {
		this.worksId = worksId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWorksName() {
		return this.worksName;
	}

	public void setWorksName(String worksName) {
		this.worksName = worksName;
	}

	public String getWorksType() {
		return this.worksType;
	}

	public void setWorksType(String worksType) {
		this.worksType = worksType;
	}

	public String getPress() {
		return this.press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getSelectedSituation() {
		return this.selectedSituation;
	}

	public void setSelectedSituation(String selectedSituation) {
		this.selectedSituation = selectedSituation;
	}

	public String getSelectedDate() {
		return this.selectedDate;
	}

	public void setSelectedDate(String selectedDate) {
		this.selectedDate = selectedDate;
	}

	public String getEditorUserNames() {
		return this.editorUserNames;
	}

	public void setEditorUserNames(String editorUserNames) {
		this.editorUserNames = editorUserNames;
	}

	public String getEditorUserIds() {
		return this.editorUserIds;
	}

	public void setEditorUserIds(String editorUserIds) {
		this.editorUserIds = editorUserIds;
	}

	public String getSubEditorUserNames() {
		return this.subEditorUserNames;
	}

	public void setSubEditorUserNames(String subEditorUserNames) {
		this.subEditorUserNames = subEditorUserNames;
	}

	public String getSubEditorUserIds() {
		return this.subEditorUserIds;
	}

	public void setSubEditorUserIds(String subEditorUserIds) {
		this.subEditorUserIds = subEditorUserIds;
	}

	public String getAssociateEditorUserNames() {
		return this.associateEditorUserNames;
	}

	public void setAssociateEditorUserNames(String associateEditorUserNames) {
		this.associateEditorUserNames = associateEditorUserNames;
	}

	public String getAssociateEditorUserIds() {
		return this.associateEditorUserIds;
	}

	public void setAssociateEditorUserIds(String associateEditorUserIds) {
		this.associateEditorUserIds = associateEditorUserIds;
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