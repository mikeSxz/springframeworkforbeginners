package com.example.pkg;

public class Calculator {

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	private int num1, num2;

	public double divide() {
		return (double) num1 / (double) num2;
	}

	public int multiply() {
		return num1 * num2;
	}

	public int add() {
		return num1 + num2;
	}

	public int substract() {
		return num1 - num2;
	}

}
