package com.angiadema.abstractShapes;

public class Cone extends Shape {
	
	// Attributes of radius and height
	private double radius;
	private double height;
	
	// Parameterized constructor to initialize attributes
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// Implement abstract methods from Shape
	@Override
	public double surface_area() {
		return (Math.PI) * radius * (radius + (Math.sqrt((Math.pow(height, 2)) + (Math.pow(radius, 2)))));
	}
	
	@Override
	public double volume() {
		return (1.0/3.0) * (Math.PI) * (Math.pow(radius, 2)) * height;
	}
	
	// Implement a toString method to print surface area and volume
	@Override
	public String toString() {
		return "Cone Surface Area: " + String.format("%.2f", surface_area()) + " units\u00B2\n" +
	           "Cone Volume: " + String.format("%.2f", volume()) + " units\u00B3";
	}

}
