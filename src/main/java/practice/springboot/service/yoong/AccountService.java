package practice.springboot.service.yoong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.springboot.domain.yoong.Account;
import practice.springboot.domain.yoong.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Long addAccount(Account account) {
        accountRepository.save(account);
        return account.getId();
    }
}
