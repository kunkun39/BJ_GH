package com.changhong.system.domain.movietype;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午10:06
 */
public class Provider extends EntityBase {

     /**
     * Provider类型的属性, 对应Provider_item[]
     */
    private String providerID;

    private String providerName;

    private String providerType;

    /************************************************GETTER/SETTER*****************************************************/

    public String getProviderID() {
        return providerID;
    }

    public void setProviderID(String providerID) {
        this.providerID = providerID;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }
}
