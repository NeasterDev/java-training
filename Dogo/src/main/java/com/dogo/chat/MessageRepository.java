package com.dogo.chat;

import org.springframework.data.jpa.repository.JpaRepository;
											// Integer is the data type for the primary key
public interface MessageRepository extends JpaRepository<Message, Integer>{
// orm interface that allows us to query database without using sql
}
