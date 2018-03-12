package com.example.pkg;

public class Animal {

	private double weight;
	private float height;
	private String specieName;
	private Color color;
	private Size size;
	private String validator;

	public Animal() {

	}
	


	public Animal(double weight, float height, String specieName, Color color, Size size, String validator) {
		this.weight = weight;
		this.height = height;
		this.specieName = specieName;
		this.color = color;
		this.size = size;
		this.validator = validator;
	}



	public String getValidator() {
		return validator;
	}


	public void setValidator(String validator) {
		this.validator = validator;
	}


	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}





	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
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





	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", height=" + height + ", specieName=" + specieName + ", color=" + color
				+ ", size=" + size + "]";
	}

	

	

}
