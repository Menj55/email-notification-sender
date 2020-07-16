package com.app.dto;

public class PipelineModel {

	private String name;
	private String start;
	private String end;
	private String status;
	private String error;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "PipelineModel [name=" + name + ", start=" + start + ", end=" + end + ", status=" + status + ", error="
				+ error + "]";
	}
}
