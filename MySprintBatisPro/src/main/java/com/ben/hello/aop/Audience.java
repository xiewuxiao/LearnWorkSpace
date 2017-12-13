package com.ben.hello.aop;

import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Ben on 2017/12/9.
 * @author ben
 * @date 2017/12/9
 */
@Aspect
@Component
public class Audience {
    private Logger logger  = LogManager.getLogger();
    @Getter
    private HttpServletRequest request;
    @Getter
    private Model model;
    /**
     * 此处的该方法并没任何含义，只是为了引入切入点而已
     * @param model 用于页面显示相关数据
     * @param request  请求对象
     *
     * */

    @Pointcut("execution(* com.ben.hello.web.TestController.testDatabase(org.springframework.ui.Model,javax.servlet.http.HttpServletRequest)) && args(model,request)")
    public void testDatabase(Model model, HttpServletRequest request){

    }
    @Before("testDatabase(model,request)")
    public void takeSeates(Model model, HttpServletRequest request){
        //可以将request封装一下
        System.out.println(request);
        logger.debug("观众们正在就位");
    }
    @Before("testDatabase(model,request)")
    public void turnOffCellPhone(Model model, HttpServletRequest request){
        logger.debug("观众们手机已经关机");
    }
    @AfterReturning("testDatabase(model,request)")
    public void applaud(Model model, HttpServletRequest request){
        logger.debug("观众们热情地鼓掌");
    }
    @AfterThrowing("testDatabase(model,request)")
    public void demandRefund(Model model, HttpServletRequest request){
        logger.debug("由于表演太烂了，所以观众要求退票");
    }


}
