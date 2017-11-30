package com.ben.hello.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by xiewuxiao@163.com on 2017-11-30 15:47:16.
 */
@Service
public class CacheService {

    /***
     * 测试缓存是否生效
     * @return
     */
    @Cacheable(value = "myCache", key = "#key")
    public String testCache(String key) {
        System.out.println("第一次调用会会打印此语句-------");
        return "cache test success !!!";
    }
}