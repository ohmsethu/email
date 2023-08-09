package com.example.demo.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Emailcontroller {
	@Autowired
	private Emailservice emailService;

    @GetMapping("/sendemail")
    public String sendEmail() {
        emailService.sendSimpleEmail("ssharesh10@gmail.com", "Hello", "This is a test email.");
        return "Email sent!";
    }


}
