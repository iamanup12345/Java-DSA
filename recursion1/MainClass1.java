package recursion1;

public class MainClass1 {
	
	static void printNaturalNumbers(int N) {
		if(N == 0) return;
		printNaturalNumbers(N-1);
		System.out.println(N);
	}
	
	static int sumofNaturalNumbers(int N) {
		if(N == 0) return 0;
		return sumofNaturalNumbers(N-1) + N;
		
	}
	
	static int powerOfNumber(int a, int b) {
		if(b == 0) return 1;
		return powerOfNumber(a, b-1) * a;
		
	}

	static int coutPathsInAMatrix(int N, int M) {
		if(N == 1 || M == 1) return 1;
			int rightSideAns = coutPathsInAMatrix(N, M-1);
			int downSideAns = coutPathsInAMatrix(N-1, M);
			return rightSideAns + downSideAns;
		}
	public static void main(String[] args) {
//		printNaturalNumbers(5);
		
//		System.out.println(sumofNaturalNumbers(3));
		
//		System.out.println(powerOfNumber(3,2));
		
//		System.out.println(coutPathsInAMatrix(3,4));
	}

}
