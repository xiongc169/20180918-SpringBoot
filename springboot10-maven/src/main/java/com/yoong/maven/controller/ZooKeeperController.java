package com.yoong.maven.controller;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Desc ZooKeeperController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/zk")
public class ZooKeeperController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired
    private CuratorFramework curatorFramework;

    /**
     * http://127.0.0.1:8000/zk/createNode?key=name
     */
    @ResponseBody
    @RequestMapping("/createNode")
    public void createNode(String key) {
        try {
            String path = curatorFramework.create().withMode(CreateMode.EPHEMERAL).withACL(ZooDefs.Ids.OPEN_ACL_UNSAFE).forPath("/zkLock", "/zkLock".getBytes());
            System.out.println(path);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * http://127.0.0.1:8000/zk/distLock?key=name
     */
    @ResponseBody
    @RequestMapping("/distLock")
    public void distLock(String key) {
        try {
            InterProcessMutex lock = new InterProcessMutex(curatorFramework, "/" + key);
            if (lock.acquire(-1, TimeUnit.MILLISECONDS)) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(1000);
                lock.release();
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                System.out.println("        " + format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
