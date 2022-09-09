package Searching2;

public class SearchingMain {
	
	static int binarySearch(int a[], int key, int l, int r) {
		while(l <= r) {
			int mid = l + ( r - l) /2;
			if( a[mid] == key) {
				return mid;
			}
			else if(key > a[mid]) {
				l = mid +1;
			}
			else {
				r = mid - 1;
			}
		}
		return -1;
	}
	
	static int searchInInfiniteSortedArray(int a[], int key) {
		if(a.length == 0) return -1;
		if(a[0] == key) return 0;
		int index = 1;
		while(a[index] <= key) {
			index *= 2;
		}
		return binarySearch(a, key, index/2, index);
	}
	
	static int sqrt(int n) {
		int ans = 1;
		int l = 1, r = n;
		while(l <= r) {
			int mid =  (l + r)/2;
			int midSq = mid * mid;
			if(midSq == n) return mid;
			if(midSq > n) r = mid - 1;
			else {
				ans = mid;
				l = mid + 1;
			}
		}
		return ans;
	}
	
	public static double findMedianArrays(int a1[], int a2[]) {
		int n1 = a1.length;
		int n2 = a2.length;
		if(n1 > n2) return findMedianArrays(a2, a1);
		int l = 0, r = n1;
		while(l <= r) {
			int m1 = (l+r)/2;
			int m2 = (n1+n2+1)/2 - m1;
			int max1 = m1 == 0 ? Integer.MIN_VALUE : a1[m1-1];
			int max2 = m2 == 0 ? Integer.MIN_VALUE : a2[m2-1];
			
			int min1 = m1 == n1 ? Integer.MAX_VALUE : a1[m1];
			int min2 = m2 == n2 ? Integer.MAX_VALUE : a2[m2];
			
			if(max1 <= min2 && max2 <= min1) {
				if((n1 + n2)%2 == 0) {
					return ((double)Math.max(max1, max2) + (double)Math.min(min1, min2))/2;
				}
					else {
						return (double)Math.max(max1, max2);
					}
			}
					else if(max2 > min1) {
						l = m1 + 1;
					}
					else {
						r = m1 - 1;
					}
				}
				return 0.0;	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = { 1, 2, 3, 4, 5, 6, 7, 17, 17, 31, 32, 34};
//		int key = 7;
//		System.out.println(searchInInfiniteSortedArray(a, key));
//		int n = 49;
//		System.out.println(sqrt(n));
		
		int a1[] = {3, 7, 8, 9};
		int a2[] = { 4, 5, 5, 6, 9, 10};
		System.out.println(findMedianArrays(a1, a2));
	}

}
