package com.app.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.app.dto.MailModel;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service
public class MailerService {
	
	@Autowired
    private JavaMailSender emailSender;

    @Autowired
    @Qualifier("emailConfigBean")
    private Configuration emailConfig;


    @Value("${spring.mail.username}")
    private String from; 
    
    public void sendEmail(MailModel mailModel, boolean start) throws MessagingException, IOException, TemplateException {

        Map model = new HashMap();
        model.put("name", mailModel.getName());
        model.put("pipelines", mailModel.getPipelines());
        
        String subject;
        mailModel.setModel(model);

        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, 
        		MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, 
        		StandardCharsets.UTF_8.name());
        Template template;
        if(start) {
        	template = emailConfig.getTemplate("start.ftl");
        	subject = "Streamset Orchestration - Workflow Start Notification";
        } else {
        	template = emailConfig.getTemplate("finish.ftl");
        	subject = "Streamset Orchestration - Workflow End Notification";
        }
        
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, 
        		mailModel.getModel());

        mimeMessageHelper.setTo(mailModel.getToEmail());
        mimeMessageHelper.setText(html, true);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setFrom(from);


        emailSender.send(message);

    }
}
