package javaBasics1Practice;

import java.util.Scanner;

public class Inches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of a in inches: ");
		int a = sc.nextInt();
		double c=a*0.0254;
		System.out.print(c);
	}

}
