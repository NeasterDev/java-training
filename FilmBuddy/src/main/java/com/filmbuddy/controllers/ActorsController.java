package com.filmbuddy.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.filmbuddy.models.Actor;

// flag to let spring know this is a controller class used for routing
@Controller
// tells spring that this controller will assume all inner routes begin with ("/")
@RequestMapping({ "/" })
public class ActorsController {
	// gets the value from our application properties file for the connection url for the database
	@Value("${spring.datasource.url}")
	private String url;
	// gets the value from our application properties file for the connection username for the database
	@Value("${spring.datasource.username}")
	private String username;
	// gets the value from our application properties file for the connection password for the database
	@Value("${spring.datasource.password}")
	private String password;
	
	// home page GET route for ("/")
	@GetMapping()
	public String getAllActors(Model model) {
		// creates an array list to hole the actors that will be queried
		List<Actor> actors = new ArrayList<Actor>();
		// creates a connection variable that will establish the connection to the database
		Connection con;
		// try/catch block for connection to the database
		try {
			// attempt to connect to the database using the values from our applications.properties file
			con = DriverManager.getConnection(url, username, password);
			// create a statement variable from our connection, to excecute sql queries
			Statement stmt = con.createStatement();
			// set rs to the result of the SQL query
			ResultSet rs = stmt.executeQuery("SELECT * FROM actor");
			
			// while there is still more information in the results from the query
			while (rs.next()) {
				
				// create a new Actor object
				Actor newActor = new Actor();
				
				// get the values from each column of the current
				// row and add them to the new Actor
				newActor.setActor_id(rs.getInt("actor_id"));
				newActor.setFirst_name(rs.getString("first_name"));
				newActor.setLast_name(rs.getString("last_name"));
				newActor.setLast_update(rs.getTimestamp("last_update"));
				
				// add the new actor to the actors list
				actors.add(newActor);
			}
		// listen for SQL errors
		} catch (SQLException e) {
			// print the error if one is caught
			e.printStackTrace();
		}
		// adds the actor list information to the model
		model.addAttribute("actors", actors);
		// return actors.html to the client
		return "actors";
	}
	
	@GetMapping("/actors")
	public String viewActors(Model model) {
		// creates an array list to hole the actors that will be queried
		List<Actor> actors = new ArrayList<Actor>();
		// creates a connection variable that will establish the connection to the database
		Connection con;
		// try/catch block for connection to the database
		try {
			// attempt to connect to the database using the values from our applications.properties file
			con = DriverManager.getConnection(url, username, password);
			// create a statement variable from our connection, to excecute sql queries
			Statement stmt = con.createStatement();
			// set rs to the result of the SQL query
			ResultSet rs = stmt.executeQuery("SELECT first_name, last_name, title FROM film\r\n"
											+ "JOIN film_actor USING (film_id)\r\n"
											+ "JOIN actor USING (actor_id);");
			
			// while there is still more information in the results from the query
			while (rs.next()) {
				// create a new Actor object
				Actor newActor = new Actor();
				
				// get the values from each column of the current
				// row and add them to the new Actor
				newActor.setFirst_name(rs.getString("first_name"));
				newActor.setLast_name(rs.getString("last_name"));
				newActor.setTitle(rs.getString("title"));
				
				// add the new actor to the actors list
				actors.add(newActor);
			}
			// listen for SQL errors
		} catch (SQLException e) {
			// print the error if one is caught
			e.printStackTrace();
		}
		// adds the actor list information to the model
		model.addAttribute("actors", actors);
		// return view.html to the client
		return "view";
	}
	
	
}
