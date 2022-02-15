package Udemytrilas;

/**
 * @author suren
 *
 */
public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodCalling c = new MethodCalling();
		c.ro();
		System.out.println("after ro5 method");
		// this for refernce iam calling method from previous class
		System.out.println("adding method");
		Calculator c2 = new Calculator();
		c2.adding(20, 30);

	}

	public void ro() {
		System.out.println("ro method");
		System.out.println("after ro method");

		ro1();
	}

	public void ro1() {
		System.out.println("ro1 method");
		System.out.println("after ro1 method");

		ro2();
	}

	public void ro2() {
		System.out.println("ro2 method");
		System.out.println("after ro2 method");

		ro3();
	}

	public void ro3() {

		System.out.println("ro3 method");
		System.out.println("after ro3 method");
		ro4();
	}

	public void ro4() {

		System.out.println("ro4 method");
		System.out.println("after ro4 method");
		ro5();
	}

	public void ro5() {
		System.out.println("ro5 method");

	}
}
