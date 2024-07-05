package com.example.helloWordSpring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list-bsm")
public class BsmListController {

	@GetMapping
	public List bsms(){
		
	List<String> bsm = new ArrayList<>();
	bsm.add("Persistência");
	bsm.add("Orientação ao detalhe");
	
	return bsm;
	}
	
}
