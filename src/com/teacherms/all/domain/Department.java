package com.teacherms.all.domain;


import javax.persistence.*;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "department")
public class Department implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DEPARTMENT_ID")
	private String departmentId;

	//院系（部门）名称
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;

	//院系（部门）描述
	@Column(name = "DESCRIPTION")
	private String description;

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** minimal constructor */
	public Department(String departmentId) {
		this.departmentId = departmentId;
	}

	/** full constructor */
	public Department(String departmentId, String departmentName, String description) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.description = description;
	}

	// Property accessors

	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}