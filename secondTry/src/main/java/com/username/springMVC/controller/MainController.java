package com.username.springMVC.controller;


import com.username.bl.service.TestService;
import com.username.springMVC.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/try-access")
    public ModelAndView checkUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        String message = TestService.getData(user.getName(), user.getPassword());

        modelAndView.setViewName("access-result");

        modelAndView.addObject("message", message);

        return modelAndView;
    }
}
