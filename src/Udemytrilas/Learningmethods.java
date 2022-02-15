package Udemytrilas;

public class Learningmethods {

	public void display() {

		System.out.println("displaying something");
		

	}

	public int addition(int a, int b) {

		int c = a + b;
		System.out.println("The addition method");
		System.out.println(c);
		return c;

	}

	public void subtraction() {

		int d = 10;
		int e = 11;
		int f = d + e;
		System.out.println("subtraction method");
		System.out.println(f);
	}

	public int multiply(int e, int f) {

		int g = e * f;

		System.out.println("The mutliply method");
		System.out.println(g);
		return (g);

	}

	public static void main(String[] args) {

		Learningmethods d = new Learningmethods();
		d.display();
		Learningmethods d1 = new Learningmethods();
		d1.addition(10, 40);
		Learningmethods d2 = new Learningmethods();
		d2.subtraction();
		Learningmethods d3 = new Learningmethods();
		d3.multiply(10, 20);
	}

}
