package com.sun.cics.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_BAS_DEPT database table.
 * 
 */
@Entity
@Table(name="T_BAS_DEPT")
@NamedQuery(name="TBasDept.findAll", query="SELECT t FROM TBasDept t")
public class TBasDept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_BAS_DEPT_FID_GENERATOR", sequenceName="T_BAS_DEPT_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_BAS_DEPT_FID_GENERATOR")
	@Column(name="F_ID")
	private long fId;

	@Temporal(TemporalType.DATE)
	@Column(name="F_CREATE_TIME")
	private Date fCreateTime;

	@Column(name="F_CREATE_USER")
	private BigDecimal fCreateUser;

	@Column(name="F_DEPT_CODE")
	private String fDeptCode;

	@Column(name="F_DEPT_DES")
	private String fDeptDes;

	@Column(name="F_DEPT_IDX")
	private BigDecimal fDeptIdx;

	@Column(name="F_DEPT_NAME")
	private String fDeptName;

	@Temporal(TemporalType.DATE)
	@Column(name="F_LAST_EDIT_TIME")
	private Date fLastEditTime;

	@Column(name="F_LAST_EDIT_USER")
	private BigDecimal fLastEditUser;

	@Column(name="F_P_ID")
	private BigDecimal fPId;

	@Column(name="F_STATUS")
	private String fStatus;

	//bi-directional many-to-one association to TBasOrg
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="F_ORG_ID")
	private TBasOrg TBasOrg;

	public TBasDept() {
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

	public String getFDeptCode() {
		return this.fDeptCode;
	}

	public void setFDeptCode(String fDeptCode) {
		this.fDeptCode = fDeptCode;
	}

	public String getFDeptDes() {
		return this.fDeptDes;
	}

	public void setFDeptDes(String fDeptDes) {
		this.fDeptDes = fDeptDes;
	}

	public BigDecimal getFDeptIdx() {
		return this.fDeptIdx;
	}

	public void setFDeptIdx(BigDecimal fDeptIdx) {
		this.fDeptIdx = fDeptIdx;
	}

	public String getFDeptName() {
		return this.fDeptName;
	}

	public void setFDeptName(String fDeptName) {
		this.fDeptName = fDeptName;
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

	public BigDecimal getFPId() {
		return this.fPId;
	}

	public void setFPId(BigDecimal fPId) {
		this.fPId = fPId;
	}

	public String getFStatus() {
		return this.fStatus;
	}

	public void setFStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public TBasOrg getTBasOrg() {
		return this.TBasOrg;
	}

	public void setTBasOrg(TBasOrg TBasOrg) {
		this.TBasOrg = TBasOrg;
	}

}