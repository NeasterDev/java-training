package com.random.circle;

import com.random.shape.*;

public class Circle implements Shape {
	float radius;
	
	
	// overloaded constructor
	public Circle(float radius) {
		this.radius = radius;
	}
	
	public float area() {
		return 3.14f * radius * radius;
	}
}
