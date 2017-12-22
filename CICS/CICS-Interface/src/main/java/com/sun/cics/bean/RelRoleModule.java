package com.sun.cics.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the REL_ROLE_MODULE database table.
 * 
 */
@Entity
@Table(name="REL_ROLE_MODULE")
@NamedQuery(name="RelRoleModule.findAll", query="SELECT r FROM RelRoleModule r")
public class RelRoleModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REL_ROLE_MODULE_FID_GENERATOR", sequenceName="T_BAS_ROLE_PERM_RL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REL_ROLE_MODULE_FID_GENERATOR")
	@Column(name="F_ID")
	private long fId;

	@Column(name="F_ACTION")
	private String fAction;

	@Temporal(TemporalType.DATE)
	@Column(name="F_CREATE_TIME")
	private Date fCreateTime;

	@Column(name="F_CREATE_USER")
	private BigDecimal fCreateUser;

	@Column(name="F_PERM_STATUS")
	private String fPermStatus;

	@Column(name="F_PERM_TYPE")
	private String fPermType;

	@Column(name="F_STATUS")
	private String fStatus;

	//bi-directional many-to-one association to TBasModule
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="F_MODULE_ID")
	private TBasModule TBasModule;

	//bi-directional many-to-one association to TBasRole
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="F_ROLE_ID")
	private TBasRole TBasRole;

	public RelRoleModule() {
	}

	public long getFId() {
		return this.fId;
	}

	public void setFId(long fId) {
		this.fId = fId;
	}

	public String getFAction() {
		return this.fAction;
	}

	public void setFAction(String fAction) {
		this.fAction = fAction;
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

	public String getFPermStatus() {
		return this.fPermStatus;
	}

	public void setFPermStatus(String fPermStatus) {
		this.fPermStatus = fPermStatus;
	}

	public String getFPermType() {
		return this.fPermType;
	}

	public void setFPermType(String fPermType) {
		this.fPermType = fPermType;
	}

	public String getFStatus() {
		return this.fStatus;
	}

	public void setFStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public TBasModule getTBasModule() {
		return this.TBasModule;
	}

	public void setTBasModule(TBasModule TBasModule) {
		this.TBasModule = TBasModule;
	}

	public TBasRole getTBasRole() {
		return this.TBasRole;
	}

	public void setTBasRole(TBasRole TBasRole) {
		this.TBasRole = TBasRole;
	}

}