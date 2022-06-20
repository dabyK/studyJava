package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;

public class ShapeMaker {
	
	public static void main(String[] args) {
		
		Circle[] circle=new Circle[3];
		circle[0]=new Circle(20);
		circle[1]=new Circle(40);
		circle[2]=new Circle(50);
		
		for(int i=0;i<circle.length;i++) {
			circle[i].draw();
		}
		
		System.out.println();
		RectAngle[] rec=new RectAngle[2];
		rec[0]=new RectAngle(20,20);
		rec[1]=new RectAngle(50,60);
		
		
		for(int i=0;i<rec.length;i++) {
			rec[i].draw();
		}
		
		
		
	}

}
