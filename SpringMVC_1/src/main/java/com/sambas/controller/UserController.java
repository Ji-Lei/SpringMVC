package com.sambas.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")//如果与方法定义名一样，类定义优先级更高
public class UserController {
    private Logger logger = Logger.getLogger(IndexController.class);

    //value值是一个String类型数组，可以配置多个访问名，浏览器访问哪个都能访问到
    //method请求方法（get,post），params请求参数
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    //value = "username" ,required = false设置值是非必须的，不设置默认必须（url必须带参数），前提是@RequestMapping里没有params = "username"
    public String welcome(@RequestParam(value = "username" ,required = false) String username){//@RequestParam String username必须和params = "username"一致
        logger.info("欢迎你使用SpringMVC username："+username);
        return "html/user";
    }

}
