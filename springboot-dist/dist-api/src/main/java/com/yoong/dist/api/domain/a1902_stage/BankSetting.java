package com.yoong.dist.api.domain.a1902_stage;

import java.math.BigDecimal;
import java.util.Date;

public class BankSetting {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Long version;

    private String bankId;

    private String agencyCode;

    private String assurerNo;

    private String bankCode;

    private String bankName;

    private String bankType;

    private Integer creditReceiveAmount;

    private String marketingArchivesNum;

    private Integer orgType;

    private String platNo;

    private Integer productType;

    private BigDecimal bankServiceFee;

    private Integer isCocom;

    private String cocomId;

    private Integer isInvoke;

    private String reczoneno;

    private String guaranteeCode;

    private String marketId;

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

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode == null ? null : agencyCode.trim();
    }

    public String getAssurerNo() {
        return assurerNo;
    }

    public void setAssurerNo(String assurerNo) {
        this.assurerNo = assurerNo == null ? null : assurerNo.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    public Integer getCreditReceiveAmount() {
        return creditReceiveAmount;
    }

    public void setCreditReceiveAmount(Integer creditReceiveAmount) {
        this.creditReceiveAmount = creditReceiveAmount;
    }

    public String getMarketingArchivesNum() {
        return marketingArchivesNum;
    }

    public void setMarketingArchivesNum(String marketingArchivesNum) {
        this.marketingArchivesNum = marketingArchivesNum == null ? null : marketingArchivesNum.trim();
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public String getPlatNo() {
        return platNo;
    }

    public void setPlatNo(String platNo) {
        this.platNo = platNo == null ? null : platNo.trim();
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public BigDecimal getBankServiceFee() {
        return bankServiceFee;
    }

    public void setBankServiceFee(BigDecimal bankServiceFee) {
        this.bankServiceFee = bankServiceFee;
    }

    public Integer getIsCocom() {
        return isCocom;
    }

    public void setIsCocom(Integer isCocom) {
        this.isCocom = isCocom;
    }

    public String getCocomId() {
        return cocomId;
    }

    public void setCocomId(String cocomId) {
        this.cocomId = cocomId == null ? null : cocomId.trim();
    }

    public Integer getIsInvoke() {
        return isInvoke;
    }

    public void setIsInvoke(Integer isInvoke) {
        this.isInvoke = isInvoke;
    }

    public String getReczoneno() {
        return reczoneno;
    }

    public void setReczoneno(String reczoneno) {
        this.reczoneno = reczoneno == null ? null : reczoneno.trim();
    }

    public String getGuaranteeCode() {
        return guaranteeCode;
    }

    public void setGuaranteeCode(String guaranteeCode) {
        this.guaranteeCode = guaranteeCode == null ? null : guaranteeCode.trim();
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId == null ? null : marketId.trim();
    }
}