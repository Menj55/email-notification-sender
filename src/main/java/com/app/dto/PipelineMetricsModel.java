package com.app.dto;

import java.sql.Timestamp;

public class PipelineMetricsModel {
	private String pipelineId;
	private String inputRecordCount;
	private String outputRecordCount;
	private String errorRecordCount;
	private Timestamp startTime;
	private Timestamp endTime;
	
	
	
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public String getPipelineId() {
		return pipelineId;
	}
	public void setPipelineId(String pipelineid) {
		this.pipelineId = pipelineid;
	}
	public String getInputRecordCount() {
		return inputRecordCount;
	}
	public void setInputRecordCount(String inputRecordCount) {
		this.inputRecordCount = inputRecordCount;
	}
	public String getOutputRecordCount() {
		return outputRecordCount;
	}
	public void setOutputRecordCount(String outputRecordCount) {
		this.outputRecordCount = outputRecordCount;
	}
	public String getErrorRecordCount() {
		return errorRecordCount;
	}
	public void setErrorRecordCount(String errorRecordCount) {
		this.errorRecordCount = errorRecordCount;
	}
	@Override
	public String toString() {
		return "PipelineMetricsModel [pipelineId=" + pipelineId + ", inputRecordCount=" + inputRecordCount
				+ ", outputRecordCount=" + outputRecordCount + ", errorRecordCount=" + errorRecordCount + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
	
	
}
