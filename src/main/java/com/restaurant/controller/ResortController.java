package com.restaurant.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.entities.Resort;
import com.restaurant.service.ResortService;


@RestController
public class ResortController {
	@Autowired
	private ResortService resortService;

	//Get All Resorts
	@GetMapping("/resorts")
	public List<Resort> getAllSubjects() {
       return resortService.getAllSubjects();
	}
	
	//Get user by userid
	@GetMapping("/resort/{id}")
	public Optional<Resort> getUser(@PathVariable int id ,@RequestBody Resort resort)
	{
		return resortService.getSubject(id,resort);
	}
    
	//create user
	@PostMapping("/resort")
	public void addSubject(@RequestBody Resort resort)
	{
		resortService.addSubject(resort);
	}
	
	//update user
	@PutMapping("/resort/{id}")
	public void updateSubject(@PathVariable int id ,@RequestBody Resort resort)
	{
		resortService.updateSubject(id,resort);
	}
    
	//delete user
	
	@DeleteMapping("/resort/{id}")
	public void deleteSubject(@PathVariable int id)
	{
		resortService.deleteSubject(id);
	}

}







