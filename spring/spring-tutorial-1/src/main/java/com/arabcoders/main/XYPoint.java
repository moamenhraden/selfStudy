package com.arabcoders.main;

public class XYPoint implements Point {

	private int x;
	private int y;

	public XYPoint() {
		this(0, 0);
	}

	public XYPoint(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

}
