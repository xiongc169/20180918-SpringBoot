package com.yoong.dist.api.domain.a1902_biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanProjectExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanProjectExtExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoIsNull() {
            addCriterion("external_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoIsNotNull() {
            addCriterion("external_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoEqualTo(String value) {
            addCriterion("external_serial_no =", value, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoNotEqualTo(String value) {
            addCriterion("external_serial_no <>", value, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoGreaterThan(String value) {
            addCriterion("external_serial_no >", value, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("external_serial_no >=", value, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoLessThan(String value) {
            addCriterion("external_serial_no <", value, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoLessThanOrEqualTo(String value) {
            addCriterion("external_serial_no <=", value, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoLike(String value) {
            addCriterion("external_serial_no like", value, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoNotLike(String value) {
            addCriterion("external_serial_no not like", value, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoIn(List<String> values) {
            addCriterion("external_serial_no in", values, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoNotIn(List<String> values) {
            addCriterion("external_serial_no not in", values, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoBetween(String value1, String value2) {
            addCriterion("external_serial_no between", value1, value2, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNoNotBetween(String value1, String value2) {
            addCriterion("external_serial_no not between", value1, value2, "externalSerialNo");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdIsNull() {
            addCriterion("pledge_estimate_id is null");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdIsNotNull() {
            addCriterion("pledge_estimate_id is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdEqualTo(Long value) {
            addCriterion("pledge_estimate_id =", value, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdNotEqualTo(Long value) {
            addCriterion("pledge_estimate_id <>", value, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdGreaterThan(Long value) {
            addCriterion("pledge_estimate_id >", value, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pledge_estimate_id >=", value, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdLessThan(Long value) {
            addCriterion("pledge_estimate_id <", value, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdLessThanOrEqualTo(Long value) {
            addCriterion("pledge_estimate_id <=", value, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdIn(List<Long> values) {
            addCriterion("pledge_estimate_id in", values, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdNotIn(List<Long> values) {
            addCriterion("pledge_estimate_id not in", values, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdBetween(Long value1, Long value2) {
            addCriterion("pledge_estimate_id between", value1, value2, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andPledgeEstimateIdNotBetween(Long value1, Long value2) {
            addCriterion("pledge_estimate_id not between", value1, value2, "pledgeEstimateId");
            return (Criteria) this;
        }

        public Criteria andSignResultIsNull() {
            addCriterion("sign_result is null");
            return (Criteria) this;
        }

        public Criteria andSignResultIsNotNull() {
            addCriterion("sign_result is not null");
            return (Criteria) this;
        }

        public Criteria andSignResultEqualTo(Integer value) {
            addCriterion("sign_result =", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultNotEqualTo(Integer value) {
            addCriterion("sign_result <>", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultGreaterThan(Integer value) {
            addCriterion("sign_result >", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_result >=", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultLessThan(Integer value) {
            addCriterion("sign_result <", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultLessThanOrEqualTo(Integer value) {
            addCriterion("sign_result <=", value, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultIn(List<Integer> values) {
            addCriterion("sign_result in", values, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultNotIn(List<Integer> values) {
            addCriterion("sign_result not in", values, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultBetween(Integer value1, Integer value2) {
            addCriterion("sign_result between", value1, value2, "signResult");
            return (Criteria) this;
        }

        public Criteria andSignResultNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_result not between", value1, value2, "signResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultIsNull() {
            addCriterion("outer_sign_result is null");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultIsNotNull() {
            addCriterion("outer_sign_result is not null");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultEqualTo(Integer value) {
            addCriterion("outer_sign_result =", value, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultNotEqualTo(Integer value) {
            addCriterion("outer_sign_result <>", value, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultGreaterThan(Integer value) {
            addCriterion("outer_sign_result >", value, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("outer_sign_result >=", value, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultLessThan(Integer value) {
            addCriterion("outer_sign_result <", value, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultLessThanOrEqualTo(Integer value) {
            addCriterion("outer_sign_result <=", value, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultIn(List<Integer> values) {
            addCriterion("outer_sign_result in", values, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultNotIn(List<Integer> values) {
            addCriterion("outer_sign_result not in", values, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultBetween(Integer value1, Integer value2) {
            addCriterion("outer_sign_result between", value1, value2, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andOuterSignResultNotBetween(Integer value1, Integer value2) {
            addCriterion("outer_sign_result not between", value1, value2, "outerSignResult");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusIsNull() {
            addCriterion("fund_org_business_status is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusIsNotNull() {
            addCriterion("fund_org_business_status is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusEqualTo(Integer value) {
            addCriterion("fund_org_business_status =", value, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusNotEqualTo(Integer value) {
            addCriterion("fund_org_business_status <>", value, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusGreaterThan(Integer value) {
            addCriterion("fund_org_business_status >", value, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("fund_org_business_status >=", value, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusLessThan(Integer value) {
            addCriterion("fund_org_business_status <", value, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusLessThanOrEqualTo(Integer value) {
            addCriterion("fund_org_business_status <=", value, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusIn(List<Integer> values) {
            addCriterion("fund_org_business_status in", values, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusNotIn(List<Integer> values) {
            addCriterion("fund_org_business_status not in", values, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusBetween(Integer value1, Integer value2) {
            addCriterion("fund_org_business_status between", value1, value2, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andFundOrgBusinessStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("fund_org_business_status not between", value1, value2, "fundOrgBusinessStatus");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeIsNull() {
            addCriterion("sign_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeIsNotNull() {
            addCriterion("sign_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeEqualTo(Date value) {
            addCriterion("sign_finish_time =", value, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeNotEqualTo(Date value) {
            addCriterion("sign_finish_time <>", value, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeGreaterThan(Date value) {
            addCriterion("sign_finish_time >", value, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_finish_time >=", value, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeLessThan(Date value) {
            addCriterion("sign_finish_time <", value, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_finish_time <=", value, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeIn(List<Date> values) {
            addCriterion("sign_finish_time in", values, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeNotIn(List<Date> values) {
            addCriterion("sign_finish_time not in", values, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeBetween(Date value1, Date value2) {
            addCriterion("sign_finish_time between", value1, value2, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andSignFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_finish_time not between", value1, value2, "signFinishTime");
            return (Criteria) this;
        }

        public Criteria andAuthResultIsNull() {
            addCriterion("auth_result is null");
            return (Criteria) this;
        }

        public Criteria andAuthResultIsNotNull() {
            addCriterion("auth_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuthResultEqualTo(Integer value) {
            addCriterion("auth_result =", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotEqualTo(Integer value) {
            addCriterion("auth_result <>", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultGreaterThan(Integer value) {
            addCriterion("auth_result >", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_result >=", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLessThan(Integer value) {
            addCriterion("auth_result <", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLessThanOrEqualTo(Integer value) {
            addCriterion("auth_result <=", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultIn(List<Integer> values) {
            addCriterion("auth_result in", values, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotIn(List<Integer> values) {
            addCriterion("auth_result not in", values, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultBetween(Integer value1, Integer value2) {
            addCriterion("auth_result between", value1, value2, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_result not between", value1, value2, "authResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoIsNull() {
            addCriterion("yuntu_order_no is null");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoIsNotNull() {
            addCriterion("yuntu_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoEqualTo(String value) {
            addCriterion("yuntu_order_no =", value, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoNotEqualTo(String value) {
            addCriterion("yuntu_order_no <>", value, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoGreaterThan(String value) {
            addCriterion("yuntu_order_no >", value, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("yuntu_order_no >=", value, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoLessThan(String value) {
            addCriterion("yuntu_order_no <", value, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoLessThanOrEqualTo(String value) {
            addCriterion("yuntu_order_no <=", value, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoLike(String value) {
            addCriterion("yuntu_order_no like", value, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoNotLike(String value) {
            addCriterion("yuntu_order_no not like", value, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoIn(List<String> values) {
            addCriterion("yuntu_order_no in", values, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoNotIn(List<String> values) {
            addCriterion("yuntu_order_no not in", values, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoBetween(String value1, String value2) {
            addCriterion("yuntu_order_no between", value1, value2, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderNoNotBetween(String value1, String value2) {
            addCriterion("yuntu_order_no not between", value1, value2, "yuntuOrderNo");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultIsNull() {
            addCriterion("yuntu_order_result is null");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultIsNotNull() {
            addCriterion("yuntu_order_result is not null");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultEqualTo(Integer value) {
            addCriterion("yuntu_order_result =", value, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultNotEqualTo(Integer value) {
            addCriterion("yuntu_order_result <>", value, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultGreaterThan(Integer value) {
            addCriterion("yuntu_order_result >", value, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuntu_order_result >=", value, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultLessThan(Integer value) {
            addCriterion("yuntu_order_result <", value, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultLessThanOrEqualTo(Integer value) {
            addCriterion("yuntu_order_result <=", value, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultIn(List<Integer> values) {
            addCriterion("yuntu_order_result in", values, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultNotIn(List<Integer> values) {
            addCriterion("yuntu_order_result not in", values, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultBetween(Integer value1, Integer value2) {
            addCriterion("yuntu_order_result between", value1, value2, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andYuntuOrderResultNotBetween(Integer value1, Integer value2) {
            addCriterion("yuntu_order_result not between", value1, value2, "yuntuOrderResult");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoIsNull() {
            addCriterion("patch_record_no is null");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoIsNotNull() {
            addCriterion("patch_record_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoEqualTo(String value) {
            addCriterion("patch_record_no =", value, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoNotEqualTo(String value) {
            addCriterion("patch_record_no <>", value, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoGreaterThan(String value) {
            addCriterion("patch_record_no >", value, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoGreaterThanOrEqualTo(String value) {
            addCriterion("patch_record_no >=", value, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoLessThan(String value) {
            addCriterion("patch_record_no <", value, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoLessThanOrEqualTo(String value) {
            addCriterion("patch_record_no <=", value, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoLike(String value) {
            addCriterion("patch_record_no like", value, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoNotLike(String value) {
            addCriterion("patch_record_no not like", value, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoIn(List<String> values) {
            addCriterion("patch_record_no in", values, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoNotIn(List<String> values) {
            addCriterion("patch_record_no not in", values, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoBetween(String value1, String value2) {
            addCriterion("patch_record_no between", value1, value2, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordNoNotBetween(String value1, String value2) {
            addCriterion("patch_record_no not between", value1, value2, "patchRecordNo");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusIsNull() {
            addCriterion("patch_record_status is null");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusIsNotNull() {
            addCriterion("patch_record_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusEqualTo(Integer value) {
            addCriterion("patch_record_status =", value, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusNotEqualTo(Integer value) {
            addCriterion("patch_record_status <>", value, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusGreaterThan(Integer value) {
            addCriterion("patch_record_status >", value, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patch_record_status >=", value, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusLessThan(Integer value) {
            addCriterion("patch_record_status <", value, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patch_record_status <=", value, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusIn(List<Integer> values) {
            addCriterion("patch_record_status in", values, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusNotIn(List<Integer> values) {
            addCriterion("patch_record_status not in", values, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("patch_record_status between", value1, value2, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andPatchRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patch_record_status not between", value1, value2, "patchRecordStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNull() {
            addCriterion("settle_status is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNotNull() {
            addCriterion("settle_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusEqualTo(Integer value) {
            addCriterion("settle_status =", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotEqualTo(Integer value) {
            addCriterion("settle_status <>", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThan(Integer value) {
            addCriterion("settle_status >", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_status >=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThan(Integer value) {
            addCriterion("settle_status <", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("settle_status <=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIn(List<Integer> values) {
            addCriterion("settle_status in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotIn(List<Integer> values) {
            addCriterion("settle_status not in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusBetween(Integer value1, Integer value2) {
            addCriterion("settle_status between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_status not between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIsNull() {
            addCriterion("loan_status is null");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIsNotNull() {
            addCriterion("loan_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStatusEqualTo(Integer value) {
            addCriterion("loan_status =", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotEqualTo(Integer value) {
            addCriterion("loan_status <>", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusGreaterThan(Integer value) {
            addCriterion("loan_status >", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_status >=", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLessThan(Integer value) {
            addCriterion("loan_status <", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLessThanOrEqualTo(Integer value) {
            addCriterion("loan_status <=", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIn(List<Integer> values) {
            addCriterion("loan_status in", values, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotIn(List<Integer> values) {
            addCriterion("loan_status not in", values, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusBetween(Integer value1, Integer value2) {
            addCriterion("loan_status between", value1, value2, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_status not between", value1, value2, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanResultIsNull() {
            addCriterion("loan_result is null");
            return (Criteria) this;
        }

        public Criteria andLoanResultIsNotNull() {
            addCriterion("loan_result is not null");
            return (Criteria) this;
        }

        public Criteria andLoanResultEqualTo(Integer value) {
            addCriterion("loan_result =", value, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultNotEqualTo(Integer value) {
            addCriterion("loan_result <>", value, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultGreaterThan(Integer value) {
            addCriterion("loan_result >", value, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_result >=", value, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultLessThan(Integer value) {
            addCriterion("loan_result <", value, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultLessThanOrEqualTo(Integer value) {
            addCriterion("loan_result <=", value, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultIn(List<Integer> values) {
            addCriterion("loan_result in", values, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultNotIn(List<Integer> values) {
            addCriterion("loan_result not in", values, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultBetween(Integer value1, Integer value2) {
            addCriterion("loan_result between", value1, value2, "loanResult");
            return (Criteria) this;
        }

        public Criteria andLoanResultNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_result not between", value1, value2, "loanResult");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Integer value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Integer value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Integer value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Integer value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Integer> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Integer> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusIsNull() {
            addCriterion("overdue_status is null");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusIsNotNull() {
            addCriterion("overdue_status is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusEqualTo(Integer value) {
            addCriterion("overdue_status =", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusNotEqualTo(Integer value) {
            addCriterion("overdue_status <>", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusGreaterThan(Integer value) {
            addCriterion("overdue_status >", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_status >=", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusLessThan(Integer value) {
            addCriterion("overdue_status <", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_status <=", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusIn(List<Integer> values) {
            addCriterion("overdue_status in", values, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusNotIn(List<Integer> values) {
            addCriterion("overdue_status not in", values, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusBetween(Integer value1, Integer value2) {
            addCriterion("overdue_status between", value1, value2, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_status not between", value1, value2, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewIdIsNull() {
            addCriterion("interview_id is null");
            return (Criteria) this;
        }

        public Criteria andInterviewIdIsNotNull() {
            addCriterion("interview_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewIdEqualTo(Long value) {
            addCriterion("interview_id =", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdNotEqualTo(Long value) {
            addCriterion("interview_id <>", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdGreaterThan(Long value) {
            addCriterion("interview_id >", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdGreaterThanOrEqualTo(Long value) {
            addCriterion("interview_id >=", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdLessThan(Long value) {
            addCriterion("interview_id <", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdLessThanOrEqualTo(Long value) {
            addCriterion("interview_id <=", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdIn(List<Long> values) {
            addCriterion("interview_id in", values, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdNotIn(List<Long> values) {
            addCriterion("interview_id not in", values, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdBetween(Long value1, Long value2) {
            addCriterion("interview_id between", value1, value2, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdNotBetween(Long value1, Long value2) {
            addCriterion("interview_id not between", value1, value2, "interviewId");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalIsNull() {
            addCriterion("signing_authorize_link_total is null");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalIsNotNull() {
            addCriterion("signing_authorize_link_total is not null");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalEqualTo(String value) {
            addCriterion("signing_authorize_link_total =", value, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalNotEqualTo(String value) {
            addCriterion("signing_authorize_link_total <>", value, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalGreaterThan(String value) {
            addCriterion("signing_authorize_link_total >", value, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalGreaterThanOrEqualTo(String value) {
            addCriterion("signing_authorize_link_total >=", value, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalLessThan(String value) {
            addCriterion("signing_authorize_link_total <", value, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalLessThanOrEqualTo(String value) {
            addCriterion("signing_authorize_link_total <=", value, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalLike(String value) {
            addCriterion("signing_authorize_link_total like", value, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalNotLike(String value) {
            addCriterion("signing_authorize_link_total not like", value, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalIn(List<String> values) {
            addCriterion("signing_authorize_link_total in", values, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalNotIn(List<String> values) {
            addCriterion("signing_authorize_link_total not in", values, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalBetween(String value1, String value2) {
            addCriterion("signing_authorize_link_total between", value1, value2, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andSigningAuthorizeLinkTotalNotBetween(String value1, String value2) {
            addCriterion("signing_authorize_link_total not between", value1, value2, "signingAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIsNull() {
            addCriterion("interview_status is null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIsNotNull() {
            addCriterion("interview_status is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusEqualTo(Integer value) {
            addCriterion("interview_status =", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotEqualTo(Integer value) {
            addCriterion("interview_status <>", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThan(Integer value) {
            addCriterion("interview_status >", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_status >=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThan(Integer value) {
            addCriterion("interview_status <", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("interview_status <=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIn(List<Integer> values) {
            addCriterion("interview_status in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotIn(List<Integer> values) {
            addCriterion("interview_status not in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("interview_status between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_status not between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultIsNull() {
            addCriterion("interview_verify_result is null");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultIsNotNull() {
            addCriterion("interview_verify_result is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultEqualTo(Integer value) {
            addCriterion("interview_verify_result =", value, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultNotEqualTo(Integer value) {
            addCriterion("interview_verify_result <>", value, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultGreaterThan(Integer value) {
            addCriterion("interview_verify_result >", value, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_verify_result >=", value, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultLessThan(Integer value) {
            addCriterion("interview_verify_result <", value, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultLessThanOrEqualTo(Integer value) {
            addCriterion("interview_verify_result <=", value, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultIn(List<Integer> values) {
            addCriterion("interview_verify_result in", values, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultNotIn(List<Integer> values) {
            addCriterion("interview_verify_result not in", values, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultBetween(Integer value1, Integer value2) {
            addCriterion("interview_verify_result between", value1, value2, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andInterviewVerifyResultNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_verify_result not between", value1, value2, "interviewVerifyResult");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIsNull() {
            addCriterion("flow_type is null");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIsNotNull() {
            addCriterion("flow_type is not null");
            return (Criteria) this;
        }

        public Criteria andFlowTypeEqualTo(String value) {
            addCriterion("flow_type =", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotEqualTo(String value) {
            addCriterion("flow_type <>", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeGreaterThan(String value) {
            addCriterion("flow_type >", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("flow_type >=", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeLessThan(String value) {
            addCriterion("flow_type <", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeLessThanOrEqualTo(String value) {
            addCriterion("flow_type <=", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeLike(String value) {
            addCriterion("flow_type like", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotLike(String value) {
            addCriterion("flow_type not like", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIn(List<String> values) {
            addCriterion("flow_type in", values, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotIn(List<String> values) {
            addCriterion("flow_type not in", values, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeBetween(String value1, String value2) {
            addCriterion("flow_type between", value1, value2, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotBetween(String value1, String value2) {
            addCriterion("flow_type not between", value1, value2, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyIsNull() {
            addCriterion("flow_node_key is null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyIsNotNull() {
            addCriterion("flow_node_key is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyEqualTo(String value) {
            addCriterion("flow_node_key =", value, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyNotEqualTo(String value) {
            addCriterion("flow_node_key <>", value, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyGreaterThan(String value) {
            addCriterion("flow_node_key >", value, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("flow_node_key >=", value, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyLessThan(String value) {
            addCriterion("flow_node_key <", value, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyLessThanOrEqualTo(String value) {
            addCriterion("flow_node_key <=", value, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyLike(String value) {
            addCriterion("flow_node_key like", value, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyNotLike(String value) {
            addCriterion("flow_node_key not like", value, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyIn(List<String> values) {
            addCriterion("flow_node_key in", values, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyNotIn(List<String> values) {
            addCriterion("flow_node_key not in", values, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyBetween(String value1, String value2) {
            addCriterion("flow_node_key between", value1, value2, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeKeyNotBetween(String value1, String value2) {
            addCriterion("flow_node_key not between", value1, value2, "flowNodeKey");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexIsNull() {
            addCriterion("flow_node_index is null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexIsNotNull() {
            addCriterion("flow_node_index is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexEqualTo(Integer value) {
            addCriterion("flow_node_index =", value, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexNotEqualTo(Integer value) {
            addCriterion("flow_node_index <>", value, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexGreaterThan(Integer value) {
            addCriterion("flow_node_index >", value, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_node_index >=", value, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexLessThan(Integer value) {
            addCriterion("flow_node_index <", value, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexLessThanOrEqualTo(Integer value) {
            addCriterion("flow_node_index <=", value, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexIn(List<Integer> values) {
            addCriterion("flow_node_index in", values, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexNotIn(List<Integer> values) {
            addCriterion("flow_node_index not in", values, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexBetween(Integer value1, Integer value2) {
            addCriterion("flow_node_index between", value1, value2, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_node_index not between", value1, value2, "flowNodeIndex");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameIsNull() {
            addCriterion("flow_node_name is null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameIsNotNull() {
            addCriterion("flow_node_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameEqualTo(String value) {
            addCriterion("flow_node_name =", value, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameNotEqualTo(String value) {
            addCriterion("flow_node_name <>", value, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameGreaterThan(String value) {
            addCriterion("flow_node_name >", value, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("flow_node_name >=", value, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameLessThan(String value) {
            addCriterion("flow_node_name <", value, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameLessThanOrEqualTo(String value) {
            addCriterion("flow_node_name <=", value, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameLike(String value) {
            addCriterion("flow_node_name like", value, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameNotLike(String value) {
            addCriterion("flow_node_name not like", value, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameIn(List<String> values) {
            addCriterion("flow_node_name in", values, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameNotIn(List<String> values) {
            addCriterion("flow_node_name not in", values, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameBetween(String value1, String value2) {
            addCriterion("flow_node_name between", value1, value2, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andFlowNodeNameNotBetween(String value1, String value2) {
            addCriterion("flow_node_name not between", value1, value2, "flowNodeName");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeIsNull() {
            addCriterion("data_review_time is null");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeIsNotNull() {
            addCriterion("data_review_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeEqualTo(Date value) {
            addCriterion("data_review_time =", value, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeNotEqualTo(Date value) {
            addCriterion("data_review_time <>", value, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeGreaterThan(Date value) {
            addCriterion("data_review_time >", value, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_review_time >=", value, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeLessThan(Date value) {
            addCriterion("data_review_time <", value, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_review_time <=", value, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeIn(List<Date> values) {
            addCriterion("data_review_time in", values, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeNotIn(List<Date> values) {
            addCriterion("data_review_time not in", values, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeBetween(Date value1, Date value2) {
            addCriterion("data_review_time between", value1, value2, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andDataReviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_review_time not between", value1, value2, "dataReviewTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeIsNull() {
            addCriterion("flow_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeIsNotNull() {
            addCriterion("flow_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeEqualTo(Date value) {
            addCriterion("flow_create_time =", value, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeNotEqualTo(Date value) {
            addCriterion("flow_create_time <>", value, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeGreaterThan(Date value) {
            addCriterion("flow_create_time >", value, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("flow_create_time >=", value, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeLessThan(Date value) {
            addCriterion("flow_create_time <", value, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("flow_create_time <=", value, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeIn(List<Date> values) {
            addCriterion("flow_create_time in", values, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeNotIn(List<Date> values) {
            addCriterion("flow_create_time not in", values, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeBetween(Date value1, Date value2) {
            addCriterion("flow_create_time between", value1, value2, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlowCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("flow_create_time not between", value1, value2, "flowCreateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeIsNull() {
            addCriterion("business_approval_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeIsNotNull() {
            addCriterion("business_approval_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeEqualTo(Date value) {
            addCriterion("business_approval_time =", value, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeNotEqualTo(Date value) {
            addCriterion("business_approval_time <>", value, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeGreaterThan(Date value) {
            addCriterion("business_approval_time >", value, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_approval_time >=", value, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeLessThan(Date value) {
            addCriterion("business_approval_time <", value, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_approval_time <=", value, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeIn(List<Date> values) {
            addCriterion("business_approval_time in", values, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeNotIn(List<Date> values) {
            addCriterion("business_approval_time not in", values, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("business_approval_time between", value1, value2, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andBusinessApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_approval_time not between", value1, value2, "businessApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeIsNull() {
            addCriterion("loan_approval_time is null");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeIsNotNull() {
            addCriterion("loan_approval_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeEqualTo(Date value) {
            addCriterion("loan_approval_time =", value, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeNotEqualTo(Date value) {
            addCriterion("loan_approval_time <>", value, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeGreaterThan(Date value) {
            addCriterion("loan_approval_time >", value, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loan_approval_time >=", value, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeLessThan(Date value) {
            addCriterion("loan_approval_time <", value, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("loan_approval_time <=", value, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeIn(List<Date> values) {
            addCriterion("loan_approval_time in", values, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeNotIn(List<Date> values) {
            addCriterion("loan_approval_time not in", values, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("loan_approval_time between", value1, value2, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andLoanApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("loan_approval_time not between", value1, value2, "loanApprovalTime");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateIsNull() {
            addCriterion("payment_loan_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateIsNotNull() {
            addCriterion("payment_loan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateEqualTo(Date value) {
            addCriterion("payment_loan_date =", value, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateNotEqualTo(Date value) {
            addCriterion("payment_loan_date <>", value, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateGreaterThan(Date value) {
            addCriterion("payment_loan_date >", value, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_loan_date >=", value, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateLessThan(Date value) {
            addCriterion("payment_loan_date <", value, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateLessThanOrEqualTo(Date value) {
            addCriterion("payment_loan_date <=", value, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateIn(List<Date> values) {
            addCriterion("payment_loan_date in", values, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateNotIn(List<Date> values) {
            addCriterion("payment_loan_date not in", values, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateBetween(Date value1, Date value2) {
            addCriterion("payment_loan_date between", value1, value2, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andPaymentLoanDateNotBetween(Date value1, Date value2) {
            addCriterion("payment_loan_date not between", value1, value2, "paymentLoanDate");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeIsNull() {
            addCriterion("flow_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeIsNotNull() {
            addCriterion("flow_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeEqualTo(Date value) {
            addCriterion("flow_finish_time =", value, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeNotEqualTo(Date value) {
            addCriterion("flow_finish_time <>", value, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeGreaterThan(Date value) {
            addCriterion("flow_finish_time >", value, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("flow_finish_time >=", value, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeLessThan(Date value) {
            addCriterion("flow_finish_time <", value, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("flow_finish_time <=", value, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeIn(List<Date> values) {
            addCriterion("flow_finish_time in", values, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeNotIn(List<Date> values) {
            addCriterion("flow_finish_time not in", values, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeBetween(Date value1, Date value2) {
            addCriterion("flow_finish_time between", value1, value2, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andFlowFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("flow_finish_time not between", value1, value2, "flowFinishTime");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountIsNull() {
            addCriterion("bank_sub_account is null");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountIsNotNull() {
            addCriterion("bank_sub_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountEqualTo(String value) {
            addCriterion("bank_sub_account =", value, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountNotEqualTo(String value) {
            addCriterion("bank_sub_account <>", value, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountGreaterThan(String value) {
            addCriterion("bank_sub_account >", value, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_sub_account >=", value, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountLessThan(String value) {
            addCriterion("bank_sub_account <", value, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_sub_account <=", value, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountLike(String value) {
            addCriterion("bank_sub_account like", value, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountNotLike(String value) {
            addCriterion("bank_sub_account not like", value, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountIn(List<String> values) {
            addCriterion("bank_sub_account in", values, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountNotIn(List<String> values) {
            addCriterion("bank_sub_account not in", values, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountBetween(String value1, String value2) {
            addCriterion("bank_sub_account between", value1, value2, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andBankSubAccountNotBetween(String value1, String value2) {
            addCriterion("bank_sub_account not between", value1, value2, "bankSubAccount");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoIsNull() {
            addCriterion("mango_acct_no is null");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoIsNotNull() {
            addCriterion("mango_acct_no is not null");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoEqualTo(String value) {
            addCriterion("mango_acct_no =", value, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoNotEqualTo(String value) {
            addCriterion("mango_acct_no <>", value, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoGreaterThan(String value) {
            addCriterion("mango_acct_no >", value, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("mango_acct_no >=", value, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoLessThan(String value) {
            addCriterion("mango_acct_no <", value, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoLessThanOrEqualTo(String value) {
            addCriterion("mango_acct_no <=", value, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoLike(String value) {
            addCriterion("mango_acct_no like", value, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoNotLike(String value) {
            addCriterion("mango_acct_no not like", value, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoIn(List<String> values) {
            addCriterion("mango_acct_no in", values, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoNotIn(List<String> values) {
            addCriterion("mango_acct_no not in", values, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoBetween(String value1, String value2) {
            addCriterion("mango_acct_no between", value1, value2, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andMangoAcctNoNotBetween(String value1, String value2) {
            addCriterion("mango_acct_no not between", value1, value2, "mangoAcctNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoIsNull() {
            addCriterion("host_cust_no is null");
            return (Criteria) this;
        }

        public Criteria andHostCustNoIsNotNull() {
            addCriterion("host_cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andHostCustNoEqualTo(String value) {
            addCriterion("host_cust_no =", value, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoNotEqualTo(String value) {
            addCriterion("host_cust_no <>", value, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoGreaterThan(String value) {
            addCriterion("host_cust_no >", value, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("host_cust_no >=", value, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoLessThan(String value) {
            addCriterion("host_cust_no <", value, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoLessThanOrEqualTo(String value) {
            addCriterion("host_cust_no <=", value, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoLike(String value) {
            addCriterion("host_cust_no like", value, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoNotLike(String value) {
            addCriterion("host_cust_no not like", value, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoIn(List<String> values) {
            addCriterion("host_cust_no in", values, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoNotIn(List<String> values) {
            addCriterion("host_cust_no not in", values, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoBetween(String value1, String value2) {
            addCriterion("host_cust_no between", value1, value2, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andHostCustNoNotBetween(String value1, String value2) {
            addCriterion("host_cust_no not between", value1, value2, "hostCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("bank_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("bank_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("bank_card_no =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("bank_card_no <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("bank_card_no >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_no >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("bank_card_no <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_no <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("bank_card_no like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("bank_card_no not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("bank_card_no in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("bank_card_no not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("bank_card_no between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("bank_card_no not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeIsNull() {
            addCriterion("bank_card_get_type is null");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeIsNotNull() {
            addCriterion("bank_card_get_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeEqualTo(Integer value) {
            addCriterion("bank_card_get_type =", value, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeNotEqualTo(Integer value) {
            addCriterion("bank_card_get_type <>", value, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeGreaterThan(Integer value) {
            addCriterion("bank_card_get_type >", value, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_card_get_type >=", value, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeLessThan(Integer value) {
            addCriterion("bank_card_get_type <", value, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bank_card_get_type <=", value, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeIn(List<Integer> values) {
            addCriterion("bank_card_get_type in", values, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeNotIn(List<Integer> values) {
            addCriterion("bank_card_get_type not in", values, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeBetween(Integer value1, Integer value2) {
            addCriterion("bank_card_get_type between", value1, value2, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andBankCardGetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_card_get_type not between", value1, value2, "bankCardGetType");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIsNull() {
            addCriterion("loan_purpose is null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIsNotNull() {
            addCriterion("loan_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeEqualTo(String value) {
            addCriterion("loan_purpose =", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotEqualTo(String value) {
            addCriterion("loan_purpose <>", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeGreaterThan(String value) {
            addCriterion("loan_purpose >", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_purpose >=", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLessThan(String value) {
            addCriterion("loan_purpose <", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLessThanOrEqualTo(String value) {
            addCriterion("loan_purpose <=", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLike(String value) {
            addCriterion("loan_purpose like", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotLike(String value) {
            addCriterion("loan_purpose not like", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIn(List<String> values) {
            addCriterion("loan_purpose in", values, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotIn(List<String> values) {
            addCriterion("loan_purpose not in", values, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeBetween(String value1, String value2) {
            addCriterion("loan_purpose between", value1, value2, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotBetween(String value1, String value2) {
            addCriterion("loan_purpose not between", value1, value2, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeIsNull() {
            addCriterion("extra_loan_purpose is null");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeIsNotNull() {
            addCriterion("extra_loan_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeEqualTo(String value) {
            addCriterion("extra_loan_purpose =", value, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeNotEqualTo(String value) {
            addCriterion("extra_loan_purpose <>", value, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeGreaterThan(String value) {
            addCriterion("extra_loan_purpose >", value, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("extra_loan_purpose >=", value, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeLessThan(String value) {
            addCriterion("extra_loan_purpose <", value, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeLessThanOrEqualTo(String value) {
            addCriterion("extra_loan_purpose <=", value, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeLike(String value) {
            addCriterion("extra_loan_purpose like", value, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeNotLike(String value) {
            addCriterion("extra_loan_purpose not like", value, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeIn(List<String> values) {
            addCriterion("extra_loan_purpose in", values, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeNotIn(List<String> values) {
            addCriterion("extra_loan_purpose not in", values, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeBetween(String value1, String value2) {
            addCriterion("extra_loan_purpose between", value1, value2, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andExtraLoanPurposeNotBetween(String value1, String value2) {
            addCriterion("extra_loan_purpose not between", value1, value2, "extraLoanPurpose");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusIsNull() {
            addCriterion("lawsuit_status is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusIsNotNull() {
            addCriterion("lawsuit_status is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusEqualTo(Integer value) {
            addCriterion("lawsuit_status =", value, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusNotEqualTo(Integer value) {
            addCriterion("lawsuit_status <>", value, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusGreaterThan(Integer value) {
            addCriterion("lawsuit_status >", value, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lawsuit_status >=", value, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusLessThan(Integer value) {
            addCriterion("lawsuit_status <", value, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lawsuit_status <=", value, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusIn(List<Integer> values) {
            addCriterion("lawsuit_status in", values, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusNotIn(List<Integer> values) {
            addCriterion("lawsuit_status not in", values, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusBetween(Integer value1, Integer value2) {
            addCriterion("lawsuit_status between", value1, value2, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andLawsuitStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lawsuit_status not between", value1, value2, "lawsuitStatus");
            return (Criteria) this;
        }

        public Criteria andIsInuseIsNull() {
            addCriterion("is_inuse is null");
            return (Criteria) this;
        }

        public Criteria andIsInuseIsNotNull() {
            addCriterion("is_inuse is not null");
            return (Criteria) this;
        }

        public Criteria andIsInuseEqualTo(Boolean value) {
            addCriterion("is_inuse =", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseNotEqualTo(Boolean value) {
            addCriterion("is_inuse <>", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseGreaterThan(Boolean value) {
            addCriterion("is_inuse >", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_inuse >=", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseLessThan(Boolean value) {
            addCriterion("is_inuse <", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseLessThanOrEqualTo(Boolean value) {
            addCriterion("is_inuse <=", value, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseIn(List<Boolean> values) {
            addCriterion("is_inuse in", values, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseNotIn(List<Boolean> values) {
            addCriterion("is_inuse not in", values, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseBetween(Boolean value1, Boolean value2) {
            addCriterion("is_inuse between", value1, value2, "isInuse");
            return (Criteria) this;
        }

        public Criteria andIsInuseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_inuse not between", value1, value2, "isInuse");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}