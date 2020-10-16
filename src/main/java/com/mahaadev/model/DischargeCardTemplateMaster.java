package com.mahaadev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dischargecardtemplatemaster")
public class DischargeCardTemplateMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String templateName;
	private String courseDuringHospitalization;
	private String operation;
	private String finalDiagnosis;
	private String examinationFindingsDischarge;
	private String advice;
	private String nextFollowUp;
	private String historyPresentIllness;
	private String presentComplaints;
	private String examFindingAdmission;
	private String drugSensitivity;
	private String historyPastIllness;
	private String menstrual;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getCourseDuringHospitalization() {
		return courseDuringHospitalization;
	}
	public void setCourseDuringHospitalization(String courseDuringHospitalization) {
		this.courseDuringHospitalization = courseDuringHospitalization;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getFinalDiagnosis() {
		return finalDiagnosis;
	}
	public void setFinalDiagnosis(String finalDiagnosis) {
		this.finalDiagnosis = finalDiagnosis;
	}
	public String getExaminationFindingsDischarge() {
		return examinationFindingsDischarge;
	}
	public void setExaminationFindingsDischarge(String examinationFindingsDischarge) {
		this.examinationFindingsDischarge = examinationFindingsDischarge;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public String getNextFollowUp() {
		return nextFollowUp;
	}
	public void setNextFollowUp(String nextFollowUp) {
		this.nextFollowUp = nextFollowUp;
	}
	public String getHistoryPresentIllness() {
		return historyPresentIllness;
	}
	public void setHistoryPresentIllness(String historyPresentIllness) {
		this.historyPresentIllness = historyPresentIllness;
	}
	public String getPresentComplaints() {
		return presentComplaints;
	}
	public void setPresentComplaints(String presentComplaints) {
		this.presentComplaints = presentComplaints;
	}
	public String getExamFindingAdmission() {
		return examFindingAdmission;
	}
	public void setExamFindingAdmission(String examFindingAdmission) {
		this.examFindingAdmission = examFindingAdmission;
	}
	public String getDrugSensitivity() {
		return drugSensitivity;
	}
	public void setDrugSensitivity(String drugSensitivity) {
		this.drugSensitivity = drugSensitivity;
	}
	public String getHistoryPastIllness() {
		return historyPastIllness;
	}
	public void setHistoryPastIllness(String historyPastIllness) {
		this.historyPastIllness = historyPastIllness;
	}
	public String getMenstrual() {
		return menstrual;
	}
	public void setMenstrual(String menstrual) {
		this.menstrual = menstrual;
	}
	@Override
	public String toString() {
		return "DischargeCardTemplateMaster [sno=" + sno + ", templateName=" + templateName
				+ ", courseDuringHospitalization=" + courseDuringHospitalization + ", operation=" + operation
				+ ", finalDiagnosis=" + finalDiagnosis + ", examinationFindingsDischarge="
				+ examinationFindingsDischarge + ", advice=" + advice + ", nextFollowUp=" + nextFollowUp
				+ ", historyPresentIllness=" + historyPresentIllness + ", presentComplaints=" + presentComplaints
				+ ", examFindingAdmission=" + examFindingAdmission + ", drugSensitivity=" + drugSensitivity
				+ ", historyPastIllness=" + historyPastIllness + ", menstrual=" + menstrual + "]";
	}
}