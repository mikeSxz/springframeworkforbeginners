package com.example.pkg;

public class Point {
	private int x;
	private int y;
	
	public Point(double myDouble, float myFloat){
		System.out.println(myDouble);
		System.out.println(myFloat);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
