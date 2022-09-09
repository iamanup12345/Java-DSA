package Searching1Practice;

public class SearchingMain {
	static int firstPositionArray(int a[], int key) {
		int l = 0;
		int r = a.length - 1;
		int ans = -1;
		while(l <= r) {
			int mid = l + ( r - l) /2;
			if( a[mid] == key) {
				ans = mid;
				r = mid - 1;
			}
			else if(key > a[mid]) {
				l = mid +1;
			}
			else {
				r = mid - 1;
			}
		}
		return ans;
	}

	    public static void main(String[] args) {
		int a [] = {0,0 ,0, 0, 1, 1, 1, 1};
		int key = 1;
		System.out.print(firstPositionArray(a, key));
	}

}
