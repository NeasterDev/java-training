package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	// sets up the template for the greeting
    private static final String template = "Greetings, %s!";
    // creates a variable to act as the counter for the program
    private final AtomicLong counter = new AtomicLong();

    // use this route for any request at localhost:8080/greeting
    @RequestMapping("/greeting")
    // function that takes a name as a parameter, or defaults it to world
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
            // the counter value odd (i.e. 1, 3, 5, 7, ...)
            long newCounter = 0; //initialize
            // gets the current value of the count and multiplies it by its (current value + 1)
            newCounter = counter.get() * counter.incrementAndGet();
            // format the string with the name that was given
            String templateWithName = String.format(template, name);
            // create a new greeting object to store the values
            Greeting greetingObject = new Greeting(newCounter, templateWithName);
            // respond with the greetingObject
            return greetingObject;
    }
}