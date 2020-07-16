package com.app.dto;


import java.util.Arrays;
import java.util.Map;

public class MailModel {

    private String toEmail;
    private String name;
    private PipelineModel[] pipelines;
    private PipelineMetricsModel[] pipelineMetrics;
    private Map<String, String> model;
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PipelineModel[] getPipelines() {
		return pipelines;
	}
	public void setPipelines(PipelineModel[] pipelines) {
		this.pipelines = pipelines;
	}
	public PipelineMetricsModel[] getPipelineMetrics() {
		return pipelineMetrics;
	}
	public void setPipelineMetrics(PipelineMetricsModel[] pipelineMetrics) {
		this.pipelineMetrics = pipelineMetrics;
	}
	public Map<String, String> getModel() {
		return model;
	}
	public void setModel(Map<String, String> model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "MailModel [toEmail=" + toEmail + ", name=" + name + ", pipelines=" + Arrays.toString(pipelines)
				+ ", pipelineMetrics=" + Arrays.toString(pipelineMetrics) + ", model=" + model + "]";
	}
}
