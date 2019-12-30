package com.jgs1902.interceptor;

import com.jgs1902.pojo.Staff;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Integer role = (Integer) session.getAttribute("role");
        if(role!=null){
            if (role==1){
                return true;
            }else {
                response.sendRedirect(request.getContextPath()+"/jsp/err.jsp");
                return false;
            }
        }else {
            return false;
        }
    }
}
