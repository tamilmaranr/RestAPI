package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ApiService;

@RestController 

public class ApiController {

	@Autowired 
	ApiService  bser;
	
	
	@PostMapping("add")
	public Book add(@RequestBody Book b)
	{
		return bser.saveinfo(b);
	}
	
	
	@GetMapping("show")
	public List <Book> show()
	{
			return bser.showinfo();
	}
	
	//delete by id
		@DeleteMapping ("delete/{id}")
		public void deletemyid(@PathVariable int id)
		{
			bser.deletebyid(id);
		}
		
	//update by id
		@PostMapping("updatebyid/{id}")
		public String changeinfo(@PathVariable int id,@RequestBody Book b)
		{
			return bser.updateinfobyid(id, b);
		}
}
