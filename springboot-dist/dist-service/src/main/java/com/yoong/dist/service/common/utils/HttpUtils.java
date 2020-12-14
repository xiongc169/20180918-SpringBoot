package com.yoong.dist.service.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Desc HttpUtils
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
@Slf4j
public class HttpUtils {

    public static final String UTF_8 = "UTF-8";

    public static final String ContentType = "Content-Type";

    public static final String ApplicationJson = "application/json";

    public static final String ApplicationFormData = "application/x-www-form-urlencoded";

    private static RequestConfig requestConfig = RequestConfig.custom()
            .setConnectionRequestTimeout(30000)
            .setConnectTimeout(30000)
            .setSocketTimeout(50000)
            .build();

    /**
     * Get方法
     */
    public static String get(String url) {
        log.info("Get入参：{}", url);
        String response = null;
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(url);
            httpGet.setConfig(requestConfig);
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            //log.info("响应结果：{}", JSON.toJSONString(httpResponse));
            if (httpResponse != null) {
                if (httpResponse.getStatusLine() != null) {
                    log.info("响应码：{}", httpResponse.getStatusLine().getStatusCode());
                }
                if (httpResponse.getEntity() != null) {
                    response = EntityUtils.toString(httpResponse.getEntity());
                    log.info("响应报文：{}", response);
                }
            }
        } catch (Exception ex) {
            log.error("Get异常", ex);
        } finally {
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (Exception ex) {
                    log.error("关闭httpClient异常", ex);
                }
            }
        }
        return response;
    }

    /**
     * Post方法
     */
    public static String postJSON(String url, String params) {
        log.info("PostJSON入参：{} {}", url, params);
        String response = null;
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            StringEntity string = new StringEntity(params, UTF_8);
            string.setContentEncoding(UTF_8);
            httpPost.addHeader(ContentType, ApplicationJson);
            httpPost.setConfig(requestConfig);
            httpPost.setEntity(string);
            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            //log.info("响应结果：{}", JSON.toJSONString(httpResponse));
            if (httpResponse != null) {
                if (httpResponse.getStatusLine() != null) {
                    log.info("响应码：{}", httpResponse.getStatusLine().getStatusCode());
                }
                if (httpResponse.getEntity() != null) {
                    response = EntityUtils.toString(httpResponse.getEntity());
                    log.info("响应报文：{}", response);
                }
            }
        } catch (Exception ex) {
            log.error("PostJSON异常", ex);
        } finally {
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (Exception ex) {
                    log.error("关闭httpClient异常", ex);
                }
            }
        }
        return response;
    }

    /**
     * Post方法
     */
    public static String postFormData(String url, Map<String, String> params) throws Exception {
        log.info("PostFormData入参：{} {}", url, params);
        String response = null;
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader(ContentType, ApplicationFormData);
            httpPost.setConfig(requestConfig);
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, UTF_8));
            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            //log.info("响应结果：{}", JSON.toJSONString(httpResponse));
            if (httpResponse != null) {
                if (httpResponse.getStatusLine() != null) {
                    log.info("响应码：{}", httpResponse.getStatusLine().getStatusCode());
                }
                if (httpResponse.getEntity() != null) {
                    response = EntityUtils.toString(httpResponse.getEntity());
                    log.info("响应报文：{}", response);
                }
            }
        } catch (Exception ex) {
            log.error("PostFormData异常", ex);
        } finally {
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (Exception ex) {
                    log.error("关闭httpClient异常", ex);
                }
            }
        }
        return response;
    }
}
