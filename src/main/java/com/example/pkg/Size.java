package com.example.pkg;

public class Size {
	
	private double weight, height;
	
	

	public Size() {
	}

	public Size(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Size [weight=" + weight + ", height=" + height + "]";
	}
	
	

}
