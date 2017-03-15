package com.username.springMVC.controller;


import com.username.bl.service.TestService;
import com.username.springMVC.model.AccessData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    TestService testService;

    private static final Logger log = Logger.getLogger(MainController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        try {
            modelAndView.addObject("message", testService.getData());
        }
        catch (Throwable e)
        {
            modelAndView.addObject("message", "ERROR");
            log.error(e);
        }

        return modelAndView;
    }

    @RequestMapping(value = "/try-access")
    public ModelAndView checkUser(@ModelAttribute("access-data") AccessData accessData) {
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
