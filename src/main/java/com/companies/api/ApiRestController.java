package com.companies.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {

    private static final Logger log = LoggerFactory.getLogger(ApiRestController.class);

    @RequestMapping("/video/index")
    public String index() {

        log.info("log from /video/index");

        return "index of video ApiResponse";
    }

    @RequestMapping("/video/show")
    public String show() {

        return "show of video ApiResponse";
    }

    @RequestMapping("/video/create")
    public String create() {

        return "Show of create ApiResponse";
    }

    @RequestMapping("/video/update")
    public String update() {

        return "update of update ApiResponse";
    }

    @RequestMapping("/video/delete")
    public String delete() {

        return "delete of video ApiResponse";
    }

}