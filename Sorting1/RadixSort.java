package Sorting1;

import java.util.Arrays;

public class RadixSort {
	static int getMax(int a[], int n) {  
		   int max = a[0];  
		   for(int i = 1; i<n; i++) {  
		      if(a[i] > max)  
		         max = a[i];  
		   }  
		   return max; //maximum element from the array  
		}  
	
	   static void countSort(int a[], int n, int exp) {
	      int result[] = new int[n];
	      int i;
	      int count[] = new int[10];
	      Arrays.fill(count,0);
	      for (i = 0; i < n; i++)
	         count[ (a[i]/exp)%10 ]++;
	      for (i = 1; i < 10; i++)
	         count[i] += count[i - 1];
	      for (i = n - 1; i >= 0; i--) {
	         result[count[ (a[i]/exp)%10 ] - 1] = a[i];
	         count[ (a[i]/exp)%10 ]--;
	      }
	      for (i = 0; i < n; i++)
	         a[i] = result[i];
	   }
	   
	   static void radixSort(int a[], int n) {
	      int m = getMax(a, n);
	      for (int exp = 1; m/exp > 0; exp *= 10)
	      countSort(a, n, exp);
	   }
	   public static void main (String[] args) {
	      int a[] = {56, 78, 102, 345, 67, 90, 102, 45, 78};
	      int n = a.length;
	      System.out.println("The array after performing radix sort is ");
	      radixSort(a, n);
	      for (int i=0; i<n; i++)
	      System.out.print(a[i]+" ");
	   }
}
