package com.emc.memoryleaks.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emc.memoryleaks.beans.Policy;

@RestController
public class PolicyController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "*") 
    @RequestMapping("/policy")
    public Policy greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Policy(counter.incrementAndGet(),
                          String.format(template, name),
                          "ABrandNewDataset");
    }
}
