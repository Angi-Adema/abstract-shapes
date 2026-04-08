package com.angiadema.abstractShapes;

public class Cylinder extends Shape {
	
	// Attributes radius and height
	private double radius;
	private double height;
	
	// Parameterized constructor
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// Implement methods from Shape
	@Override
	public double surface_area() {
		return (2 * (Math.PI) * radius * height) + (2 * (Math.PI) * (Math.pow(radius, 2)));
	}
	
	@Override
	public double volume() {
		return (Math.PI) * (Math.pow(radius, 2)) * height;
	}
	
	// Implement toString method printing surface area and volume
	public String toString() {
		return "Cylinder Surface Area: " + String.format("%.2f", surface_area()) + "units^2\n" +
	           "Cylinder Volume: " + String.format("%.2f", volume()) + "units^3\n";
	}
}
