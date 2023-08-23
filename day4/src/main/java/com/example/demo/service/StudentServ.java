package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service 
public class StudentServ {

	@Autowired
	StudentRepository sr;
	public Student saveinfo(Student ss)
	{
		return sr.save(ss);
	}
	public List<Student> showinfo()
	{
		return sr.findAll();
	}
	
	//update by id
	public String updateinfobyid(int id,Student ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Update";
		}
		else
		{
			return "Enter a valid id";
		}
	}
	
	
	public List<Student> savedetails(List<Student> ss)
	{
		return (List<Student>)sr.saveAll(ss);
	}
	//delete by id
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
//delete by id for requestparam
	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
	
}
