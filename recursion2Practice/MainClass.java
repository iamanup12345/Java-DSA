package recursion2Practice;

public class MainClass {
	
	static String swap(String str, int i, int j)
	{
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	static void permute(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}
	
		static int maxCuts(int n, int a, int b, int c){
			if(n == 0) return 0;
			if(n < 0)  return -1;
	 
			int res = Math.max(maxCuts(n-a, a, b, c), 
			          Math.max(maxCuts(n-b, a, b, c), 
			          maxCuts(n-c, a, b, c)));
	 
			if(res == -1)
				return -1;
	 
			return res + 1; 
		}
		
		static int josephus(int n, int k) {
			if(n==1) return 0;
			return (josephus(n-1, k) + k)%n;
		}
	    public static void main(String [] args) 
	    {
//	    int n = 23, a = 11, b = 9, c = 12;
//	    System.out.println(maxCuts(n, a, b, c));
	    
	    System.out.println(josephus(5,3));
	    	
//		String str = "ABC";
//		int n = str.length();
//	    permute(str, 0, n-1);
	}
	}
