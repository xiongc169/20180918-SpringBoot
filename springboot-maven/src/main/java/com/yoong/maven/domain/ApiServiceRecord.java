package com.yoong.maven.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Desc TODO
 * @Author
 * @Date
 * @Version 1.0
 */
@Entity
@Table(name = "api_service_record")
public class ApiServiceRecord {
    private long id;
    private Timestamp createDate;
    private Timestamp modifyDate;
    private long version;
    private String appId;
    private String appName;
    private String requestId;
    private String callIp;
    private String apiParam;
    private String apiResult;
    private int thirdPartyId;
    private Integer businessType;
    private Timestamp responseTime;
    private String remark;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "create_date", nullable = false)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modify_date", nullable = false)
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "version", nullable = false)
    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Basic
    @Column(name = "app_id", nullable = false, length = 50)
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "app_name", nullable = false, length = 50)
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "request_id", nullable = true, length = 200)
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Basic
    @Column(name = "call_ip", nullable = true, length = 20)
    public String getCallIp() {
        return callIp;
    }

    public void setCallIp(String callIp) {
        this.callIp = callIp;
    }

    @Basic
    @Column(name = "api_param", nullable = true, length = -1)
    public String getApiParam() {
        return apiParam;
    }

    public void setApiParam(String apiParam) {
        this.apiParam = apiParam;
    }

    @Basic
    @Column(name = "api_result", nullable = true, length = -1)
    public String getApiResult() {
        return apiResult;
    }

    public void setApiResult(String apiResult) {
        this.apiResult = apiResult;
    }

    @Basic
    @Column(name = "third_party_id", nullable = false)
    public int getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(int thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    @Basic
    @Column(name = "business_type", nullable = true)
    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    @Basic
    @Column(name = "response_time", nullable = true)
    public Timestamp getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Timestamp responseTime) {
        this.responseTime = responseTime;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 256)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiServiceRecord that = (ApiServiceRecord) o;
        return id == that.id &&
                version == that.version &&
                thirdPartyId == that.thirdPartyId &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(modifyDate, that.modifyDate) &&
                Objects.equals(appId, that.appId) &&
                Objects.equals(appName, that.appName) &&
                Objects.equals(requestId, that.requestId) &&
                Objects.equals(callIp, that.callIp) &&
                Objects.equals(apiParam, that.apiParam) &&
                Objects.equals(apiResult, that.apiResult) &&
                Objects.equals(businessType, that.businessType) &&
                Objects.equals(responseTime, that.responseTime) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, modifyDate, version, appId, appName, requestId, callIp, apiParam, apiResult, thirdPartyId, businessType, responseTime, remark);
    }
}
