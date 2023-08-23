package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Meeting;
public interface MeetingRepo extends JpaRepository <Meeting, Integer>{

}
