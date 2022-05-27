package com.postman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.postman.entity.Instructor;
import com.postman.repository.InstructorRepository;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
	
	@Autowired
	InstructorRepository instructorRepository;
	
	@PostMapping
    public Instructor addCategory(@RequestBody Instructor instructor){
        return instructorRepository.save(instructor);
    }
	
	@GetMapping
    public List<Instructor> getCategory(){
        return instructorRepository.findAll();
    }
}
