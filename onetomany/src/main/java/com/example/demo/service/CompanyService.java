package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;

@Service
@Transactional
public class CompanyService {
	@Autowired
	private CompanyRepository comRepository;

	public Company savecompany(Company comp) {
		return comRepository.save(comp);
		
	}
	public List<Company> addcompany(List<Company> company) {
		return comRepository.saveAll(company);
	}
	
	public List<Company> getcompany(List<Company> comapani){
		return comRepository.findAll();
		}
	
	
	
	
}
