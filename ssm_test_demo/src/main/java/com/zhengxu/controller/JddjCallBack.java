package com.zhengxu.controller;

import com.zhengxu.domain.ResulMap;
import com.zhengxu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class JddjCallBack {

    @RequestMapping(value = "/home", method = POST)
    @ResponseBody
    public ResulMap ToJddj(User user){

        System.out.println(user);
        ResulMap resulMap = new ResulMap();
        resulMap.setCode("200");
        resulMap.setMsg("success");
        resulMap.setData(" ");
        return resulMap;
    }
}
