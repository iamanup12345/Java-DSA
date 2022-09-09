package Sorting1;

public class HeapSort {

	// Build heap (rearrange array)
	static void buildHeap(int a[], int n) {
		for(int i = n/2 ; i> 0; i--) 
			heapify(a, n, i);
			
			for (int i = n - 1; i > 0; i--) {
	            // Move current root to end
	            int temp = a[0];
	            a[0] = a[i];
	            a[i] = temp;
	  
	            // call max heapify on the reduced heap
	            heapify(a, i, 0);
			}
	}
	
	static void heapify(int a[], int n, int i) {
		int largest = i;
		int l = 2 * i;
		int r = 2 * i + 1;
		if(l < n && a[l] > a[largest]) {
			largest = l;
		}
		if(r < n && a[r] > a[largest]) {
			largest = r;
		}
		if(largest != i) {
			int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;
			heapify(a, n, largest);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 12, 11, 13, 5, 6, 7 };
	        int n = a.length;
	  
	        buildHeap(a, n);
	  
	        System.out.println("Sorted array is");
	        for (int i = 0; i < n; ++i)
	            System.out.print(a[i] + " ");
	        System.out.println();
	}

}
