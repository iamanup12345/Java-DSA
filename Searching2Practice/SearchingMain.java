package Searching2Practice;

public class SearchingMain {
	
	static int upperBound(int a[], int key) {
		int low = 0, high = a.length -1, ans = -1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(a[mid] <= key) {
				low = mid + 1;
			}
			else {
				ans = mid;
				high = mid - 1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int a[] = {1, 3, 5, 6, 6, 7, 8};
		int key = 6;
		System.out.println(upperBound(a, key));
	}

}
