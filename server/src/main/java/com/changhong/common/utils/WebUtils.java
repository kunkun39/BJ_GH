package com.changhong.common.utils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.MultipartPostMethod;

import java.io.InputStream;

/**
 * User: Jack Wang
 * Date: 14-11-19
 * Time: 下午5:52
 */
public class WebUtils {

    private static MultiThreadedHttpConnectionManager connectionManager;

    private static int timeOutMilliSeconds = 60000;

    static {
        connectionManager = new MultiThreadedHttpConnectionManager();
        connectionManager.getParams().setConnectionTimeout(timeOutMilliSeconds);
    }

    public String httpGetRequest(String url) {
        HttpClient client = new HttpClient(connectionManager);
        client.getParams().setSoTimeout(timeOutMilliSeconds);
        client.getParams().setContentCharset("UTF-8");

        String sendUrl = url.replaceAll(" ", "%20");
        String response = "";
        GetMethod httpGet = new GetMethod(sendUrl);
        try {
            client.executeMethod(httpGet);
            response = httpGet.getResponseBodyAsString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            httpGet.releaseConnection();
        }
        return response;
    }

    public InputStream httpGetRequest(GetMethod httpGet) {
        HttpClient client = new HttpClient(connectionManager);
        client.getParams().setSoTimeout(timeOutMilliSeconds);
        client.getParams().setContentCharset("UTF-8");

        InputStream response = null;
        try {
            client.executeMethod(httpGet);
            response = httpGet.getResponseBodyAsStream();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }

    public String httpPostRequest(MultipartPostMethod postMethod) {
        HttpClient client = new HttpClient(connectionManager);
        client.setConnectionTimeout(timeOutMilliSeconds);
        client.getParams().setContentCharset("UTF-8");

        int status = 0;
        String response = "";
        try {
            status = client.executeMethod(postMethod);
            if (status == HttpStatus.SC_OK) {
                response = postMethod.getResponseBodyAsString();
            } else {
                throw new RuntimeException("service is not avaible");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            postMethod.releaseConnection();
        }

        return response;
    }
}
