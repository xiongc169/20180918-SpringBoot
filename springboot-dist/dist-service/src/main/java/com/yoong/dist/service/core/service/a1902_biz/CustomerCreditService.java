package com.yoong.dist.service.core.service.a1902_biz;

import com.yoong.dist.service.core.mapper.a1902_biz.CustomerCreditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerCreditService {

    @Autowired
    private CustomerCreditMapper mapper;
}
