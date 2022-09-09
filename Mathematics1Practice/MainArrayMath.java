package Mathematics1Practice;

public class MainArrayMath {
	static int catalan(int n) {
		if(n<=1) {
			return 1;
		}
		int res = 0;
		for(int i=0; i<n; i++) {
			res += catalan(i) * catalan(n-i-1);
		}
		return res;
	}

	static int inclusionExclusion(int n, int a, int b) {
		int c1 = n/a;
		int c2 = n/b;
		int c3 = n/(a*b);
		return c1+c2-c3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0; i<10;i++) {
//		System.out.println(catalan(i));
//	}
		System.out.println(inclusionExclusion(40, 5, 7));
		}
	}

