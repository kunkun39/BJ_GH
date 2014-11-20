package com.changhong.system.domain.movietype;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午9:51
 */
public class Type extends EntityBase {

    /**
     * Type类型的属性, 对应JSON Type_item[]
     */
    private String typeID;

    private String type;

    private int typeSequence;

    private String dramaType;

    /************************************************GETTER/SETTER*****************************************************/

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTypeSequence() {
        return typeSequence;
    }

    public void setTypeSequence(int typeSequence) {
        this.typeSequence = typeSequence;
    }

    public String getDramaType() {
        return dramaType;
    }

    public void setDramaType(String dramaType) {
        this.dramaType = dramaType;
    }
}
