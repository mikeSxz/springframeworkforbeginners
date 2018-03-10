package com.example.pkg;

public class Color {
	private String colorName;
	private String colorId;
	
	
	public Color() {
	}
	
	public Color(String colorName, String colorId) {
		this.colorName = colorName;
		this.colorId = colorId;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	public String getColorId() {
		return colorId;
	}
	public void setColorId(String colorId) {
		this.colorId = colorId;
	}

	@Override
	public String toString() {
		return "Color [colorName=" + colorName + ", colorId=" + colorId + "]";
	}
	
	
	
	
}
