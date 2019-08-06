package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compliance")
public class WebController {
	
	@GetMapping
    public void start()
    {
       System.out.println("Running data compliance service...........");
       //TODO : Call RideData compliance service for cleanup 
    }

}
