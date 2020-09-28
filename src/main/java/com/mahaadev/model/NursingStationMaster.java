package com.mahaadev.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nursingstationmaster")
public class NursingStationMaster {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int sno;	
   private String nursingstation;
   private int number;
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

	public String getNursingstation() {
		return nursingstation;
	}

	public void setNursingstation(String nursingstation) {
		this.nursingstation = nursingstation;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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
		return "NursingStationMaster [sno=" + sno + ", nursingstation=" + nursingstation + ", number=" + number
				+ ", enteredBy=" + enteredBy + ", enteredDate=" + enteredDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

	
}
