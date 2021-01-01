package com.arabcoders.main;

public class Circle implements Shape {

	private Point point;

	public void move(Point point) {
		this.point = point;
	}

	public void move(int x, int y) {
		this.point.setX(x);
		this.point.setY(y);
	}

	public String getLocation() {
		return "x : " + this.point.getX() + "\n" + "y : " + this.point.getY() + "\n";
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
