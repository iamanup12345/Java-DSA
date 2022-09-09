package Mathematics1;

import java.util.Arrays;

public class MainClass {
	
	static int trailingZeroes(int n) {
		int res = 0;
		for(int i = 5; i <= n; i = i*5) {
			res += n/i;
		}
		return res;
	}
	
	public static boolean palindromeNumber(int n) {
		int rev = 0;
		int temp = n;
		while(temp > 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp /= 10;
		}
	return n == rev;
	}
	
//	public static int gcd(int a, int b) {
//				if(a==b) return a;
//				if(a<b) return gcd(b,a);
//				return gcd(a-b,b);
//	}
	
//	public static int gcdEucliModified(int a, int b) {
//		if(a<b) return gcdEucliModified(b,a);
//		if(b==0) return a;
//		return gcdEucliModified(a%b,b);
//}
	
	static int gcd(int a , int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
	
	static int lcm (int a, int b) {
		return a * b / gcd(a, b);
	}
	
	static long fastPowerModule( int a, int b, int n) {
		long res = 1;
		while(b > 0) {
			if((b&1) !=0) {
				res = (res * a % n) % n;
			}
			a = (a % n * a % n) % n;
			b = b >> 1;
		}
		return res;
	}
	
	static int gridUniquePath(int n, int m) {
		int res = 1;
		int N = n + m - 2;
		int r = m - 1;
		for(int i=1; i<=r; i++) {
			res = (res * (N - r + i))/i;
		}
		return res;
	}
	
	static boolean[] seiveOfErateSthenes(int n) {
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i*i <=n; i++) {
			for(int j = i*i; j <= n; j+=i) {
				isPrime[j] = false;
			}
		}		
		return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean isPrime[]= seiveOfErateSthenes(20);
//		for(int i =0; i<=20;i++) {
//			System.out.println(i + " "+isPrime[i]);
		
//		System.out.println(fastPowerModule(3978432, 5, 100000007));
		
//		int n = 11211;
//		System.out.println(palindromeNumber(n));
				
//		int a=40;
//		int b = 24;
//		System.out.println(gcd(a,b));
		
//		int a=40;
//		int b = 24;
//		System.out.println(gcdEucliModified(a,b));
		
//		int a=40;
//		int b = 24;
//		System.out.println(gcd(a,b));
		
//		System.out.println(lcm(20,10));
		
//		System.out.println(trailingZeroes(20));
		
		System.out.println(gridUniquePath(2,2));
		
		}
	}
