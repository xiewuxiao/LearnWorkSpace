package com.ben.hello.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Ben on 2017/12/9.
 */
@Aspect
@Component
public class Audience {
    private Logger logger  = LogManager.getLogger();

    //此处的该方法并没任何含义，只是为了引入切入点而已
    @Pointcut("execution(* com.ben.hello.web.TestController.testDatabase(..))")
    public void testDatabase(){

    }
    @Before("testDatabase()")
    public void takeSeates(){
        logger.debug("观众们正在就位");
    }
    @Before("testDatabase()")
    public void turnOffCellPhone(){
        logger.debug("观众们手机已经关机");
    }
    @AfterReturning("testDatabase()")
    public void applaud(){
        logger.debug("观众们热情地鼓掌");
    }
    @AfterThrowing("testDatabase()")
    public void demandRefund(){
        logger.debug("由于表演太烂了，所以观众要求退票");
    }
}
