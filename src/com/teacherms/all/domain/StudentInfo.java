package com.teacherms.all.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * StudentInfo entity. @author MyEclipse Persistence Tools
 */

@Entity
@Table(name = "student_info")
public class StudentInfo implements java.io.Serializable {

	// Fields

	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@Column(name = "UUID")
	private String uuid;

	@Column(name = "STUDENT_ID",unique=true)
	private String studentId;

	//姓名
	@Column(name = "STUDENT_NAME")
	private String studentName;

	//年制
	@Column(name = "CALENDAR_YEAR")
	private String calendarYear;

	//入学年份
	@Column(name = "ENROLMENT_YEAR")
	private Integer enrolmentYear;

	//证件类型
	@Column(name = "CERTIFICATE_TYPE")
	private String certificateType;

	//身份证/护照号码
	@Column(name = "CERTIFICATE_NO")
	private String certificateNo;

	//出生年份
	@Column(name = "BIRTH_YEAR")
	private String birthYear;

	//性别
	@Column(name = "SEX")
	private String sex;

	//民族
	@Column(name = "NATION")
	private String nation;

	//政治面貌
	@Column(name = "POLITICAL_STATUS")
	private String politicalStatus;

	//生源地
	@Column(name = "STUDENT_SOURCE")
	private String studentSource;

	//学生类型
	@Column(name = "STUDENT_TYPE")
	private String studentType;

	//招生类型
	@Column(name = "ENROLMENT_TYPE")
	private String enrolmentType;

	//授课方式
	@Column(name = "CLASS_TYPE")
	private String classType;

	//专业代码
	@Column(name = "CLASS_NUMBER")
	private String classNumber;

	//专业名称
	@Column(name = "CLASS_NAME")
	private String className;

	//自主专业名称
	@Column(name = "IN_CLASS_NAME")
	private String inClassName;

	//所在学院
	@Column(name = "DEPARTMENT_ID")
	private Integer departmentId;

	//是否师范类
	@Column(name = "TEACHER_TRAINING")
	private String teacherTraining;

	//是否残疾
	@Column(name = "DEFORMED")
	private String deformed;

	//异动类型
	@Column(name = "CHANGES")
	private String changes;

	//入学学历
	@Column(name = "ENTRANCE_RECORD")
	private String entranceRecord;

	//招生方式
	@Column(name = "ENROLMENT_STYLE")
	private String enrolmentStyle;

	//休退学原因
	@Column(name = "DROPPING_REASON")
	private String droppingReason;

	//户口类型
	@Column(name = "REGISTERED_TYPE")
	private String registeredType;

	//是否授予学位
	@Column(name = "DEGREE")
	private String degree;

	//数据状态
	@Column(name = "DATA_STATUS")
	private String dataStatus;

	//修改时间
	@Column(name = "CREATE_TIME")
	private String createTime;

	// Constructors

	/** default constructor */
	public StudentInfo() {
	}

	/** minimal constructor */
	public StudentInfo(String studentId) {
		this.studentId = studentId;
	}

	/** full constructor */
	public StudentInfo(String studentId, String studentName, String calendarYear, Integer enrolmentYear,
			String certificateType, String certificateNo, String birthYear, String sex, String nation,
			String politicalStatus, String studentSource, String studentType, String enrolmentType, String classType,
			String classNumber, String className, String inClassName, Integer departmentId, String teacherTraining,
			String deformed, String changes, String entranceRecord, String enrolmentStyle, String droppingReason,
			String registeredType, String degree, String dataStatus, String createTime) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.calendarYear = calendarYear;
		this.enrolmentYear = enrolmentYear;
		this.certificateType = certificateType;
		this.certificateNo = certificateNo;
		this.birthYear = birthYear;
		this.sex = sex;
		this.nation = nation;
		this.politicalStatus = politicalStatus;
		this.studentSource = studentSource;
		this.studentType = studentType;
		this.enrolmentType = enrolmentType;
		this.classType = classType;
		this.classNumber = classNumber;
		this.className = className;
		this.inClassName = inClassName;
		this.departmentId = departmentId;
		this.teacherTraining = teacherTraining;
		this.deformed = deformed;
		this.changes = changes;
		this.entranceRecord = entranceRecord;
		this.enrolmentStyle = enrolmentStyle;
		this.droppingReason = droppingReason;
		this.registeredType = registeredType;
		this.degree = degree;
		this.dataStatus = dataStatus;
		this.createTime = createTime;
	}

	// Property accessors

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

	public String getCalendarYear() {
		return this.calendarYear;
	}

	public void setCalendarYear(String calendarYear) {
		this.calendarYear = calendarYear;
	}

	public Integer getEnrolmentYear() {
		return this.enrolmentYear;
	}

	public void setEnrolmentYear(Integer enrolmentYear) {
		this.enrolmentYear = enrolmentYear;
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

	public String getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPoliticalStatus() {
		return this.politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}

	public String getStudentSource() {
		return this.studentSource;
	}

	public void setStudentSource(String studentSource) {
		this.studentSource = studentSource;
	}

	public String getStudentType() {
		return this.studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public String getEnrolmentType() {
		return this.enrolmentType;
	}

	public void setEnrolmentType(String enrolmentType) {
		this.enrolmentType = enrolmentType;
	}

	public String getClassType() {
		return this.classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getClassNumber() {
		return this.classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getInClassName() {
		return this.inClassName;
	}

	public void setInClassName(String inClassName) {
		this.inClassName = inClassName;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getTeacherTraining() {
		return this.teacherTraining;
	}

	public void setTeacherTraining(String teacherTraining) {
		this.teacherTraining = teacherTraining;
	}

	public String getDeformed() {
		return this.deformed;
	}

	public void setDeformed(String deformed) {
		this.deformed = deformed;
	}

	public String getChanges() {
		return this.changes;
	}

	public void setChanges(String changes) {
		this.changes = changes;
	}

	public String getEntranceRecord() {
		return this.entranceRecord;
	}

	public void setEntranceRecord(String entranceRecord) {
		this.entranceRecord = entranceRecord;
	}

	public String getEnrolmentStyle() {
		return this.enrolmentStyle;
	}

	public void setEnrolmentStyle(String enrolmentStyle) {
		this.enrolmentStyle = enrolmentStyle;
	}

	public String getDroppingReason() {
		return this.droppingReason;
	}

	public void setDroppingReason(String droppingReason) {
		this.droppingReason = droppingReason;
	}

	public String getRegisteredType() {
		return this.registeredType;
	}

	public void setRegisteredType(String registeredType) {
		this.registeredType = registeredType;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
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

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "StudentInfo{" +
				"uuid='" + uuid + '\'' +
				", studentId='" + studentId + '\'' +
				", studentName='" + studentName + '\'' +
				", calendarYear='" + calendarYear + '\'' +
				", enrolmentYear=" + enrolmentYear +
				", certificateType='" + certificateType + '\'' +
				", certificateNo='" + certificateNo + '\'' +
				", birthYear='" + birthYear + '\'' +
				", sex='" + sex + '\'' +
				", nation='" + nation + '\'' +
				", politicalStatus='" + politicalStatus + '\'' +
				", studentSource='" + studentSource + '\'' +
				", studentType='" + studentType + '\'' +
				", enrolmentType='" + enrolmentType + '\'' +
				", classType='" + classType + '\'' +
				", classNumber='" + classNumber + '\'' +
				", className='" + className + '\'' +
				", inClassName='" + inClassName + '\'' +
				", departmentId=" + departmentId +
				", teacherTraining='" + teacherTraining + '\'' +
				", deformed='" + deformed + '\'' +
				", changes='" + changes + '\'' +
				", entranceRecord='" + entranceRecord + '\'' +
				", enrolmentStyle='" + enrolmentStyle + '\'' +
				", droppingReason='" + droppingReason + '\'' +
				", registeredType='" + registeredType + '\'' +
				", degree='" + degree + '\'' +
				", dataStatus='" + dataStatus + '\'' +
				", createTime='" + createTime + '\'' +
				'}';
	}
}