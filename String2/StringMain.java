package String2;

public class StringMain {
	
	static void patternMatching(String s, String p){
		int n = s.length();
		int m = p.length();		   
		for(int i=0;i<=n-m;i++){
			int j = 0;
			for(; j<m;j++) {
				if(s.charAt(i+j) != p.charAt(j)) {
					break;
				}
			}
			if(j==m) {
				System.out.println("pattern found at : "+i);
			}
		}
	    }
	
	static boolean rotationStrings(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		String doubleString = s1+s1;
		return doubleString.contains(s2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "abcabdabbacbdabda";
//		String p = "bda";
//		patternMatching(s,p);
		
		String s1 = "AACD";
        String s2 = "ACDA";
		System.out.println(rotationStrings(s1, s2));
		
	}

}
