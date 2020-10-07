package com.mahaadev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deliveryentrytransaction")
public class DeliveryEntryTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String deliverydate;
	private String lastchildsex;
	private String status;
    private int pregWeek;
    private int bornChild;
    private int aliveChild;
    private int deadChild;
    private int lastChildAge;
    private int totalLivingChild;
    private int ageAtMarriagem;
    private String nationalitym;
    private String religionm;
    private String qualificationm;
    private String occupationm;
    private int ageAtMarriagef;
    private String nationalityf;
    private String religionf;
    private String qualificationf;
    private String occupationf;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getLastchildsex() {
		return lastchildsex;
	}
	public void setLastchildsex(String lastchildsex) {
		this.lastchildsex = lastchildsex;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPregWeek() {
		return pregWeek;
	}
	public void setPregWeek(int pregWeek) {
		this.pregWeek = pregWeek;
	}
	public int getBornChild() {
		return bornChild;
	}
	public void setBornChild(int bornChild) {
		this.bornChild = bornChild;
	}
	public int getAliveChild() {
		return aliveChild;
	}
	public void setAliveChild(int aliveChild) {
		this.aliveChild = aliveChild;
	}
	public int getDeadChild() {
		return deadChild;
	}
	public void setDeadChild(int deadChild) {
		this.deadChild = deadChild;
	}
	public int getLastChildAge() {
		return lastChildAge;
	}
	public void setLastChildAge(int lastChildAge) {
		this.lastChildAge = lastChildAge;
	}
	public int getTotalLivingChild() {
		return totalLivingChild;
	}
	public void setTotalLivingChild(int totalLivingChild) {
		this.totalLivingChild = totalLivingChild;
	}
	public int getAgeAtMarriagem() {
		return ageAtMarriagem;
	}
	public void setAgeAtMarriagem(int ageAtMarriagem) {
		this.ageAtMarriagem = ageAtMarriagem;
	}
	
	public String getNationalitym() {
		return nationalitym;
	}
	public void setNationalitym(String nationalitym) {
		this.nationalitym = nationalitym;
	}
	public String getReligionm() {
		return religionm;
	}
	public void setReligionm(String religionm) {
		this.religionm = religionm;
	}
	public String getQualificationm() {
		return qualificationm;
	}
	public void setQualificationm(String qualificationm) {
		this.qualificationm = qualificationm;
	}
	public String getOccupationm() {
		return occupationm;
	}
	public void setOccupationm(String occupationm) {
		this.occupationm = occupationm;
	}
	public int getAgeAtMarriagef() {
		return ageAtMarriagef;
	}
	public void setAgeAtMarriagef(int ageAtMarriagef) {
		this.ageAtMarriagef = ageAtMarriagef;
	}
	public String getNationalityf() {
		return nationalityf;
	}
	public void setNationalityf(String nationalityf) {
		this.nationalityf = nationalityf;
	}
	public String getReligionf() {
		return religionf;
	}
	public void setReligionf(String religionf) {
		this.religionf = religionf;
	}
	public String getQualificationf() {
		return qualificationf;
	}
	public void setQualificationf(String qualificationf) {
		this.qualificationf = qualificationf;
	}
	public String getOccupationf() {
		return occupationf;
	}
	public void setOccupationf(String occupationf) {
		this.occupationf = occupationf;
	}
	
	@Override
	public String toString() {
	return "DeliveryEntryTransaction [ sno=" + sno + ",status=" + status + " ,pregWeek=" + pregWeek + ", bornChild=" + bornChild + ", aliveChild="
	+ aliveChild + ", deadChild=" + deadChild + ", lastChildAge=" + lastChildAge + ", totalLivingChild="
	+ totalLivingChild + ", ageAtMarriagem=" + ageAtMarriagem + ", nationalitym=" + nationalitym
	+ ", religionm=" + religionm + ", qualificationm=" + qualificationm + ", occupationm=" + occupationm
	+ ", ageAtMarriagef=" + ageAtMarriagef + ", nationalityf=" + nationalityf + ", religionf=" + religionf
	+ ", qualificationf=" + qualificationf + ", occupationf=" + occupationf + "]";
	}
}
