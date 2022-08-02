package com.NicholasEaster.handson9;

public class Animal {
	// required properties
    private String name;
    private float length;
    private float height;
    private float weight;
    
    // optional properties
    private boolean isGrassFed;
    
    // default constructor
    public Animal() {
        name = "";
        length = 0;
        height = 0;
        weight = 0;
    }
    
    // overloaded constructor with required properties
    public Animal(String name, float length, float height, float weight) {
        this.name = name;
        this.length = length;
        this.height = height;
        this.weight = weight;
    }
    
    // getter and setter for optional property 
	public boolean isGrassFed() {
		return isGrassFed;
	}

	public void setGrassFed(boolean isGrassFed) {
		this.isGrassFed = isGrassFed;
	}

	
	// getter and setter for name also because I needed to setName 
	// for my factory
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    // just getters for the rest of required properties to implement
    // builder design patterns
	public float getLength() {
		return length;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}
}