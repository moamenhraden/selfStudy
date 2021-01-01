package com.arabcoders.main;

public class Rectangle implements Shape {

	private Point p;

	public Rectangle(Point p) {
		this.p = p;
	}

	public void init() {
		System.out.println("init method got executed");
	}

	public void destroy() {
		System.out.println("destroy method got executed");
	}

	public void move(Point p) {
		this.p = p;
	}

	public void move(int x, int y) {
		this.p.setX(x);
		this.p.setY(y);
	}

	public String getLocation() {
		return "Loction ==>> \n" + "x : " + this.p.getX() + "\n" + "y : " + this.p.getY() + "\n";
	}

}
