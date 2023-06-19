package com.git.learn.controller;

import com.git.learn.model.Time;
import com.git.learn.service.LearnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

   /* @GetMapping("/getTime/{city}")
    public Time getTime(@PathVariable String city)
    {
        LOG.info("Inside getTime method.");
        Time objTime = learnService.getTime(city);
        return objTime;
    }*/

    @GetMapping("/getTime/{city}")
    public ResponseEntity<?> getTime(@PathVariable String city)
    {
        LOG.info("Inside getTime method.");
        Time objTime = null;
        try {
            objTime = learnService.getTime(city);
        }catch (Exception ex){
            LOG.error(ex.getMessage());
        }
        if (objTime != null)
        {
            return new ResponseEntity<>(objTime, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(objTime, HttpStatus.BAD_REQUEST);
        }
    }

}
