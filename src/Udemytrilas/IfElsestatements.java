package Udemytrilas;

public class IfElsestatements {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 20);
		System.out.println(num);

		if (num > 5) {
			System.out.println(num + " greater than 5");}
		else if (num <5  && num < 10) {
			System.out.println("between 5 and 10");
		}else {
			System.out.println(num + " less than 10");
	}}
}
