package Sorting1;

public class CountSort {
	
	static void countSort(int a[], int n) {		
		int[] output = new int[n + 1];

	    // Find the largest element of the array
	    int max = a[0];
	    for (int i = 1; i < n; i++) {
	      if (a[i] > max)
	        max = a[i];
	    }
	    
	    int[] count = new int[max + 1];

	    // Initialize count array with all zeros.
	    for (int i = 0; i < max; ++i) {
	      count[i] = 0;
	    }

	    // Store the count of each element
	    for (int i = 0; i < n; i++) {
	      count[a[i]]++;
	    }

	    // Store the cummulative count of each array
	    for (int i = 1; i <= max; i++) {
	      count[i] =count[i] + count[i - 1];
	    }

	    // Find the index of each element of the original array in count array, and
	    // place the elements in output array
	    for (int i = n - 1; i >= 0; i--) {
	      output[count[a[i]] - 1] = a[i];
	      count[a[i]]--;
	    }

	    // Copy the sorted elements into original array
	    for (int i = 0; i < n; i++) {
	      a[i] = output[i];
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4, 2, 8, 3, 1, 5, 7,11,6};
		 int n = a.length;
		 countSort(a, n);
		    for(int i = 0; i< n;i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();

	}

}
