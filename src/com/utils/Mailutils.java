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
        props.setProperty("mail.smtp.auth", "true");// ָ����֤Ϊtrue
        props.put("mail.smtp.ssl.enable", "true");
// ������֤��
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("185829931@qq.com", "wsz1998wsz");
            }
        };
        Session session = Session.getInstance(props, auth);
// 2.����һ��Message�����൱�����ʼ�����
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("185829931@qq.com")); // ���÷�����
        message.setRecipient(RecipientType.TO, new InternetAddress(email)); // ���÷��ͷ�ʽ�������
        message.setSubject("�û�����");
// message.setText("����һ�⼤���ʼ�����<a href='#'>���</a>");
        message.setContent(emailMsg, "text/html;charset=utf-8");
// 3.���� Transport���ڽ��ʼ�����
        Transport.send(message);
    }
}

