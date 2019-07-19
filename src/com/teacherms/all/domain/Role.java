package com.teacherms.all.domain;

import javax.persistence.*;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {

	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROLE_ID")
	private String roleId;

	//角色名称
	@Column(name = "ROLE_NAME")
	private String roleName;

	//角色描述
	@Column(name = "DESCRIPTION")
	private String description;

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(String roleId) {
		this.roleId = roleId;
	}

	/** full constructor */
	public Role(String roleId, String roleName, String description) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.description = description;
	}

	// Property accessors

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}