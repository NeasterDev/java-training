package com.random;

import com.random.circle.Circle;
import com.random.square.Square;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circ = new Circle(5f);
		System.out.println(circ.area());
		
		Square sq = new Square(5);
		
		System.out.println(sq.area());
		
	}

}
