package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service 
public class ApiService {

	@Autowired 
	BookRepo br;
	public Book saveinfo(Book b)
	{
		return br.save(b);
	}
	public List<Book> showinfo()
	{
		return br.findAll();
	}
	
	public String updateinfobyid(int id,Book b)
	{
		br.saveAndFlush(b);
		if(br.existsById(id))
		{
			return "Update";
			
		}
		else
		{
			return "Enter a valid id";
		}
	}
	
	//delete by id
	public void deletebyid(int id)
	{
		br.deleteById(id);
	}
}
