package Searching1;

public class BinarySearch {
	
//	static int binarySearch(int a[],int key) {
//		int low = 0, high = a.length -1;
//		while(low <= high) {
//			int mid = (low + high)/2;
//			if(a[mid] == key) {
//				return mid;
//			}
//			else if(key > a[mid]) {
//				low = mid + 1;
//			}
//			else {
//				high = mid - 1;
//			}
//		}
//		return -1;
//	}
//
//	public static int binarySearchRecursive(int a[],int key, int low, int high) {
//		if(low > high) {
//			return -1;
//		}
//			int mid = (low + high)/2;
//			if(a[mid] == key) {
//				return mid;
//			}
//			if(key > a[mid]) {				
//				return binarySearchRecursive(a, key, mid + 1, high);
//			}
//			else {
//				return binarySearchRecursive(a, key, low, mid - 1);
//			}
//	}
	
	static int leftOccurene(int a[], int key) {
		int low = 0, high = a.length -1, ans = -1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(a[mid] == key) {
				ans = mid;
				high = mid -1;
			}
			else if(key > a[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return ans;
	}
	
	static int searchRotatedSorted(int a[], int key) {
		int low = 0, high = a.length -1;
		while(low <= high) {
			int mid = low + (high - low)/2;
	   if(a[mid] == key) return  mid;
			if(a[low] <= a[mid]) { //left part sorted
				if(key >= a[low] && key < a[mid]) {  //left side present
					high = mid - 1;
			     }
			     else {  //right side present
				 low = mid + 1;
			    }
		}
		else {  // right part sorted
			  if(key > a[mid] && key <= a[high]) { // right side present
				low = mid + 1;
			  }
				else { // left side present
					high = mid -1;
				}
			  }
	}
			  return -1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {3, 4, 5, 6, 7, 8, 9};
//		int key = 4;
//		int result = binarySearch(a, key);
//		 if (result == -1)
//		      System.out.println("Not found");
//		    else
//		      System.out.println("Element found at index " + result);	
		
//		int a[] = {3, 4, 5, 6, 7, 8, 9};
//		int n = a.length;
//		int key = 9;
//		int result = binarySearchRecursive(a, key,0 , n-1);
//		 if (result == -1) 
//		      System.out.println("Not found");
//		    else
//		      System.out.println("Element found at index " + result);

//		int a[] = { 1, 2, 4, 4, 4, 4, 4, 5, 7, 6};
//		int key = 4;
//		System.out.println(leftOccurene(a, key));
		
		int a[] = {4, 5, 6, 7, 9, 1, 2, 3, 4};
		int key = 1;
		System.out.println(searchRotatedSorted(a, key));
		}
	}
