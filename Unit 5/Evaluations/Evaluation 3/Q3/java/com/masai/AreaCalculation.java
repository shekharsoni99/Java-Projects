package com.masai;

class Circle {
	
	int x;
	
	public double areaOfCircle() {
		return (3.14 * x * x);
	}
}

class Rectangle {
	
	int x, y;
	
	public double areaOfRectangle() {
		return (x * y);
	}
}

class Triangle {
	
	int x, y;
	
	public double areaOfTriangle() {
		return (0.5 * x * y);
	}
}

class Square {
	
	int x;
	
	public double areaOfSquare() {
		return (x * x);
	}
}