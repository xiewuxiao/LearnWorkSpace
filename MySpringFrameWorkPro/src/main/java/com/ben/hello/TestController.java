package com.ben.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by hasee on 2017/11/17.
 */
@Controller
@RequestMapping(path = {"pay"})
public class TestController {
    @RequestMapping(value = {"hello.do","ben.do"})
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        System.out.println("test");
        return "index1";
    }

    @RequestMapping(value = {"hello"})
    public String anotherTest(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        System.out.println("请求进来啦");
        return "index";
    }

}
