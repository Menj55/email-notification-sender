package com.app.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.app.dto.PipelineMetricsModel;
import com.app.dto.PipelineModel;

@Service
public class PipelineDataMerger {

	public PipelineModel[] setPipelineData(PipelineModel[] pipeline, PipelineMetricsModel[] metrics) {
		
		for(PipelineModel p : pipeline) {
			for(PipelineMetricsModel m : metrics) {
				
				if(p.getId().equals(m.getPipelineId())) {
					p.setStartTime(new Date(m.getStartTime().getTime()).toString());
					p.setEndTime(new Date(m.getEndTime().getTime()).toString());
					p.setInput(m.getInputRecordCount());
					p.setOutput(m.getOutputRecordCount());
					p.setError(m.getErrorRecordCount());
				}
			}
		}
		
		return pipeline;
	}
}
