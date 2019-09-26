package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {


//    @RequestMapping(value = "users",method = RequestMethod.GET)
//    public String getuser(ModelMap model){
//        model.addAttribute("user",user.getName());
//        System.out.println(user.getName());
//        return "users";
//
//    }



    @RequestMapping("users")
    public ModelAndView Greeting(HttpServletRequest request, HttpServletResponse response){
        String username=request.getParameter("uname");
        String password=request.getParameter("pwd");
        User user= new User(username,password);
        ModelAndView MV = new ModelAndView();
        MV.setViewName("users");
        MV.addObject("username",user.getName());
        MV.addObject("password",user.getPassword());
        return MV;
    }

//    @GetMapping("users")
//    public ModelAndView passParametersWithModelAndView() {
//        ModelAndView modelAndView = new ModelAndView("users");
//        modelAndView.addObject("user", user);
//        return modelAndView;
//
//    }





}
