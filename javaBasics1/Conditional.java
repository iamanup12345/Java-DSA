package javaBasics1;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Voting started");
//		int age = 2;
//		if(age >= 18) {
//			System.out.println("You can vote");
//			System.out.println("hurray");
//		}
//		else {
//			System.out.println("ride Ferris wheel");
//		}
//		System.out.println("Voting ended");
		
		
//		int marks = 98;
//		if(marks >90) {
//			System.out.println("A+");
//		}
//		else if(marks >80) {
//			System.out.println("A");
//		}
//		else if(marks >70) {
//			System.out.println("B+");
//		}
//		else if(marks >60) {
//			System.out.println("B");
//		}
//		else {
//			System.out.println("D");
//		}
		
		
//		int a = 4;
//		int b = 12;
//		int c = 3;
//		if(a>b) {
//			if(a>c) {
//				System.out.println("a");
//			}
//			else {
//				System.out.println("c");
//			}
//		}
//		else {
//			if(b>c) {
//				System.out.println("b");
//			}
//			else {
//				System.out.println("c");
//			}
//		}
		
		int number = 23;
		switch(number) {
		
		case 12:
			System.out.println("It's small");
			break;
			
		case 16:
			System.out.println("It's medium");
			break;
			
		case 20:
			System.out.println("It's large");
			break;
			
		case 24:
			System.out.println("It's extra large");
			break;
			
			default:
				System.out.println("Invalid");

		}
	}

}
