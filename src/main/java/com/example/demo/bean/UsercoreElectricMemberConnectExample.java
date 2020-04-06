package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsercoreElectricMemberConnectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsercoreElectricMemberConnectExample() {
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

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoIsNull() {
            addCriterion("ELECTRIC_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoIsNotNull() {
            addCriterion("ELECTRIC_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoEqualTo(String value) {
            addCriterion("ELECTRIC_USER_NO =", value, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoNotEqualTo(String value) {
            addCriterion("ELECTRIC_USER_NO <>", value, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoGreaterThan(String value) {
            addCriterion("ELECTRIC_USER_NO >", value, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("ELECTRIC_USER_NO >=", value, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoLessThan(String value) {
            addCriterion("ELECTRIC_USER_NO <", value, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoLessThanOrEqualTo(String value) {
            addCriterion("ELECTRIC_USER_NO <=", value, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoLike(String value) {
            addCriterion("ELECTRIC_USER_NO like", value, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoNotLike(String value) {
            addCriterion("ELECTRIC_USER_NO not like", value, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoIn(List<String> values) {
            addCriterion("ELECTRIC_USER_NO in", values, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoNotIn(List<String> values) {
            addCriterion("ELECTRIC_USER_NO not in", values, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoBetween(String value1, String value2) {
            addCriterion("ELECTRIC_USER_NO between", value1, value2, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNoNotBetween(String value1, String value2) {
            addCriterion("ELECTRIC_USER_NO not between", value1, value2, "electricUserNo");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameIsNull() {
            addCriterion("ELECTRIC_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameIsNotNull() {
            addCriterion("ELECTRIC_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameEqualTo(String value) {
            addCriterion("ELECTRIC_USER_NAME =", value, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameNotEqualTo(String value) {
            addCriterion("ELECTRIC_USER_NAME <>", value, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameGreaterThan(String value) {
            addCriterion("ELECTRIC_USER_NAME >", value, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("ELECTRIC_USER_NAME >=", value, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameLessThan(String value) {
            addCriterion("ELECTRIC_USER_NAME <", value, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameLessThanOrEqualTo(String value) {
            addCriterion("ELECTRIC_USER_NAME <=", value, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameLike(String value) {
            addCriterion("ELECTRIC_USER_NAME like", value, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameNotLike(String value) {
            addCriterion("ELECTRIC_USER_NAME not like", value, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameIn(List<String> values) {
            addCriterion("ELECTRIC_USER_NAME in", values, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameNotIn(List<String> values) {
            addCriterion("ELECTRIC_USER_NAME not in", values, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameBetween(String value1, String value2) {
            addCriterion("ELECTRIC_USER_NAME between", value1, value2, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andElectricUserNameNotBetween(String value1, String value2) {
            addCriterion("ELECTRIC_USER_NAME not between", value1, value2, "electricUserName");
            return (Criteria) this;
        }

        public Criteria andRegistDateIsNull() {
            addCriterion("REGIST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegistDateIsNotNull() {
            addCriterion("REGIST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistDateEqualTo(Date value) {
            addCriterion("REGIST_DATE =", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotEqualTo(Date value) {
            addCriterion("REGIST_DATE <>", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateGreaterThan(Date value) {
            addCriterion("REGIST_DATE >", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGIST_DATE >=", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateLessThan(Date value) {
            addCriterion("REGIST_DATE <", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateLessThanOrEqualTo(Date value) {
            addCriterion("REGIST_DATE <=", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateIn(List<Date> values) {
            addCriterion("REGIST_DATE in", values, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotIn(List<Date> values) {
            addCriterion("REGIST_DATE not in", values, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateBetween(Date value1, Date value2) {
            addCriterion("REGIST_DATE between", value1, value2, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotBetween(Date value1, Date value2) {
            addCriterion("REGIST_DATE not between", value1, value2, "registDate");
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