package com.function.mail.service.model;


/**
 * Created by Administrator on 2017/12/13.
 */
public class Message {

    private String messageCode;

    private String messageStatus;

    private String cause;

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}
    	
}
