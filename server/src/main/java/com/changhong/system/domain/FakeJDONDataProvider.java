package com.changhong.system.domain;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 下午2:34
 */
public class FakeJDONDataProvider {

    public static String MOVIE_TYPE_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"Class\":\"type\"\n" +
            "    }\n" +
            "},\"Type\":{\n" +
            "    \"Type_item\":[\n" +
            "        {\n" +
            "            \"TypeID\":\"1\",\n" +
            "            \"Type\":\"\\u7535\\u5f71\",\n" +
            "            \"TypeSequence\":\"1\",\n" +
            "            \"c\":\"1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,18,23,29,43,45,49,50,54,55,57,60,66,67,68,70,74,78,80,84\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"TypeID\":\"2\",\n" +
            "            \"Type\":\"\\u5267\\u96c6\",\n" +
            "            \"TypeSequence\":\"2\",\n" +
            "            \"DramaType\":\"1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,20,21,22,23,25,29,43,45,50,53,54,57,66\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"TypeID\":\"3\",\n" +
            "            \"Type\":\"\\u52a8\\u6f2b\",\n" +
            "            \"TypeSequence\":\"3\",\n" +
            "            \"DramaType\":\"6,13,51,26,27,28,29,30,31,32,33,34,45,50,52,53,77\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"TypeID\":\"4\",\n" +
            "            \"Type\":\"\\u7efc\\u827a\",\n" +
            "            \"TypeSequence\":\"4\",\n" +
            "            \"DramaType\":\"13,16,35,36,37,38,39,40,41,42,43,44,46,47,48,50,56,58,59,64,70,75,76,79,84\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"TypeID\":\"21\",\n" +
            "            \"Type\":\"\\u793e\\u6559\",\n" +
            "            \"TypeSequence\":\"5\",\n" +
            "            \"DramaType\":\"113\"\n" +
            "        }\n" +
            "    ]\n" +
            "}}";

    public static String MOVIE_DRAMATYPE_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"Class\":\"dramatype\"\n" +
            "    }\n" +
            "},\"Dramatype\":{\n" +
            "    \"Dramatype_item\":[\n" +
            "        {\n" +
            "            \"DramaTypeID\":\"1\",\n" +
            "            \"DramaType\":\"\\u7535\\u5f71\",\n" +
            "            \"DramaTypeSequence\":\"1\"\n" +
            "        },\n" +
            "    ]\n" +
            "}}";

    public static String MOVIE_AREA_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"Class\":\"area\"\n" +
            "    }\n" +
            "},\"Area\":{\n" +
            "    \"Area_item\":[\n" +
            "        {\n" +
            "            \"AreaID\":\"1\",\n" +
            "            \"Area\":\"\\u7535\\u5f71\",\n" +
            "            \"AreaGroupID\":\"1,2\"\n" +
            "        },\n" +
            "    ]\n" +
            "}}";

    public static String MOVIE_AREAGROUP_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"Class\":\"areagroup\"\n" +
            "    }\n" +
            "},\"Areagroup\":{\n" +
            "    \"Areagroup_item\":[\n" +
            "        {\n" +
            "            \"AreaGroupID\":\"1\",\n" +
            "            \"AreaGroup\":\"\\u7535\\u5f71\"\n" +
            "        },\n" +
            "    ]\n" +
            "}}";

    public static String MOVIE_CLIENTTYPE_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"Class\":\"clienttype\"\n" +
            "    }\n" +
            "},\"ClientType\":{\n" +
            "    \"ClientType_item\":[\n" +
            "        {\n" +
            "            \"ClientTypeID\":\"1\",\n" +
            "            \"ClientType\":\"\\u7535\\u5f71\"\n" +
            "        },\n" +
            "    ]\n" +
            "}}";

    public static String MOVIE_CHANNELTYPE_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"Class\":\"channeltype\"\n" +
            "    }\n" +
            "},\"ChannelType\":{\n" +
            "    \"ChannelType_item\":[\n" +
            "        {\n" +
            "            \"ChannelTypeID\":\"1\",\n" +
            "            \"ChannelType\":\"\\u7535\\u5f71\"\n" +
            "        },\n" +
            "    ]\n" +
            "}}";

    public static String MOVIE_EVENTTYPE_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"Class\":\"eventtype\"\n" +
            "    }\n" +
            "},\"EventType\":{\n" +
            "    \"EventType_item\":[\n" +
            "        {\n" +
            "            \"EventTypeID\":\"1\",\n" +
            "            \"EventType\":\"\\u7535\\u5f71\"\n" +
            "        },\n" +
            "    ]\n" +
            "}}";

    public static String MOVIE_COLUMN_DATA = "{\n" +
            "    \"ResponseHeader\": {\n" +
            "        \"TransactionId\": \"20140708143719_18329\",\n" +
            "        \"Status\": \"0\",\n" +
            "        \"Params\": {\n" +
            "            \"ColumnID\": \"50046\",\n" +
            "            \"QueryFlag\": \"1\"\n" +
            "        }\n" +
            "    },\n" +
            "    \"Columns\": [\n" +
            "        {\n" +
            "            \"ColumnID\": \"50046\",\n" +
            "            \"ColumnTypeCode\": \"mf\",\n" +
            "            \"Type\": \"1\",\n" +
            "            \"ParentID\": \"50041\",\n" +
            "            \"ColumnName\": null,\n" +
            "            \"Alias\": \"免费点播\",\n" +
            "            \"Describe\": \"\",\n" +
            "            \"Display\": \"1\",\n" +
            "            \"Rank\": \"5\",\n" +
            "            \"Url\": \"\",\n" +
            "            \"UrlType\": null,\n" +
            "            \"UpdateTime\": \"Wed Jul 16 00:00:00 CST 2014\",\n" +
            "            \"RelevantChargeMode\": \"0\",\n" +
            "            \"ProductID\": \"1048584\",\n" +
            "            \"ResourceType\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"ColumnID\": \"50047\",\n" +
            "            \"ColumnTypeCode\": \"US\",\n" +
            "            \"Type\": \"1\",\n" +
            "            \"ParentID\": \"50046\",\n" +
            "            \"ColumnName\": null,\n" +
            "            \"Alias\": \"电影\",\n" +
            "            \"Describe\": \"\",\n" +
            "            \"Display\": \"1\",\n" +
            "            \"Rank\": \"2\",\n" +
            "            \"Url\": \"\",\n" +
            "            \"UrlType\": null,\n" +
            "            \"UpdateTime\": \"Tue Jul 22 00:00:00 CST 2014\",\n" +
            "            \"RelevantChargeMode\": \"0\",\n" +
            "            \"ProductID\": null,\n" +
            "            \"ResourceType\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"ColumnID\": \"50048\",\n" +
            "            \"ColumnTypeCode\": \"rhjj\",\n" +
            "            \"Type\": \"1\",\n" +
            "            \"ParentID\": \"50046\",\n" +
            "            \"ColumnName\": null,\n" +
            "            \"Alias\": \"电视剧\",\n" +
            "            \"Describe\": \"\",\n" +
            "            \"Display\": \"1\",\n" +
            "            \"Rank\": \"3\",\n" +
            "            \"Url\": \"\",\n" +
            "            \"UrlType\": null,\n" +
            "            \"UpdateTime\": \"Tue Jul 22 00:00:00 CST 2014\",\n" +
            "            \"RelevantChargeMode\": \"0\",\n" +
            "            \"ProductID\": null,\n" +
            "            \"ResourceType\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"ColumnID\": \"50049\",\n" +
            "            \"ColumnTypeCode\": \"gtxp\",\n" +
            "            \"Type\": \"1\",\n" +
            "            \"ParentID\": \"50046\",\n" +
            "            \"ColumnName\": null,\n" +
            "            \"Alias\": \"经典影视\",\n" +
            "            \"Describe\": \"\",\n" +
            "            \"Display\": \"1\",\n" +
            "            \"Rank\": \"4\",\n" +
            "            \"Url\": \"\",\n" +
            "            \"UrlType\": null,\n" +
            "            \"UpdateTime\": \"Tue Jul 22 00:00:00 CST 2014\",\n" +
            "            \"RelevantChargeMode\": \"0\",\n" +
            "            \"ProductID\": null,\n" +
            "            \"ResourceType\": null\n" +
            "        }\n" +
            "    ]\n" +
            "}";
}
