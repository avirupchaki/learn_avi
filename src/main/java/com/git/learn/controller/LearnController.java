package com.git.learn.controller;

import com.git.learn.model.Time;
import com.git.learn.service.LearnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn")
public class LearnController {

    private static final Logger LOG = LoggerFactory.getLogger("LearnController.class");

    @Autowired
    private LearnService learnService;

    @GetMapping("/getTime/{city}")
    public Time getTime(@PathVariable String city)
    {
        LOG.info("Inside getTime method.");
        Time objTime = learnService.getTime(city);
        return objTime;
    }

}
