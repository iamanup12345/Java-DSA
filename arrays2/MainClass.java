 package arrays2;

public class MainClass {

	static void leadersinAnArray(int a []) {
		int largest = Integer.MIN_VALUE;
//		int b[] = new int[a.length];
//		int j = 0;
		for(int i = a.length-1;i >= 0;i--) {
			if(a[i]>largest) {
				largest = a[i];
				System.out.println(a[i]+ " ");
//				b[j++] = a[i];
			}
		}
//		for(j = j-1;j>=0;j--) {
//			System.out.println(b[j]+ " ");
//		}
	}
	
	
	
	public static int largestSumSubArray(int a[]) {
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i =0;i<a.length;i++) {
			curSum += a[i];
			if(maxSum < curSum)
				maxSum = curSum;
			if(curSum < 0)
				curSum =0;
		}
		return maxSum;
	}
	
	static int containerWithMostWater(int a[]) {
		int maxArea = 0;
		int l = 0;
		int r = a.length - 1;
		while(l < r) {
			int height = Math.min(a[l], a[r]);
			int distance = r - l;
			
			int area = height * distance;
			maxArea = Math.max(maxArea, area);
			if(a[l] < a[r]) {
				l++;
			}
			else {
				r--;
			}
		}
		return maxArea;
				
	}
	
	static void trappingRainWater(int a []) {
		int n = a.length;
		int l[] = new int [n];
		int r[] = new int [n];
		l[0] = a[0];
		for(int i = 1; i < n; i++) {
			l[i] = Math.max(l[i-1], a[i]);
		}
		r[n-1] = a[n-1];
		for(int i = n-2; i >= 0; i--) {
			r[i] = Math.max(r[i+1], a[i]);
		}
		int ans = 0;
		for(int i = 0; i< n-1; i++) {
			ans += (Math.min(l[i], r[i]) - a[i]);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {-2,7,6,-4,1,-3,8,3};
//		leadersinAnArray(a);
		
//		int ans = (largestSumSubArray(a));
//		System.out.println(ans);
//		
//		int a[] = {1,4,6,2,4,5,8,3,7};
//		int ans = containerWithMostWater(a);
//		System.out.println(ans);
//		
		int a[] = {1,0,2,1,0,1,3,2,1,2,1};
		trappingRainWater(a);
	}

}
