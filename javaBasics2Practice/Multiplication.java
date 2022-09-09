package javaBasics2Practice;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a multiplication tabel of: ");
		int n = sc.nextInt();
		for(int i = 0;i<=10;i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}

	}
}
