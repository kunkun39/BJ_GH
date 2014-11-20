package com.changhong.system.domain.movietype;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午10:05
 */
public class EventType extends EntityBase {

     /**
     * EventType类型的属性, 对应EventType_item[]
     */
    private String eventTypeID;

    private String eEventType;

    /************************************************GETTER/SETTER*****************************************************/

    public String getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(String eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String geteEventType() {
        return eEventType;
    }

    public void seteEventType(String eEventType) {
        this.eEventType = eEventType;
    }
}
