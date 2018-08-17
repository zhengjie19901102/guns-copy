package com.stylefeng.guns.modular.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class TestController {

    @RequestMapping("/ad")
    public String getAd(Model mode, Locale local){
        return "/ad.html";
    }

    @RequestMapping("/bb")
    public String getBb(Locale locale){
        return "/bb.html";
    }

}
