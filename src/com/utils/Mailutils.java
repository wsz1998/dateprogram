package com.utils;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import java.util.*;
public class Mailutils {
    public static void sendMail(String email, String emailMsg)
            throws AddressException, MessagingException {
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "SMTP");
        props.setProperty("mail.host", "smtp.qq.com");
        props.setProperty("mail.smtp.auth", "true");// 指定验证为true
        props.put("mail.smtp.ssl.enable", "true");
// 创建验证器
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("185829931@qq.com", "wsz1998wsz");
            }
        };
        Session session = Session.getInstance(props, auth);
// 2.创建一个Message，它相当于是邮件内容
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("185829931@qq.com")); // 设置发送者
        message.setRecipient(RecipientType.TO, new InternetAddress(email)); // 设置发送方式与接收者
        message.setSubject("用户激活");
// message.setText("这是一封激活邮件，请<a href='#'>点击</a>");
        message.setContent(emailMsg, "text/html;charset=utf-8");
// 3.创建 Transport用于将邮件发送
        Transport.send(message);
    }
}

