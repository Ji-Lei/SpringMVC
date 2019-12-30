package com.sambas.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {
      private Logger logger = Logger.getLogger(IndexController.class);
//    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        System.out.println("hello,spring mvc!");
//        /*配置到jsp*/
//        return new ModelAndView("jsp/index");
//        /*配置到html*/
//        /*return new ModelAndView("html/index");*/
//    }
    @RequestMapping("index1")//处理中间部分为html/index的请求
    public ModelAndView index1(){
        System.out.println("来自html视图！");
        return new ModelAndView("html/index");//此处index表示视图文件index.html的名字
    }
    @RequestMapping("index2")//处理中间部分为jsp/index的请求
    public ModelAndView index2(){
        System.out.println("来自jsp视图");
        return new ModelAndView("jsp/index");//此处index表示视图文件index.jsp的名字
    }
    @RequestMapping("user")//返回值类型也可以用String
    public String user(){
        System.out.println("欢迎小菜鸟");
        return "html/user";//此处user表示视图文件user.html的名字
    }
    @RequestMapping("/welcome")
    public String welcome(@RequestParam String username){
        logger.info("欢迎使用SpringMVC username："+username);
        return "html/user";
    }
    //向jsp视图页面传值
    @RequestMapping("/index0")
    public ModelAndView index0(String username){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username",username);
        System.out.println(username);
        modelAndView.setViewName("jsp/index");
        return modelAndView;
    }
//向html传值
    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        String username=request.getParameter("username");
        System.out.println(username);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username",username);
        modelAndView.setViewName("html/index");
        return modelAndView;
    }
}
