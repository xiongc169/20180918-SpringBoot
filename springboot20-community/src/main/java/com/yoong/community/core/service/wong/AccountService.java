package com.yoong.community.core.service.wong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yoong.community.core.domain.wong.Account;
import com.yoong.community.core.domain.wong.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account addAccount(Account account) {
        accountRepository.save(account);
        return account;
    }
}
