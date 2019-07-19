package com.teacherms.all.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * TeacherInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher_info")
public class TeacherInfo implements java.io.Serializable {

	// Fields
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@Column(name = "TEACHER_INFO_ID")
	private String teacherInfoId;

	//用户ID
	@Column(name = "USER_ID")
	private String userId;

	//证件类型
	@Column(name = "CERTIFICATE_TYPE")
	private String certificateType;

	//证件号码
	@Column(name = "CERTIFICATE_NO")
	private String certificateNo;

	//民族
	@Column(name = "NATION")
	private String nation;

	//国籍
	@Column(name = "NATIONALITY")
	private String nationality;

	//港澳台
	@Column(name = "G_A_T")
	private String GAT;

	//华侨
	@Column(name = "HUA_QIAO")
	private String huaQiao;

	//政治面貌
	@Column(name = "POLITICAL_STATUS")
	private String politicalStatus;

	//性别
	@Column(name = "SEX")
	private String sex;

	//出生年月
	@Column(name = "BIRTHDAY")
	private String birthday;

	//最高学历
	@Column(name = "HIGHEST_EDUCATION")
	private String highestEducation;

	//最高学位
	@Column(name = "HIGHEST_DEGREE")
	private String highestDegree;

	//学缘
	@Column(name = "LEARN_EDGE_STRUCTURE")
	private String learnEdgeStructure;

	//专业技术职称
	@Column(name = "PROFESSIONAL_TITLE")
	private String professionalTitle;

	//职称级别
	@Column(name = "PROFESSIONAL_GRADE")
	private String professionalGrade;

	//学科类别
	@Column(name = "SUBJECT_CATEGORY")
	private String subjectCategory;

	//参加工作时间
	@Column(name = "WORK_DATE")
	private String workDate;

	//入校时间
	@Column(name = "INDUCTION_DATE")
	private String inductionDate;

	//教师资格证号
	@Column(name = "TEACHER_CERTIFICATE_NO")
	private String teacherCertificateNo;

	//授课类型
	@Column(name = "TEACHING_TYPE")
	private String teachingType;

	//授课状态
	@Column(name = "TEACHING_STATUS")
	private String teachingStatus;

	//任教专业名称
	@Column(name = "TEACHING_PROFESSION_NAME")
	private String teachingProfessionName;

	//任教专业代码
	@Column(name = "TEACHING_PROFESSION_NO")
	private String teachingProfessionNo;

	//专业任教时间
	@Column(name = "PROFESSION_TEACHING_DATE")
	private String professionTeachingDate;

	//是否实验技术人员
	@Column(name = "EXPERIMENTAL_TECHNICAL_PERSONNEL")
	private String experimentalTechnicalPersonnel;

	//是否双师型
	@Column(name = "DOUBLE_TEACHER_TYPE")
	private String doubleTeacherType;

	//是否工程背景
	@Column(name = "ENGINEERING_BACKGROUND")
	private String engineeringBackground;

	//是否行业背景
	@Column(name = "INDUSTRY_BACKGROUND")
	private String industryBackground;

	//行政职务级别
	@Column(name = "ADMINISTRATIVE_RANK")
	private String administrativeRank;

	//研究生导师类型
	@Column(name = "GRADUATE_TUTOR_TYPE")
	private String graduateTutorType;

	//校内指导博士生人数
	@Column(name = "NUMBER_OF_DOCTOR")
	private Integer numberOfDoctor;

	//内指导硕士生人数
	@Column(name = "NUMBER_OF_MASTER")
	private Integer numberOfMaster;

	//职工类型
	@Column(name = "EMPLOYEE_TYPE")
	private String employeeType;

	//录用类型
	@Column(name = "EMPLOYMENT_TYPE")
	private String employmentType;

	//任职状态
	@Column(name = "JOB_STATUE")
	private String jobStatue;

	//异动类型
	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;

	//高校调入
	@Column(name = "UNIVERSITY_TRANSFER")
	private String universityTransfer;

	//本校毕业
	@Column(name = "SCHOOL_GRADUATION")
	private String schoolGraduation;

	//本校调整
	@Column(name = "SCHOOL_ADJUSTMENT")
	private String schoolAdjustment;

	//校外教师类型
	@Column(name = "OFF_CAMPUS_TEACHER_TYPE")
	private String offCampusTeacherType;

	//数据状态
	@Column(name = "DATA_STATUS")
	private String dataStatus;

	//创建时间
	@Column(name = "CREATE_TIME")
	private String createTime;


	// Constructors

	/** default constructor */
	public TeacherInfo() {
	}

	/** minimal constructor */
	public TeacherInfo(String teacherInfoId) {
		this.teacherInfoId = teacherInfoId;
	}

	/** full constructor */
	public TeacherInfo(String teacherInfoId, String userId, String certificateType, String certificateNo, String nation,
			String nationality, String GAT, String huaQiao, String politicalStatus, String sex, String birthday,
			String highestEducation, String highestDegree, String learnEdgeStructure, String professionalTitle,
			String professionalGrade, String subjectCategory, String workDate, String inductionDate,
			String teacherCertificateNo, String teachingType, String teachingStatus, String teachingProfessionName,
			String teachingProfessionNo, String professionTeachingDate, String experimentalTechnicalPersonnel,
			String doubleTeacherType, String engineeringBackground, String industryBackground,
			String administrativeRank, String graduateTutorType, Integer numberOfDoctor, Integer numberOfMaster,
			String employeeType, String employmentType, String jobStatue, String transactionType,
			String universityTransfer, String schoolGraduation, String schoolAdjustment, String offCampusTeacherType,
			String dataStatus, String createTime) {
		this.teacherInfoId = teacherInfoId;
		this.userId = userId;
		this.certificateType = certificateType;
		this.certificateNo = certificateNo;
		this.nation = nation;
		this.nationality = nationality;
		this.GAT = GAT;
		this.huaQiao = huaQiao;
		this.politicalStatus = politicalStatus;
		this.sex = sex;
		this.birthday = birthday;
		this.highestEducation = highestEducation;
		this.highestDegree = highestDegree;
		this.learnEdgeStructure = learnEdgeStructure;
		this.professionalTitle = professionalTitle;
		this.professionalGrade = professionalGrade;
		this.subjectCategory = subjectCategory;
		this.workDate = workDate;
		this.inductionDate = inductionDate;
		this.teacherCertificateNo = teacherCertificateNo;
		this.teachingType = teachingType;
		this.teachingStatus = teachingStatus;
		this.teachingProfessionName = teachingProfessionName;
		this.teachingProfessionNo = teachingProfessionNo;
		this.professionTeachingDate = professionTeachingDate;
		this.experimentalTechnicalPersonnel = experimentalTechnicalPersonnel;
		this.doubleTeacherType = doubleTeacherType;
		this.engineeringBackground = engineeringBackground;
		this.industryBackground = industryBackground;
		this.administrativeRank = administrativeRank;
		this.graduateTutorType = graduateTutorType;
		this.numberOfDoctor = numberOfDoctor;
		this.numberOfMaster = numberOfMaster;
		this.employeeType = employeeType;
		this.employmentType = employmentType;
		this.jobStatue = jobStatue;
		this.transactionType = transactionType;
		this.universityTransfer = universityTransfer;
		this.schoolGraduation = schoolGraduation;
		this.schoolAdjustment = schoolAdjustment;
		this.offCampusTeacherType = offCampusTeacherType;
		this.dataStatus = dataStatus;
		this.createTime = createTime;
	}

	// Property accessors

	public String getTeacherInfoId() {
		return this.teacherInfoId;
	}

	public void setTeacherInfoId(String teacherInfoId) {
		this.teacherInfoId = teacherInfoId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateNo() {
		return this.certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGAT() {
		return this.GAT;
	}

	public void setGAT(String GAT) {
		this.GAT = GAT;
	}

	public String getHuaQiao() {
		return this.huaQiao;
	}

	public void setHuaQiao(String huaQiao) {
		this.huaQiao = huaQiao;
	}

	public String getPoliticalStatus() {
		return this.politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHighestEducation() {
		return this.highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getHighestDegree() {
		return this.highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

	public String getLearnEdgeStructure() {
		return this.learnEdgeStructure;
	}

	public void setLearnEdgeStructure(String learnEdgeStructure) {
		this.learnEdgeStructure = learnEdgeStructure;
	}

	public String getProfessionalTitle() {
		return this.professionalTitle;
	}

	public void setProfessionalTitle(String professionalTitle) {
		this.professionalTitle = professionalTitle;
	}

	public String getProfessionalGrade() {
		return this.professionalGrade;
	}

	public void setProfessionalGrade(String professionalGrade) {
		this.professionalGrade = professionalGrade;
	}

	public String getSubjectCategory() {
		return this.subjectCategory;
	}

	public void setSubjectCategory(String subjectCategory) {
		this.subjectCategory = subjectCategory;
	}

	public String getWorkDate() {
		return this.workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getInductionDate() {
		return this.inductionDate;
	}

	public void setInductionDate(String inductionDate) {
		this.inductionDate = inductionDate;
	}

	public String getTeacherCertificateNo() {
		return this.teacherCertificateNo;
	}

	public void setTeacherCertificateNo(String teacherCertificateNo) {
		this.teacherCertificateNo = teacherCertificateNo;
	}

	public String getTeachingType() {
		return this.teachingType;
	}

	public void setTeachingType(String teachingType) {
		this.teachingType = teachingType;
	}

	public String getTeachingStatus() {
		return this.teachingStatus;
	}

	public void setTeachingStatus(String teachingStatus) {
		this.teachingStatus = teachingStatus;
	}

	public String getTeachingProfessionName() {
		return this.teachingProfessionName;
	}

	public void setTeachingProfessionName(String teachingProfessionName) {
		this.teachingProfessionName = teachingProfessionName;
	}

	public String getTeachingProfessionNo() {
		return this.teachingProfessionNo;
	}

	public void setTeachingProfessionNo(String teachingProfessionNo) {
		this.teachingProfessionNo = teachingProfessionNo;
	}

	public String getProfessionTeachingDate() {
		return this.professionTeachingDate;
	}

	public void setProfessionTeachingDate(String professionTeachingDate) {
		this.professionTeachingDate = professionTeachingDate;
	}

	public String getExperimentalTechnicalPersonnel() {
		return this.experimentalTechnicalPersonnel;
	}

	public void setExperimentalTechnicalPersonnel(String experimentalTechnicalPersonnel) {
		this.experimentalTechnicalPersonnel = experimentalTechnicalPersonnel;
	}

	public String getDoubleTeacherType() {
		return this.doubleTeacherType;
	}

	public void setDoubleTeacherType(String doubleTeacherType) {
		this.doubleTeacherType = doubleTeacherType;
	}

	public String getEngineeringBackground() {
		return this.engineeringBackground;
	}

	public void setEngineeringBackground(String engineeringBackground) {
		this.engineeringBackground = engineeringBackground;
	}

	public String getIndustryBackground() {
		return this.industryBackground;
	}

	public void setIndustryBackground(String industryBackground) {
		this.industryBackground = industryBackground;
	}

	public String getAdministrativeRank() {
		return this.administrativeRank;
	}

	public void setAdministrativeRank(String administrativeRank) {
		this.administrativeRank = administrativeRank;
	}

	public String getGraduateTutorType() {
		return this.graduateTutorType;
	}

	public void setGraduateTutorType(String graduateTutorType) {
		this.graduateTutorType = graduateTutorType;
	}

	public Integer getNumberOfDoctor() {
		return this.numberOfDoctor;
	}

	public void setNumberOfDoctor(Integer numberOfDoctor) {
		this.numberOfDoctor = numberOfDoctor;
	}

	public Integer getNumberOfMaster() {
		return this.numberOfMaster;
	}

	public void setNumberOfMaster(Integer numberOfMaster) {
		this.numberOfMaster = numberOfMaster;
	}

	public String getEmployeeType() {
		return this.employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmploymentType() {
		return this.employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getJobStatue() {
		return this.jobStatue;
	}

	public void setJobStatue(String jobStatue) {
		this.jobStatue = jobStatue;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getUniversityTransfer() {
		return this.universityTransfer;
	}

	public void setUniversityTransfer(String universityTransfer) {
		this.universityTransfer = universityTransfer;
	}

	public String getSchoolGraduation() {
		return this.schoolGraduation;
	}

	public void setSchoolGraduation(String schoolGraduation) {
		this.schoolGraduation = schoolGraduation;
	}

	public String getSchoolAdjustment() {
		return this.schoolAdjustment;
	}

	public void setSchoolAdjustment(String schoolAdjustment) {
		this.schoolAdjustment = schoolAdjustment;
	}

	public String getOffCampusTeacherType() {
		return this.offCampusTeacherType;
	}

	public void setOffCampusTeacherType(String offCampusTeacherType) {
		this.offCampusTeacherType = offCampusTeacherType;
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
		return "TeacherInfo [teacherInfoId=" + teacherInfoId + ", userId=" + userId + ", certificateType="
				+ certificateType + ", certificateNo=" + certificateNo + ", nation=" + nation + ", nationality="
				+ nationality + ", GAT=" + GAT + ", huaQiao=" + huaQiao + ", politicalStatus=" + politicalStatus
				+ ", sex=" + sex + ", birthday=" + birthday + ", highestEducation=" + highestEducation
				+ ", highestDegree=" + highestDegree + ", learnEdgeStructure=" + learnEdgeStructure
				+ ", professionalTitle=" + professionalTitle + ", professionalGrade=" + professionalGrade
				+ ", subjectCategory=" + subjectCategory + ", workDate=" + workDate + ", inductionDate=" + inductionDate
				+ ", teacherCertificateNo=" + teacherCertificateNo + ", teachingType=" + teachingType
				+ ", teachingStatus=" + teachingStatus + ", teachingProfessionName=" + teachingProfessionName
				+ ", teachingProfessionNo=" + teachingProfessionNo + ", professionTeachingDate="
				+ professionTeachingDate + ", experimentalTechnicalPersonnel=" + experimentalTechnicalPersonnel
				+ ", doubleTeacherType=" + doubleTeacherType + ", engineeringBackground=" + engineeringBackground
				+ ", industryBackground=" + industryBackground + ", administrativeRank=" + administrativeRank
				+ ", graduateTutorType=" + graduateTutorType + ", numberOfDoctor=" + numberOfDoctor
				+ ", numberOfMaster=" + numberOfMaster + ", employeeType=" + employeeType + ", employmentType="
				+ employmentType + ", jobStatue=" + jobStatue + ", transactionType=" + transactionType
				+ ", universityTransfer=" + universityTransfer + ", schoolGraduation=" + schoolGraduation
				+ ", schoolAdjustment=" + schoolAdjustment + ", offCampusTeacherType=" + offCampusTeacherType
				+ ", dataStatus=" + dataStatus + ", createTime=" + createTime + "]";
	}

}