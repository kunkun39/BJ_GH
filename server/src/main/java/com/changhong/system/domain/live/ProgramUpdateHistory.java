package com.changhong.system.domain.live;

import com.changhong.common.domain.EntityBase;

/**
 * User: Jack Wang
 * Date: 14-12-3
 * Time: 下午5:28
 */
public class ProgramUpdateHistory extends EntityBase {

    private int programID;

    private String updateDate;

    /************************************************GETTER/SETTER*****************************************************/

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
