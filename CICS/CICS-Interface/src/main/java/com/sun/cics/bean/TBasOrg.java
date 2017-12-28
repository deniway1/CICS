package com.sun.cics.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_BAS_ORG database table.
 * 
 */
@Entity
@Table(name="T_BAS_ORG")
@NamedQuery(name="TBasOrg.findAll", query="SELECT t FROM TBasOrg t")
public class TBasOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_BAS_ORG_FID_GENERATOR", sequenceName="T_BAS_ORG_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_BAS_ORG_FID_GENERATOR")
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

	@Column(name="F_ORG_CODE")
	private String fOrgCode;

	@Column(name="F_ORG_DES")
	private String fOrgDes;

	@Column(name="F_ORG_IDX")
	private BigDecimal fOrgIdx;

	@Column(name="F_ORG_NAME")
	private String fOrgName;

	@Column(name="F_STATUS")
	private String fStatus;

	//bi-directional many-to-one association to TBasDept
	@OneToMany(mappedBy="TBasOrg")
	private List<TBasDept> TBasDepts;

	public TBasOrg() {
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

	public String getFOrgCode() {
		return this.fOrgCode;
	}

	public void setFOrgCode(String fOrgCode) {
		this.fOrgCode = fOrgCode;
	}

	public String getFOrgDes() {
		return this.fOrgDes;
	}

	public void setFOrgDes(String fOrgDes) {
		this.fOrgDes = fOrgDes;
	}

	public BigDecimal getFOrgIdx() {
		return this.fOrgIdx;
	}

	public void setFOrgIdx(BigDecimal fOrgIdx) {
		this.fOrgIdx = fOrgIdx;
	}

	public String getFOrgName() {
		return this.fOrgName;
	}

	public void setFOrgName(String fOrgName) {
		this.fOrgName = fOrgName;
	}

	public String getFStatus() {
		return this.fStatus;
	}

	public void setFStatus(String fStatus) {
		this.fStatus = fStatus;
	}

	public List<TBasDept> getTBasDepts() {
		return this.TBasDepts;
	}

	public void setTBasDepts(List<TBasDept> TBasDepts) {
		this.TBasDepts = TBasDepts;
	}

	public TBasDept addTBasDept(TBasDept TBasDept) {
		getTBasDepts().add(TBasDept);
		TBasDept.setTBasOrg(this);

		return TBasDept;
	}

	public TBasDept removeTBasDept(TBasDept TBasDept) {
		getTBasDepts().remove(TBasDept);
		TBasDept.setTBasOrg(null);

		return TBasDept;
	}

}