package com.yoong.dist.api.domain.a1902_stage;

import java.math.BigDecimal;
import java.util.Date;

public class LoanReleaseInfo {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Long version;

    private Long apiServiceId;

    private Long apiSendId;

    private Long callbackId;

    private String orderNo;

    private BigDecimal eachAmt;

    private Integer eachDate;

    private BigDecimal eachPfee;

    private BigDecimal feeAmt;

    private BigDecimal firstAmt;

    private BigDecimal firstPfee;

    private String loanAccount;

    private BigDecimal loanAmount;

    private Integer loanFlag;

    private String nextDate;

    private Date releaseLoanDate;

    private String cardNo;

    private String loanDate;

    private String loanStageDate;

    private BigDecimal bankServiceFee;

    private Integer delFlag;

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

    public Long getCallbackId() {
        return callbackId;
    }

    public void setCallbackId(Long callbackId) {
        this.callbackId = callbackId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public BigDecimal getEachAmt() {
        return eachAmt;
    }

    public void setEachAmt(BigDecimal eachAmt) {
        this.eachAmt = eachAmt;
    }

    public Integer getEachDate() {
        return eachDate;
    }

    public void setEachDate(Integer eachDate) {
        this.eachDate = eachDate;
    }

    public BigDecimal getEachPfee() {
        return eachPfee;
    }

    public void setEachPfee(BigDecimal eachPfee) {
        this.eachPfee = eachPfee;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public BigDecimal getFirstAmt() {
        return firstAmt;
    }

    public void setFirstAmt(BigDecimal firstAmt) {
        this.firstAmt = firstAmt;
    }

    public BigDecimal getFirstPfee() {
        return firstPfee;
    }

    public void setFirstPfee(BigDecimal firstPfee) {
        this.firstPfee = firstPfee;
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount == null ? null : loanAccount.trim();
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getLoanFlag() {
        return loanFlag;
    }

    public void setLoanFlag(Integer loanFlag) {
        this.loanFlag = loanFlag;
    }

    public String getNextDate() {
        return nextDate;
    }

    public void setNextDate(String nextDate) {
        this.nextDate = nextDate == null ? null : nextDate.trim();
    }

    public Date getReleaseLoanDate() {
        return releaseLoanDate;
    }

    public void setReleaseLoanDate(Date releaseLoanDate) {
        this.releaseLoanDate = releaseLoanDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate == null ? null : loanDate.trim();
    }

    public String getLoanStageDate() {
        return loanStageDate;
    }

    public void setLoanStageDate(String loanStageDate) {
        this.loanStageDate = loanStageDate == null ? null : loanStageDate.trim();
    }

    public BigDecimal getBankServiceFee() {
        return bankServiceFee;
    }

    public void setBankServiceFee(BigDecimal bankServiceFee) {
        this.bankServiceFee = bankServiceFee;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}