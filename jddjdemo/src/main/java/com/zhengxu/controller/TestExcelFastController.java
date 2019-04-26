package com.zhengxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.wordnik.swagger.annotations.ApiOperation;


import io.swagger.annotations.Api;


@Controller
@RequestMapping(value="/TestExcelFast")
@Api(value = "restful", description = "测试")
public class TestExcelFastController {

    @ApiOperation(value = "测试专用")
    @RequestMapping(value="/test",method=RequestMethod.GET)
    @ResponseBody
    public String  test(){
        String str = "123";
        System.out.println(1);
        return str;
    }

}