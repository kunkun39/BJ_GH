package com.changhong.system.domain.movietype;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午10:01
 */
public class AreaGroup extends EntityBase {

     /**
     * Areagroup类型的属性, 对应Areagroup_item[]
     */
    private String areaGroupID;

    private String areaGroup;

    /************************************************GETTER/SETTER*****************************************************/

    public String getAreaGroupID() {
        return areaGroupID;
    }

    public void setAreaGroupID(String areaGroupID) {
        this.areaGroupID = areaGroupID;
    }

    public String getAreaGroup() {
        return areaGroup;
    }

    public void setAreaGroup(String areaGroup) {
        this.areaGroup = areaGroup;
    }
}
