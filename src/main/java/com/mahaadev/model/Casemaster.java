package com.mahaadev.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "casemaster")
public class Casemaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String casename;
	private String depname;
	private String ob;
	
	
	@Column(updatable = false)
	private String enteredBy;

	@Column(updatable = false)
	private Date enteredDate;

	private String updatedBy;

	private Date updatedDate;
	
	

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getCasename() {
		return casename;
	}

	public void setCasename(String casename) {
		this.casename = casename;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}
	/*public String getOb() {
		return ob;
	}

	public void setOb(String ob) {
		this.ob = ob;
	}
   */

	public String getOb() {
		return ob;
	}

	public void setOb(String ob) {
		this.ob = ob;
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
		return "Casemaster [sno=" + sno  + ", casename=" + casename + ", depname=" + depname + ", enteredBy=" + enteredBy
				+ ", enteredDate=" + enteredDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}

}
