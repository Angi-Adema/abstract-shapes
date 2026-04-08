package com.angiadema.abstractShapes;

public class Sphere extends Shape {
	
	// Attribute of radius
	private double radius;
	
	// Parameterized constructor
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	// Implement abstract methods
	public double surface_area() {
		return 0;
	}
	
	public double volume() {
		return 0;
	}
	
	//.toString() method printing surface area and volume
	

}
