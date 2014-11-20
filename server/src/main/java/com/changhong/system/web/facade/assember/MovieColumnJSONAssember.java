package com.changhong.system.web.facade.assember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.column.Column;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 下午4:05
 */
public class MovieColumnJSONAssember {

    public static List<Column> toMovieColumneList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONArray itemsJSON = o.getJSONArray("Columns");

            List<Column> columns = new ArrayList<Column>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                Column event = new Column();
                event.setColumnID(object.getString("ColumnID"));
                event.setColumnTypeCode(object.getString("ColumnTypeCode"));
                event.setType(object.getString("Type"));
                event.setParentID(object.getString("ParentID"));
                event.setColumnName(object.getString("ColumnName"));
                event.setAlias(object.getString("Alias"));
                event.setDescribe(object.getString("Describe"));
                event.setDisplay(object.getString("Display"));
                event.setRank(object.getString("Rank"));
                event.setUrl(object.getString("Url"));
                event.setUrlType(object.getString("UrlType"));
                event.setUpdateTime(object.getString("UpdateTime"));
                event.setRelevantChargeMode(object.getString("RelevantChargeMode"));
                event.setProductID(object.getString("ProductID"));
                event.setResourceType(object.getString("ResourceType"));
                columns.add(event);
            }

            return columns;
        }

        return null;
    }
}
