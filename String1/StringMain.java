package String1;

public class StringMain {
	static boolean anagrams(String s1, String s2) {
		int a[] = new int[256];
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int  i = 0; i<s1.length(); i++) {
			a[s1.charAt(i)]++;
			a[s2.charAt(i)]--;
		}
		for(int e: a) {
			if(e!=0) return false;
		}
		return true;
	}
	
	static void reverseCharacters(char[] s, int i, int j) {
		while(i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			
			i++;
			j--;
		}
	}

	static String reverseWords(String s) {
		char[] c = s.toCharArray();
		int start = 0;
		int end = 0;
		for(; end<s.length(); end++) {
			if(c[end] == ' ') {
				reverseCharacters(c, start,end-1);
				start = end + 1;
			}
		}
		reverseCharacters(c, start, end-1);
		reverseCharacters(c, 0, s.length()-1);
		return new String(c);
	}
	
	
	  static boolean isSubSequence(String str1, String str2){
		    int i = 0;
		    int m = str1.length();
		    int n = str2.length();
		    for (int j = 0; i < m && j < n; j++)
		      if (str1.charAt(i) == str2.charAt(j))
		        i++;
		    return (i == m);
	  }
	  
	  static int lastIndex(String str){
		    str = str.trim();
	        int n = str.length();
	        int lastIndex = str.lastIndexOf(' ') + 1;
	        return n - lastIndex;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Hello";
//		String s2 = "Hello";
//		String s3 = new String("Hello");
//		System.out.println(s1 == s2);
//		System.out.println(s2 == s3);
		
//		System.out.println(s1.equals(s3));
//		s1.concat(" String");
//		System.out.println(s1);
		
//		String s1 = "abcda";
//		String s2 = "bdaac";
//		System.out.println(anagrams(s1, s2));
		
//		String s = "I am the boss";
//		String ans = reverseWords(s);
//		System.out.println(ans);
		
        
//        String str1 = "gksrek";
//	    String str2 = "geeksforgeeks";
//		boolean res = isSubSequence(str1, str2);
//		 
//        if (res)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
		
		String str = "geeks for geeks";
		System.out.println(lastIndex(str));
	}

}
