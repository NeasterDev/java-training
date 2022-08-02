package com.dogo.chat;

import javax.persistence.*;

@Entity
@Table(name="message") // gives the table a name when created
public class Message {
	
	// flag signifies that this is the primary key 
	// and the generated value flag auto increments it
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String content;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
