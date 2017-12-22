package com.sun.cics.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the T_BAS_MODULE database table.
 * 
 */
@Entity
@Table(name="T_BAS_MODULE")
@NamedQuery(name="TBasModule.findAll", query="SELECT t FROM TBasModule t")
public class TBasModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_BAS_MODULE_FID_GENERATOR", sequenceName="T_BAS_MODEL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_BAS_MODULE_FID_GENERATOR")
	@Column(name="F_ID")
	private long fId;

	@Column(name="F_CREATE_TIME")
	private Timestamp fCreateTime;

	@Column(name="F_CREATE_USER")
	private BigDecimal fCreateUser;

	@Column(name="F_INDEX")
	private BigDecimal fIndex;

	@Column(name="F_IS_LEAF")
	private String fIsLeaf;

	@Column(name="F_LAST_EDIT_TIME")
	private Timestamp fLastEditTime;

	@Column(name="F_LAST_EDIT_USER")
	private BigDecimal fLastEditUser;

	@Column(name="F_LEV")
	private BigDecimal fLev;

	@Column(name="F_MODAL_CLASS")
	private String fModalClass;

	@Column(name="F_MODEL_NAME")
	private String fModelName;

	@Column(name="F_P_ID")
	private BigDecimal fPId;

	@Column(name="F_STATUS")
	private String fStatus;

	@Column(name="F_URI_VALID")
	private String fUriValid;

	@Column(name="F_URL")
	private String fUrl;

	//bi-directional many-to-one association to RelRoleModule
	@OneToMany(mappedBy="TBasModule")
	private List<RelRoleModule> relRoleModules;

	public TBasModule() {
	}

	public long getFId() {
		return this.fId;
	}

	public void setFId(long fId) {
		this.fId = fId;
	}

	public Timestamp getFCreateTime() {
		return this.fCreateTime;
	}

	public void setFCreateTime(Timestamp fCreateTime) {
		this.fCreateTime = fCreateTime;
	}

	public BigDecimal getFCreateUser() {
		return this.fCreateUser;
	}

	public void setFCreateUser(BigDecimal fCreateUser) {
		this.fCreateUser = fCreateUser;
	}

	public BigDecimal getFIndex() {
		return this.fIndex;
	}

	public void setFIndex(BigDecimal fIndex) {
		this.fIndex = fIndex;
	}

	public String getFIsLeaf() {
		return this.fIsLeaf;
	}

	public void setFIsLeaf(String fIsLeaf) {
		this.fIsLeaf = fIsLeaf;
	}

	public Timestamp getFLastEditTime() {
		return this.fLastEditTime;
	}

	public void setFLastEditTime(Timestamp fLastEditTime) {
		this.fLastEditTime = fLastEditTime;
	}

	public BigDecimal getFLastEditUser() {
		return this.fLastEditUser;
	}

	public void setFLastEditUser(BigDecimal fLastEditUser) {
		this.fLastEditUser = fLastEditUser;
	}

	public BigDecimal getFLev() {
		return this.fLev;
	}

	public void setFLev(BigDecimal fLev) {
		this.fLev = fLev;
	}

	public String getFModalClass() {
		return this.fModalClass;
	}

	public void setFModalClass(String fModalClass) {
		this.fModalClass = fModalClass;
	}

	public String getFModelName() {
		return this.fModelName;
	}

	public void setFModelName(String fModelName) {
		this.fModelName = fModelName;
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

	public String getFUriValid() {
		return this.fUriValid;
	}

	public void setFUriValid(String fUriValid) {
		this.fUriValid = fUriValid;
	}

	public String getFUrl() {
		return this.fUrl;
	}

	public void setFUrl(String fUrl) {
		this.fUrl = fUrl;
	}

	public List<RelRoleModule> getRelRoleModules() {
		return this.relRoleModules;
	}

	public void setRelRoleModules(List<RelRoleModule> relRoleModules) {
		this.relRoleModules = relRoleModules;
	}

	public RelRoleModule addRelRoleModule(RelRoleModule relRoleModule) {
		getRelRoleModules().add(relRoleModule);
		relRoleModule.setTBasModule(this);

		return relRoleModule;
	}

	public RelRoleModule removeRelRoleModule(RelRoleModule relRoleModule) {
		getRelRoleModules().remove(relRoleModule);
		relRoleModule.setTBasModule(null);

		return relRoleModule;
	}

}