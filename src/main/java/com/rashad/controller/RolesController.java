package com.rashad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rashad.entity.Roles;
import com.rashad.service.RolesService;

@RestController
public class RolesController {
	
	@Autowired
	RolesService service;
	
	@PostMapping("/save")
	public String saveRole(@RequestBody Roles role) {
		return service.saveRole(role);
	}
	
	@DeleteMapping("/delete/{rollId}")
	public String deleteRole(@PathVariable int rollId) {
		return service.deleteRole(rollId);
	}
	
	@PutMapping("/update/{rollId}")
	public Roles updateRole(@PathVariable int rollId,@RequestBody Roles role) {
		return service.updateRole(rollId, role);
	}
	
	@GetMapping("/get")
	public List<Roles> fetchAll(){
		return service.fetchAll();
	}

}
