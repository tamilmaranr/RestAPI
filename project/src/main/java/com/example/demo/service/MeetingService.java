package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Meeting;
import com.example.demo.repository.MeetingRepo;

@Service 
public class MeetingService {

	@Autowired 
	MeetingRepo mr;
	
	public Meeting saveinfo(Meeting ms)
	{
		return mr.save(ms);
	}
	
	public List<Meeting> showinfo()
	{
		return mr.findAll();
	}
	
	
	//show by id
	public Optional<Meeting> showbyid(int id)
	{
		return mr.findById(id);
	}
	
	
	// update by id
	public String updateinfobyid(int id, Meeting ms)
	{
		mr.saveAndFlush(ms);
		if(mr.existsById(id))
		{
			return "Update";
		}
		else
		{
			return "Enter a valid id";
		}
	}
	
	
	//delete
	public  void deleteinfo(Meeting ss)
	{
		mr.delete(ss);
	}
	
	
	public List<Meeting> savedetails(List<Meeting> ms)
	{
		return (List<Meeting>)mr.saveAll(ms);
	}
	
	
	//delete by id
	public void deleteid(int id)
	{
		mr.deleteById(id);  
	}
}
