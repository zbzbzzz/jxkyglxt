package com.teacherms.all.domain;

/**
 * StudentPaper entity. @author MyEclipse Persistence Tools
 */

public class StudentPaper implements java.io.Serializable {

	// Fields

	private String paperId;
	private String paperName;
	private String studentId;
	private String studentName;
	private String periodical;
	private String publishTime;
	private String includedSituation;
	private String dataStatus;
	private String createTime;

	// Constructors

	/** default constructor */
	public StudentPaper() {
	}

	/** minimal constructor */
	public StudentPaper(String paperId) {
		this.paperId = paperId;
	}

	/** full constructor */
	public StudentPaper(String paperId, String paperName, String studentId, String studentName, String periodical,
			String publishTime, String includedSituation, String dataStatus, String createTime) {
		this.paperId = paperId;
		this.paperName = paperName;
		this.studentId = studentId;
		this.studentName = studentName;
		this.periodical = periodical;
		this.publishTime = publishTime;
		this.includedSituation = includedSituation;
		this.dataStatus = dataStatus;
		this.createTime = createTime;
	}

	// Property accessors

	public String getPaperId() {
		return this.paperId;
	}

	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

	public String getPaperName() {
		return this.paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
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

	public String getPeriodical() {
		return this.periodical;
	}

	public void setPeriodical(String periodical) {
		this.periodical = periodical;
	}

	public String getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getIncludedSituation() {
		return this.includedSituation;
	}

	public void setIncludedSituation(String includedSituation) {
		this.includedSituation = includedSituation;
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
		return "StudentPaper [paperId=" + paperId + ", paperName=" + paperName + ", studentId=" + studentId
				+ ", studentName=" + studentName + ", periodical=" + periodical + ", publishTime=" + publishTime
				+ ", includedSituation=" + includedSituation + ", dataStatus=" + dataStatus + ", createTime="
				+ createTime + "]";
	}

}