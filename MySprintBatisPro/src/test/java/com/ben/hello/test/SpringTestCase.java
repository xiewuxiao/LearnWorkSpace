package com.ben.hello.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xiewuxiao@163.com on 2017-11-30 15:47:16.
 * spring 测试基类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class SpringTestCase extends AbstractTransactionalJUnit4SpringContextTests {

}