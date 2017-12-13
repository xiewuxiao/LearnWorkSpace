package com.ben.hello.test;

import com.ben.hello.dao.LotteryResultMapper;
import com.ben.hello.service.CacheService;
import org.apache.ibatis.javassist.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


/**
 * Created by xiewuxiao@163.com on 2017-11-30 15:47:16.
 * spring 测试基类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class SpringTestCase extends AbstractTransactionalJUnit4SpringContextTests {
    @Test
    public void test(){
        System.out.println(System.getProperty("file.encoding"));
    }
}