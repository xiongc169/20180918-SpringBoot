package practice.springboot.service.wong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.springboot.domain.wong.Account;
import practice.springboot.domain.wong.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account addAccount(Account account) {
        accountRepository.save(account);
        return account;
    }
}
