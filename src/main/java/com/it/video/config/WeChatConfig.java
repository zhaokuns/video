package com.it.video.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: dell
 * @Date: 2019/11/13 23:49
 * @Description:
 */
@Configuration
@PropertySource("classpath:application.properties")
public class WeChatConfig {
    @Value("${wxpay.appid}")
    private String appId;
    @Value("$(wxpay.appsecret)")
    private String appsecret;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }
}
