package com.cabbage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {

    @RequestMapping(value = "/file")
    public String file(){
        return "/file/index";
    }
}
