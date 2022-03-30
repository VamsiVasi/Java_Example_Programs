package mypack;

interface Square {
	void size(String i);

	static void draw() {
		System.out.println("We draw a square");
	}
}

interface Circle {
	void size(String i);

	default void draw() {
		System.out.println("We draw a Circle");
	}
}

class Shape implements Square, Circle {
	public void draw() {
		System.out.println("We draw a Shape");
	}

	public void size(String i) {
		System.out.println("The Size of the shape is : " + i);
	}
}

public class Java8_Interfaces {
	public static void main(String args[]) {
		Circle c = new Shape();
		c.draw();
		Square.draw();
		c.size("Large");
	}
}
