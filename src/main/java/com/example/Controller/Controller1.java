package com.example.Controller;

import com.example.dao.UserIMP;
import com.example.entities.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controller1 {
   @Autowired
   private UserIMP userimp;

   @GetMapping(path = "/index")
    String getIndex(){
       return "index" ;
   }
   /***********Sign in ***********/
    @GetMapping(path = "/signin")
    String getSignin(Model model){
        model.addAttribute("user",new User());
        return "signin" ;
    }
    @PostMapping(path = "/checkuser")
    public String checkuser(@ModelAttribute User user, HttpSession session,Model model){
        User u = userimp.checkuser(user.getLogin(),user.getPassword());
        if (u != null){
            session.setAttribute("userlogin",u);
            
            return "redirect:/index";
        }
        else {
        	model.addAttribute("message","errore");
             return "signin" ;
             
        }
    }
    /***********Sign up ***********/
    @GetMapping(path = "/signup")
    String getSignup(Model model){
        model.addAttribute("signup_user",new User());
        return "signup" ;
    }
    @PostMapping(path = "/register_user")
    String register_user(@ModelAttribute User user) {
    	userimp.save(user);
    	return "success";
    }
    @GetMapping(path = "/deconnexion")
    String deconnexion( HttpSession session) {
    	session.setAttribute("userlogin",null);
    	return "redirect:signin" ;
    }
    /********************Bien access*******************/
    @GetMapping(path = "/biens")
    String getBiens(Model model) {
    	
    	return "biens";
    }
    /********************Dashbborad****************/
    @GetMapping(path = "DashBoard")
    String getDash() {
    	
    	return "DashBoard" ;
    }
}
