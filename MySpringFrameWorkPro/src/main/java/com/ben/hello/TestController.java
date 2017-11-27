package com.ben.hello;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by hasee on 2017/11/17.
 */
@Controller
@RequestMapping("/")
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "index1";
    }
    @RequestMapping(value = "sayHi",produces = "application/json;charset=utf-8")
    @ResponseBody()
    public JSONObject testController_1( String yourName){
        JSONObject result = new JSONObject();
        result.put("name",yourName);
        result.put("msg","Hello,"+yourName);
        return result;
    }
}
