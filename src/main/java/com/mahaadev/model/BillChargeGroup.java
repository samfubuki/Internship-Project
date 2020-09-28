package com.mahaadev.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="billchargegroup")
public class BillChargeGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String billchargegroupname;
	private String srno;

	@Column(updatable = false)
	private String enteredBy;

	@Column(updatable = false)
	private Date enteredDate;

	private String updatedBy;

	private Date updatedDate;

	public int getsno() {
		return sno;
	}

	public void setsno(int sno) {
		this.sno = sno;
	}

	public String getBillchargegroupname() {
		return billchargegroupname;
	}

	public void setBillchargegroupname(String billchargegroupname) {
		this.billchargegroupname = billchargegroupname;
	}

	public String getSrno() {
		return srno;
	}

	public void setSrno(String srno) {
		this.srno = srno;
	}

	public String getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}

	public Date getEnteredDate() {
		return enteredDate;
	}

	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "BillChargeGroup [sno=" + sno + ", billchargegroupname=" + billchargegroupname + ", srno=" + srno
				+ ", enteredBy=" + enteredBy + ", enteredDate=" + enteredDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}
	

}
