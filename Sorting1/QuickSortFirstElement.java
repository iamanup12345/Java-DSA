package Sorting1;

public class QuickSortFirstElement {
	
	static void swap(int[] a, int i, int j)
	{
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	
	static void random(int a[], int l, int h) {
		int randomIndex = l + (int)Math.random() * (h-l+1);
		swap(a,l,randomIndex);
	}
	
//	From First Element
	static int partition(int a[], int l , int h) {
		int i = l;
		int j = h;
		random(a,l,h);
		int pivot = a[l];
		while(i<j) {
			while(i<j &&a[i] <= pivot)
				i++;
			while(a[j] > pivot)
				j--;
			if(i<j)
				swap(a, i, j);
		}
		swap(a, j, l);
		return j;
	}
	
//	From Random Element
//	static int partition(int a[], int l , int h) {
//		int pivot = a[l];
//		int i = l;
//		int j = h;
//		while(i<j) {
//			while(i<j &&a[i] <= pivot)
//				i++;
//			while(a[j] > pivot)
//				j--;
//			if(i<j)
//				swap(a, i, j);
//		}
//		swap(a, j, l);
//		return j;
//	}
	
	static void quickSort(int a[], int l, int h) {
		if(l<h) {
			int pivot = partition(a, l, h);
			quickSort(a, l, pivot-1);
			quickSort(a, pivot+1, h);
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
		 int a[] = {4, 2, 8, 3, 1, 5, 7,11,6};;
		 int n = a.length;
		    System.out.println("Before Sorting");
		    printArray(a);
		    quickSort(a, 0, n-1);
		    System.out.println("After Sorting");
		    printArray(a);

	}

}
