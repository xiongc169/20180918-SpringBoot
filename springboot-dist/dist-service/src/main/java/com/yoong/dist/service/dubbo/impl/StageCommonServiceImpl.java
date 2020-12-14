package com.yoong.dist.service.dubbo.impl;

import com.yoong.dist.api.dubbo.StageCommonService;
import com.yoong.dist.service.core.service.a1902_biz.CustomerCreditService;
import com.yoong.dist.service.core.service.a1902_stage.ApiSendRecordService;
import com.yoong.dist.service.core.service.wong_user.AccountService;
import com.yoong.dist.service.dubbo.AbstractStageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

/**
 * @Desc dubbo实现类
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
@Slf4j
@Service("stageCommonServiceImpl")
public class StageCommonServiceImpl extends AbstractStageService implements StageCommonService {

    @Autowired
    private CustomerCreditService customerCreditService;

    @Autowired
    private ApiSendRecordService apiSendRecordService;

    @Autowired
    private AccountService accountService;

    @Override
    public Optional<String> applyCredit(@RequestBody Long creditId) {
        return null;
    }

}
