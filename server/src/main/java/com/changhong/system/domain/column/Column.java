package com.changhong.system.domain.column;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午10:13
 */
public class Column extends EntityBase {

    /**
     * Column类型的属性, 对应Columns[]
     */
    private String columnID;
    private String columnTypeCode;
    private String type;
    private String parentID;
    private String columnName;
    private String alias;
    private String describe;
    private String display;
    private String rank;
    private String url;
    private String urlType;
    private String updateTime;
    private String relevantChargeMode;
    private String productID;
    private String resourceType;

    /************************************************GETTER/SETTER*****************************************************/

    public String getColumnID() {
        return columnID;
    }

    public void setColumnID(String columnID) {
        this.columnID = columnID;
    }

    public String getColumnTypeCode() {
        return columnTypeCode;
    }

    public void setColumnTypeCode(String columnTypeCode) {
        this.columnTypeCode = columnTypeCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRelevantChargeMode() {
        return relevantChargeMode;
    }

    public void setRelevantChargeMode(String relevantChargeMode) {
        this.relevantChargeMode = relevantChargeMode;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
