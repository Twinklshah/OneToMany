package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;

@RestController
@RequestMapping("/Company")
public class CompanyController {
	@Autowired
	CompanyService comService;
	
	@PostMapping("/add-company")
	public Company savecompany( @RequestBody Company com) {
		return comService.savecompany(com);
		
	}
	@PostMapping("/add-listcompany")
	public List<Company> listcompany(@RequestBody List<Company> listcomp) {
	   return comService.addcompany(listcomp);
	    
	}
	
	public List<Company> getcompany(@RequestBody List<Company> compn){
		return comService.getcompany(compn);
	}
	
	
}