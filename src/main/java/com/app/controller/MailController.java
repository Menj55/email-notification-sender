package com.app.controller;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MailModel;
import com.app.dto.PipelineMetricsModel;
import com.app.dto.PipelineModel;
import com.app.service.MailerService;
import com.app.service.PipelineDataMerger;

import freemarker.template.TemplateException;

@RestController
public class MailController {
	
	@Autowired
	MailerService mailer;
	
	@Autowired
	PipelineDataMerger merger;
	
	@PostMapping("/notify/finish")
    public ResponseEntity<?> sendFinishNotification(@RequestBody MailModel mailModel) {
        try {
        	PipelineModel[] p = merger.setPipelineData(mailModel.getPipelines(), mailModel.getPipelineMetrics());
        	mailModel.setPipelines(p);
        	
            mailer.sendEmail(mailModel, false);
            return ResponseEntity.ok().body(mailModel.toString());
        } catch (MessagingException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        } catch (TemplateException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        }
    }
	
	@PostMapping("/notify/start")
    public ResponseEntity<?> sendStartNotification(@RequestBody MailModel mailModel) {
        try {
            mailer.sendEmail(mailModel, true);
            return ResponseEntity.ok().body(mailModel.toString());
        } catch (MessagingException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        } catch (TemplateException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        }


    }
}
