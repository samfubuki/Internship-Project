package com.mahaadev.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billchargemaster")
public class BillChargeMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private int rate;
	private String nature;
	private String type;
	private String rateEditable;
	private String discountAllow;
	private String tax;
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
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRateEditable() {
		return rateEditable;
	}
	public void setRateEditable(String rateEditable) {
		this.rateEditable = rateEditable;
	}
	public String getDiscountAllow() {
		return discountAllow;
	}
	public void setDiscountAllow(String discountAllow) {
		this.discountAllow = discountAllow;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
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
		return "BillChargeMaster [sno=" + sno + ", rate=" + rate + ", nature=" + nature + ", enteredBy=" + enteredBy
				+ ", enteredDate=" + enteredDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}

	
	
	
}
