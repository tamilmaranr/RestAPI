package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

public class ApiController {
	
	@Autowired 
	EmployeeService eser;
	
	@PostMapping ("add")
	public Employee add(@RequestBody Employee e)
	{
		return eser.saveinfo(e);
	}
	
	
	@GetMapping ("show")
	public List<Employee> show()
	{
		return eser.showinfo();
	}

	@GetMapping ("showbyid/{id}")
	public Optional <Employee > showid(@PathVariable int id)
	{
		return eser.showbyid(id);
	}
}
