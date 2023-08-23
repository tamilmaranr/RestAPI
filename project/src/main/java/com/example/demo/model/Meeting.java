package com.example.demo.model;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Meeting {
	
	@Id 
	private int meetingId;
	private String title;
	private String description;
	private String date;
	private String startTime;
	private String duration;
	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Meeting(int meetingId, String title, String description, String date, String startTime, String duration) {
		super();
		this.meetingId = meetingId;
		this.title = title;
		this.description = description;
		this.date = date;
		this.startTime = startTime;
		this.duration = duration;
	}
	public int getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	

}
