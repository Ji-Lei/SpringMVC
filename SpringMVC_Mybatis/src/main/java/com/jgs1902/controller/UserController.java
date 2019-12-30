package com.jgs1902.controller;

import com.jgs1902.pojo.User;
import com.jgs1902.pojo.UsersList;
import com.jgs1902.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

//    根据用户名查询用户信息，默认查询所有
    @RequestMapping("/select")
    public String select(@RequestParam(required = false) String username, Model model){
        List<UsersList> list=userService.getUsers(username);
        model.addAttribute("count",list.size());
        model.addAttribute("list",list);
        return "jsp/selectuser";
    }

//    添加用户信息，添加成功后转发到信息展示页
    @RequestMapping("/adduser")
    public String add(User user){
        userService.addUser(user);
        return "redirect:select";//添加后跳转到展示页
    }

//  根据用户名删除信息
    @RequestMapping("/deleteuser")
    public String delete(@RequestParam String username){
        userService.deleteUser(username);
        return "redirect:select";//删除后跳转到展示页
    }
}
