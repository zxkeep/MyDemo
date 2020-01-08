package com.zhengxu.controller;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.zhengxu.anno.SysLog;
import com.zhengxu.constant.ResponseConstant;
import com.zhengxu.constant.UriConstant;
import com.zhengxu.domain.User;
import com.zhengxu.service.UserService;
import com.zhengxu.vo.BaseResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengxu
 * @create 2019-06-18 18:11
 * @desc 用户控制
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = UriConstant.USER_ADD,method = RequestMethod.POST)
    public BaseResultVO addUser(@RequestBody User user){
        if(user==null){
            return new BaseResultVO(ResponseConstant.OPERATION_WRONG_PARAM);
        }
        userService.add(user);
        return new BaseResultVO();
    }

    @RequestMapping(value = UriConstant.USER_LIST, method = RequestMethod.GET)
    @SysLog("登陆")
    public  User testAop(Integer a,Integer b){
        Integer sum = a + b;
        sum+=5;
        String result = sum + "------------------------------------";
        System.out.println(result);
        if(true){
            return null;
        }
        User user = new User();
        user.setUseAge(sum);
        return user;
    }

}
