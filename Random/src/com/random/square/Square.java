package com.random.square;

import com.random.shape.Shape;

public class Square implements Shape {
	float length;
	
	// overloaded constructor
	public Square(float length) {
		this.length = length;
	}
	
	// interface method
	public float area() {
		return length * length;
	}
	
}
