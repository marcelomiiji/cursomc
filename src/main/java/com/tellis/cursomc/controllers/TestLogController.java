package com.tellis.cursomc.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tellis.cursomc.services.PersonServices;

@RestController
public class TestLogController {

    private Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping(value = "/test")
    public String testLog() {
        logger.info("Test log!");
        logger.debug("Test log debug!");
        logger.warn("Test log warn!");
        logger.error("Test log error!");
        return "Logs generated successfully";
    }
    
}
