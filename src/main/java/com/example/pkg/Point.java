package com.example.pkg;

public class Point {
	private int x;
	private int y;
	
	public Point(String message, int number){
		System.out.println(message);
		System.out.println(number);
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
