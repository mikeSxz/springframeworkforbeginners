package com.example.pkg;

public class Animal {
	
	private double weight;
	private float height;
	private String specieName;
	
	
	
	public Animal() {
		
	}

	public Animal(double weight, float height, String specieName) {
		
		this.weight = weight;
		this.height = height;
		this.specieName = specieName;
		
		System.out.println("this animal have "+ weight + " of weight, "+ height+" of height, and it's species name is: "+specieName);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getSpecieName() {
		return specieName;
	}

	public void setSpecieName(String specieName) {
		this.specieName = specieName;
	}
	
	
	
	

}
