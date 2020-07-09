package com.app.service;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.app.dto.MailReq;

@Service
public class MailerService {
	
	@Value("${spring.mail.properties.mail.smtp.auth}")
	private String auth;
	
	@Value("${spring.mail.host}")
	private String host;
	
	@Value("${spring.mail.password}")
	private String password;
	
	@Value("${spring.mail.port}")
	private String port;
	
	@Value("${spring.mail.username}")
	private String username;
	
	@Value("${spring.mail.properties.mail.smtp.starttls.enable}")
	private String starttls;
	
	public void sendmail(MailReq mailre) throws AddressException, MessagingException, IOException {
		   
		System.out.println(host + username + port + password);
			Properties props = new Properties();
		   props.put("mail.smtp.auth", auth);
		   props.put("mail.smtp.starttls.enable", starttls);
		   props.put("mail.smtp.host", host);
		   props.put("mail.smtp.port", port);
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication(username, password);
		      }
		   });
		   Message msg = new MimeMessage(session);
		   msg.setFrom(new InternetAddress(username, false));

		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailre.getTo()));
		   msg.setSubject(mailre.getSubject());
		   msg.setContent(mailre.getBody(), "text/html");
		   msg.setSentDate(new Date());

		   MimeBodyPart messageBodyPart = new MimeBodyPart();
		   messageBodyPart.setContent(mailre.getBody(), "text/html");

		   Multipart multipart = new MimeMultipart();
		   multipart.addBodyPart(messageBodyPart);
		   msg.setContent(multipart);
		   Transport.send(msg);   
		}
}
