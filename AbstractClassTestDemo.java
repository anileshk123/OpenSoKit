package com.cts.test;

import com.cts.model.Circle;
import com.cts.model.Shape;
import com.cts.model.Square;

public class AbstractClassTestDemo {

	public static void main(String[] args) {
		Shape shape;
		//shape = new Shape(); Compilation error
		shape = new Circle();
		shape.setX(12);
		shape.area();
		
		shape = new Square();
		shape.setX(10);
		shape.area();
	}

}
