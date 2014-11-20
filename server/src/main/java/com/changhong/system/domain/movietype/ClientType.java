package com.changhong.system.domain.movietype;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午10:03
 */
public class ClientType extends EntityBase {

     /**
     * ClientType类型的属性, 对应ClientType_item[]
     */
    private String clientTypeID;

    private String clientType;

    /************************************************GETTER/SETTER*****************************************************/

    public String getClientTypeID() {
        return clientTypeID;
    }

    public void setClientTypeID(String clientTypeID) {
        this.clientTypeID = clientTypeID;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
