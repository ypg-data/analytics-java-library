package com.adobe.analytics.client.domain;

import com.google.gson.annotations.SerializedName;

public class ReportQueueItem {

	@SerializedName("reportID")
	private Integer reportID;

	@SerializedName("type")
	private String type;

	@SerializedName("queueTime")
	private String queueTime;

	@SerializedName("status")
	private String status;

	@SerializedName("priority")
	private Integer priority;

	@SerializedName("estimate")
	private Integer estimate;

	@SerializedName("user")
	private String user;

	public Integer getReportID() {
		return reportID;
	}

	public void setReportID(Integer reportID) {
		this.reportID = reportID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQueueTime() {
		return queueTime;
	}

	public void setQueueTime(String queueTime) {
		this.queueTime = queueTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getEstimate() {
		return estimate;
	}

	public void setEstimate(Integer estimate) {
		this.estimate = estimate;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}

