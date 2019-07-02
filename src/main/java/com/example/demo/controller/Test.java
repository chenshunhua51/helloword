package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2019/7/2.
 */
@Controller
@RequestMapping("/test")
public class Test {


    /**
     *
     */
    @GetMapping("/helloword")
    @ResponseBody
    public String helloword() throws Exception
    {
         return "helloword";
    }


}
