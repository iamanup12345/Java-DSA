package javaBasics1Practice;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("The output is: "+c);
	}

}
