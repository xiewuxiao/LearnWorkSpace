package com.ben.hello;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by hasee on 2017/11/17.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/sayHi",produces = "application/json;charset=utf-8")
    @ResponseBody()
    public JSONObject testController_1(@RequestParam String yourName){
        JSONObject result = new JSONObject();
        result.put("name",yourName);
        result.put("msg","Hello,"+yourName);
        return result;
    }
}
