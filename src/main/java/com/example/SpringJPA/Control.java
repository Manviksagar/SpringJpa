package com.example.SpringJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	@Autowired
	StuRepo sturepo;
	
	@GetMapping("/repo")
	public List<StuJPA> allemp(){
		
		return sturepo.findAll();
	}

}
