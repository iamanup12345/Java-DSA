package javaBasics1Practice;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentage = 62;
		if (90<percentage) {
			System.out.println("A+");
		}
		else if (80<percentage) {
			System.out.println("B");
		}
		else if (70<percentage) {
			System.out.println("B+");
		}
		else if (60<percentage) {
			System.out.println("B");
		}
		else {
			System.out.println("fail");
		}
	}

}
