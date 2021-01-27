package com.yoong.autoconfig.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Desc springboot获取spring容器
 * https://www.cnblogs.com/s648667069/p/6489557.html
 * https://blog.csdn.net/tuoni123/article/details/80213160
 * <p>
 * @Author yoong
 * <p>
 * @Date 2019年4月14日19:30:00
 * <p>
 * @Version 1.0
 */
@Deprecated
@Component
public class MyApplicationContextAware implements ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
