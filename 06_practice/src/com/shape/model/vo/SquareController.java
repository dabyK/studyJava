package com.shape.model.vo;

public class SquareController {
	
	private Shape s=new Shape();
	
	

	public double calcPerimeter(double height, double width) {
		
		return (height*2)+(width*2);
	}
	
	public double calcArea(double height, double width) {
	
		return height*width;
	}
	
	public void paintColor(String color) {
		
		
	}
	
	public String print() {
		return " ";
	}
	
	

}
