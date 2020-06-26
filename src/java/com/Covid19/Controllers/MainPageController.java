/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Covid19.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
    
    @RequestMapping(value = "/MainPage")
    public String MainController(ModelMap model){
        
        String msg = "Welcome to our covid 19 page";
        model.addAttribute("msg", msg);
        
        return "MainPage";
    }
}
