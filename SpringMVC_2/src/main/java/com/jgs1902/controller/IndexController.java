package com.jgs1902.controller;

import com.jgs1902.pojo.Student;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Controller
public class IndexController {
    //定义一个日志打印对象
    private Logger logger = Logger.getLogger(IndexController.class);


    /*测试用*/
    @RequestMapping(value = "/student1")
    public ModelAndView student1(@RequestParam(required = false) String sname,String sex,String cno){
        Student student=new Student();
        student.setSname(sname);
        student.setSex(sex);
        student.setCno(cno);
        logger.info(student);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("html/student");
        modelAndView.addObject("student",student);
        return modelAndView;
    }

    /*作业*/
    @RequestMapping(value = "/student2")
    public ModelAndView student2(Student student) {
        logger.info(student);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("result","返回结果："+student);
        modelAndView.setViewName("jsp/student");
        return modelAndView;
    }
//    model传值
    @RequestMapping(value = "/student3")
    public String student3(Model model) {
        logger.info(model);
        model.addAttribute("result",model);
        return "jsp/student";
    }
//    map传值
    @RequestMapping(value = "/student4")
    public String student4(Map<String,Object> map){
        Student student=new Student();
        student.setSname("纪雷");
        map.put("result",student);
        return "jsp/student";
    }
}
