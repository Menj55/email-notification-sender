package com.app.controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MailReq;
import com.app.service.MailerService;

@RestController
public class MailController {
	
	@Autowired
	MailerService mailer;
	
	@PostMapping("/notify")
	public String sendNotification(@RequestBody MailReq mailre) {
		
		System.out.println(mailre.toString());
		try {
			mailer.sendmail(mailre);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Email sent successfully";
	}
}
