package com.ben.hello.web;

import com.alibaba.fastjson.JSON;
import com.ben.hello.dao.LotteryResultMapper;
import com.ben.hello.po.LotteryResult;
import com.ben.hello.service.CacheService;
import com.ben.hello.setup.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 简单的控制层对象
 * @author ben
 * @date 2017/12/9
 * Created by hasee on 2017/12/4.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private Logger logger = LogManager.getLogger(this.getClass());
    @Autowired
    CacheService cacheService;

    @Autowired
    LotteryResultMapper lotteryResultMapper;

    /**
     * 测试数据库是否正常
     *
     * @return
     */
    @RequestMapping(value = "/database")
    public String testDatabase(Model model, HttpServletRequest request) {
        try {

            Map<String,Object> param = new HashMap<>(10);
            Page page = new Page();
            String pageNum = request.getParameter("pageNum");
            if(pageNum!=null){
                page.setPageNum(Integer.valueOf(pageNum));
            }
            param.put("page",page);
            List<LotteryResult> list = lotteryResultMapper.getAllLotteryResultByPaging(param);
            model.addAttribute("list",list);
            model.addAttribute("title", "数据库");
            model.addAttribute("license", "© 2014 AllMobilize, Inc. Licensed under MIT license.");
            model.addAttribute("page",page);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "/testDatabase";
    }

    /**
     * 测试页面跳转是 否正常
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/index")
    public String testPage(Model model) {
        System.out.println("success!!!!");
        model.addAttribute("result", "project is running successfully!!!");
        model.addAttribute("title", "首页");
        model.addAttribute("license", "© 2014 AllMobilize, Inc. Licensed under MIT license.");
        return "/index";
    }

    /**
     * 测试cache配置是否成功
     *
     * @return
     */
    @RequestMapping(value = "/cache")
    public String testCache(Model model) {
        //缓存了一个key值为cacheTest的对象
        String value = cacheService.testCache("cacheTest");
        model.addAttribute("cache",value);
        model.addAttribute("title", "缓存测试");
        model.addAttribute("license", "© 2014 AllMobilize, Inc. Licensed under MIT license.");
        return "/cacheTest";
    }

    @RequestMapping(value = "/nositemesh")
    public String noSitemesh(Model model) {
        model.addAttribute("result", "这是不带有sitemesh的页面");
        model.addAttribute("title", "这是不带有sitemesh的页面");
        model.addAttribute("license", "© 2014 AllMobilize, Inc. Licensed under MIT license.");
        return "/nositemesh/nositemesh";
    }
    @RequestMapping(value = "/nositemesh/mybody",produces = "application/json;charset=utf-8")
    @ResponseBody()
    public String getLotteryResultData() {
        Map<String,Object> param = new HashMap<>(10);
        Page page = new Page(1,200);
        param.put("page",page);
        List<LotteryResult> list = lotteryResultMapper.getAllLotteryResultByPaging(param);
        String result = JSON.toJSONString(list);
        System.out.println(result);
        return result;
    }

}