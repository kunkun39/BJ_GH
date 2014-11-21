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

    public static String MOVIE_PROVIDER_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"Class\":\"provider\"\n" +
            "    }\n" +
            "},\"Provider\":{\n" +
            "    \"Provider_item\":[\n" +
            "        {\n" +
            "            \"ProviderID\":\"1\",\n" +
            "            \"ProviderName\":\"\\u7535\\u5f71\",\n" +
            "            \"ProviderType\":\"WEB\"\n" +
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

    public static String MOVIE_INFO_DATA = "{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"TypeID\":\"1\",\n" +
            "        \"DramaTypeID\":\"2\",\n" +
            "        \"Year\":\"2012\",\n" +
            "        \"AreaID\":\"\",\n" +
            "        \"AreaGroupID\":\"4\",\n" +
            "        \"PS\":1,\n" +
            "        \"P\":2,\n" +
            "        \"Sort\":\"1\"\n" +
            "    }\n" +
            "},\"Typecount\":{\n" +
            "    \"Typeitem\":[\n" +
            "        {\n" +
            "            \"TypeID\":\"1\",\n" +
            "            \"Typecount\":\"21\"\n" +
            "        }\n" +
            "    ]\n" +
            "},\"Item_title\":{\n" +
            "    \"TotalNumber\":\"21\"\n" +
            "},\"Matches\":{\n" +
            "    \"Matches_item\":[\n" +
            "        {\n" +
            "            \"MovieInfo\":{\n" +
            "                \"MovieID\":\"144265\",\n" +
            "                \"MovieName\":\"\\u6e29\\u67d4\\u6740\\u622e\",\n" +
            "                \"MovieAliasName\":\"\\u975e\\u6cd5\\u4ea4\\u6613\\/\\u593a\\u547d\\u65e0\\u58f0\\/\\u67ef\\u6839\\u7684\\u4ea4\\u6613\\/\\u6e29\\u67d4\\u5730\\u6740\\u6b7b\\u4ed6\\u4eec\\/\\u6740\\u622e\\u884c\\u52a8\\/\\u6e29\\u67d4\\u7684\\u6740\\u622e\\/Killing Them Softly\\/Cogan\\\\\\\\\\\\'s Trade\",\n" +
            "                \"TypeID\":\"1\",\n" +
            "                \"DramaTypeID\":\"2,12\",\n" +
            "                \"AreaID\":\"31\",\n" +
            "                \"Year\":\"2012\",\n" +
            "                \"Director\":\";\\u5b89\\u5fb7\\u9c81\\u00b7\\u591a\\u7c73\\u5c3c\\u514b;\",\n" +
            "                \"Actor\":\";\\u5e03\\u62c9\\u5fb7\\u00b7\\u76ae\\u7279;\\u65af\\u79d1\\u7279\\u00b7\\u9ea6\\u514b\\u7eb3\\u91cc;\\u672c\\u00b7\\u95e8\\u5fb7\\u5c14\\u68ee;\",\n" +
            "                \"Host\":\"\",\n" +
            "                \"Station\":\"\",\n" +
            "                \"Author\":\"\",\n" +
            "                \"RunTime\":\"97\",\n" +
            "                \"Count\":\"0\",\n" +
            "                \"SummaryShort\":\"    \\u5e03\\u62c9\\u5fb7\\u00b7\\u76ae\\u7279\\u9970\\u6f14\\u7684\\u6770\\u57fa\\u00b7\\u67ef\\u6839\\u662f\\u4e00\\u4f4d\\u5f3a\\u786c\\u7684\\u804c\\u4e1a\\u6267\\u6cd5\\u4eba\\uff0c\\u4ed6\\u4ecb\\u5165\\u8c03\\u67e5\\u4e00\\u6869\\u62a2\\u52ab\\u6848\\uff0c\\u6848\\u4ef6\\u53d1\\u751f\\u5728\\u4e00\\u6b21\\u7531\\u9ed1\\u5e2e\\u4fdd\\u62a4\\u7684\\u91cd\\u91d1\\u6251\\u514b\\u8d4c\\u5c40\\u4e2d\\u3002\",\n" +
            "                \"Commentary\":\"\\u6781\\u9177\\u7684\\u98ce\\u683c\\u5316\",\n" +
            "                \"Tag\":\"\\u5341\\u6708\\u9884\\u544a\",\n" +
            "                \"SuggestPrice\":null,\n" +
            "                \"RecommendClass1\":\"6.1\",\n" +
            "                \"RecommendClass2\":null,\n" +
            "                \"RecommendClass3\":null,\n" +
            "                \"RecommendClass4\":null,\n" +
            "                \"Area\":\"\\u5185\\u5730\",\n" +
            "                \"DramaType\":\"\\u60ca\\u609a,\\u72af\\u7f6a\",\n" +
            "                \"Type\":\"\\u7535\\u5f71\",\n" +
            "                \"OtherInfoArray\":\"\"\n" +
            "            },\n" +
            "            \"PlayInfo\":{\n" +
            "                \"PlayPlatform\":\"WEB\",\n" +
            "                \"AssetID\":null,\n" +
            "                \"AssetName\":null,\n" +
            "                \"ContentProviderID\":\"youku\",\n" +
            "                \"ProductOfferingUID\":null,\n" +
            "                \"PlayUrl\":\"http:\\/\\/v.youku.com\\/v_show\\/id_XNjIxMTU1Mzg4.html\",\n" +
            "                \"PlayUrlID\":\"8873125\",\n" +
            "                \"PlaySwfUrl\":\"http:\\/\\/player.youku.com\\/player.php\\/sid\\/XNjIxMTU1Mzg4\\/v.swf\",\n" +
            "                \"MainCacheUrl\":\"\",\n" +
            "                \"Series\":\"\",\n" +
            "                \"SinglePriceInfo\":null,\n" +
            "                \"CopyRightInfo\":null,\n" +
            "                \"VideoCodecInfo\":null,\n" +
            "                \"AudioCodecInfo\":null,\n" +
            "                \"MuxInfo\":null,\n" +
            "                \"RunTimeInfo\":null,\n" +
            "                \"ResolutionInfo\":null,\n" +
            "                \"BitRateInfo\":null,\n" +
            "                \"OtherInfoArray\":null,\n" +
            "                \"ContentProviderIDArray\":\"youku,tudou\",\n" +
            "                \"SeriesArray\":\"\"\n" +
            "            },\n" +
            "            \"Poster\":[]\n" +
            "        }\n" +
            "    ]\n" +
            "}}";




public  static String LIVE_CHANNEL_DATA="{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"ChannelID\":31378,\n" +
            "         \"ChannelTypeID\": null  }\n" +
            "},\"ChannelList\": {\n" +
            "        \"Channel_item\": [\n" +
            "            {\n" +
            "                \"id\": \"0b0b0f8e-5c66-4b43-a067-95dc38fc4c74\",\n" +
            "                \"DVBAudioCodec\": \"AC3\",\n" +
            "                \"DVBBitRate\": \"10000\",\n" +
            "                \"DVBLogicChannelID\": \"622\",\n" +
            "                \"DVBNetworkID\": \"16512\",\n" +
            "                \"DVBResolution\": \"19201080\",\n" +
            "                \"DVBServiceID\": \"622\",\n" +
            "                \"DVBTSID\": \"26\",\n" +
            "                \"DVBVideoCodec\": \"H264\",\n" +
            "                \"AudioCodecInfo\": \"AAC\",\n" +
            "                \"BitRateInfo\": \"800,1200\",\n" +
            "                \"ChannelID\": \"31378\",\n" +
            "                \"ChannelIcon\": \"/channel/icon/BTVWYHD.jpg\",\n" +
            "                \"ChannelImage\": \"/channel/image/BTVWYHD_888_666.jpg;/channel/image/BTVWYHD_684_513.jpg;/channel/image/BTVWYHD_432_324.jpg\",\n" +
            "                \"ChannelName\": \"BTV文艺高清\",\n" +
            "                \"ChannelType\": \"高清频道\",\n" +
            "                \"ChannelTypeID\": \"21\",\n" +
            "                \"FeeType\": \"0\",\n" +
            "                \"MuxInfo\": \"HLS\",\n" +
            "                \"OtherInfoArray\": \"\",\n" +
            "                \"PlayUrl\": \"{\\\"MAIN\\\":\\\"http://172.16.188.1:8088/live/BTVWYHD.m3u8\\\",\\\"800K\\\":\\\"http://172.16.188.1:8088/live/BTVWYHD_800.m3u8\\\",\\\"1200K\\\":\\\"http://172.16.188.1:8088/live/BTVWYHD_1200.m3u8\\\"}\",\n" +
            "                \"ResolutionInfo\": \"640480,720576\",\n" +
            "                \"VideoCodecInfo\": \"H264\",\n" +
            "                \"VideoType\": \"1\",\n" +
            "                \"DVBFrequency\": \"459\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }}";

    public static String Live_Program_DATA="{\"ResponseHeader\":{\n" +
            "    \"TransactionId\":\"TransactionId\",\n" +
            "    \"Status\":0,\n" +
            "    \"Params\":{\n" +
            "        \"ChannelID\":21\n" +
            "         \"Date\":\"2013-11-21\"\n"+
            "    }\n" +
            "},\"ProgramList\":{\n" +
            "    \"Program_item\":[\n" +
            "        {\n" +
            "            \"ClientTypeID\":\"1\",\n" +
            "            \"ClientType\":\"\\u7535\\u5f71\"\n" +
            "        },\n" +
            "    ]\n" +
            "}}";

}


