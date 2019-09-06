package com.web.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("test")
    @ResponseBody
    public JSONObject testDemo(){
        JSONObject retJo = new JSONObject();
        retJo.put("data","hello world");
        return retJo;
    }
}
