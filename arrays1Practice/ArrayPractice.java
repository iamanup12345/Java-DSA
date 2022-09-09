package arrays1Practice;

import java.util.Arrays;

public class ArrayPractice {
//	private static final int[] a = null;

	public static int smallest(int a []) {
		if(a.length == 0) return -1;
		int minIndex = 0;
		for(int i = 1;i<a.length;i++) {
			if(a[minIndex]>a[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void reverse(int a[]) {
		for(int i = a.length-1;i >= 0; i--) {
		System.out.print(a[i]+" ");
		}
	}
	
	
	public static boolean sorted(int a[]) {
		int n = a.length;
	 for(int i=1;i<n;i++){
         if(a[i]<a[i-1]){
             return false;
         }
	 }
	 return true;
	}
	
	
	public static void duplicate(int a[]) {
	int j=0;
	int n= a.length;
	for(int i = 0 ;i < n - 1 ;i++){
	    if(a[i]!=a[i+1]) {
	    	a[j] = a[i];
	    j++;
	  }
	}
	a[j] = a [n-1];
	j++;
	System.out.println(j);
	}
	
	public static void rightGreat(int a[]) {
		int n = a.length;		
		int gtr = -1;
	      int temp =  0;
	      for(int i = n-1 ; i >= 0; i--){
	          temp = a[i];
	          a[i] = gtr;
	          gtr = Math.max(gtr, temp);
	          System.out.println(a[i]);
	          }
	      
//		int n = a.length;				
//		int max = a[n-1];
//		a[n-1] = -1;
//		for(int i = n-2; i>=0; i--) {
//			int temp = a[i];
//			a[i] = max;
//			if(max < temp) {
//				max = temp;
//			}
//		}
//		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,4,9,67,7,8,10,4,23,43,45,66,9,6,45};
		
		int n = a.length;
		int max = Math.max(a[0],a[1]);
		int secondMax = Math.min(a[0], a[1]);
		int thirdMax = Integer.MIN_VALUE;
		for(int i = 2; i < n; i++) {
		if(a[i] > thirdMax) {
			thirdMax = a[i];
		}
		if(a[i] > secondMax) {
			thirdMax = secondMax;
			secondMax = a[i];
			}
		if(a[i] > max) {
//			thirdMax = secondMax;
			secondMax = max;
			max = a[i];
		}
			}
//		System.out.println("The third max is :" + thirdMax);
		
//		int index = smallest(a);
//		System.out.println(a[index]);
		
//		reverse(a);
		
//		boolean index = sorted(a);
//		System.out.println(index);
		
//		int [] a= {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};		
//		duplicate(a);
//		
		rightGreat(a);
		
//		int result[] = rightGreat(a);
//        System.out.println("The modified array:" + Arrays.toString(a));
	}

}
