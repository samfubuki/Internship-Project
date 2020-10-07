package com.mahaadev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patienthistoryentry")
public class PatientHistoryEntry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;
    private String complaints;
    private String hopresentillness;
    private String hopastillness;
    private String familyhistory;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getComplaints() {
		return complaints;
	}
	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}
	public String getHopresentillness() {
		return hopresentillness;
	}
	public void setHopresentillness(String hopresentillness) {
		this.hopresentillness = hopresentillness;
	}
	public String getHopastillness() {
		return hopastillness;
	}
	public void setHopastillness(String hopastillness) {
		this.hopastillness = hopastillness;
	}
	public String getFamilyhistory() {
		return familyhistory;
	}
	public void setFamilyhistory(String familyhistory) {
		this.familyhistory = familyhistory;
	}
	
	@Override
	public String toString() {
		return "PatientHistoryEntry [sno=" + sno + ", complaints=" + complaints + ", hopresentillness="
				+ hopresentillness + ", hopastillness=" + hopastillness + ", familyhistory=" + familyhistory + "]";
	}
    
}
