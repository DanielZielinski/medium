package com.daniel.zielinski.medium.tracedapp.codereview.account;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationEmailService {
    public void sendAccountCreatedEmail(AccountEntity accountEntity) {
        log.info("Sending email");
    }
}
