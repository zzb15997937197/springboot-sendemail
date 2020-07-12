package com.example.mail.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {


    @Autowired
    private JavaMailSender mailSender;


    @Value("${spring.mail.username}")
    private String from;

   @GetMapping("/send")
    public String sendSimpleEmail(){
       SimpleMailMessage message = new SimpleMailMessage();
       message.setFrom(from);
      // message.setTo("zhengbing.zhang@hand-china.com");
       message.setTo("1315126511@qq.com");
       message.setSubject("我（づ￣3￣）づ╭❤～");
       message.setText("小宝贝儿，木啊，❥(^_-)");
       System.out.println(mailSender);
       mailSender.send(message);
       return "发送成功！";
   }

}
