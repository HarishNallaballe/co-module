package com.co.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Correspondence {
	
	@Id
	private Integer noticeId;
	private Date cogenDate;
	private String coStatus;
	private Date coPrintDate;
	private String s3Url;
	private Integer appNumber;
	public Integer getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}
	public Date getCogenDate() {
		return cogenDate;
	}
	public void setCogenDate(Date cogenDate) {
		this.cogenDate = cogenDate;
	}
	public String getCoStatus() {
		return coStatus;
	}
	public void setCoStatus(String coStatus) {
		this.coStatus = coStatus;
	}
	public Date getCoPrintDate() {
		return coPrintDate;
	}
	public void setCoPrintDate(Date coPrintDate) {
		this.coPrintDate = coPrintDate;
	}
	public String getS3Url() {
		return s3Url;
	}
	public void setS3Url(String s3Url) {
		this.s3Url = s3Url;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}
	public Correspondence(Integer noticeId, Date cogenDate, String coStatus, Date coPrintDate, String s3Url,
			Integer appNumber) {
		super();
		this.noticeId = noticeId;
		this.cogenDate = cogenDate;
		this.coStatus = coStatus;
		this.coPrintDate = coPrintDate;
		this.s3Url = s3Url;
		this.appNumber = appNumber;
	}
	public Correspondence() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Correspondence [noticeId=" + noticeId + ", cogenDate=" + cogenDate + ", coStatus=" + coStatus
				+ ", coPrintDate=" + coPrintDate + ", s3Url=" + s3Url + ", appNumber=" + appNumber + "]";
	}

}
