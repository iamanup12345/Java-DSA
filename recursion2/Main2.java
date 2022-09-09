package recursion2;

public class Main2 {
	static void generatAllSubsets(String s) {
		untilGenerateAllSubsets(s,0,"");
	}
	
	static void untilGenerateAllSubsets(String s, int i, String cur) {
		if(i == s.length()) {
			System.out.println(cur);
			return;
		}
		untilGenerateAllSubsets(s, i+1 , cur + s.charAt(i));
		untilGenerateAllSubsets(s, i+1 , cur);
	}
	
//	static int sumOfDigits(int n) {
//		if(n == 0) return 0;
//		
//		int lastDigit = n%10;
//		return lastDigit + sumOfDigits(n/10);
//	}
	
//	static void towerOfHanoi(int n, char from, char to, char aux) {
//		if(n == 0) return;
//		towerOfHanoi(n-1, from, aux, to);
//		System.out.println("Move" +n+"from" +from + "to"+to);	
//		towerOfHanoi(n-1,aux,to,from);
//	}
	
	public static void main(String[] args) {
//		int n=2314;
//		System.out.println(sumOfDigits(n));
		
		generatAllSubsets("abc");
		
//		towerOfHanoi(3, 'A', 'C', 'B');
	}

}
