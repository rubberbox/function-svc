package com.function.mail.service;

public interface MailService { 

    /**
     * @param params       发送邮件的主题对象 object
     * @param title        邮件标题
     * @param templateName 模板名称
     */
	void sendMessageMail(Object params, String title, String templateName);

}
