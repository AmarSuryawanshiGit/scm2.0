package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page Handler");
        model.addAttribute("name", "Substring technologis");
        model.addAttribute("youtubechannel","Imortalgaming");
        model.addAttribute("Github", "http://github/imortal");
        return "home";
    }

    // about content

    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("This is about content");
        return "about";
    }
    

    // services content

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("This is services content");
        return "services";
    }

    // contact content

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    // login content

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    // ragister content

    @GetMapping("/ragister")
    public String ragister() {
        return"ragister";
    }
    
    

}
