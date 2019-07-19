package com.teacherms.all.domain;

import javax.persistence.*;

/**
 * TeacherPaper entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher_paper")
public class TeacherPaper implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAPER_ID")
	private String paperId;

	//用户ID
	@Column(name = "USER_ID")
	private String userId;

	//论文名称
	@Column(name = "PAPER_NAME")
	private String paperName;

	//作者
	@Column(name = "AUTHOR_USER_NAMES")
	private String authorUserNames;

	//作者工号_排名
	@Column(name = "AUTHOR_USER_IDS")
	private String authorUserIds;

	//论文类别
	@Column(name = "PAPER_TYPE")
	private String paperType;

	//发表期刊
	@Column(name = "PERIODICAL")
	private String periodical;

	//期号
	@Column(name = "PERIODICAL_NO")
	private String periodicalNo;

	//发表日期
	@Column(name = "PUBLISH_TIME")
	private String publishTime;

	//收录情况
	@Column(name = "INCLUDED_SITUATION")
	private String includedSituation;

	//他引次数
	@Column(name = "TOTAL_CITATIONS")
	private Integer totalCitations;

	//是否与行业联合发表
	@Column(name = "SFYHYLHFB")
	private String sfyhylhfb;

	//是否与地方联合发表
	@Column(name = "SFYDFLHFB")
	private String sfydflhfb;

	//是否与国际联合发表
	@Column(name = "SFYGJLHFB")
	private String sfygjlhfb;

	//是否是跨学科论文
	@Column(name = "SFSKXKLW")
	private String sfskxklw;

	//成果字数（千字）
	@Column(name = "WORDS_NUM")
	private String wordsNum;

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
	public TeacherPaper() {
	}

	/** minimal constructor */
	public TeacherPaper(String paperId) {
		this.paperId = paperId;
	}

	/** full constructor */
	public TeacherPaper(String paperId, String userId, String paperName, String authorUserNames, String authorUserIds,
			String paperType, String periodical, String periodicalNo, String publishTime, String includedSituation,
			Integer totalCitations, String sfyhylhfb, String sfydflhfb, String sfygjlhfb, String sfskxklw,
			String wordsNum, String attachmentPath, String dataStatus, String createTime) {
		this.paperId = paperId;
		this.userId = userId;
		this.paperName = paperName;
		this.authorUserNames = authorUserNames;
		this.authorUserIds = authorUserIds;
		this.paperType = paperType;
		this.periodical = periodical;
		this.periodicalNo = periodicalNo;
		this.publishTime = publishTime;
		this.includedSituation = includedSituation;
		this.totalCitations = totalCitations;
		this.sfyhylhfb = sfyhylhfb;
		this.sfydflhfb = sfydflhfb;
		this.sfygjlhfb = sfygjlhfb;
		this.sfskxklw = sfskxklw;
		this.wordsNum = wordsNum;
		this.attachmentPath = attachmentPath;
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPaperName() {
		return this.paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
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

	public String getPaperType() {
		return this.paperType;
	}

	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}

	public String getPeriodical() {
		return this.periodical;
	}

	public void setPeriodical(String periodical) {
		this.periodical = periodical;
	}

	public String getPeriodicalNo() {
		return this.periodicalNo;
	}

	public void setPeriodicalNo(String periodicalNo) {
		this.periodicalNo = periodicalNo;
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

	public Integer getTotalCitations() {
		return this.totalCitations;
	}

	public void setTotalCitations(Integer totalCitations) {
		this.totalCitations = totalCitations;
	}

	public String getSfyhylhfb() {
		return this.sfyhylhfb;
	}

	public void setSfyhylhfb(String sfyhylhfb) {
		this.sfyhylhfb = sfyhylhfb;
	}

	public String getSfydflhfb() {
		return this.sfydflhfb;
	}

	public void setSfydflhfb(String sfydflhfb) {
		this.sfydflhfb = sfydflhfb;
	}

	public String getSfygjlhfb() {
		return this.sfygjlhfb;
	}

	public void setSfygjlhfb(String sfygjlhfb) {
		this.sfygjlhfb = sfygjlhfb;
	}

	public String getSfskxklw() {
		return this.sfskxklw;
	}

	public void setSfskxklw(String sfskxklw) {
		this.sfskxklw = sfskxklw;
	}

	public String getWordsNum() {
		return this.wordsNum;
	}

	public void setWordsNum(String wordsNum) {
		this.wordsNum = wordsNum;
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