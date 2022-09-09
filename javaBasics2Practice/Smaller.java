package javaBasics2Practice;

import java.util.Scanner;

public class Smaller {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
			int[] arr = new int[5];
			for(int i = 0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
				int smallestNum = arr[0];
				for(int i = 0;i<arr.length;i++) {
				if(arr[i]<smallestNum) {
					 smallestNum = arr[i];					
				       }
				}
				System.out.println(smallestNum);
	}
}
