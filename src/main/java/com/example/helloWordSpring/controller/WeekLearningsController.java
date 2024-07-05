package com.example.helloWordSpring.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/week-learnings")
public class WeekLearningsController {
	
	private final List<String> learnings = Arrays.asList(
			"Back-End",
			"Spring",
			"Desenvolvimento Web Com JAVA"
			);
		
	
	
	@GetMapping
	public List weekLearning() {
		return learnings;
	}
	
	
}
