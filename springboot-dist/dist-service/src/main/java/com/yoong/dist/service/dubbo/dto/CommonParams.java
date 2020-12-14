package com.yoong.dist.service.dubbo.dto;

import lombok.Data;

@Data
public class CommonParams {
    private Long bankId;
    private Long creditId;
    private Long projectId;
    private Integer signConfirm;
    private Long apiServiceId;

    public CommonParams() {
    }

    public CommonParams(Long bankId, Long creditId) {
        this(bankId, creditId, null, null);
    }

    public CommonParams(Long bankId, Long creditId, Long projectId) {
        this(bankId, creditId, projectId, null);
    }

    public CommonParams(Long bankId, Long creditId, Integer signConfirm) {
        this(bankId, creditId, null, signConfirm);
    }

    public CommonParams(Long bankId, Long creditId, Long projectId, Integer signConfirm) {
        this.bankId = bankId;
        this.creditId = creditId;
        this.projectId = projectId;
        this.signConfirm = signConfirm;
    }
}
