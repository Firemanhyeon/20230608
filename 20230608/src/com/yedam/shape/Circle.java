package com.yedam.shape;

public class Circle extends Shape implements Drawable, Movable{

	@Override
	public void move() {
		System.out.println("원을이동"); //moveable인터페이스 메소드
		
	}

	@Override
	public void draw() {
		System.out.println("원을그림");
		
	}
	

}
