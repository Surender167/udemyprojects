package Udemytrilas;

public class Calculator {

	public int adding(int x, int y) {

		int z = x + y;
		System.out.println("adding two numbers :" + z);

		return (z);
	}

	public int subtracting(int x, int y) {

		int z = x - y;
//		System.out.println("subtracting two numbers");
//		System.out.println(z);
		return (z);
	}

	public int multiplyig(int x, int y) {

		int z = x * y;
		System.out.println("multiplying two numbers");
		System.out.println(z);
		return (z);
	}

	public int dividing(int x, int y) {

		int z = x % y;
		System.out.println("dividing two numbers");
		System.out.println(z);
		return (z);
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.adding(10, 20);
		System.out.println("subtraction of two numers:" + c.subtracting(20, 30));
		c.multiplyig(3, 5);
		c.dividing(4, 2);

		// TODO Auto-generated method stub

	}

}
