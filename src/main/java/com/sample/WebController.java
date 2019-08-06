package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class WebController {
	
	@GetMapping("/{name}")	
    public String start(@PathVariable(value="name") String name)
    {
       System.out.println("Running Web API service...........");
       return "Web App " + name;
    }

}
