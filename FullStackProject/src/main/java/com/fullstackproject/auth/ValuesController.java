package com.fullstackproject.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/values")
public class ValuesController {

	// /api/values GET route
	@GetMapping()
	public ResponseEntity<List<String>> getNames() {
		// create an arraylist to hold names
		List<String> names = new ArrayList<String>();
		// add some names
		names.add("First");
		names.add("Second");
		names.add("Third");
		// respond with the list of names
		return ResponseEntity.ok(names);
	}
}
