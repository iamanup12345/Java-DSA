package arrays2Practice;
public class ArrayPractice2 {
	
	public static int minimunSumSubArray(int a[]) {
	 int n = a.length;
	 int minSum = Integer.MAX_VALUE;
	 int curSum = 0;
     for(int i=0;i<n;i++) {
         curSum += a[i];
         if(curSum>a[i])
         curSum = a[i];
         minSum = Math.min(minSum,curSum);
     }
     return minSum;   
 }
	public static void main(String[] args) {
		int a[] = {2,4,-1,3,1,-4};
		int ans = minimunSumSubArray(a);
		System.out.println(ans);
		
	}

}