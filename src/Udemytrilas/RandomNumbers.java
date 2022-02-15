package Udemytrilas;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		int num = (int) (Math.random() * 5);
		System.out.println(num);
//this step will help if we have like no of check boxes
		// to choose any one random
		int num1 = (int) (Math.random() * 10);
		System.out.println(num1);
		int num2 = num + num1;
		System.out.println(num2);

	}

}
