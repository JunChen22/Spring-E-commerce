package com.example.spring.ecommerce.demo.springecommerce.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductChangeLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductChangeLogExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(BigDecimal value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(BigDecimal value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(BigDecimal value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(BigDecimal value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<BigDecimal> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<BigDecimal> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andPriceOldIsNull() {
            addCriterion("price_old is null");
            return (Criteria) this;
        }

        public Criteria andPriceOldIsNotNull() {
            addCriterion("price_old is not null");
            return (Criteria) this;
        }

        public Criteria andPriceOldEqualTo(BigDecimal value) {
            addCriterion("price_old =", value, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldNotEqualTo(BigDecimal value) {
            addCriterion("price_old <>", value, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldGreaterThan(BigDecimal value) {
            addCriterion("price_old >", value, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_old >=", value, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldLessThan(BigDecimal value) {
            addCriterion("price_old <", value, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_old <=", value, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldIn(List<BigDecimal> values) {
            addCriterion("price_old in", values, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldNotIn(List<BigDecimal> values) {
            addCriterion("price_old not in", values, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_old between", value1, value2, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceOldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_old not between", value1, value2, "priceOld");
            return (Criteria) this;
        }

        public Criteria andPriceNewIsNull() {
            addCriterion("price_new is null");
            return (Criteria) this;
        }

        public Criteria andPriceNewIsNotNull() {
            addCriterion("price_new is not null");
            return (Criteria) this;
        }

        public Criteria andPriceNewEqualTo(BigDecimal value) {
            addCriterion("price_new =", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewNotEqualTo(BigDecimal value) {
            addCriterion("price_new <>", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewGreaterThan(BigDecimal value) {
            addCriterion("price_new >", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_new >=", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewLessThan(BigDecimal value) {
            addCriterion("price_new <", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_new <=", value, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewIn(List<BigDecimal> values) {
            addCriterion("price_new in", values, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewNotIn(List<BigDecimal> values) {
            addCriterion("price_new not in", values, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_new between", value1, value2, "priceNew");
            return (Criteria) this;
        }

        public Criteria andPriceNewNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_new not between", value1, value2, "priceNew");
            return (Criteria) this;
        }

        public Criteria andUnitOldIsNull() {
            addCriterion("unit_old is null");
            return (Criteria) this;
        }

        public Criteria andUnitOldIsNotNull() {
            addCriterion("unit_old is not null");
            return (Criteria) this;
        }

        public Criteria andUnitOldEqualTo(BigDecimal value) {
            addCriterion("unit_old =", value, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldNotEqualTo(BigDecimal value) {
            addCriterion("unit_old <>", value, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldGreaterThan(BigDecimal value) {
            addCriterion("unit_old >", value, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_old >=", value, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldLessThan(BigDecimal value) {
            addCriterion("unit_old <", value, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_old <=", value, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldIn(List<BigDecimal> values) {
            addCriterion("unit_old in", values, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldNotIn(List<BigDecimal> values) {
            addCriterion("unit_old not in", values, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_old between", value1, value2, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitOldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_old not between", value1, value2, "unitOld");
            return (Criteria) this;
        }

        public Criteria andUnitNewIsNull() {
            addCriterion("unit_new is null");
            return (Criteria) this;
        }

        public Criteria andUnitNewIsNotNull() {
            addCriterion("unit_new is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNewEqualTo(BigDecimal value) {
            addCriterion("unit_new =", value, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewNotEqualTo(BigDecimal value) {
            addCriterion("unit_new <>", value, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewGreaterThan(BigDecimal value) {
            addCriterion("unit_new >", value, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_new >=", value, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewLessThan(BigDecimal value) {
            addCriterion("unit_new <", value, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_new <=", value, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewIn(List<BigDecimal> values) {
            addCriterion("unit_new in", values, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewNotIn(List<BigDecimal> values) {
            addCriterion("unit_new not in", values, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_new between", value1, value2, "unitNew");
            return (Criteria) this;
        }

        public Criteria andUnitNewNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_new not between", value1, value2, "unitNew");
            return (Criteria) this;
        }

        public Criteria andOperateManIsNull() {
            addCriterion("operate_man is null");
            return (Criteria) this;
        }

        public Criteria andOperateManIsNotNull() {
            addCriterion("operate_man is not null");
            return (Criteria) this;
        }

        public Criteria andOperateManEqualTo(String value) {
            addCriterion("operate_man =", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManNotEqualTo(String value) {
            addCriterion("operate_man <>", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManGreaterThan(String value) {
            addCriterion("operate_man >", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManGreaterThanOrEqualTo(String value) {
            addCriterion("operate_man >=", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManLessThan(String value) {
            addCriterion("operate_man <", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManLessThanOrEqualTo(String value) {
            addCriterion("operate_man <=", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManLike(String value) {
            addCriterion("operate_man like", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManNotLike(String value) {
            addCriterion("operate_man not like", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManIn(List<String> values) {
            addCriterion("operate_man in", values, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManNotIn(List<String> values) {
            addCriterion("operate_man not in", values, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManBetween(String value1, String value2) {
            addCriterion("operate_man between", value1, value2, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManNotBetween(String value1, String value2) {
            addCriterion("operate_man not between", value1, value2, "operateMan");
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