package com.jgs1902.controller;

import com.jgs1902.pojo.Staff;
import com.jgs1902.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StaffsController {

    @Autowired
    @Qualifier("staffService")
    private StaffService service;

    @RequestMapping("/home/index")
    public String index(Model model){
        List<Staff> list=service.getStaffList();
        model.addAttribute("list",list);
        return "jsp/index";
    }


    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request, @RequestParam String staffname, @RequestParam String password){
        System.out.println(staffname+password);
        Staff staff=service.getStaff(staffname);
        HttpSession session=request.getSession();
        if(staff != null ){
            if(staff.getPassword().equals(password)){
                session.setAttribute("staffs",staff);
                session.setAttribute("role",staff.getRole());
                return "redirect:home/index";
            }else {
                return "redirect:jsp/login.jsp";
            }
        }
        return "redirect:jsp/login.jsp";
    }

    @RequestMapping("/dele/delete")
    public String delete(Model model,@RequestParam String staffname,HttpServletRequest request){
        System.out.println(staffname);
        HttpSession session=request.getSession();
        Integer role= (Integer) session.getAttribute("role");
        System.out.println(role);
        service.deleteStaff(staffname);
        return "redirect:../home/index";
    }
}
