package assignment;

import java.util.Scanner;

//Q 2 Java program to print sum of  three float numbers

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float a,b,c;
     Scanner s =new Scanner(System.in);
     System.out.println("sum of three float number");
     
     System.out.print("enter ist number = ");
     a = s.nextFloat();
     
     System.out.print("enter 2nd number = ");
     b = s.nextFloat();
     
     System.out.print("enter 3rd number = ");
	 c = s.nextFloat();
	 System.out.println("sum is " +(a+b+c));
		 
	}

}
