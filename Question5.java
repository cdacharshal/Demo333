package assignment;

import java.util.Scanner;

//Q5 Wap to check from three given number  
//   that whether a number is greater than or equal
//   to 20 and less than other numbers .print appropriate message .

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 3 number");
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter 1st number = ");
		int a = s.nextInt();
		
		System.out.print("enter 2nd number = ");
		int b = s.nextInt();
		
		System.out.print("enter 3rd number = ");
		int c = s.nextInt();
		
		System.out.println("a = " +a +",b = " +b + ", c = " +c);
		
		if(a>20 && (a<b && a<c)) {
			System.out.println("Condition is true because a is greater then 20 and less then b and c");
		}
		else
			System.out.print("Condition is false");
		
		
	}

}
