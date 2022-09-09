package recursion1Practice;

public class Recursion1Practice {
	
	static int factorial(int N) {
	if(N == 0 || N == 1) return 1;
    return N * factorial (N - 1);
	}
	
	static int sumOfSquare(int N) {
		if(N == 1 || N == 0) return N;
				return N * N + sumOfSquare(N - 1 );
	}
	
	static void fibonacii(int a, int b, int n ) {
		if(n== 0) return;
		int c = a + b;
		System.out.println(c);
		fibonacii (b,c,n-1);
	}
	
	static int gcd(int a , int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
		
	static int palindrome(int a[], int begin, int end)
	{
	    // base case
	    if (begin >= end) {
	        return 1;
	    }
	    if (a[begin] == a[end]) {
	        return palindrome(a, begin + 1, end - 1);
	    }
	    else {
	        return 0;
	    }
	}
	public static void main(String[] args) {
//		System.out.println(factorial(2));
		
//		System.out.println(sumOfSquare(5));
		
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		int n = 7;
//		fibonacii(a,b,n-2);
		
//		System.out.println(gcd(15,27));
		
//		int a[] = { 3, 6, 0, 6, 3 };
//	    int n = a.length;
//	    if (palindrome(a, 0, n - 1) == 1)
//	        System.out.print( "Palindrome");
//	    else
//	        System.out.println( "Not Palindrome");
	    }
	}

