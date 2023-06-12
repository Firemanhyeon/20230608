package com.yedam.shape;

public class MainApp {

	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.setColor("White");
		System.out.println(shape.getColor());
		if(shape instanceof Triangle) {
			((Triangle)shape).draw();//트라이앵글의 메소드를 쓰기위해서 
		}
		
		shape = new Circle();
		if(shape instanceof Circle) {
			((Circle)shape).draw();
			((Circle)shape).move();
		}
		
	}

}
