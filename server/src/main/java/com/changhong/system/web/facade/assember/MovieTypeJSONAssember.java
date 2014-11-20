package com.changhong.system.web.facade.assember;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.changhong.system.domain.movietype.*;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 下午2:41
 */
public class MovieTypeJSONAssember {

    public static List<Type> toMovieTypeList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("Type");
            JSONArray itemsJSON = typeJSON.getJSONArray("Type_item");

            List<Type> types = new ArrayList<Type>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                Type type = new Type();
                type.setTypeID(object.getString("TypeID"));
                type.setType(object.getString("Type"));
                type.setTypeSequence(object.getIntValue("TypeSequence"));
                type.setDramaType(object.getString("TypeSequence"));
                types.add(type);
            }

            return types;
        }

        return null;
    }

    public static List<DramaType> toMovieDramaTypeList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("Dramatype");
            JSONArray itemsJSON = typeJSON.getJSONArray("Dramatype_item");

            List<DramaType> types = new ArrayList<DramaType>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                DramaType type = new DramaType();
                type.setDramaTypeID(object.getString("DramaTypeID"));
                type.setDramaType(object.getString("DramaType"));
                type.setDramaTypeSequence(object.getIntValue("DramaTypeSequence"));
                types.add(type);
            }

            return types;
        }

        return null;
    }

    public static List<Area> toMovieAreaList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("Area");
            JSONArray itemsJSON = typeJSON.getJSONArray("Area_item");

            List<Area> areas = new ArrayList<Area>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                Area area = new Area();
                area.setAreaID(object.getString("AreaID"));
                area.setArea(object.getString("Area"));
                area.setAreaGroupID(object.getString("AreaGroupID"));
                areas.add(area);
            }

            return areas;
        }

        return null;
    }

    public static List<AreaGroup> toMovieAreaGroupList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("Areagroup");
            JSONArray itemsJSON = typeJSON.getJSONArray("Areagroup_item");

            List<AreaGroup> groups = new ArrayList<AreaGroup>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                AreaGroup group = new AreaGroup();
                group.setAreaGroupID(object.getString("AreaGroupID"));
                group.setAreaGroup(object.getString("AreaGroup"));
                groups.add(group);
            }

            return groups;
        }

        return null;
    }

    public static List<ClientType> toMovieClientTypeList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("ClientType");
            JSONArray itemsJSON = typeJSON.getJSONArray("ClientType_item");

            List<ClientType> clients = new ArrayList<ClientType>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                ClientType client = new ClientType();
                client.setClientTypeID(object.getString("ClientTypeID"));
                client.setClientType(object.getString("ClientType"));
                clients.add(client);
            }

            return clients;
        }

        return null;
    }

    public static List<ChannelType> toMovieChannelTypeList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("ChannelType");
            JSONArray itemsJSON = typeJSON.getJSONArray("ChannelType_item");

            List<ChannelType> channels = new ArrayList<ChannelType>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                ChannelType channel = new ChannelType();
                channel.setChannelTypeID(object.getString("ChannelTypeID"));
                channel.setChannelType(object.getString("ChannelType"));
                channels.add(channel);
            }

            return channels;
        }

        return null;
    }

    public static List<EventType> toMovieEventTypeList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("EventType");
            JSONArray itemsJSON = typeJSON.getJSONArray("EventType_item");

            List<EventType> events = new ArrayList<EventType>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                EventType event = new EventType();
                event.setEventTypeID(object.getString("EventTypeID"));
                event.setEventType(object.getString("EventType"));
                events.add(event);
            }

            return events;
        }

        return null;
    }

    public static List<Provider> toMovieProviderList(String json) {
        JSONObject o = JSON.parseObject(json);
        int status = o.getJSONObject("ResponseHeader").getIntValue("Status");
        if (status == 0) {
            JSONObject typeJSON = o.getJSONObject("Provider");
            JSONArray itemsJSON = typeJSON.getJSONArray("Provider_item");

            List<Provider> providers = new ArrayList<Provider>();
            for (int i = 0; i < itemsJSON.size(); i++) {
                JSONObject object = itemsJSON.getJSONObject(i);

                Provider provider = new Provider();
                provider.setProviderID(object.getString("ProviderID"));
                provider.setProviderName(object.getString("ProviderName"));
                provider.setProviderType(object.getString("ProviderType"));
                providers.add(provider);
            }

            return providers;
        }

        return null;
    }
}
