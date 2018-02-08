package com.sun.cics.base;

import java.io.Serializable;

import javax.persistence.Transient;

public class BaseEntity implements Serializable {

	/**
	 * 分页 页码 默认为1
	 */
	@Transient
	protected int page = 1;
	
	/**
	 * 分页每页数量 默认为20
	 */
	@Transient
	protected int size = 20;
	
	/**
	 * 默认排序列名，默认为Id
	 */
	@Transient
	protected String sidx = "F_ID";

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}
	
}
