package com.app.dto;

public class PipelineModel {
	private String id;
	private String name;
	private String status;
	private String input;
	private String output;
	private String error;
	private String startTime;
	private String endTime;
	
	
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "PipelineModel [id=" + id + ", name=" + name + ", status=" + status + ", input=" + input + ", output="
				+ output + ", error=" + error + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
}
