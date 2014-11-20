package com.changhong.system.domain.movietype;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 上午11:01
 */
public class DramaType extends EntityBase {
    /**
     * Dramatype类型的属性, 对应Dramatype_ite[]
     */
    private String dramaTypeID;

    private String dramaType;

    private int dramaTypeSequence;

    /************************************************GETTER/SETTER*****************************************************/

    public String getDramaTypeID() {
        return dramaTypeID;
    }

    public void setDramaTypeID(String dramaTypeID) {
        this.dramaTypeID = dramaTypeID;
    }

    public String getDramaType() {
        return dramaType;
    }

    public void setDramaType(String dramaType) {
        this.dramaType = dramaType;
    }

    public int getDramaTypeSequence() {
        return dramaTypeSequence;
    }

    public void setDramaTypeSequence(int dramaTypeSequence) {
        this.dramaTypeSequence = dramaTypeSequence;
    }
}

