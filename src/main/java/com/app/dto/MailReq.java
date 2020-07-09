package com.app.dto;

public class MailReq {
	String to;
	String body;
	String subject;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "MailReq [to=" + to + ", body=" + body + ", subject=" + subject + "]";
	}
}
