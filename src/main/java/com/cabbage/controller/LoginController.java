package com.cabbage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    /** 系统主页 */
    @RequestMapping("/main")
    public String index(){
        return "/main/index";
    }

    /** 系统登录界面 */
    @RequestMapping("/login")
    public String login(){
        return "/login";
    }
}
