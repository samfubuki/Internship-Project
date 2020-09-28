package com.mahaadev.model;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roommaster")
public class RoomMaster {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)		
   private int sno;
   private String roomno;
   private String roomdescrip;//koi bhi variable ka naam naminig convention k sath likho or pura likho!
   private int roomcharge;
   private String type;
   private String active;
   @Column(updatable = false)
   private String enteredBy;

   @Column(updatable = false)
   private Date enteredDate;

  	private String updatedBy;

  	private Date updatedDate;

	public int getsno() {
		return sno;
	}

	public void setrmno(int sno) {
		this.sno = sno;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public String getRoomdescrip() {
		return roomdescrip;
	}

	public void setRoomdescrip(String roomdescrip) {
		this.roomdescrip = roomdescrip;
	}

	public int getRoomcharge() {
		return roomcharge;
	}

	public void setRoomcharge(int roomcharge) {
		this.roomcharge = roomcharge;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
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
		return "RoomMaster [sno=" + sno + ", roomno=" + roomno + ", roomdescrip=" + roomdescrip + ", roomcharge="
				+ roomcharge + ", type=" + type + ", enteredBy=" + enteredBy + ", enteredDate=" + enteredDate
				+ ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}

   
}
