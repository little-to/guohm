package com.livinglibrary.po;

import java.util.ArrayList;
import java.util.List;

public class SystemsetExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public SystemsetExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
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

		public Criteria andLiveaddressIsNull() {
			addCriterion("liveaddress is null");
			return (Criteria) this;
		}

		public Criteria andLiveaddressIsNotNull() {
			addCriterion("liveaddress is not null");
			return (Criteria) this;
		}

		public Criteria andLiveaddressEqualTo(String value) {
			addCriterion("liveaddress =", value, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressNotEqualTo(String value) {
			addCriterion("liveaddress <>", value, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressGreaterThan(String value) {
			addCriterion("liveaddress >", value, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressGreaterThanOrEqualTo(String value) {
			addCriterion("liveaddress >=", value, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressLessThan(String value) {
			addCriterion("liveaddress <", value, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressLessThanOrEqualTo(String value) {
			addCriterion("liveaddress <=", value, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressLike(String value) {
			addCriterion("liveaddress like", value, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressNotLike(String value) {
			addCriterion("liveaddress not like", value, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressIn(List<String> values) {
			addCriterion("liveaddress in", values, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressNotIn(List<String> values) {
			addCriterion("liveaddress not in", values, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressBetween(String value1, String value2) {
			addCriterion("liveaddress between", value1, value2, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andLiveaddressNotBetween(String value1, String value2) {
			addCriterion("liveaddress not between", value1, value2, "liveaddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressIsNull() {
			addCriterion("serveraddress is null");
			return (Criteria) this;
		}

		public Criteria andServeraddressIsNotNull() {
			addCriterion("serveraddress is not null");
			return (Criteria) this;
		}

		public Criteria andServeraddressEqualTo(String value) {
			addCriterion("serveraddress =", value, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressNotEqualTo(String value) {
			addCriterion("serveraddress <>", value, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressGreaterThan(String value) {
			addCriterion("serveraddress >", value, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressGreaterThanOrEqualTo(String value) {
			addCriterion("serveraddress >=", value, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressLessThan(String value) {
			addCriterion("serveraddress <", value, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressLessThanOrEqualTo(String value) {
			addCriterion("serveraddress <=", value, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressLike(String value) {
			addCriterion("serveraddress like", value, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressNotLike(String value) {
			addCriterion("serveraddress not like", value, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressIn(List<String> values) {
			addCriterion("serveraddress in", values, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressNotIn(List<String> values) {
			addCriterion("serveraddress not in", values, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressBetween(String value1, String value2) {
			addCriterion("serveraddress between", value1, value2, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andServeraddressNotBetween(String value1, String value2) {
			addCriterion("serveraddress not between", value1, value2, "serveraddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressIsNull() {
			addCriterion("imgaddress is null");
			return (Criteria) this;
		}

		public Criteria andImgaddressIsNotNull() {
			addCriterion("imgaddress is not null");
			return (Criteria) this;
		}

		public Criteria andImgaddressEqualTo(String value) {
			addCriterion("imgaddress =", value, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressNotEqualTo(String value) {
			addCriterion("imgaddress <>", value, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressGreaterThan(String value) {
			addCriterion("imgaddress >", value, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressGreaterThanOrEqualTo(String value) {
			addCriterion("imgaddress >=", value, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressLessThan(String value) {
			addCriterion("imgaddress <", value, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressLessThanOrEqualTo(String value) {
			addCriterion("imgaddress <=", value, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressLike(String value) {
			addCriterion("imgaddress like", value, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressNotLike(String value) {
			addCriterion("imgaddress not like", value, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressIn(List<String> values) {
			addCriterion("imgaddress in", values, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressNotIn(List<String> values) {
			addCriterion("imgaddress not in", values, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressBetween(String value1, String value2) {
			addCriterion("imgaddress between", value1, value2, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andImgaddressNotBetween(String value1, String value2) {
			addCriterion("imgaddress not between", value1, value2, "imgaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressIsNull() {
			addCriterion("vedioaddress is null");
			return (Criteria) this;
		}

		public Criteria andVedioaddressIsNotNull() {
			addCriterion("vedioaddress is not null");
			return (Criteria) this;
		}

		public Criteria andVedioaddressEqualTo(String value) {
			addCriterion("vedioaddress =", value, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressNotEqualTo(String value) {
			addCriterion("vedioaddress <>", value, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressGreaterThan(String value) {
			addCriterion("vedioaddress >", value, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressGreaterThanOrEqualTo(String value) {
			addCriterion("vedioaddress >=", value, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressLessThan(String value) {
			addCriterion("vedioaddress <", value, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressLessThanOrEqualTo(String value) {
			addCriterion("vedioaddress <=", value, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressLike(String value) {
			addCriterion("vedioaddress like", value, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressNotLike(String value) {
			addCriterion("vedioaddress not like", value, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressIn(List<String> values) {
			addCriterion("vedioaddress in", values, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressNotIn(List<String> values) {
			addCriterion("vedioaddress not in", values, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressBetween(String value1, String value2) {
			addCriterion("vedioaddress between", value1, value2, "vedioaddress");
			return (Criteria) this;
		}

		public Criteria andVedioaddressNotBetween(String value1, String value2) {
			addCriterion("vedioaddress not between", value1, value2, "vedioaddress");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table systemset
     *
     * @mbg.generated do_not_delete_during_merge Wed May 08 15:09:33 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}