package Sorting1;

public class SelectionSort {
	
	static void selectionSort(int a[]) {
		int n = a.length;
		for(int i = 0; i< n-1;i++) {
			int min = i;
			for(int j = i+1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			if(min!=i) {
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;	
			}
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
		selectionSort(a);
		System.out.println("Array is Sorted");
		printArray(a);
	}

}
