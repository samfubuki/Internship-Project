package com.mahaadev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ipdrefundentry")
public class IpdRefundEntry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sno;
	private int amount;
	private String remark;
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "IpdRefundEntry [Sno=" + Sno + ", amount=" + amount + ", remark=" + remark + "]";
	}
	
}