package com.changhong.system.domain.movietype;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午9:59
 */
public class Area extends EntityBase {

    /**
     * Area类型的属性, 对应Area_item[]
     */
    private String areaID;

    private String area;

    private String areaGroupID;

    /************************************************GETTER/SETTER*****************************************************/

    public String getAreaID() {
        return areaID;
    }

    public void setAreaID(String areaID) {
        this.areaID = areaID;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaGroupID() {
        return areaGroupID;
    }

    public void setAreaGroupID(String areaGroupID) {
        this.areaGroupID = areaGroupID;
    }
}
