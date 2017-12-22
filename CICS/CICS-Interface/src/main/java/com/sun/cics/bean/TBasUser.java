package com.sun.cics.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_BAS_USER database table.
 * 
 */
@Entity
@Table(name="T_BAS_USER")
@NamedQuery(name="TBasUser.findAll", query="SELECT t FROM TBasUser t")
public class TBasUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_BAS_USER_FID_GENERATOR", sequenceName="T_BAS_USER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_BAS_USER_FID_GENERATOR")
	@Column(name="F_ID")
	private long fId;

	@Column(name="F_ACCOUNT")
	private String fAccount;

	@Temporal(TemporalType.DATE)
	@Column(name="F_CREATE_TIME")
	private Date fCreateTime;

	@Column(name="F_CREATE_USER")
	private BigDecimal fCreateUser;

	@Column(name="F_EMAIL")
	private String fEmail;

	@Temporal(TemporalType.DATE)
	@Column(name="F_LAST_EDIT_TIME")
	private Date fLastEditTime;

	@Column(name="F_LAST_EDIT_USER")
	private BigDecimal fLastEditUser;

	@Column(name="F_PASS_RAND")
	private String fPassRand;

	@Column(name="F_PASSWORD")
	private String fPassword;

	@Column(name="F_PHONE")
	private String fPhone;

	@Column(name="F_STATUS")
	private String fStatus;

	@Column(name="F_USER_TYPE")
	private String fUserType;

	@Column(name="F_USERNAME")
	private String fUsername;

	//bi-directional many-to-one association to RelUserRole
	@OneToMany(mappedBy="TBasUser")
	private List<RelUserRole> relUserRoles;

	public TBasUser() {
	}

	public long getFId() {
		return this.fId;
	}

	public void setFId(long fId) {
		this.fId = fId;
	}

	public String getFAccount() {
		return this.fAccount;
	}

	public void setFAccount(String fAccount) {
		this.fAccount = fAccount;
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

	public String getFEmail() {
		return this.fEmail;
	}

	public void setFEmail(String fEmail) {
		this.fEmail = fEmail;
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

	public String getFPassRand() {
		return this.fPassRand;
	}

	public void setFPassRand(String fPassRand) {
		this.fPassRand = fPassRand;
	}

	public String getFPassword() {
		return this.fPassword;
	}

	public void setFPassword(String fPassword) {
		this.fPassword = fPassword;
	}

	public String getFPhone() {
		return this.fPhone;
	}

	public void setFPhone(String fPhone) {
		this.fPhone = fPhone;
	}

	public String getFStatus() {
		return this.fStatus;
	}

	public void setFStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public String getFUserType() {
		return this.fUserType;
	}

	public void setFUserType(String fUserType) {
		this.fUserType = fUserType;
	}

	public String getFUsername() {
		return this.fUsername;
	}

	public void setFUsername(String fUsername) {
		this.fUsername = fUsername;
	}

	public List<RelUserRole> getRelUserRoles() {
		return this.relUserRoles;
	}

	public void setRelUserRoles(List<RelUserRole> relUserRoles) {
		this.relUserRoles = relUserRoles;
	}

	public RelUserRole addRelUserRole(RelUserRole relUserRole) {
		getRelUserRoles().add(relUserRole);
		relUserRole.setTBasUser(this);

		return relUserRole;
	}

	public RelUserRole removeRelUserRole(RelUserRole relUserRole) {
		getRelUserRoles().remove(relUserRole);
		relUserRole.setTBasUser(null);

		return relUserRole;
	}

}