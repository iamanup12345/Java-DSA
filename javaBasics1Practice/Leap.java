package javaBasics1Practice;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		if(year%100==0) {
			if(year%400==0){
			  System.out.println("year is leap year");
		         }
		    else {
			  System.out.println("year is not a leap year");
		         }
	                    }
		else {
			if(year%4==0) {
				System.out.println("year is leap year");
			}
			else {
				System.out.println("year is not a leap year");				
			}
		}
		
	}

}
