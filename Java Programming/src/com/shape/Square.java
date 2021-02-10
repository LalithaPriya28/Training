package com.shape;

 	public class Square implements Polygon {
	float side;
	public void calcArea(float side) {
		// TODO Auto-generated method stub
		float area=side*side;
		System.out.println("The Area of the Square is "+area);

	}

	public void calcPeri(float side) {
		// TODO Auto-generated method stub
		float perimeter=4*side;
		System.out.println("The Perimeter of the Square is "+perimeter);

	}

	@Override
	public void calcArea(float length, float breadth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcPeri(float length, float breadth) {
		// TODO Auto-generated method stub
		
	}

	
	

}
