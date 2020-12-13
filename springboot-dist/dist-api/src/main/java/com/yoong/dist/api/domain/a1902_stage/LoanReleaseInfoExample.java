package com.yoong.dist.api.domain.a1902_stage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanReleaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanReleaseInfoExample() {
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdIsNull() {
            addCriterion("api_service_id is null");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdIsNotNull() {
            addCriterion("api_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdEqualTo(Long value) {
            addCriterion("api_service_id =", value, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdNotEqualTo(Long value) {
            addCriterion("api_service_id <>", value, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdGreaterThan(Long value) {
            addCriterion("api_service_id >", value, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("api_service_id >=", value, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdLessThan(Long value) {
            addCriterion("api_service_id <", value, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdLessThanOrEqualTo(Long value) {
            addCriterion("api_service_id <=", value, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdIn(List<Long> values) {
            addCriterion("api_service_id in", values, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdNotIn(List<Long> values) {
            addCriterion("api_service_id not in", values, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdBetween(Long value1, Long value2) {
            addCriterion("api_service_id between", value1, value2, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiServiceIdNotBetween(Long value1, Long value2) {
            addCriterion("api_service_id not between", value1, value2, "apiServiceId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdIsNull() {
            addCriterion("api_send_id is null");
            return (Criteria) this;
        }

        public Criteria andApiSendIdIsNotNull() {
            addCriterion("api_send_id is not null");
            return (Criteria) this;
        }

        public Criteria andApiSendIdEqualTo(Long value) {
            addCriterion("api_send_id =", value, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdNotEqualTo(Long value) {
            addCriterion("api_send_id <>", value, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdGreaterThan(Long value) {
            addCriterion("api_send_id >", value, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("api_send_id >=", value, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdLessThan(Long value) {
            addCriterion("api_send_id <", value, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdLessThanOrEqualTo(Long value) {
            addCriterion("api_send_id <=", value, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdIn(List<Long> values) {
            addCriterion("api_send_id in", values, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdNotIn(List<Long> values) {
            addCriterion("api_send_id not in", values, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdBetween(Long value1, Long value2) {
            addCriterion("api_send_id between", value1, value2, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andApiSendIdNotBetween(Long value1, Long value2) {
            addCriterion("api_send_id not between", value1, value2, "apiSendId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdIsNull() {
            addCriterion("callback_id is null");
            return (Criteria) this;
        }

        public Criteria andCallbackIdIsNotNull() {
            addCriterion("callback_id is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackIdEqualTo(Long value) {
            addCriterion("callback_id =", value, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdNotEqualTo(Long value) {
            addCriterion("callback_id <>", value, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdGreaterThan(Long value) {
            addCriterion("callback_id >", value, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("callback_id >=", value, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdLessThan(Long value) {
            addCriterion("callback_id <", value, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdLessThanOrEqualTo(Long value) {
            addCriterion("callback_id <=", value, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdIn(List<Long> values) {
            addCriterion("callback_id in", values, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdNotIn(List<Long> values) {
            addCriterion("callback_id not in", values, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdBetween(Long value1, Long value2) {
            addCriterion("callback_id between", value1, value2, "callbackId");
            return (Criteria) this;
        }

        public Criteria andCallbackIdNotBetween(Long value1, Long value2) {
            addCriterion("callback_id not between", value1, value2, "callbackId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andEachAmtIsNull() {
            addCriterion("each_amt is null");
            return (Criteria) this;
        }

        public Criteria andEachAmtIsNotNull() {
            addCriterion("each_amt is not null");
            return (Criteria) this;
        }

        public Criteria andEachAmtEqualTo(BigDecimal value) {
            addCriterion("each_amt =", value, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtNotEqualTo(BigDecimal value) {
            addCriterion("each_amt <>", value, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtGreaterThan(BigDecimal value) {
            addCriterion("each_amt >", value, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("each_amt >=", value, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtLessThan(BigDecimal value) {
            addCriterion("each_amt <", value, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("each_amt <=", value, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtIn(List<BigDecimal> values) {
            addCriterion("each_amt in", values, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtNotIn(List<BigDecimal> values) {
            addCriterion("each_amt not in", values, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("each_amt between", value1, value2, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("each_amt not between", value1, value2, "eachAmt");
            return (Criteria) this;
        }

        public Criteria andEachDateIsNull() {
            addCriterion("each_date is null");
            return (Criteria) this;
        }

        public Criteria andEachDateIsNotNull() {
            addCriterion("each_date is not null");
            return (Criteria) this;
        }

        public Criteria andEachDateEqualTo(Integer value) {
            addCriterion("each_date =", value, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateNotEqualTo(Integer value) {
            addCriterion("each_date <>", value, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateGreaterThan(Integer value) {
            addCriterion("each_date >", value, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("each_date >=", value, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateLessThan(Integer value) {
            addCriterion("each_date <", value, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateLessThanOrEqualTo(Integer value) {
            addCriterion("each_date <=", value, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateIn(List<Integer> values) {
            addCriterion("each_date in", values, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateNotIn(List<Integer> values) {
            addCriterion("each_date not in", values, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateBetween(Integer value1, Integer value2) {
            addCriterion("each_date between", value1, value2, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachDateNotBetween(Integer value1, Integer value2) {
            addCriterion("each_date not between", value1, value2, "eachDate");
            return (Criteria) this;
        }

        public Criteria andEachPfeeIsNull() {
            addCriterion("each_pfee is null");
            return (Criteria) this;
        }

        public Criteria andEachPfeeIsNotNull() {
            addCriterion("each_pfee is not null");
            return (Criteria) this;
        }

        public Criteria andEachPfeeEqualTo(BigDecimal value) {
            addCriterion("each_pfee =", value, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeNotEqualTo(BigDecimal value) {
            addCriterion("each_pfee <>", value, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeGreaterThan(BigDecimal value) {
            addCriterion("each_pfee >", value, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("each_pfee >=", value, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeLessThan(BigDecimal value) {
            addCriterion("each_pfee <", value, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("each_pfee <=", value, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeIn(List<BigDecimal> values) {
            addCriterion("each_pfee in", values, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeNotIn(List<BigDecimal> values) {
            addCriterion("each_pfee not in", values, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("each_pfee between", value1, value2, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andEachPfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("each_pfee not between", value1, value2, "eachPfee");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNull() {
            addCriterion("fee_amt is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNotNull() {
            addCriterion("fee_amt is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtEqualTo(BigDecimal value) {
            addCriterion("fee_amt =", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("fee_amt <>", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("fee_amt >", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amt >=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThan(BigDecimal value) {
            addCriterion("fee_amt <", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amt <=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIn(List<BigDecimal> values) {
            addCriterion("fee_amt in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("fee_amt not in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amt between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amt not between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtIsNull() {
            addCriterion("first_amt is null");
            return (Criteria) this;
        }

        public Criteria andFirstAmtIsNotNull() {
            addCriterion("first_amt is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAmtEqualTo(BigDecimal value) {
            addCriterion("first_amt =", value, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtNotEqualTo(BigDecimal value) {
            addCriterion("first_amt <>", value, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtGreaterThan(BigDecimal value) {
            addCriterion("first_amt >", value, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_amt >=", value, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtLessThan(BigDecimal value) {
            addCriterion("first_amt <", value, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_amt <=", value, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtIn(List<BigDecimal> values) {
            addCriterion("first_amt in", values, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtNotIn(List<BigDecimal> values) {
            addCriterion("first_amt not in", values, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_amt between", value1, value2, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_amt not between", value1, value2, "firstAmt");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeIsNull() {
            addCriterion("first_pfee is null");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeIsNotNull() {
            addCriterion("first_pfee is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeEqualTo(BigDecimal value) {
            addCriterion("first_pfee =", value, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeNotEqualTo(BigDecimal value) {
            addCriterion("first_pfee <>", value, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeGreaterThan(BigDecimal value) {
            addCriterion("first_pfee >", value, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_pfee >=", value, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeLessThan(BigDecimal value) {
            addCriterion("first_pfee <", value, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_pfee <=", value, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeIn(List<BigDecimal> values) {
            addCriterion("first_pfee in", values, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeNotIn(List<BigDecimal> values) {
            addCriterion("first_pfee not in", values, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_pfee between", value1, value2, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andFirstPfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_pfee not between", value1, value2, "firstPfee");
            return (Criteria) this;
        }

        public Criteria andLoanAccountIsNull() {
            addCriterion("loan_account is null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountIsNotNull() {
            addCriterion("loan_account is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountEqualTo(String value) {
            addCriterion("loan_account =", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNotEqualTo(String value) {
            addCriterion("loan_account <>", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountGreaterThan(String value) {
            addCriterion("loan_account >", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountGreaterThanOrEqualTo(String value) {
            addCriterion("loan_account >=", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountLessThan(String value) {
            addCriterion("loan_account <", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountLessThanOrEqualTo(String value) {
            addCriterion("loan_account <=", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountLike(String value) {
            addCriterion("loan_account like", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNotLike(String value) {
            addCriterion("loan_account not like", value, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountIn(List<String> values) {
            addCriterion("loan_account in", values, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNotIn(List<String> values) {
            addCriterion("loan_account not in", values, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountBetween(String value1, String value2) {
            addCriterion("loan_account between", value1, value2, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNotBetween(String value1, String value2) {
            addCriterion("loan_account not between", value1, value2, "loanAccount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanFlagIsNull() {
            addCriterion("loan_flag is null");
            return (Criteria) this;
        }

        public Criteria andLoanFlagIsNotNull() {
            addCriterion("loan_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLoanFlagEqualTo(Integer value) {
            addCriterion("loan_flag =", value, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagNotEqualTo(Integer value) {
            addCriterion("loan_flag <>", value, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagGreaterThan(Integer value) {
            addCriterion("loan_flag >", value, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_flag >=", value, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagLessThan(Integer value) {
            addCriterion("loan_flag <", value, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagLessThanOrEqualTo(Integer value) {
            addCriterion("loan_flag <=", value, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagIn(List<Integer> values) {
            addCriterion("loan_flag in", values, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagNotIn(List<Integer> values) {
            addCriterion("loan_flag not in", values, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagBetween(Integer value1, Integer value2) {
            addCriterion("loan_flag between", value1, value2, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andLoanFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_flag not between", value1, value2, "loanFlag");
            return (Criteria) this;
        }

        public Criteria andNextDateIsNull() {
            addCriterion("next_date is null");
            return (Criteria) this;
        }

        public Criteria andNextDateIsNotNull() {
            addCriterion("next_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextDateEqualTo(String value) {
            addCriterion("next_date =", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotEqualTo(String value) {
            addCriterion("next_date <>", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateGreaterThan(String value) {
            addCriterion("next_date >", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateGreaterThanOrEqualTo(String value) {
            addCriterion("next_date >=", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateLessThan(String value) {
            addCriterion("next_date <", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateLessThanOrEqualTo(String value) {
            addCriterion("next_date <=", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateLike(String value) {
            addCriterion("next_date like", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotLike(String value) {
            addCriterion("next_date not like", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateIn(List<String> values) {
            addCriterion("next_date in", values, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotIn(List<String> values) {
            addCriterion("next_date not in", values, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateBetween(String value1, String value2) {
            addCriterion("next_date between", value1, value2, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotBetween(String value1, String value2) {
            addCriterion("next_date not between", value1, value2, "nextDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateIsNull() {
            addCriterion("release_loan_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateIsNotNull() {
            addCriterion("release_loan_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateEqualTo(Date value) {
            addCriterion("release_loan_date =", value, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateNotEqualTo(Date value) {
            addCriterion("release_loan_date <>", value, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateGreaterThan(Date value) {
            addCriterion("release_loan_date >", value, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("release_loan_date >=", value, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateLessThan(Date value) {
            addCriterion("release_loan_date <", value, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateLessThanOrEqualTo(Date value) {
            addCriterion("release_loan_date <=", value, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateIn(List<Date> values) {
            addCriterion("release_loan_date in", values, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateNotIn(List<Date> values) {
            addCriterion("release_loan_date not in", values, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateBetween(Date value1, Date value2) {
            addCriterion("release_loan_date between", value1, value2, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andReleaseLoanDateNotBetween(Date value1, Date value2) {
            addCriterion("release_loan_date not between", value1, value2, "releaseLoanDate");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNull() {
            addCriterion("loan_date is null");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNotNull() {
            addCriterion("loan_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDateEqualTo(String value) {
            addCriterion("loan_date =", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotEqualTo(String value) {
            addCriterion("loan_date <>", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThan(String value) {
            addCriterion("loan_date >", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThanOrEqualTo(String value) {
            addCriterion("loan_date >=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThan(String value) {
            addCriterion("loan_date <", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThanOrEqualTo(String value) {
            addCriterion("loan_date <=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLike(String value) {
            addCriterion("loan_date like", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotLike(String value) {
            addCriterion("loan_date not like", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateIn(List<String> values) {
            addCriterion("loan_date in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotIn(List<String> values) {
            addCriterion("loan_date not in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateBetween(String value1, String value2) {
            addCriterion("loan_date between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotBetween(String value1, String value2) {
            addCriterion("loan_date not between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateIsNull() {
            addCriterion("loan_stage_date is null");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateIsNotNull() {
            addCriterion("loan_stage_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateEqualTo(String value) {
            addCriterion("loan_stage_date =", value, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateNotEqualTo(String value) {
            addCriterion("loan_stage_date <>", value, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateGreaterThan(String value) {
            addCriterion("loan_stage_date >", value, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateGreaterThanOrEqualTo(String value) {
            addCriterion("loan_stage_date >=", value, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateLessThan(String value) {
            addCriterion("loan_stage_date <", value, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateLessThanOrEqualTo(String value) {
            addCriterion("loan_stage_date <=", value, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateLike(String value) {
            addCriterion("loan_stage_date like", value, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateNotLike(String value) {
            addCriterion("loan_stage_date not like", value, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateIn(List<String> values) {
            addCriterion("loan_stage_date in", values, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateNotIn(List<String> values) {
            addCriterion("loan_stage_date not in", values, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateBetween(String value1, String value2) {
            addCriterion("loan_stage_date between", value1, value2, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andLoanStageDateNotBetween(String value1, String value2) {
            addCriterion("loan_stage_date not between", value1, value2, "loanStageDate");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeIsNull() {
            addCriterion("bank_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeIsNotNull() {
            addCriterion("bank_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeEqualTo(BigDecimal value) {
            addCriterion("bank_service_fee =", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("bank_service_fee <>", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("bank_service_fee >", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_service_fee >=", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeLessThan(BigDecimal value) {
            addCriterion("bank_service_fee <", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_service_fee <=", value, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeIn(List<BigDecimal> values) {
            addCriterion("bank_service_fee in", values, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("bank_service_fee not in", values, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_service_fee between", value1, value2, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andBankServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_service_fee not between", value1, value2, "bankServiceFee");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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