package com.mahaadev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="operationmaster")
public class OperationMaster{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String opname;
	private int opcharge;
	private int srno;
	private String rateeditable;
	private String discountallow;
	private String tax;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getOpname() {
		return opname;
	}
	public void setOpname(String opname) {
		this.opname = opname;
	}
	public int getOpcharge() {
		return opcharge;
	}
	public void setOpcharge(int opcharge) {
		this.opcharge = opcharge;
	}
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getRateeditable() {
		return rateeditable;
	}
	public void setRateeditable(String rateeditable) {
		this.rateeditable = rateeditable;
	}
	public String getDiscountallow() {
		return discountallow;
	}
	public void setDiscountallow(String discountallow) {
		this.discountallow = discountallow;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "OperationMaster [sno=" + sno + ", opname=" + opname + ", opcharge=" + opcharge + ", srno=" + srno + "]";
	}
}