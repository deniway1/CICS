package com.sun.cics.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_BAS_ROLE database table.
 * 
 */
@Entity
@Table(name="T_BAS_ROLE")
@NamedQuery(name="TBasRole.findAll", query="SELECT t FROM TBasRole t")
public class TBasRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_BAS_ROLE_FROLEID_GENERATOR", sequenceName="T_BAS_ROLE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_BAS_ROLE_FROLEID_GENERATOR")
	@Column(name="F_ROLE_ID")
	private long fRoleId;

	@Temporal(TemporalType.DATE)
	@Column(name="F_CREATE_TIME")
	private Date fCreateTime;

	@Column(name="F_CREATE_USER")
	private BigDecimal fCreateUser;

	@Temporal(TemporalType.DATE)
	@Column(name="F_LAST_EDIT_TIME")
	private Date fLastEditTime;

	@Column(name="F_LAST_EDIT_USER")
	private BigDecimal fLastEditUser;

	@Column(name="F_ROLE_NAME")
	private String fRoleName;

	@Column(name="F_STATUS")
	private String fStatus;

	//bi-directional many-to-one association to RelRoleModule
	@OneToMany(mappedBy="TBasRole")
	private List<RelRoleModule> relRoleModules;

	//bi-directional many-to-one association to RelUserRole
	@OneToMany(mappedBy="TBasRole")
	private List<RelUserRole> relUserRoles;

	public TBasRole() {
	}

	public long getFRoleId() {
		return this.fRoleId;
	}

	public void setFRoleId(long fRoleId) {
		this.fRoleId = fRoleId;
	}

	public Date getFCreateTime() {
		return this.fCreateTime;
	}

	public void setFCreateTime(Date fCreateTime) {
		this.fCreateTime = fCreateTime;
	}

	public BigDecimal getFCreateUser() {
		return this.fCreateUser;
	}

	public void setFCreateUser(BigDecimal fCreateUser) {
		this.fCreateUser = fCreateUser;
	}

	public Date getFLastEditTime() {
		return this.fLastEditTime;
	}

	public void setFLastEditTime(Date fLastEditTime) {
		this.fLastEditTime = fLastEditTime;
	}

	public BigDecimal getFLastEditUser() {
		return this.fLastEditUser;
	}

	public void setFLastEditUser(BigDecimal fLastEditUser) {
		this.fLastEditUser = fLastEditUser;
	}

	public String getFRoleName() {
		return this.fRoleName;
	}

	public void setFRoleName(String fRoleName) {
		this.fRoleName = fRoleName;
	}

	public String getFStatus() {
		return this.fStatus;
	}

	public void setFStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public List<RelRoleModule> getRelRoleModules() {
		return this.relRoleModules;
	}

	public void setRelRoleModules(List<RelRoleModule> relRoleModules) {
		this.relRoleModules = relRoleModules;
	}

	public RelRoleModule addRelRoleModule(RelRoleModule relRoleModule) {
		getRelRoleModules().add(relRoleModule);
		relRoleModule.setTBasRole(this);

		return relRoleModule;
	}

	public RelRoleModule removeRelRoleModule(RelRoleModule relRoleModule) {
		getRelRoleModules().remove(relRoleModule);
		relRoleModule.setTBasRole(null);

		return relRoleModule;
	}

	public List<RelUserRole> getRelUserRoles() {
		return this.relUserRoles;
	}

	public void setRelUserRoles(List<RelUserRole> relUserRoles) {
		this.relUserRoles = relUserRoles;
	}

	public RelUserRole addRelUserRole(RelUserRole relUserRole) {
		getRelUserRoles().add(relUserRole);
		relUserRole.setTBasRole(this);

		return relUserRole;
	}

	public RelUserRole removeRelUserRole(RelUserRole relUserRole) {
		getRelUserRoles().remove(relUserRole);
		relUserRole.setTBasRole(null);

		return relUserRole;
	}

}