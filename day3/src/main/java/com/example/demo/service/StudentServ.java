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
}
