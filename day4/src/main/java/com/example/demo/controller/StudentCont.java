package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Student;
import com.example.demo.service.StudentServ;

@RestController
public class StudentCont {
	
	@Autowired 
	StudentServ sser;
	
	@PostMapping("addstudent")
	public Student add(@RequestBody Student ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("showstudent")
	public List <Student> show()
	{
		return sser.showinfo();
	}
	
	
	//update by id
	@PostMapping("updatebyid/{id}")
	public String changeinfo(@PathVariable int id,@RequestBody Student ss)
	{
		return sser.updateinfobyid(id,ss);
		
	}
	
	
	
	//delete by id
	@DeleteMapping("delete/{id}")
	public void deletemyid(@PathVariable int id)
	{
		sser.deleteid(id);
	}
	
	@DeleteMapping ("delparam")
	public void delid(@RequestParam int id)
	{
		sser.deletepid(id);
	}
	

	
	

}
