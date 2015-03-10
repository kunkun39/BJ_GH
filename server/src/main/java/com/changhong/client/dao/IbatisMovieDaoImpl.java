package com.changhong.client.dao;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Jack Wang
 * Date: 15-3-1
 * Time: 下午2:54
 */
@Repository("ibatisMovieDao")
public class IbatisMovieDaoImpl extends IbatisEntityObjectDao implements IbatisMovieDao {

    public String obtainColumns() {
        List<HashMap> columns = getSqlMapClientTemplate().queryForList("Movie.selectAllColumns");

        Map<String, String> values = new HashMap<String, String>();
        values.put("typeId", "111111");
        values.put("typeName", "Hello World");
        values.put("typeSequence", "657");
        values.put("dramaTypeId", "56");
        getSqlMapClientTemplate().insert("Movie.insertMovieType", values);

        List<HashMap> types = getSqlMapClientTemplate().queryForList("Movie.selectAllMovieTypes");

        return null;
    }

    public static void main(String[] args) {
        String recognitionResult = "ｃｃｔｖ1";
        Map<String, Integer> matchChannel = new HashMap<String, Integer>();
        List<String>  channelData = new ArrayList<String>();
        channelData.add("湖南卫视");
        channelData.add("湖南高清");
        channelData.add("浙江高清");
        channelData.add("中央五台");
        channelData.add("CETV-1");
        channelData.add("CETV-2");
        channelData.add("CCTV-5");
        channelData.add("CCTV-10");
        channelData.add("CCTV-11");
        channelData.add("CCTV-13");
        channelData.add("CETV-1");
        channelData.add("CCTV-1");

        /**
         * compare the matched chancel
         */
        matchChannel.clear();
        for (int i = 0; i < recognitionResult.length(); i++) {
            for (int j = 0; j < channelData.size(); j++) {
                String channelName = channelData.get(j);
                char ch = recognitionResult.charAt(i);

                if (channelName.indexOf(ch) >= 0) {
                    Integer count = matchChannel.get(String.valueOf(j));
                    if (count == null) {
                        matchChannel.put(String.valueOf(j), 1);
                    } else {
                        matchChannel.put(String.valueOf(j), count + 1);
                    }
                }
            }
        }

        /**
         * get best matched result and send result to server box
         * 1 - first compare the value
         * 2 - if value is equal, then compare service name, which is shorter, which is bester
         */
        int bestCounter = 0;
        String bestPostion = "";
        for (String position : matchChannel.keySet()) {
            Integer value = matchChannel.get(position);
            if (value > bestCounter) {
                bestCounter = value;
                bestPostion = position;
            } else if (value == bestCounter) {
                String bestChannel = channelData.get(Integer.valueOf(bestPostion));
                String newChannel = channelData.get(Integer.valueOf(position));

                if (newChannel.length() < bestChannel.length()) {
                    bestPostion = position;
                } else if(newChannel.length() == bestChannel.length()) {
                    int bestIndex = bestChannel.indexOf(recognitionResult);
                    int newIndex = newChannel.indexOf(recognitionResult);
                    if (bestIndex < 0 && newIndex >= 0) {
                        bestPostion = position;
                    }
                }
            }
        }

        if (StringUtils.hasLength(bestPostion)) {
            System.out.println(channelData.get(Integer.valueOf(bestPostion)));
        }
    }

}
