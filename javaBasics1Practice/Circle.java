package javaBasics1Practice;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 double pi = 3.142;
		System.out.println("Enter a value of r: ");
		float r = sc.nextFloat();
		double area = pi * r * r;
		double perimeter = 2 * pi * r;
		System.out.println("The area of circle is: "+area);
		System.out.println("The perimetere of circle is: "+perimeter);
	}

}
