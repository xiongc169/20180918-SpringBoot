package com.yoong.dist.api.domain.a1902_stage;

import java.util.Date;

public class ConfirmRecord {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Long version;

    private Long apiServiceId;

    private Long apiSendId;

    private String appId;

    private String orderNo;

    private String bankId;

    private Integer signConfirm;

    private Integer respCode;

    private String respMsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getApiServiceId() {
        return apiServiceId;
    }

    public void setApiServiceId(Long apiServiceId) {
        this.apiServiceId = apiServiceId;
    }

    public Long getApiSendId() {
        return apiSendId;
    }

    public void setApiSendId(Long apiSendId) {
        this.apiSendId = apiSendId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public Integer getSignConfirm() {
        return signConfirm;
    }

    public void setSignConfirm(Integer signConfirm) {
        this.signConfirm = signConfirm;
    }

    public Integer getRespCode() {
        return respCode;
    }

    public void setRespCode(Integer respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg == null ? null : respMsg.trim();
    }
}