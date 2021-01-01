package com.arabcoders.main;

public interface Shape {
	void move(Point point);

	void move(int x, int y);

	String getLocation();
}
