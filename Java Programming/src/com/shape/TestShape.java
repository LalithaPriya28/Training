package com.shape;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon p=new Square();
		p.calcArea(10);
		p.calcPeri(12);
		Polygon p1=new Rectangle();
		p1.calcArea(20, 30);
		p1.calcPeri(20, 30);
		
	}

}
