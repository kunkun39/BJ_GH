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

    private String eventType;

    /************************************************GETTER/SETTER*****************************************************/

    public String getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(String eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
