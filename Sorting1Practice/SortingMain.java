package Sorting1Practice;

public class SortingMain {
	static void unionTwoSortArray(int a[], int b[]) {
		int i = 0, j = 0;
		int n = a.length;
		int m = b.length;
		while(i<m && i<n) {
			if(a[i] < b[j]) {
				System.out.println(a[i++]);
			}
			else if(a[i] > b[j]) {
				System.out.println(b[j++]);
			}
			else {
				System.out.println(b[j++]);
				i++;
			}
		}
		while(i<n) {
			System.out.println(a[i++]);
		}
		while(j<m) {
			System.out.println(b[j++]);
		}
	}
	    
		static void sortThreeTypeArray(int a[]) {	    {
	    	int n = a.length;
	        int l = 0, h = n-1, m = 0;
	        while (m <= h){
	            if(a[m] == 0){
	            	int temp = a[l];
	    	        a[l] = a[m];
	    	        a[m] = temp;
	                l++;
	                m++;  
	            }
	            else if(a[m] == 1){
	                m++;
	            }
	            else{
	            	int temp = a[m];
	    	        a[m] = a[h];
	    	        a[h] = temp;
	                h--;
	            }
	        }
		}
	}
	
//	public static void printArray(int a[]) {
//		for(int i = 0; i< a.length;i++) 
//			System.out.print(a[i] + " ");
//		System.out.println();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {1, 2, 3, 4, 9};
//		int b[] = {2, 3, 4, 7, 9, 11,13};
//		unionTwoSortArray(a,b);
		
		int a[] = { 0, 1, 0, 1, 2, 2, 0};
		sortThreeTypeArray(a);
		for(int i = 0; i< a.length;i++) 
			System.out.print(a[i] + " ");
		System.out.println();
		
	}

}
