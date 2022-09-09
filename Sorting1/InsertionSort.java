package Sorting1;

public class InsertionSort {
	

	static void insertionSort(int a[]) {
		int n = a.length;
		for(int i = 1; i< n;i++) {
			int temp = a[i];
			int j = i-1;
				while (j >= 0 && a[j] > temp) {
	                a[j + 1] = a[j];
	                j = j - 1;
	            }
	            a[j + 1] = temp;
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
		insertionSort(a);
		System.out.println("Array is Sorted");
		printArray(a);
	}

}