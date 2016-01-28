package com.companies.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiRestController {

    private static final Logger log = LoggerFactory.getLogger(ApiRestController.class);

    @Autowired
    MongoOperations mongoOperation;

    @Autowired
    BrowserAndOSUtil browserAndOSUtil;

    @RequestMapping(value = "/video/index")
    public String index() {

        log.info("log from /video/index");

        System.out.println("browserAndOSUtil :: "+browserAndOSUtil);
        System.out.println("browserAndOSUtil.getBrowserName() :: "+browserAndOSUtil.getBrowserName());
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

    @RequestMapping("/video/mongo")
    public String delete() {

        User user = new User("mkyong", "password123");
        // save
        mongoOperation.save(user);

        // now user object got the created id.
        System.out.println("1. user : " + user);

        // query to search user
        Query searchUserQuery = new Query(Criteria.where("username").is("mkyong"));

        // find the saved user again.
        User savedUser = mongoOperation.findOne(searchUserQuery, User.class);
        System.out.println("2. find - savedUser : " + savedUser);

        // update password
        mongoOperation.updateFirst(searchUserQuery,
                Update.update("password", "new password"),User.class);

        // find the updated user object
        User updatedUser = mongoOperation.findOne(searchUserQuery, User.class);

        System.out.println("3. updatedUser : " + updatedUser);

        // delete
        mongoOperation.remove(searchUserQuery, User.class);

        // List, it should be empty now.
        List<User> listUser = mongoOperation.findAll(User.class);
        System.out.println("4. Number of user = " + listUser.size());

        return "delete of video ApiResponse";
    }

}