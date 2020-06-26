
package com.Covid19.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Covid19.Models.LoginModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import com.Covid19.Models.UserAuthendication;
import com.Covid19.Controllers.DatabaseConfig;


@Controller
public class HomeController {
    
    @RequestMapping(value = "/home")
    public String HomePage(ModelMap model){
    
        LoginModel Lm = new LoginModel();
        
        model.addAttribute("loginForm", Lm);
        return "home";
    }
    
    
    @RequestMapping(value = "/welcome")
    public String Log(@ModelAttribute("loginForm") LoginModel Lm,Model model){
        
        DatabaseConfig DB = new DatabaseConfig();
        UserAuthendication obj;
        
        
        String uname,pass;
        uname= Lm.getUsername();
        pass = Lm.getPass();
        obj = DB.method(uname);
        
        if(uname.equals(obj.getUname()) && pass.equals(obj.getPass()) ){        
        model.addAttribute("user", uname);
        return "MainPage";
        }
        else{
        
            return "home";
        }
    }
    
    
}
