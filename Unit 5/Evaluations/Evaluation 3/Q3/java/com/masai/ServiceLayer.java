package com.masai;

public class ServiceLayer {
	
	Circle circle;
	Square square;
	Rectangle rectangle;
	Triangle triangle;
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public void setSquare(Square square) {
		this.square = square;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public void areaCircle() {
		circle.areaOfCircle();
	}
	
	public void areaSquare() {
		square.areaOfSquare();
	}
	
	public void areaTriangle() {
		triangle.areaOfTriangle();
	}
	
	public void areaRectangle() {
		rectangle.areaOfRectangle();
	}
}
