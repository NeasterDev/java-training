package com.example.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	// identifier in case of naming conflicts
	private static final long serialVersionUID = 6632886175268784375L;
	
	// resource management
	// throws ServletException
	// initialize servlet
	public void init() throws ServletException {
		super.init();
	}
	
	// resource management
	// if the servlet is going to be stopped, the destroy method is called
	public void destroy() {
		super.destroy();
	}
	// method for GET requests
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the "Test-Header" value from the HTTP request header
		String testHeaderID = request.getHeader("Test-Header");
		String testHeaderResponse;
		
		// if the response is not null and has a value, replace with said value
		if (testHeaderID != null && !testHeaderID.isEmpty()) {
			testHeaderResponse = testHeaderID;
		} else {
			testHeaderResponse = "nothing";
			// changes the response status to 400 bad request
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		// Store the 'responseText' string in the response object (to be sent to the client)
		String responseText = "You sent " + testHeaderResponse + " to the server.";
		
		// writes the test to the response
		response.getWriter().append(responseText);
		
		System.out.println("doGet was called");
	}
	// method for POST requests
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost was called");
	}
	// method for PUT requests
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPut was called");
	}
	// method for DELETE requests
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doDelete was called");
	}

}
