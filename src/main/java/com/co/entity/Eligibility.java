package com.co.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Eligibility {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer appNumber;
	private Integer planId;
	private String eligibilityStatus;
	private Date eligibilityStartDate;
	private Date eligibilityEndDate;
	private double benfitAmt;
	private String denialReason;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getEligibilityStatus() {
		return eligibilityStatus;
	}
	public void setEligibilityStatus(String eligibilityStatus) {
		this.eligibilityStatus = eligibilityStatus;
	}
	public Date getEligibilityStartDate() {
		return eligibilityStartDate;
	}
	public void setEligibilityStartDate(Date eligibilityStartDate) {
		this.eligibilityStartDate = eligibilityStartDate;
	}
	public Date getEligibilityEndDate() {
		return eligibilityEndDate;
	}
	public void setEligibilityEndDate(Date eligibilityEndDate) {
		this.eligibilityEndDate = eligibilityEndDate;
	}
	public double getBenfitAmt() {
		return benfitAmt;
	}
	public void setBenfitAmt(double benfitAmt) {
		this.benfitAmt = benfitAmt;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public Eligibility(Integer appNumber, Integer planId, String eligibilityStatus, Date eligibilityStartDate,
			Date eligibilityEndDate, double benfitAmt, String denialReason) {
		super();
		this.appNumber = appNumber;
		this.planId = planId;
		this.eligibilityStatus = eligibilityStatus;
		this.eligibilityStartDate = eligibilityStartDate;
		this.eligibilityEndDate = eligibilityEndDate;
		this.benfitAmt = benfitAmt;
		this.denialReason = denialReason;
	}
	public Eligibility() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Eligibility [id=" + id + ", appNumber=" + appNumber + ", planId=" + planId + ", eligibilityStatus="
				+ eligibilityStatus + ", eligibilityStartDate=" + eligibilityStartDate + ", eligibilityEndDate="
				+ eligibilityEndDate + ", benfitAmt=" + benfitAmt + ", denialReason=" + denialReason + "]";
	}
	
}
