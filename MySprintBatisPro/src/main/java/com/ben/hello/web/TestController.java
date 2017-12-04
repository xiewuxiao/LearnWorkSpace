package com.ben.hello.web;

import com.ben.hello.dao.BookDAOMapper;
import com.ben.hello.dao.LotteryResultMapper;
import com.ben.hello.po.Book;
import com.ben.hello.po.LotteryResult;
import com.ben.hello.service.CacheService;
import com.ben.hello.setup.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by xiewuxiao@163.com on 2017-11-30 15:47:16.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private Logger logger = LogManager.getLogger(this.getClass());
    @Autowired
    CacheService cacheService;

    @Autowired
    BookDAOMapper bookDAOMapper;
    @Autowired
    LotteryResultMapper lotteryResultMapper;

    /**
     * 测试数据库是否正常
     *
     * @return
     */
    @RequestMapping(value = "/database")
    public String testDatabase(Model model) {
        try {
            Map<String,Object> param = new HashMap<>();
            Page page = new Page();
            param.put("page",page);
            List<LotteryResult> list = lotteryResultMapper.getAllLotteryResultByPaging(param);
            model.addAttribute("list",list);
            model.addAttribute("title", "数据库");
            model.addAttribute("license", "© 2014 AllMobilize, Inc. Licensed under MIT license.");
            model.addAttribute("page",page);
        }catch (Exception e){
            e.printStackTrace();
//            logger.error(e.getMessage(),e);
        }
        return "/testDatabase";
    }

    /**
     * 测试页面跳转是否正常
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
        String value = cacheService.testCache("cacheTest");//缓存了一个key值为cacheTest的对象
        model.addAttribute("title", "缓存测试");
        model.addAttribute("license", "© 2014 AllMobilize, Inc. Licensed under MIT license.");
        return "/cacheTest";
    }

    @RequestMapping(value = "/nositemesh")
    public String noSitemesh(Model model) {
        model.addAttribute("result", "这是不带有sitemesh的页面");
        model.addAttribute("title", "这是不带有sitemesh的页面");
        model.addAttribute("license", "© 2014 AllMobilize, Inc. Licensed under MIT license.");
        return "/nositemesh";
    }
}