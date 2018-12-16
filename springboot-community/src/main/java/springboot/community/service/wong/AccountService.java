package springboot.community.service.wong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.community.domain.wong.Account;
import springboot.community.domain.wong.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account addAccount(Account account) {
        accountRepository.save(account);
        return account;
    }
}
