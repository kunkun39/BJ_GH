package com.changhong.system.domain.movietype;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午10:04
 */
public class ChannelType extends EntityBase {

     /**
     * ChannelType类型的属性, 对应ClientType_item[]
     */
    private String channelTypeID;

    private String channelType;

    /************************************************GETTER/SETTER*****************************************************/

    public String getChannelTypeID() {
        return channelTypeID;
    }

    public void setChannelTypeID(String channelTypeID) {
        this.channelTypeID = channelTypeID;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
