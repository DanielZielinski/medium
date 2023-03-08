package com.daniel.zielinski.medium.tracedapp.codereview.account;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountService {

    @Autowired
    public AccountEntityRepository accountEntityRepository;

    @Autowired
    public NotificationEmailService notificationEmailService;


    public AccountEntity create(AccountRequest accountRequest) {
        checkIfEmailAndUserNameIsUsed(accountRequest);
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setUserName( accountRequest.getUserName() );
        accountEntity.setFirstName( accountRequest.getFirstName() );
        accountEntity.setLastName( accountRequest.getLastName() );
        accountEntity.setEmail( accountRequest.getEmail() );
        accountEntity.setEnabled( accountRequest.isEnabled() );
        addRoles(accountRequest, accountEntity);
        accountEntityRepository.save(accountEntity);
        notificationEmailService.sendAccountCreatedEmail(accountEntity);
        log.info("Account created: {}", accountEntity);
        return accountEntity;
    }

    private void addRoles(AccountRequest accountRequest, AccountEntity accountEntity) {
    }

    private void checkIfEmailAndUserNameIsUsed(AccountRequest accountRequest) {
    }


}
