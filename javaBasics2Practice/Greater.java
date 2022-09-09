package javaBasics2Practice;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float sum =0;
		float average = 0;
		int[] arr = new int[10];
		System.out.println("Enter a number of array");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++) {
			sum = sum + arr[i];
			average = sum/10;
		}

        for(int i = 0; i<9; i++){

            if(arr[i]>average){
            	System.out.println("The maximum number is:" + arr[i]);
            }

        }
	}

}
