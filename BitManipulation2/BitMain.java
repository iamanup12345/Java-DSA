package BitManipulation2;

public class BitMain {

	static int countSetBitOptimised(int n) {
		int c = 0;
		while(n>0){
			c++;
			n = (n & (n-1));
		}
		return c;
	}
	
	static int swapTwoBits(int n, int i, int j) {
		int ith = (n >> i) & 1;
		int jth = (n >> j) & 1;
		int xor = ith ^ jth;
		if(xor == 0) return n;
		int mask = (1 << i) | (1 << j);
		return n^mask;
	}
	
	static long reverse32BitUInt(long n) {
		long res = 0;
		int i = 0;
		while(i<=31) {
			if((n & (1 << i))!=0)
			res = res + (1L<<(31-i));
			i++;
		}
		return res;
	}
	
	public static int oneNonRepeatingElement(int a[]) {
		int ans = 0;
		for(int e : a) {
			ans = ans ^ e;
		}
		return ans;
	}
	
	public static int[] twoNonRepeatingElement(int a[]) {
		int xor = 0;
		for(int e : a) {
			xor = xor ^ e;
		}
		int temp = xor;
		int mask = xor & (~(xor-1));
		for(int e: a) {
			if((mask & e) == 0) {
				temp = temp ^ e;
			}
		}
		int firstNumber = temp;
		int secondNumber = xor ^ firstNumber;
		
		int res[] = new int[2];
		res[0] = firstNumber;
		res[1] = secondNumber;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(countSetBitOptimised(20));
		
//		int a[] = {2, 1, 4, 1, 2, 3, 4};
//		System.out.println(oneNonRepeatingElement(a));
		
//		int a[] = {2, 1, 4, 1, 2, 3, 4, 7};
//		System.out.println(twoNonRepeatingElement(a));
		
//		System.out.println(swapTwoBits(23, 4, 3));
		
		System.out.println(reverse32BitUInt(3));
	}
	

}
