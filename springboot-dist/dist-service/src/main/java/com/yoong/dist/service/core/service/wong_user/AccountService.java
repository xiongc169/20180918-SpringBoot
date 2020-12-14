package com.yoong.dist.service.core.service.wong_user;

import com.yoong.dist.service.core.mapper.wong_user.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;
}
