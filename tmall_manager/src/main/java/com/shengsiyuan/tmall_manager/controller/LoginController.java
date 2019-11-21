package com.shengsiyuan.tmall_manager.controller;

import com.shengsiyuan.tmall_manager.bean.UserAccount;
import com.shengsiyuan.tmall_manager.service.UserService;
import com.shengsiyuan.tmall_manager.service.impl.UserServiceImpl;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/goto_login")
    public String goto_login(HttpServletRequest request, ModelMap map){
        String username="";
        Cookie[] cookies = request.getCookies();
        if (cookies!=null &&cookies.length>0){
            for(int i=0;i<cookies.length;i++){
                String name = cookies[i].getName();
                if(name.equals("zs")){
                    username = cookies[i].getValue();
                }
            }
        }
        map.put("username",username);

        return "/login";
    }

    @PostMapping("/login")
    public String goto_login(HttpServletResponse response, HttpSession session, UserAccount userAccount){

        UserAccount user = userService.queryUser(userAccount);

        if (user == null ){
            return "redirect:/goto_login";
        }else {
            session.setAttribute("user",user);

            Cookie cookie = new Cookie("zs",user.getUsername());
            cookie.setMaxAge(60*60);
            response.addCookie(cookie);

        }

        return "success";
    }

}
