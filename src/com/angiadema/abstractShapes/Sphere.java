package com.angiadema.abstractShapes;

public class Sphere extends Shape {
	
	// Attribute of radius
	private double radius;
	
	// Parameterized constructor
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	// Implement abstract methods
	@Override
	public double surface_area() {
		return 4 * (Math.PI) * (Math.pow(radius, 2));
	}
	
	@Override
	public double volume() {
		return (4.0/3.0) * (Math.PI) * (Math.pow(radius, 3));
	}
	
	//.toString() method printing surface area and volume
	@Override
	public String toString() {
		return "Sphere surface area: " + String.format("%.2f", surface_area()) + "\n" +
			   "Volume: " + String.format("%.2f", volume()) + "\n";
	}

}
