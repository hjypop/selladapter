package com.hjy.sacore.entity.productcenter;


/**
 * 分类属性关联表 pc_categoryproperty_rel
 * @author zhy
 * @date 2016年6月14日 上午10:24:41
 * @description
 */
public class PcProductcategoryRel  {
    
    /**
     * 
     */
    private Integer zid   = 0 ;
    /**
     * 
     */
    private String uid  = ""  ;
    /**
     * 商品编号
     */
    private String productCode  = ""  ;
    /**
     * 分类编号
     */
    private String categoryCode  = ""  ;
    /**
     * 是否主分类
     */
    private Integer flagMain   = 0 ;

    public void setZid(Integer zid) {
        this.zid = zid;
    }
    
    public Integer getZid() {
        return this.zid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public String getUid() {
        return this.uid;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    
    public String getProductCode() {
        return this.productCode;
    }
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
    
    public String getCategoryCode() {
        return this.categoryCode;
    }
    public void setFlagMain(Integer flagMain) {
        this.flagMain = flagMain;
    }
    
    public Integer getFlagMain() {
        return this.flagMain;
    }
}

