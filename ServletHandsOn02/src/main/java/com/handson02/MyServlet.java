package com.handson02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProjectServlet")
public class MyServlet extends HttpServlet {
	// generated serial id
	// identifies class with that UID to prevent naming conflicts
	private static final long serialVersionUID = 7245570758522501100L;
	
	// calls this when the servlet initializes
	public void init() throws ServletException {
		super.init();
	}
	// calls this when the servlet is stopped
	public void destroy() {
		super.destroy();
	}
	
	// POST method for sending data to the server (C)RUD
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the value of the header payload-data and set that value to the headerID string
		String headerID = request.getHeader("Payload-Data");
		// initialize empty variable to hold the response that will be output
		String headerResponse;
		
		// if the headerID is not null and is not empty
		if (headerID != null && !headerID.isEmpty()) {
			// set the headerID as the response
			headerResponse = headerID;
			// set the status to OK (200) to indicate this was a good server request
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			// if the headerID is null or empty, set response to no payload data
			headerResponse = "No payload data";
			// set the status to BAD REQUEST (400) to indicate a bad server request
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		// set message to be sent as a response from the server
		String responseText = "Data can be created using this method (POST).";
		// set the response to the responseText
		response.getWriter().append(responseText);
		// print to the console to make sure the method is being called correctly
		System.out.println("POST was called.");
		// print the value of headerResponse to the console
		System.out.println("Payload-Data: " + headerResponse);
	}
	// GET method for retrieving data from server C(R)UD
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the value of the header payload-data and set that value to the headerID string
		String headerID = request.getHeader("Payload-Data");
		// initialize empty variable to hold the response that will be output
		String headerResponse;
		
		// if the headerID is not null and is not empty
		if (headerID != null && !headerID.isEmpty()) {
			// set the headerID as the response
			headerResponse = headerID;
			// set the status to OK (200) to indicate this was a good server request
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			// if the headerID is null or empty, set response to no payload data
			headerResponse = "No payload data";
			// set the status to BAD REQUEST (400) to indicate a bad server request
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		// set message to be sent as a response from the server
		String responseText = "GET is used to read information information.";
		// set the response to the responseText
		response.getWriter().append(responseText);
		// print to the console to make sure the method is being called correctly
		System.out.println("GET was called.");
		// print the value of headerResponse to the console
		System.out.println("Payload-Data: " + headerResponse);
	}
	// PUT method for updating data in the server CR(U)D
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the value of the header payload-data and set that value to the headerID string
		String headerID = request.getHeader("Payload-Data");
		// initialize empty variable to hold the response that will be output
		String headerResponse;
		
		// if the headerID is not null and is not empty
		if (headerID != null && !headerID.isEmpty()) {
			// set the headerID as the response
			headerResponse = headerID;
			// set the status to OK (200) to indicate this was a good server request
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			// if the headerID is null or empty, set response to no payload data
			headerResponse = "No payload data";
			// set the status to BAD REQUEST (400) to indicate a bad server request
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		// set message to be sent as a response from the server
		String responseText = "Use this (PUT) to update information.";
		// set the response to the responseText
		response.getWriter().append(responseText);
		// print to the console to make sure the method is being called correctly
		System.out.println("PUT was called.");
		// print the value of headerResponse to the console
		System.out.println("Payload-Data: " + headerResponse);
	}
	// DELETE method for removing data from the server CRU(D)
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the value of the header payload-data and set that value to the headerID string
		String headerID = request.getHeader("Payload-Data");
		// initialize empty variable to hold the response that will be output
		String headerResponse;
		
		// if the headerID is not null and is not empty
		if (headerID != null && !headerID.isEmpty()) {
			// set the headerID as the response
			headerResponse = headerID;
			// set the status to OK (200) to indicate this was a good server request
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			// if the headerID is null or empty, set response to no payload data
			headerResponse = "No payload data";
			// set the status to BAD REQUEST (400) to indicate a bad server request
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		// set message to be sent as a response from the server
		String responseText = "Only use DELETE to remove the specified target.";
		// set the response to the responseText
		response.getWriter().append(responseText);
		// print to the console to make sure the method is being called correctly
		System.out.println("DELETE was called.");
		// print the value of headerResponse to the console
		System.out.println("Payload-Data: " + headerResponse);
	}

}
