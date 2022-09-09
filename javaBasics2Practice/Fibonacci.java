package javaBasics2Practice;

public class Fibonacci {

	public static int fibonacci(int n) {
		int n1=1;
		int n2=1;
		int n3;
		   for(int i=3;i<=n;i++){
		      n3=n2+n1;
		       n1=n2;
		       n2=n3;
		   }
		   return n2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println("Fibonacci of "+ n + " is " + fibonacci(10));
	}

}
