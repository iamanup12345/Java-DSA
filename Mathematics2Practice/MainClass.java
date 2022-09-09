package Mathematics2Practice;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21;
		long M = 47;
		long fact = 1;
		for(int i = 2; i<= n ; i++) {
			fact = (fact * i) % M;
		}
		System.out.println(fact);
	}

}
