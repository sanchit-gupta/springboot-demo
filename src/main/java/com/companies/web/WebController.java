package com.companies.web;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class WebController {
 
    @RequestMapping(value = "/WebIndex", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");

        String str = "Hello World! from /web/index";
        mav.addObject("message", str);
        return mav;
    }

    @RequestMapping(value = "/WebUpdate", method = RequestMethod.GET)
    public ModelAndView update() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("update");

        String str = "Hello World! /web/update";
        mav.addObject("message", str);
        return mav;
    }

    @RequestMapping(value = "/WebShow", method = RequestMethod.GET)
    public ModelAndView show() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("show");

        String str = "Hello World! /web/show";
        mav.addObject("message", str);
        return mav;
    }
}