package com.teacherms.all.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user")
public class User implements java.io.Serializable {

	// Fields
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@Column(name = "UUID")
	private String uuid;

	@Column(name = "USER_ID",unique=true)
	private String userId;

	//用户姓名
	@Column(name = "USER_NAME")
	private String userName;

	//密码
	@Column(name = "PASSWORD")
	private String password;

	//院系（部门）编号
	@Column(name = "DEPARTMENT_ID")
	private String departmentId;

	//角色ID
	@Column(name = "ROLE_ID")
	private String roleId;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public User(String userId, String userName, String password, String departmentId, String roleId) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.departmentId = departmentId;
		this.roleId = roleId;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "User{" +
				"uuid='" + uuid + '\'' +
				", userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", departmentId='" + departmentId + '\'' +
				", roleId='" + roleId + '\'' +
				'}';
	}
}