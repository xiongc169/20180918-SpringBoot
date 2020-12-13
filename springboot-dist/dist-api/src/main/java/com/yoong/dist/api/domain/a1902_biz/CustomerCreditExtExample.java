package com.yoong.dist.api.domain.a1902_biz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerCreditExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerCreditExtExample() {
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

        public Criteria andCreditIdIsNull() {
            addCriterion("credit_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditIdIsNotNull() {
            addCriterion("credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditIdEqualTo(Long value) {
            addCriterion("credit_id =", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotEqualTo(Long value) {
            addCriterion("credit_id <>", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThan(Long value) {
            addCriterion("credit_id >", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_id >=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThan(Long value) {
            addCriterion("credit_id <", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThanOrEqualTo(Long value) {
            addCriterion("credit_id <=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdIn(List<Long> values) {
            addCriterion("credit_id in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotIn(List<Long> values) {
            addCriterion("credit_id not in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdBetween(Long value1, Long value2) {
            addCriterion("credit_id between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotBetween(Long value1, Long value2) {
            addCriterion("credit_id not between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdIsNull() {
            addCriterion("last_credit_id is null");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdIsNotNull() {
            addCriterion("last_credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdEqualTo(Long value) {
            addCriterion("last_credit_id =", value, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdNotEqualTo(Long value) {
            addCriterion("last_credit_id <>", value, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdGreaterThan(Long value) {
            addCriterion("last_credit_id >", value, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("last_credit_id >=", value, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdLessThan(Long value) {
            addCriterion("last_credit_id <", value, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdLessThanOrEqualTo(Long value) {
            addCriterion("last_credit_id <=", value, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdIn(List<Long> values) {
            addCriterion("last_credit_id in", values, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdNotIn(List<Long> values) {
            addCriterion("last_credit_id not in", values, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdBetween(Long value1, Long value2) {
            addCriterion("last_credit_id between", value1, value2, "lastCreditId");
            return (Criteria) this;
        }

        public Criteria andLastCreditIdNotBetween(Long value1, Long value2) {
            addCriterion("last_credit_id not between", value1, value2, "lastCreditId");
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

        public Criteria andExpectLoanAmountIsNull() {
            addCriterion("expect_loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountIsNotNull() {
            addCriterion("expect_loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountEqualTo(BigDecimal value) {
            addCriterion("expect_loan_amount =", value, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("expect_loan_amount <>", value, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("expect_loan_amount >", value, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_loan_amount >=", value, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountLessThan(BigDecimal value) {
            addCriterion("expect_loan_amount <", value, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_loan_amount <=", value, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountIn(List<BigDecimal> values) {
            addCriterion("expect_loan_amount in", values, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("expect_loan_amount not in", values, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_loan_amount between", value1, value2, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_loan_amount not between", value1, value2, "expectLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountIsNull() {
            addCriterion("expect_extra_loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountIsNotNull() {
            addCriterion("expect_extra_loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountEqualTo(BigDecimal value) {
            addCriterion("expect_extra_loan_amount =", value, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("expect_extra_loan_amount <>", value, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("expect_extra_loan_amount >", value, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_extra_loan_amount >=", value, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountLessThan(BigDecimal value) {
            addCriterion("expect_extra_loan_amount <", value, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_extra_loan_amount <=", value, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountIn(List<BigDecimal> values) {
            addCriterion("expect_extra_loan_amount in", values, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("expect_extra_loan_amount not in", values, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_extra_loan_amount between", value1, value2, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectExtraLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_extra_loan_amount not between", value1, value2, "expectExtraLoanAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountIsNull() {
            addCriterion("expect_car_trans_amount is null");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountIsNotNull() {
            addCriterion("expect_car_trans_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountEqualTo(BigDecimal value) {
            addCriterion("expect_car_trans_amount =", value, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountNotEqualTo(BigDecimal value) {
            addCriterion("expect_car_trans_amount <>", value, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountGreaterThan(BigDecimal value) {
            addCriterion("expect_car_trans_amount >", value, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_car_trans_amount >=", value, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountLessThan(BigDecimal value) {
            addCriterion("expect_car_trans_amount <", value, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_car_trans_amount <=", value, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountIn(List<BigDecimal> values) {
            addCriterion("expect_car_trans_amount in", values, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountNotIn(List<BigDecimal> values) {
            addCriterion("expect_car_trans_amount not in", values, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_car_trans_amount between", value1, value2, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectCarTransAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_car_trans_amount not between", value1, value2, "expectCarTransAmount");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermIsNull() {
            addCriterion("expect_loan_term is null");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermIsNotNull() {
            addCriterion("expect_loan_term is not null");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermEqualTo(String value) {
            addCriterion("expect_loan_term =", value, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermNotEqualTo(String value) {
            addCriterion("expect_loan_term <>", value, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermGreaterThan(String value) {
            addCriterion("expect_loan_term >", value, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermGreaterThanOrEqualTo(String value) {
            addCriterion("expect_loan_term >=", value, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermLessThan(String value) {
            addCriterion("expect_loan_term <", value, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermLessThanOrEqualTo(String value) {
            addCriterion("expect_loan_term <=", value, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermLike(String value) {
            addCriterion("expect_loan_term like", value, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermNotLike(String value) {
            addCriterion("expect_loan_term not like", value, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermIn(List<String> values) {
            addCriterion("expect_loan_term in", values, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermNotIn(List<String> values) {
            addCriterion("expect_loan_term not in", values, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermBetween(String value1, String value2) {
            addCriterion("expect_loan_term between", value1, value2, "expectLoanTerm");
            return (Criteria) this;
        }

        public Criteria andExpectLoanTermNotBetween(String value1, String value2) {
            addCriterion("expect_loan_term not between", value1, value2, "expectLoanTerm");
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

        public Criteria andPreCheckBankCardIsNull() {
            addCriterion("pre_check_bank_card is null");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardIsNotNull() {
            addCriterion("pre_check_bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardEqualTo(Integer value) {
            addCriterion("pre_check_bank_card =", value, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardNotEqualTo(Integer value) {
            addCriterion("pre_check_bank_card <>", value, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardGreaterThan(Integer value) {
            addCriterion("pre_check_bank_card >", value, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_check_bank_card >=", value, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardLessThan(Integer value) {
            addCriterion("pre_check_bank_card <", value, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardLessThanOrEqualTo(Integer value) {
            addCriterion("pre_check_bank_card <=", value, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardIn(List<Integer> values) {
            addCriterion("pre_check_bank_card in", values, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardNotIn(List<Integer> values) {
            addCriterion("pre_check_bank_card not in", values, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardBetween(Integer value1, Integer value2) {
            addCriterion("pre_check_bank_card between", value1, value2, "preCheckBankCard");
            return (Criteria) this;
        }

        public Criteria andPreCheckBankCardNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_check_bank_card not between", value1, value2, "preCheckBankCard");
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

        public Criteria andOcrStatusIsNull() {
            addCriterion("ocr_status is null");
            return (Criteria) this;
        }

        public Criteria andOcrStatusIsNotNull() {
            addCriterion("ocr_status is not null");
            return (Criteria) this;
        }

        public Criteria andOcrStatusEqualTo(Integer value) {
            addCriterion("ocr_status =", value, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusNotEqualTo(Integer value) {
            addCriterion("ocr_status <>", value, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusGreaterThan(Integer value) {
            addCriterion("ocr_status >", value, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ocr_status >=", value, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusLessThan(Integer value) {
            addCriterion("ocr_status <", value, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ocr_status <=", value, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusIn(List<Integer> values) {
            addCriterion("ocr_status in", values, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusNotIn(List<Integer> values) {
            addCriterion("ocr_status not in", values, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusBetween(Integer value1, Integer value2) {
            addCriterion("ocr_status between", value1, value2, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andOcrStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ocr_status not between", value1, value2, "ocrStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusIsNull() {
            addCriterion("real_auth_status is null");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusIsNotNull() {
            addCriterion("real_auth_status is not null");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusEqualTo(Integer value) {
            addCriterion("real_auth_status =", value, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusNotEqualTo(Integer value) {
            addCriterion("real_auth_status <>", value, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusGreaterThan(Integer value) {
            addCriterion("real_auth_status >", value, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_auth_status >=", value, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusLessThan(Integer value) {
            addCriterion("real_auth_status <", value, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusLessThanOrEqualTo(Integer value) {
            addCriterion("real_auth_status <=", value, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusIn(List<Integer> values) {
            addCriterion("real_auth_status in", values, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusNotIn(List<Integer> values) {
            addCriterion("real_auth_status not in", values, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusBetween(Integer value1, Integer value2) {
            addCriterion("real_auth_status between", value1, value2, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andRealAuthStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("real_auth_status not between", value1, value2, "realAuthStatus");
            return (Criteria) this;
        }

        public Criteria andCreditResultIsNull() {
            addCriterion("credit_result is null");
            return (Criteria) this;
        }

        public Criteria andCreditResultIsNotNull() {
            addCriterion("credit_result is not null");
            return (Criteria) this;
        }

        public Criteria andCreditResultEqualTo(Integer value) {
            addCriterion("credit_result =", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultNotEqualTo(Integer value) {
            addCriterion("credit_result <>", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultGreaterThan(Integer value) {
            addCriterion("credit_result >", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_result >=", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultLessThan(Integer value) {
            addCriterion("credit_result <", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultLessThanOrEqualTo(Integer value) {
            addCriterion("credit_result <=", value, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultIn(List<Integer> values) {
            addCriterion("credit_result in", values, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultNotIn(List<Integer> values) {
            addCriterion("credit_result not in", values, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultBetween(Integer value1, Integer value2) {
            addCriterion("credit_result between", value1, value2, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditResultNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_result not between", value1, value2, "creditResult");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIsNull() {
            addCriterion("credit_remark is null");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIsNotNull() {
            addCriterion("credit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkEqualTo(String value) {
            addCriterion("credit_remark =", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotEqualTo(String value) {
            addCriterion("credit_remark <>", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkGreaterThan(String value) {
            addCriterion("credit_remark >", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("credit_remark >=", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLessThan(String value) {
            addCriterion("credit_remark <", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLessThanOrEqualTo(String value) {
            addCriterion("credit_remark <=", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLike(String value) {
            addCriterion("credit_remark like", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotLike(String value) {
            addCriterion("credit_remark not like", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIn(List<String> values) {
            addCriterion("credit_remark in", values, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotIn(List<String> values) {
            addCriterion("credit_remark not in", values, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkBetween(String value1, String value2) {
            addCriterion("credit_remark between", value1, value2, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotBetween(String value1, String value2) {
            addCriterion("credit_remark not between", value1, value2, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNull() {
            addCriterion("credit_status is null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNotNull() {
            addCriterion("credit_status is not null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusEqualTo(Integer value) {
            addCriterion("credit_status =", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotEqualTo(Integer value) {
            addCriterion("credit_status <>", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThan(Integer value) {
            addCriterion("credit_status >", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_status >=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThan(Integer value) {
            addCriterion("credit_status <", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("credit_status <=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIn(List<Integer> values) {
            addCriterion("credit_status in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotIn(List<Integer> values) {
            addCriterion("credit_status not in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusBetween(Integer value1, Integer value2) {
            addCriterion("credit_status between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_status not between", value1, value2, "creditStatus");
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

        public Criteria andCreditLaunchTimeIsNull() {
            addCriterion("credit_launch_time is null");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeIsNotNull() {
            addCriterion("credit_launch_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeEqualTo(Date value) {
            addCriterion("credit_launch_time =", value, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeNotEqualTo(Date value) {
            addCriterion("credit_launch_time <>", value, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeGreaterThan(Date value) {
            addCriterion("credit_launch_time >", value, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("credit_launch_time >=", value, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeLessThan(Date value) {
            addCriterion("credit_launch_time <", value, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeLessThanOrEqualTo(Date value) {
            addCriterion("credit_launch_time <=", value, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeIn(List<Date> values) {
            addCriterion("credit_launch_time in", values, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeNotIn(List<Date> values) {
            addCriterion("credit_launch_time not in", values, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeBetween(Date value1, Date value2) {
            addCriterion("credit_launch_time between", value1, value2, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditLaunchTimeNotBetween(Date value1, Date value2) {
            addCriterion("credit_launch_time not between", value1, value2, "creditLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeIsNull() {
            addCriterion("credit_inter_time is null");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeIsNotNull() {
            addCriterion("credit_inter_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeEqualTo(Date value) {
            addCriterion("credit_inter_time =", value, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeNotEqualTo(Date value) {
            addCriterion("credit_inter_time <>", value, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeGreaterThan(Date value) {
            addCriterion("credit_inter_time >", value, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("credit_inter_time >=", value, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeLessThan(Date value) {
            addCriterion("credit_inter_time <", value, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeLessThanOrEqualTo(Date value) {
            addCriterion("credit_inter_time <=", value, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeIn(List<Date> values) {
            addCriterion("credit_inter_time in", values, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeNotIn(List<Date> values) {
            addCriterion("credit_inter_time not in", values, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeBetween(Date value1, Date value2) {
            addCriterion("credit_inter_time between", value1, value2, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditInterTimeNotBetween(Date value1, Date value2) {
            addCriterion("credit_inter_time not between", value1, value2, "creditInterTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeIsNull() {
            addCriterion("credit_customer_sign_launch_time is null");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeIsNotNull() {
            addCriterion("credit_customer_sign_launch_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeEqualTo(Date value) {
            addCriterion("credit_customer_sign_launch_time =", value, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeNotEqualTo(Date value) {
            addCriterion("credit_customer_sign_launch_time <>", value, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeGreaterThan(Date value) {
            addCriterion("credit_customer_sign_launch_time >", value, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("credit_customer_sign_launch_time >=", value, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeLessThan(Date value) {
            addCriterion("credit_customer_sign_launch_time <", value, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeLessThanOrEqualTo(Date value) {
            addCriterion("credit_customer_sign_launch_time <=", value, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeIn(List<Date> values) {
            addCriterion("credit_customer_sign_launch_time in", values, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeNotIn(List<Date> values) {
            addCriterion("credit_customer_sign_launch_time not in", values, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeBetween(Date value1, Date value2) {
            addCriterion("credit_customer_sign_launch_time between", value1, value2, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignLaunchTimeNotBetween(Date value1, Date value2) {
            addCriterion("credit_customer_sign_launch_time not between", value1, value2, "creditCustomerSignLaunchTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeIsNull() {
            addCriterion("credit_customer_sign_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeIsNotNull() {
            addCriterion("credit_customer_sign_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeEqualTo(Date value) {
            addCriterion("credit_customer_sign_finish_time =", value, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeNotEqualTo(Date value) {
            addCriterion("credit_customer_sign_finish_time <>", value, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeGreaterThan(Date value) {
            addCriterion("credit_customer_sign_finish_time >", value, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("credit_customer_sign_finish_time >=", value, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeLessThan(Date value) {
            addCriterion("credit_customer_sign_finish_time <", value, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("credit_customer_sign_finish_time <=", value, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeIn(List<Date> values) {
            addCriterion("credit_customer_sign_finish_time in", values, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeNotIn(List<Date> values) {
            addCriterion("credit_customer_sign_finish_time not in", values, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeBetween(Date value1, Date value2) {
            addCriterion("credit_customer_sign_finish_time between", value1, value2, "creditCustomerSignFinishTime");
            return (Criteria) this;
        }

        public Criteria andCreditCustomerSignFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("credit_customer_sign_finish_time not between", value1, value2, "creditCustomerSignFinishTime");
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

        public Criteria andEffectiveExpireTimeIsNull() {
            addCriterion("effective_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeIsNotNull() {
            addCriterion("effective_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeEqualTo(Date value) {
            addCriterion("effective_expire_time =", value, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeNotEqualTo(Date value) {
            addCriterion("effective_expire_time <>", value, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeGreaterThan(Date value) {
            addCriterion("effective_expire_time >", value, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_expire_time >=", value, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeLessThan(Date value) {
            addCriterion("effective_expire_time <", value, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("effective_expire_time <=", value, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeIn(List<Date> values) {
            addCriterion("effective_expire_time in", values, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeNotIn(List<Date> values) {
            addCriterion("effective_expire_time not in", values, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeBetween(Date value1, Date value2) {
            addCriterion("effective_expire_time between", value1, value2, "effectiveExpireTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("effective_expire_time not between", value1, value2, "effectiveExpireTime");
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

        public Criteria andOuterSigningAuthorizeLinkTotalIsNull() {
            addCriterion("outer_signing_authorize_link_total is null");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalIsNotNull() {
            addCriterion("outer_signing_authorize_link_total is not null");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalEqualTo(String value) {
            addCriterion("outer_signing_authorize_link_total =", value, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalNotEqualTo(String value) {
            addCriterion("outer_signing_authorize_link_total <>", value, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalGreaterThan(String value) {
            addCriterion("outer_signing_authorize_link_total >", value, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalGreaterThanOrEqualTo(String value) {
            addCriterion("outer_signing_authorize_link_total >=", value, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalLessThan(String value) {
            addCriterion("outer_signing_authorize_link_total <", value, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalLessThanOrEqualTo(String value) {
            addCriterion("outer_signing_authorize_link_total <=", value, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalLike(String value) {
            addCriterion("outer_signing_authorize_link_total like", value, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalNotLike(String value) {
            addCriterion("outer_signing_authorize_link_total not like", value, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalIn(List<String> values) {
            addCriterion("outer_signing_authorize_link_total in", values, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalNotIn(List<String> values) {
            addCriterion("outer_signing_authorize_link_total not in", values, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalBetween(String value1, String value2) {
            addCriterion("outer_signing_authorize_link_total between", value1, value2, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andOuterSigningAuthorizeLinkTotalNotBetween(String value1, String value2) {
            addCriterion("outer_signing_authorize_link_total not between", value1, value2, "outerSigningAuthorizeLinkTotal");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdIsNull() {
            addCriterion("customer_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdIsNotNull() {
            addCriterion("customer_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdEqualTo(String value) {
            addCriterion("customer_manager_id =", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdNotEqualTo(String value) {
            addCriterion("customer_manager_id <>", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdGreaterThan(String value) {
            addCriterion("customer_manager_id >", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_manager_id >=", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdLessThan(String value) {
            addCriterion("customer_manager_id <", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_manager_id <=", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdLike(String value) {
            addCriterion("customer_manager_id like", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdNotLike(String value) {
            addCriterion("customer_manager_id not like", value, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdIn(List<String> values) {
            addCriterion("customer_manager_id in", values, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdNotIn(List<String> values) {
            addCriterion("customer_manager_id not in", values, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdBetween(String value1, String value2) {
            addCriterion("customer_manager_id between", value1, value2, "customerManagerId");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIdNotBetween(String value1, String value2) {
            addCriterion("customer_manager_id not between", value1, value2, "customerManagerId");
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