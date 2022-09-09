package javaBasics2Practice;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int[] arr = new int[2];
		System.out.println("Enter a element of array");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum of array is: "+sum);
	}

}
