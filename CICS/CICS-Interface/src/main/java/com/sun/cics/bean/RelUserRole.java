package com.sun.cics.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the REL_USER_ROLE database table.
 * 
 */
@Entity
@Table(name="REL_USER_ROLE")
@NamedQuery(name="RelUserRole.findAll", query="SELECT r FROM RelUserRole r")
public class RelUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REL_USER_ROLE_FID_GENERATOR", sequenceName="T_BAS_USER_ROLE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REL_USER_ROLE_FID_GENERATOR")
	@Column(name="F_ID")
	private long fId;

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

	//bi-directional many-to-one association to TBasRole
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="F_ROLE_ID")
	private TBasRole TBasRole;

	//bi-directional many-to-one association to TBasUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="F_USER_ID")
	private TBasUser TBasUser;

	public RelUserRole() {
	}

	public long getFId() {
		return this.fId;
	}

	public void setFId(long fId) {
		this.fId = fId;
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

	public TBasRole getTBasRole() {
		return this.TBasRole;
	}

	public void setTBasRole(TBasRole TBasRole) {
		this.TBasRole = TBasRole;
	}

	public TBasUser getTBasUser() {
		return this.TBasUser;
	}

	public void setTBasUser(TBasUser TBasUser) {
		this.TBasUser = TBasUser;
	}

}