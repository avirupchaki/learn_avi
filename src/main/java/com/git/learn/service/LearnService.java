package com.git.learn.service;

import com.git.learn.model.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LearnService {

    private static final Logger LOG = LoggerFactory.getLogger("LearnerService.class");

    @Value("${restURLforTimeWebservice}")
    private String TIME_API_URL;
    private String strTest = "";
    
    @Autowired
    private RestTemplate restTemplate;

    public Time getTime(String city) throws Exception
    {
        String restURL = TIME_API_URL+city;
        LOG.info("Inside getTime method. "+restURL);
        Time objTime = new Time();
        objTime = restTemplate.getForObject(restURL, Time.class);
        return objTime;
    }
}
