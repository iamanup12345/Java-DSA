package Sorting1;

public class OptimizeBubbleSort {
	
	static void bubbleSort(int a[] ) {
		int n = a.length;
		for(int i = 0; i<n-1; i++) {
			boolean swapped = false;
			for(int j = 0; j<n-i-1; j++) {
				 if (a[j] > a[j + 1]) {
					 swapped = true;
					 int temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
				 }
			}
			if(swapped != true) break;
		}
	}
	
	public static void printArray(int a[]) {
		for(int i = 0; i< a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = { 9,7,8,5,6,4,2,3,1};
		bubbleSort(a);
		System.out.println("Array is Sorted");
		printArray(a);
	}

}
