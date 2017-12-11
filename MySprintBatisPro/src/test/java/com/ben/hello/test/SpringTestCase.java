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
    @Test
    public void testAnnotation() throws ClassNotFoundException, NotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("com.ben.hello.service.CacheService");
        Method method = clazz.getMethod("testCache",String.class);
        Annotation annotation =  method.getAnnotation(Cacheable.class);
    }
    @Test
    public void CGLIBTest() {
            Enhancer enhance = new Enhancer();
            enhance.setSuperclass(LotteryResultMapper.class);//他是继承了父类的方式去实现织入的，所以这里要点明使用哪个织入对象
            enhance.setUseCache(false);
            enhance.setCallback(new MethodInterceptor() {//方法拦截器

                @Override
                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                    // TODO Auto-generated method stub
                    return proxy.invokeSuper(obj, args);
                }
            });
        LotteryResultMapper sayHello =(LotteryResultMapper) enhance.create();
            long start = System.currentTimeMillis();
            System.out.println(start);
            sayHello.say();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()-start);
        }
}