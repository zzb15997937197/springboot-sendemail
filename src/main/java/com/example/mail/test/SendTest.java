package com.example.mail.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;

import javax.mail.MessagingException;

public class SendTest {

    @Autowired
    private MailSender mailSender;


    @Test
    public void testMail() throws MessagingException {
    }

}
