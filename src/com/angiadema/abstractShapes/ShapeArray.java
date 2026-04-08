package com.angiadema.abstractShapes;

public class ShapeArray {

	public static void main(String[] args) {
		
		// Instantiate one sphere
		Sphere sphere1 = new Sphere(6.0);
		
		// Instantiate one cylinder
		Cylinder cylinder1 = new Cylinder(2.0, 8.0);
		
		// Instantiate one cone
		Cone cone1 = new Cone(8.0, 10.0);
		
		// Store class instances in an array shapeArray
		Shape[] shapeArray = new Shape[3];
		
		shapeArray[0] = sphere1;
		shapeArray[1] = cylinder1;
		shapeArray[2] = cone1;
		
		// Print instance data of each object using each toString method
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
		}
		

	}

}
