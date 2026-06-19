package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class thirdControler {

    @GetMapping("/home")
    public String getHomePage() {
        return "homePage";
    }

    
    @GetMapping("/profile")
    public ModelAndView getProfilePage() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("profilePage");
        mav.addObject("Msg", "Profile Page is very important");

        return mav;
    }

    @GetMapping("/welcome")
    public ModelAndView getWelcomePage() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("welcomePage");
        mav.addObject("Msg", "Welcome Page");

        return mav;
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/saveUser")
    public ModelAndView saveUser(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("mobile") String mobile,
            @RequestParam("password") String password) {

        ModelAndView mav = new ModelAndView();

        mav.setViewName("success");

        mav.addObject("name", name);
        mav.addObject("email", email);
        mav.addObject("mobile", mobile);

        return mav;
    }
}
