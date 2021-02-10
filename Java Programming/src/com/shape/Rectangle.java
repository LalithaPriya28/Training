package com.shape;

	public class Rectangle implements Polygon {
	float length;
	float breadth;

	public void calcArea(float length,float breadth) {
		
		float area=length*breadth;
		System.out.println("The Area of the Rectangle is "+area);

	}

	public void calcPeri(float length,float breadth) {
		
		float perimeter=2*(length+breadth);
		System.out.println("The Perimeter of the Rectangle is "+perimeter);
		

	}

	public void setLength(float length) {
		this.length = length;
	}

	@Override
	public void calcArea(float side) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcPeri(float side) {
		// TODO Auto-generated method stub
		
	}



	

}
