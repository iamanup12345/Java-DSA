package arrays4;

import java.util.Arrays;

public class MainClass4 {

		// TODO Auto-generated method stub
		static int trappingRainWater(int a[]) {
			int ans = 0;
			int leftMax = 0, rightMax =0;
			int l=0,r=a.length-1;
			while(l<r) {
				if(a[l]<=a[r]) {
					if(a[l] > leftMax) leftMax = a[l];
					else ans += (leftMax - a[l]);
					l++;
				}
				else {
					if(a[r] > rightMax) rightMax = a[r];
					else ans += (rightMax-a[r]);
					r--;
				}
			}
			return ans;
		}
		
		static int maxValueOfJMinusI(int a[]) {
			int n = a.length;
			int[] rightMax = new int [n];
			int[] leftMin = new int [n];
			rightMax[n-1] = a [n-1];
			for(int i = n-2; i>=0;i--) 
				rightMax[i] = Math.max(rightMax[i+1], a[i]);
				
				leftMin[0] = a [0];
				for(int i =1 ; i<n;i++) 
					leftMin[i] = Math.min(leftMin[i-1], a[i]);
					
					int i = 0, j = 0;
					int ans = 0;
					while(i<n && j<n) {
						if(leftMin[i] < rightMax[j]) {
							ans = Math.max(ans, j-1);
							j++;
						}else {
							i++;
						}
					}
				return ans;
		}
		
		static boolean twoSum(int a[], int sum) {
//			int n = a.length;
//			int l = 0;
//			int r = a.length-1;
//			while(l < r) {
//				int curSum = a[l] + a[r];
//				if(curSum > sum){
//					r--;
//				}
//				else if(curSum < sum) {
//					l++;
//				}
//				else {
//				return true;	
//				}
//		}
//			return false;
			
			int n = a.length;
			 int i = 0;
		        int j = n - 1;
		        while (i < j) {
		            if (a[i] + a[j] == sum)
		                return true;
		            else if (a[i] + a[j] < sum)
		                i++;
		            else
		                j--;
		        }
		        return false;
			
		}
		
		static boolean threeSum(int a[], int sum) {
			int n = a.length;
			if(n < 3) return false;			 
			       //Sort the array
			       Arrays.sort(a);
			       for(int i = 0; i < n; i++) {
			 
			           int start = i+1;
			           int end = n-1;
			 
			           while(start < end) {
			 
			             if(a[i] + a[start] + a[end] == sum) {
			                return true;
			 
			              } else if (a[i] + a[start] + a[end] < sum) {
			                start++;
			           
			              } else {
			                 end--;
			 
			               }
			             }
			          }
			 
			        return false;
			   }
			 
			 
			 
			 
			public static void main(String[] args) {
//			int a[] = {4,3,5,1,4,2,1};
				
//			int ans = trappingRainWater(a);
//			System.out.println(ans);
			
//			System.out.println(maxValueOfJMinusI(a));
			
			int a[] = {1,3,5,7,8,9,12};
			int sum = 4;
			System.out.println(twoSum(a,sum));
			
//			 int[] a = { 1, 4, 45, 6, 8, 11}; 
//		      int k = 13;
//		    boolean result =threeSum(a, k);
//		    System.out.println(result);
		 }

	}
