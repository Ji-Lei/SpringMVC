package com.jgs1902.interceptor;

import com.jgs1902.pojo.Staff;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpSession;

public class StaffsInterceptor extends HandlerInterceptorAdapter {
//    重写拦截器，返回值是布尔型
//    返回值是true,代表放行,请求进入controller
//    返回值为false,请求拦截,不进入controller

    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Staff staffs = (Staff) session.getAttribute("staffs");
        if(staffs != null){
            return true;
        }else{
//			如果session中为空,重定向到错误页面
            response.sendRedirect(request.getContextPath()+"/jsp/login.jsp");//登录页
            return false;
        }
    }
}
