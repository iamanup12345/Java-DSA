package javaBasics1Practice;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 12;
		int c = 3;
		if(a>b) {
			if(a>c) {
				System.out.println("a");
			}
			else {
				System.out.println("c");
			}
		}
		else {
			if(b>c) {
				System.out.println("b");
			}
			else {
				System.out.println("c");
			}
		}
	}

}
