package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Meeting;
import com.example.demo.service.MeetingService;

@RestController 
public class MeetingController {
	
	@Autowired 
	MeetingService mser;
	
	@PostMapping ("add")
	public Meeting add(@RequestBody Meeting ms)
	{
		return mser.saveinfo(ms);
	}
	
	@GetMapping ("show")
	public List<Meeting> show()
	{
		return mser.showinfo();
	}
	
	//show by id
	
	@GetMapping("showbyid/{id}")
	public Optional <Meeting> showid(@PathVariable int id)
	{
		return mser.showbyid(id);
	}
	
	//update by id
	@PostMapping("updatebyid/{id}")
	public String changeinfo(@PathVariable int id,@RequestBody Meeting ms)
	{
		return mser.updateinfobyid(id, ms);
	}
	
	//delete by id
		@DeleteMapping ("delete/{id}")
		public void deletemyid(@PathVariable int id)
		{
			mser.deleteid(id);
		}
	

}
