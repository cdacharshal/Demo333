package assignment;

import java.util.Scanner;

//Q 7  wap to check if sales of a person is greater than 10000 then eligible for bonus 
//    else not eligible calculate bonus as 20% of sales .


public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Enter your Sales Amount = ");
		int sales = s.nextInt();
		
		if(sales>10000) {
			System.out.print("Eligible for bonus ,");
		    
			Float bonus = (sales*20)/100f ;
			System.out.println("Your bonus amount is " +bonus);
			
			
		}
		else
			System.out.println("Not Eligible for bonus ");
	}

}
