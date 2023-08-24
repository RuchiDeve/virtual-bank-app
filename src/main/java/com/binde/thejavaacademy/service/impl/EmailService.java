package com.binde.thejavaacademy.service.impl;

import com.binde.thejavaacademy.dto.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
