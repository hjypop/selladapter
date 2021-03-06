package com.hjy.sacore.entity.productcenter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PcProductinfoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PcProductinfoExample() {
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

		public Criteria andZidIsNull() {
			addCriterion("zid is null");
			return (Criteria) this;
		}

		public Criteria andZidIsNotNull() {
			addCriterion("zid is not null");
			return (Criteria) this;
		}

		public Criteria andZidEqualTo(Integer value) {
			addCriterion("zid =", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidNotEqualTo(Integer value) {
			addCriterion("zid <>", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidGreaterThan(Integer value) {
			addCriterion("zid >", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidGreaterThanOrEqualTo(Integer value) {
			addCriterion("zid >=", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidLessThan(Integer value) {
			addCriterion("zid <", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidLessThanOrEqualTo(Integer value) {
			addCriterion("zid <=", value, "zid");
			return (Criteria) this;
		}

		public Criteria andZidIn(List<Integer> values) {
			addCriterion("zid in", values, "zid");
			return (Criteria) this;
		}

		public Criteria andZidNotIn(List<Integer> values) {
			addCriterion("zid not in", values, "zid");
			return (Criteria) this;
		}

		public Criteria andZidBetween(Integer value1, Integer value2) {
			addCriterion("zid between", value1, value2, "zid");
			return (Criteria) this;
		}

		public Criteria andZidNotBetween(Integer value1, Integer value2) {
			addCriterion("zid not between", value1, value2, "zid");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("uid is null");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(String value) {
			addCriterion("uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(String value) {
			addCriterion("uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(String value) {
			addCriterion("uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(String value) {
			addCriterion("uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(String value) {
			addCriterion("uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(String value) {
			addCriterion("uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLike(String value) {
			addCriterion("uid like", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotLike(String value) {
			addCriterion("uid not like", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<String> values) {
			addCriterion("uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<String> values) {
			addCriterion("uid not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidBetween(String value1, String value2) {
			addCriterion("uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(String value1, String value2) {
			addCriterion("uid not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldIsNull() {
			addCriterion("product_code_old is null");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldIsNotNull() {
			addCriterion("product_code_old is not null");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldEqualTo(String value) {
			addCriterion("product_code_old =", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldNotEqualTo(String value) {
			addCriterion("product_code_old <>", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldGreaterThan(String value) {
			addCriterion("product_code_old >", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldGreaterThanOrEqualTo(String value) {
			addCriterion("product_code_old >=", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldLessThan(String value) {
			addCriterion("product_code_old <", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldLessThanOrEqualTo(String value) {
			addCriterion("product_code_old <=", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldLike(String value) {
			addCriterion("product_code_old like", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldNotLike(String value) {
			addCriterion("product_code_old not like", value, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldIn(List<String> values) {
			addCriterion("product_code_old in", values, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldNotIn(List<String> values) {
			addCriterion("product_code_old not in", values, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldBetween(String value1, String value2) {
			addCriterion("product_code_old between", value1, value2, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeOldNotBetween(String value1, String value2) {
			addCriterion("product_code_old not between", value1, value2, "productCodeOld");
			return (Criteria) this;
		}

		public Criteria andProductCodeIsNull() {
			addCriterion("product_code is null");
			return (Criteria) this;
		}

		public Criteria andProductCodeIsNotNull() {
			addCriterion("product_code is not null");
			return (Criteria) this;
		}

		public Criteria andProductCodeEqualTo(String value) {
			addCriterion("product_code =", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotEqualTo(String value) {
			addCriterion("product_code <>", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeGreaterThan(String value) {
			addCriterion("product_code >", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
			addCriterion("product_code >=", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLessThan(String value) {
			addCriterion("product_code <", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLessThanOrEqualTo(String value) {
			addCriterion("product_code <=", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLike(String value) {
			addCriterion("product_code like", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotLike(String value) {
			addCriterion("product_code not like", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeIn(List<String> values) {
			addCriterion("product_code in", values, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotIn(List<String> values) {
			addCriterion("product_code not in", values, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeBetween(String value1, String value2) {
			addCriterion("product_code between", value1, value2, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotBetween(String value1, String value2) {
			addCriterion("product_code not between", value1, value2, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("product_name is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("product_name is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("product_name =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("product_name <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("product_name >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("product_name >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("product_name <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("product_name <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("product_name like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("product_name not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("product_name in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("product_name not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("product_name between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("product_name not between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductShortnameIsNull() {
			addCriterion("product_shortname is null");
			return (Criteria) this;
		}

		public Criteria andProductShortnameIsNotNull() {
			addCriterion("product_shortname is not null");
			return (Criteria) this;
		}

		public Criteria andProductShortnameEqualTo(String value) {
			addCriterion("product_shortname =", value, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameNotEqualTo(String value) {
			addCriterion("product_shortname <>", value, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameGreaterThan(String value) {
			addCriterion("product_shortname >", value, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameGreaterThanOrEqualTo(String value) {
			addCriterion("product_shortname >=", value, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameLessThan(String value) {
			addCriterion("product_shortname <", value, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameLessThanOrEqualTo(String value) {
			addCriterion("product_shortname <=", value, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameLike(String value) {
			addCriterion("product_shortname like", value, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameNotLike(String value) {
			addCriterion("product_shortname not like", value, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameIn(List<String> values) {
			addCriterion("product_shortname in", values, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameNotIn(List<String> values) {
			addCriterion("product_shortname not in", values, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameBetween(String value1, String value2) {
			addCriterion("product_shortname between", value1, value2, "productShortname");
			return (Criteria) this;
		}

		public Criteria andProductShortnameNotBetween(String value1, String value2) {
			addCriterion("product_shortname not between", value1, value2, "productShortname");
			return (Criteria) this;
		}

		public Criteria andVideoUrlIsNull() {
			addCriterion("video_url is null");
			return (Criteria) this;
		}

		public Criteria andVideoUrlIsNotNull() {
			addCriterion("video_url is not null");
			return (Criteria) this;
		}

		public Criteria andVideoUrlEqualTo(String value) {
			addCriterion("video_url =", value, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlNotEqualTo(String value) {
			addCriterion("video_url <>", value, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlGreaterThan(String value) {
			addCriterion("video_url >", value, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
			addCriterion("video_url >=", value, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlLessThan(String value) {
			addCriterion("video_url <", value, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlLessThanOrEqualTo(String value) {
			addCriterion("video_url <=", value, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlLike(String value) {
			addCriterion("video_url like", value, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlNotLike(String value) {
			addCriterion("video_url not like", value, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlIn(List<String> values) {
			addCriterion("video_url in", values, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlNotIn(List<String> values) {
			addCriterion("video_url not in", values, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlBetween(String value1, String value2) {
			addCriterion("video_url between", value1, value2, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andVideoUrlNotBetween(String value1, String value2) {
			addCriterion("video_url not between", value1, value2, "videoUrl");
			return (Criteria) this;
		}

		public Criteria andSellerCodeIsNull() {
			addCriterion("seller_code is null");
			return (Criteria) this;
		}

		public Criteria andSellerCodeIsNotNull() {
			addCriterion("seller_code is not null");
			return (Criteria) this;
		}

		public Criteria andSellerCodeEqualTo(String value) {
			addCriterion("seller_code =", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeNotEqualTo(String value) {
			addCriterion("seller_code <>", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeGreaterThan(String value) {
			addCriterion("seller_code >", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeGreaterThanOrEqualTo(String value) {
			addCriterion("seller_code >=", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeLessThan(String value) {
			addCriterion("seller_code <", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeLessThanOrEqualTo(String value) {
			addCriterion("seller_code <=", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeLike(String value) {
			addCriterion("seller_code like", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeNotLike(String value) {
			addCriterion("seller_code not like", value, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeIn(List<String> values) {
			addCriterion("seller_code in", values, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeNotIn(List<String> values) {
			addCriterion("seller_code not in", values, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeBetween(String value1, String value2) {
			addCriterion("seller_code between", value1, value2, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSellerCodeNotBetween(String value1, String value2) {
			addCriterion("seller_code not between", value1, value2, "sellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeIsNull() {
			addCriterion("small_seller_code is null");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeIsNotNull() {
			addCriterion("small_seller_code is not null");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeEqualTo(String value) {
			addCriterion("small_seller_code =", value, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeNotEqualTo(String value) {
			addCriterion("small_seller_code <>", value, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeGreaterThan(String value) {
			addCriterion("small_seller_code >", value, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeGreaterThanOrEqualTo(String value) {
			addCriterion("small_seller_code >=", value, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeLessThan(String value) {
			addCriterion("small_seller_code <", value, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeLessThanOrEqualTo(String value) {
			addCriterion("small_seller_code <=", value, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeLike(String value) {
			addCriterion("small_seller_code like", value, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeNotLike(String value) {
			addCriterion("small_seller_code not like", value, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeIn(List<String> values) {
			addCriterion("small_seller_code in", values, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeNotIn(List<String> values) {
			addCriterion("small_seller_code not in", values, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeBetween(String value1, String value2) {
			addCriterion("small_seller_code between", value1, value2, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andSmallSellerCodeNotBetween(String value1, String value2) {
			addCriterion("small_seller_code not between", value1, value2, "smallSellerCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeIsNull() {
			addCriterion("brand_code is null");
			return (Criteria) this;
		}

		public Criteria andBrandCodeIsNotNull() {
			addCriterion("brand_code is not null");
			return (Criteria) this;
		}

		public Criteria andBrandCodeEqualTo(String value) {
			addCriterion("brand_code =", value, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeNotEqualTo(String value) {
			addCriterion("brand_code <>", value, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeGreaterThan(String value) {
			addCriterion("brand_code >", value, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeGreaterThanOrEqualTo(String value) {
			addCriterion("brand_code >=", value, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeLessThan(String value) {
			addCriterion("brand_code <", value, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeLessThanOrEqualTo(String value) {
			addCriterion("brand_code <=", value, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeLike(String value) {
			addCriterion("brand_code like", value, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeNotLike(String value) {
			addCriterion("brand_code not like", value, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeIn(List<String> values) {
			addCriterion("brand_code in", values, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeNotIn(List<String> values) {
			addCriterion("brand_code not in", values, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeBetween(String value1, String value2) {
			addCriterion("brand_code between", value1, value2, "brandCode");
			return (Criteria) this;
		}

		public Criteria andBrandCodeNotBetween(String value1, String value2) {
			addCriterion("brand_code not between", value1, value2, "brandCode");
			return (Criteria) this;
		}

		public Criteria andProductWeightIsNull() {
			addCriterion("product_weight is null");
			return (Criteria) this;
		}

		public Criteria andProductWeightIsNotNull() {
			addCriterion("product_weight is not null");
			return (Criteria) this;
		}

		public Criteria andProductWeightEqualTo(BigDecimal value) {
			addCriterion("product_weight =", value, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightNotEqualTo(BigDecimal value) {
			addCriterion("product_weight <>", value, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightGreaterThan(BigDecimal value) {
			addCriterion("product_weight >", value, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("product_weight >=", value, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightLessThan(BigDecimal value) {
			addCriterion("product_weight <", value, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightLessThanOrEqualTo(BigDecimal value) {
			addCriterion("product_weight <=", value, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightIn(List<BigDecimal> values) {
			addCriterion("product_weight in", values, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightNotIn(List<BigDecimal> values) {
			addCriterion("product_weight not in", values, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("product_weight between", value1, value2, "productWeight");
			return (Criteria) this;
		}

		public Criteria andProductWeightNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("product_weight not between", value1, value2, "productWeight");
			return (Criteria) this;
		}

		public Criteria andFlagSaleIsNull() {
			addCriterion("flag_sale is null");
			return (Criteria) this;
		}

		public Criteria andFlagSaleIsNotNull() {
			addCriterion("flag_sale is not null");
			return (Criteria) this;
		}

		public Criteria andFlagSaleEqualTo(Integer value) {
			addCriterion("flag_sale =", value, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleNotEqualTo(Integer value) {
			addCriterion("flag_sale <>", value, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleGreaterThan(Integer value) {
			addCriterion("flag_sale >", value, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_sale >=", value, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleLessThan(Integer value) {
			addCriterion("flag_sale <", value, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleLessThanOrEqualTo(Integer value) {
			addCriterion("flag_sale <=", value, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleIn(List<Integer> values) {
			addCriterion("flag_sale in", values, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleNotIn(List<Integer> values) {
			addCriterion("flag_sale not in", values, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleBetween(Integer value1, Integer value2) {
			addCriterion("flag_sale between", value1, value2, "flagSale");
			return (Criteria) this;
		}

		public Criteria andFlagSaleNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_sale not between", value1, value2, "flagSale");
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

		public Criteria andCreateTimeEqualTo(String value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(String value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(String value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(String value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(String value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLike(String value) {
			addCriterion("create_time like", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotLike(String value) {
			addCriterion("create_time not like", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<String> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<String> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(String value1, String value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(String value1, String value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(String value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(String value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(String value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(String value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLike(String value) {
			addCriterion("update_time like", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotLike(String value) {
			addCriterion("update_time not like", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<String> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<String> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(String value1, String value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(String value1, String value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceIsNull() {
			addCriterion("min_sell_price is null");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceIsNotNull() {
			addCriterion("min_sell_price is not null");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceEqualTo(BigDecimal value) {
			addCriterion("min_sell_price =", value, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceNotEqualTo(BigDecimal value) {
			addCriterion("min_sell_price <>", value, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceGreaterThan(BigDecimal value) {
			addCriterion("min_sell_price >", value, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("min_sell_price >=", value, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceLessThan(BigDecimal value) {
			addCriterion("min_sell_price <", value, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("min_sell_price <=", value, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceIn(List<BigDecimal> values) {
			addCriterion("min_sell_price in", values, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceNotIn(List<BigDecimal> values) {
			addCriterion("min_sell_price not in", values, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("min_sell_price between", value1, value2, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMinSellPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("min_sell_price not between", value1, value2, "minSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceIsNull() {
			addCriterion("max_sell_price is null");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceIsNotNull() {
			addCriterion("max_sell_price is not null");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceEqualTo(BigDecimal value) {
			addCriterion("max_sell_price =", value, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceNotEqualTo(BigDecimal value) {
			addCriterion("max_sell_price <>", value, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceGreaterThan(BigDecimal value) {
			addCriterion("max_sell_price >", value, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("max_sell_price >=", value, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceLessThan(BigDecimal value) {
			addCriterion("max_sell_price <", value, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("max_sell_price <=", value, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceIn(List<BigDecimal> values) {
			addCriterion("max_sell_price in", values, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceNotIn(List<BigDecimal> values) {
			addCriterion("max_sell_price not in", values, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("max_sell_price between", value1, value2, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMaxSellPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("max_sell_price not between", value1, value2, "maxSellPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIsNull() {
			addCriterion("market_price is null");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIsNotNull() {
			addCriterion("market_price is not null");
			return (Criteria) this;
		}

		public Criteria andMarketPriceEqualTo(BigDecimal value) {
			addCriterion("market_price =", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
			addCriterion("market_price <>", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceGreaterThan(BigDecimal value) {
			addCriterion("market_price >", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("market_price >=", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceLessThan(BigDecimal value) {
			addCriterion("market_price <", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("market_price <=", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIn(List<BigDecimal> values) {
			addCriterion("market_price in", values, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
			addCriterion("market_price not in", values, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("market_price between", value1, value2, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("market_price not between", value1, value2, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceIsNull() {
			addCriterion("cost_price is null");
			return (Criteria) this;
		}

		public Criteria andCostPriceIsNotNull() {
			addCriterion("cost_price is not null");
			return (Criteria) this;
		}

		public Criteria andCostPriceEqualTo(BigDecimal value) {
			addCriterion("cost_price =", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceNotEqualTo(BigDecimal value) {
			addCriterion("cost_price <>", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceGreaterThan(BigDecimal value) {
			addCriterion("cost_price >", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("cost_price >=", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceLessThan(BigDecimal value) {
			addCriterion("cost_price <", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("cost_price <=", value, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceIn(List<BigDecimal> values) {
			addCriterion("cost_price in", values, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceNotIn(List<BigDecimal> values) {
			addCriterion("cost_price not in", values, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("cost_price between", value1, value2, "costPrice");
			return (Criteria) this;
		}

		public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("cost_price not between", value1, value2, "costPrice");
			return (Criteria) this;
		}

		public Criteria andTaxRateIsNull() {
			addCriterion("tax_rate is null");
			return (Criteria) this;
		}

		public Criteria andTaxRateIsNotNull() {
			addCriterion("tax_rate is not null");
			return (Criteria) this;
		}

		public Criteria andTaxRateEqualTo(BigDecimal value) {
			addCriterion("tax_rate =", value, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateNotEqualTo(BigDecimal value) {
			addCriterion("tax_rate <>", value, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateGreaterThan(BigDecimal value) {
			addCriterion("tax_rate >", value, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("tax_rate >=", value, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateLessThan(BigDecimal value) {
			addCriterion("tax_rate <", value, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
			addCriterion("tax_rate <=", value, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateIn(List<BigDecimal> values) {
			addCriterion("tax_rate in", values, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateNotIn(List<BigDecimal> values) {
			addCriterion("tax_rate not in", values, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("tax_rate between", value1, value2, "taxRate");
			return (Criteria) this;
		}

		public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("tax_rate not between", value1, value2, "taxRate");
			return (Criteria) this;
		}

		public Criteria andProductStatusIsNull() {
			addCriterion("product_status is null");
			return (Criteria) this;
		}

		public Criteria andProductStatusIsNotNull() {
			addCriterion("product_status is not null");
			return (Criteria) this;
		}

		public Criteria andProductStatusEqualTo(String value) {
			addCriterion("product_status =", value, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusNotEqualTo(String value) {
			addCriterion("product_status <>", value, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusGreaterThan(String value) {
			addCriterion("product_status >", value, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusGreaterThanOrEqualTo(String value) {
			addCriterion("product_status >=", value, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusLessThan(String value) {
			addCriterion("product_status <", value, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusLessThanOrEqualTo(String value) {
			addCriterion("product_status <=", value, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusLike(String value) {
			addCriterion("product_status like", value, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusNotLike(String value) {
			addCriterion("product_status not like", value, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusIn(List<String> values) {
			addCriterion("product_status in", values, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusNotIn(List<String> values) {
			addCriterion("product_status not in", values, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusBetween(String value1, String value2) {
			addCriterion("product_status between", value1, value2, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductStatusNotBetween(String value1, String value2) {
			addCriterion("product_status not between", value1, value2, "productStatus");
			return (Criteria) this;
		}

		public Criteria andProductVolumeIsNull() {
			addCriterion("product_volume is null");
			return (Criteria) this;
		}

		public Criteria andProductVolumeIsNotNull() {
			addCriterion("product_volume is not null");
			return (Criteria) this;
		}

		public Criteria andProductVolumeEqualTo(BigDecimal value) {
			addCriterion("product_volume =", value, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeNotEqualTo(BigDecimal value) {
			addCriterion("product_volume <>", value, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeGreaterThan(BigDecimal value) {
			addCriterion("product_volume >", value, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("product_volume >=", value, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeLessThan(BigDecimal value) {
			addCriterion("product_volume <", value, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("product_volume <=", value, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeIn(List<BigDecimal> values) {
			addCriterion("product_volume in", values, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeNotIn(List<BigDecimal> values) {
			addCriterion("product_volume not in", values, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("product_volume between", value1, value2, "productVolume");
			return (Criteria) this;
		}

		public Criteria andProductVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("product_volume not between", value1, value2, "productVolume");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateIsNull() {
			addCriterion("transport_template is null");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateIsNotNull() {
			addCriterion("transport_template is not null");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateEqualTo(String value) {
			addCriterion("transport_template =", value, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateNotEqualTo(String value) {
			addCriterion("transport_template <>", value, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateGreaterThan(String value) {
			addCriterion("transport_template >", value, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateGreaterThanOrEqualTo(String value) {
			addCriterion("transport_template >=", value, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateLessThan(String value) {
			addCriterion("transport_template <", value, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateLessThanOrEqualTo(String value) {
			addCriterion("transport_template <=", value, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateLike(String value) {
			addCriterion("transport_template like", value, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateNotLike(String value) {
			addCriterion("transport_template not like", value, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateIn(List<String> values) {
			addCriterion("transport_template in", values, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateNotIn(List<String> values) {
			addCriterion("transport_template not in", values, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateBetween(String value1, String value2) {
			addCriterion("transport_template between", value1, value2, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andTransportTemplateNotBetween(String value1, String value2) {
			addCriterion("transport_template not between", value1, value2, "transportTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateIsNull() {
			addCriterion("area_template is null");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateIsNotNull() {
			addCriterion("area_template is not null");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateEqualTo(String value) {
			addCriterion("area_template =", value, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateNotEqualTo(String value) {
			addCriterion("area_template <>", value, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateGreaterThan(String value) {
			addCriterion("area_template >", value, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateGreaterThanOrEqualTo(String value) {
			addCriterion("area_template >=", value, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateLessThan(String value) {
			addCriterion("area_template <", value, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateLessThanOrEqualTo(String value) {
			addCriterion("area_template <=", value, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateLike(String value) {
			addCriterion("area_template like", value, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateNotLike(String value) {
			addCriterion("area_template not like", value, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateIn(List<String> values) {
			addCriterion("area_template in", values, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateNotIn(List<String> values) {
			addCriterion("area_template not in", values, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateBetween(String value1, String value2) {
			addCriterion("area_template between", value1, value2, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andAreaTemplateNotBetween(String value1, String value2) {
			addCriterion("area_template not between", value1, value2, "areaTemplate");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeIsNull() {
			addCriterion("sell_productcode is null");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeIsNotNull() {
			addCriterion("sell_productcode is not null");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeEqualTo(String value) {
			addCriterion("sell_productcode =", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeNotEqualTo(String value) {
			addCriterion("sell_productcode <>", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeGreaterThan(String value) {
			addCriterion("sell_productcode >", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeGreaterThanOrEqualTo(String value) {
			addCriterion("sell_productcode >=", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeLessThan(String value) {
			addCriterion("sell_productcode <", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeLessThanOrEqualTo(String value) {
			addCriterion("sell_productcode <=", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeLike(String value) {
			addCriterion("sell_productcode like", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeNotLike(String value) {
			addCriterion("sell_productcode not like", value, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeIn(List<String> values) {
			addCriterion("sell_productcode in", values, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeNotIn(List<String> values) {
			addCriterion("sell_productcode not in", values, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeBetween(String value1, String value2) {
			addCriterion("sell_productcode between", value1, value2, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSellProductcodeNotBetween(String value1, String value2) {
			addCriterion("sell_productcode not between", value1, value2, "sellProductcode");
			return (Criteria) this;
		}

		public Criteria andSupplierNameIsNull() {
			addCriterion("supplier_name is null");
			return (Criteria) this;
		}

		public Criteria andSupplierNameIsNotNull() {
			addCriterion("supplier_name is not null");
			return (Criteria) this;
		}

		public Criteria andSupplierNameEqualTo(String value) {
			addCriterion("supplier_name =", value, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameNotEqualTo(String value) {
			addCriterion("supplier_name <>", value, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameGreaterThan(String value) {
			addCriterion("supplier_name >", value, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
			addCriterion("supplier_name >=", value, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameLessThan(String value) {
			addCriterion("supplier_name <", value, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameLessThanOrEqualTo(String value) {
			addCriterion("supplier_name <=", value, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameLike(String value) {
			addCriterion("supplier_name like", value, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameNotLike(String value) {
			addCriterion("supplier_name not like", value, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameIn(List<String> values) {
			addCriterion("supplier_name in", values, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameNotIn(List<String> values) {
			addCriterion("supplier_name not in", values, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameBetween(String value1, String value2) {
			addCriterion("supplier_name between", value1, value2, "supplierName");
			return (Criteria) this;
		}

		public Criteria andSupplierNameNotBetween(String value1, String value2) {
			addCriterion("supplier_name not between", value1, value2, "supplierName");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlIsNull() {
			addCriterion("mainpic_url is null");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlIsNotNull() {
			addCriterion("mainpic_url is not null");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlEqualTo(String value) {
			addCriterion("mainpic_url =", value, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlNotEqualTo(String value) {
			addCriterion("mainpic_url <>", value, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlGreaterThan(String value) {
			addCriterion("mainpic_url >", value, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlGreaterThanOrEqualTo(String value) {
			addCriterion("mainpic_url >=", value, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlLessThan(String value) {
			addCriterion("mainpic_url <", value, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlLessThanOrEqualTo(String value) {
			addCriterion("mainpic_url <=", value, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlLike(String value) {
			addCriterion("mainpic_url like", value, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlNotLike(String value) {
			addCriterion("mainpic_url not like", value, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlIn(List<String> values) {
			addCriterion("mainpic_url in", values, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlNotIn(List<String> values) {
			addCriterion("mainpic_url not in", values, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlBetween(String value1, String value2) {
			addCriterion("mainpic_url between", value1, value2, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andMainpicUrlNotBetween(String value1, String value2) {
			addCriterion("mainpic_url not between", value1, value2, "mainpicUrl");
			return (Criteria) this;
		}

		public Criteria andLabelsIsNull() {
			addCriterion("labels is null");
			return (Criteria) this;
		}

		public Criteria andLabelsIsNotNull() {
			addCriterion("labels is not null");
			return (Criteria) this;
		}

		public Criteria andLabelsEqualTo(String value) {
			addCriterion("labels =", value, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsNotEqualTo(String value) {
			addCriterion("labels <>", value, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsGreaterThan(String value) {
			addCriterion("labels >", value, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsGreaterThanOrEqualTo(String value) {
			addCriterion("labels >=", value, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsLessThan(String value) {
			addCriterion("labels <", value, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsLessThanOrEqualTo(String value) {
			addCriterion("labels <=", value, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsLike(String value) {
			addCriterion("labels like", value, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsNotLike(String value) {
			addCriterion("labels not like", value, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsIn(List<String> values) {
			addCriterion("labels in", values, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsNotIn(List<String> values) {
			addCriterion("labels not in", values, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsBetween(String value1, String value2) {
			addCriterion("labels between", value1, value2, "labels");
			return (Criteria) this;
		}

		public Criteria andLabelsNotBetween(String value1, String value2) {
			addCriterion("labels not between", value1, value2, "labels");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayIsNull() {
			addCriterion("flag_payway is null");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayIsNotNull() {
			addCriterion("flag_payway is not null");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayEqualTo(Integer value) {
			addCriterion("flag_payway =", value, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayNotEqualTo(Integer value) {
			addCriterion("flag_payway <>", value, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayGreaterThan(Integer value) {
			addCriterion("flag_payway >", value, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayGreaterThanOrEqualTo(Integer value) {
			addCriterion("flag_payway >=", value, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayLessThan(Integer value) {
			addCriterion("flag_payway <", value, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayLessThanOrEqualTo(Integer value) {
			addCriterion("flag_payway <=", value, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayIn(List<Integer> values) {
			addCriterion("flag_payway in", values, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayNotIn(List<Integer> values) {
			addCriterion("flag_payway not in", values, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayBetween(Integer value1, Integer value2) {
			addCriterion("flag_payway between", value1, value2, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andFlagPaywayNotBetween(Integer value1, Integer value2) {
			addCriterion("flag_payway not between", value1, value2, "flagPayway");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemIsNull() {
			addCriterion("product_volume_item is null");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemIsNotNull() {
			addCriterion("product_volume_item is not null");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemEqualTo(String value) {
			addCriterion("product_volume_item =", value, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemNotEqualTo(String value) {
			addCriterion("product_volume_item <>", value, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemGreaterThan(String value) {
			addCriterion("product_volume_item >", value, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemGreaterThanOrEqualTo(String value) {
			addCriterion("product_volume_item >=", value, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemLessThan(String value) {
			addCriterion("product_volume_item <", value, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemLessThanOrEqualTo(String value) {
			addCriterion("product_volume_item <=", value, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemLike(String value) {
			addCriterion("product_volume_item like", value, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemNotLike(String value) {
			addCriterion("product_volume_item not like", value, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemIn(List<String> values) {
			addCriterion("product_volume_item in", values, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemNotIn(List<String> values) {
			addCriterion("product_volume_item not in", values, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemBetween(String value1, String value2) {
			addCriterion("product_volume_item between", value1, value2, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andProductVolumeItemNotBetween(String value1, String value2) {
			addCriterion("product_volume_item not between", value1, value2, "productVolumeItem");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidIsNull() {
			addCriterion("sale_scope_did is null");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidIsNotNull() {
			addCriterion("sale_scope_did is not null");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidEqualTo(String value) {
			addCriterion("sale_scope_did =", value, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidNotEqualTo(String value) {
			addCriterion("sale_scope_did <>", value, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidGreaterThan(String value) {
			addCriterion("sale_scope_did >", value, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidGreaterThanOrEqualTo(String value) {
			addCriterion("sale_scope_did >=", value, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidLessThan(String value) {
			addCriterion("sale_scope_did <", value, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidLessThanOrEqualTo(String value) {
			addCriterion("sale_scope_did <=", value, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidLike(String value) {
			addCriterion("sale_scope_did like", value, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidNotLike(String value) {
			addCriterion("sale_scope_did not like", value, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidIn(List<String> values) {
			addCriterion("sale_scope_did in", values, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidNotIn(List<String> values) {
			addCriterion("sale_scope_did not in", values, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidBetween(String value1, String value2) {
			addCriterion("sale_scope_did between", value1, value2, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andSaleScopeDidNotBetween(String value1, String value2) {
			addCriterion("sale_scope_did not between", value1, value2, "saleScopeDid");
			return (Criteria) this;
		}

		public Criteria andValidateFlagIsNull() {
			addCriterion("validate_flag is null");
			return (Criteria) this;
		}

		public Criteria andValidateFlagIsNotNull() {
			addCriterion("validate_flag is not null");
			return (Criteria) this;
		}

		public Criteria andValidateFlagEqualTo(String value) {
			addCriterion("validate_flag =", value, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagNotEqualTo(String value) {
			addCriterion("validate_flag <>", value, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagGreaterThan(String value) {
			addCriterion("validate_flag >", value, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagGreaterThanOrEqualTo(String value) {
			addCriterion("validate_flag >=", value, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagLessThan(String value) {
			addCriterion("validate_flag <", value, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagLessThanOrEqualTo(String value) {
			addCriterion("validate_flag <=", value, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagLike(String value) {
			addCriterion("validate_flag like", value, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagNotLike(String value) {
			addCriterion("validate_flag not like", value, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagIn(List<String> values) {
			addCriterion("validate_flag in", values, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagNotIn(List<String> values) {
			addCriterion("validate_flag not in", values, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagBetween(String value1, String value2) {
			addCriterion("validate_flag between", value1, value2, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andValidateFlagNotBetween(String value1, String value2) {
			addCriterion("validate_flag not between", value1, value2, "validateFlag");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyIsNull() {
			addCriterion("product_code_copy is null");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyIsNotNull() {
			addCriterion("product_code_copy is not null");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyEqualTo(String value) {
			addCriterion("product_code_copy =", value, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyNotEqualTo(String value) {
			addCriterion("product_code_copy <>", value, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyGreaterThan(String value) {
			addCriterion("product_code_copy >", value, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyGreaterThanOrEqualTo(String value) {
			addCriterion("product_code_copy >=", value, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyLessThan(String value) {
			addCriterion("product_code_copy <", value, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyLessThanOrEqualTo(String value) {
			addCriterion("product_code_copy <=", value, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyLike(String value) {
			addCriterion("product_code_copy like", value, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyNotLike(String value) {
			addCriterion("product_code_copy not like", value, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyIn(List<String> values) {
			addCriterion("product_code_copy in", values, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyNotIn(List<String> values) {
			addCriterion("product_code_copy not in", values, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyBetween(String value1, String value2) {
			addCriterion("product_code_copy between", value1, value2, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andProductCodeCopyNotBetween(String value1, String value2) {
			addCriterion("product_code_copy not between", value1, value2, "productCodeCopy");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlIsNull() {
			addCriterion("adpic_url is null");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlIsNotNull() {
			addCriterion("adpic_url is not null");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlEqualTo(String value) {
			addCriterion("adpic_url =", value, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlNotEqualTo(String value) {
			addCriterion("adpic_url <>", value, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlGreaterThan(String value) {
			addCriterion("adpic_url >", value, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlGreaterThanOrEqualTo(String value) {
			addCriterion("adpic_url >=", value, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlLessThan(String value) {
			addCriterion("adpic_url <", value, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlLessThanOrEqualTo(String value) {
			addCriterion("adpic_url <=", value, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlLike(String value) {
			addCriterion("adpic_url like", value, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlNotLike(String value) {
			addCriterion("adpic_url not like", value, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlIn(List<String> values) {
			addCriterion("adpic_url in", values, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlNotIn(List<String> values) {
			addCriterion("adpic_url not in", values, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlBetween(String value1, String value2) {
			addCriterion("adpic_url between", value1, value2, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andAdpicUrlNotBetween(String value1, String value2) {
			addCriterion("adpic_url not between", value1, value2, "adpicUrl");
			return (Criteria) this;
		}

		public Criteria andExpiryDateIsNull() {
			addCriterion("expiry_date is null");
			return (Criteria) this;
		}

		public Criteria andExpiryDateIsNotNull() {
			addCriterion("expiry_date is not null");
			return (Criteria) this;
		}

		public Criteria andExpiryDateEqualTo(Integer value) {
			addCriterion("expiry_date =", value, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateNotEqualTo(Integer value) {
			addCriterion("expiry_date <>", value, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateGreaterThan(Integer value) {
			addCriterion("expiry_date >", value, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateGreaterThanOrEqualTo(Integer value) {
			addCriterion("expiry_date >=", value, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateLessThan(Integer value) {
			addCriterion("expiry_date <", value, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateLessThanOrEqualTo(Integer value) {
			addCriterion("expiry_date <=", value, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateIn(List<Integer> values) {
			addCriterion("expiry_date in", values, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateNotIn(List<Integer> values) {
			addCriterion("expiry_date not in", values, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateBetween(Integer value1, Integer value2) {
			addCriterion("expiry_date between", value1, value2, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryDateNotBetween(Integer value1, Integer value2) {
			addCriterion("expiry_date not between", value1, value2, "expiryDate");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitIsNull() {
			addCriterion("expiry_unit is null");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitIsNotNull() {
			addCriterion("expiry_unit is not null");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitEqualTo(String value) {
			addCriterion("expiry_unit =", value, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitNotEqualTo(String value) {
			addCriterion("expiry_unit <>", value, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitGreaterThan(String value) {
			addCriterion("expiry_unit >", value, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitGreaterThanOrEqualTo(String value) {
			addCriterion("expiry_unit >=", value, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitLessThan(String value) {
			addCriterion("expiry_unit <", value, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitLessThanOrEqualTo(String value) {
			addCriterion("expiry_unit <=", value, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitLike(String value) {
			addCriterion("expiry_unit like", value, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitNotLike(String value) {
			addCriterion("expiry_unit not like", value, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitIn(List<String> values) {
			addCriterion("expiry_unit in", values, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitNotIn(List<String> values) {
			addCriterion("expiry_unit not in", values, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitBetween(String value1, String value2) {
			addCriterion("expiry_unit between", value1, value2, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andExpiryUnitNotBetween(String value1, String value2) {
			addCriterion("expiry_unit not between", value1, value2, "expiryUnit");
			return (Criteria) this;
		}

		public Criteria andLowGoodIsNull() {
			addCriterion("low_good is null");
			return (Criteria) this;
		}

		public Criteria andLowGoodIsNotNull() {
			addCriterion("low_good is not null");
			return (Criteria) this;
		}

		public Criteria andLowGoodEqualTo(String value) {
			addCriterion("low_good =", value, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodNotEqualTo(String value) {
			addCriterion("low_good <>", value, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodGreaterThan(String value) {
			addCriterion("low_good >", value, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodGreaterThanOrEqualTo(String value) {
			addCriterion("low_good >=", value, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodLessThan(String value) {
			addCriterion("low_good <", value, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodLessThanOrEqualTo(String value) {
			addCriterion("low_good <=", value, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodLike(String value) {
			addCriterion("low_good like", value, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodNotLike(String value) {
			addCriterion("low_good not like", value, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodIn(List<String> values) {
			addCriterion("low_good in", values, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodNotIn(List<String> values) {
			addCriterion("low_good not in", values, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodBetween(String value1, String value2) {
			addCriterion("low_good between", value1, value2, "lowGood");
			return (Criteria) this;
		}

		public Criteria andLowGoodNotBetween(String value1, String value2) {
			addCriterion("low_good not between", value1, value2, "lowGood");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeIsNull() {
			addCriterion("qualification_category_code is null");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeIsNotNull() {
			addCriterion("qualification_category_code is not null");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeEqualTo(String value) {
			addCriterion("qualification_category_code =", value, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeNotEqualTo(String value) {
			addCriterion("qualification_category_code <>", value, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeGreaterThan(String value) {
			addCriterion("qualification_category_code >", value, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeGreaterThanOrEqualTo(String value) {
			addCriterion("qualification_category_code >=", value, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeLessThan(String value) {
			addCriterion("qualification_category_code <", value, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeLessThanOrEqualTo(String value) {
			addCriterion("qualification_category_code <=", value, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeLike(String value) {
			addCriterion("qualification_category_code like", value, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeNotLike(String value) {
			addCriterion("qualification_category_code not like", value, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeIn(List<String> values) {
			addCriterion("qualification_category_code in", values, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeNotIn(List<String> values) {
			addCriterion("qualification_category_code not in", values, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeBetween(String value1, String value2) {
			addCriterion("qualification_category_code between", value1, value2, "qualificationCategoryCode");
			return (Criteria) this;
		}

		public Criteria andQualificationCategoryCodeNotBetween(String value1, String value2) {
			addCriterion("qualification_category_code not between", value1, value2, "qualificationCategoryCode");
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