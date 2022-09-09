package Sorting1;

public class MergeSort {
	
	static void conqure(int a[], int l, int mid, int h ) {	
	int b[] = new int[a.length];
		int i = l;
		int j = mid + 1;
		int k = l;
		while( i<= mid && j<=h) {
			if(a[i] <= a[j]) {
				b[k] = a[i];
				i++;
			}
			else {
				b[k] = a[j];
				j++;				
			}
			k++;
		}
			if(i>mid) {
				while(j<=h) {
					b[k] = a[j];
					j++;
					k++;
				}
			}
			else {
				while(i<=mid) {
					b[k] = a[i];
					i++;
					k++;
				}
			}
			for(i = l;i<=h;i++) {
				a[i] = b[i];
			}
		}
	
	static void divide(int a[], int l, int h ) {
		if(l >= h) {
			return;
		}
		int mid = (l+h)/2;
		divide(a, l, mid);
		divide(a, mid+1, h);
		conqure(a, l, mid, h);
	}
		
//	static void conqure(int a[], int si, int mid, int ei ) {
//		int merge[] = new int[ei-si + 1];
//		int idx1 = si;
//		int idx2 = mid + 1;
//		int x = 0;
//		while(idx1 <=mid && idx2 <=ei) {
//			if(a[idx1] <= a[idx2]) {
//				merge[x++] = a[idx1++];
//			}
//			else {
//				merge[x++] = a[idx2++];
//			}
//		}
//			while(idx1 <=mid) {
//				merge[x++] = a[idx1++];
//			}
//			while(idx2 <= ei) {
//				merge[x++] = a[idx2++];
//			}
//			for(int i = 0, j = si; i<merge.length;i++,j++) {
//				a[j] = merge[i];
//			}
//		  }
//	static void divide(int a[], int si, int ei ) {
//		if(si >= ei) {
//			return;
//		}
//		int mid = si + (ei - si)/2;
//		divide(a, si, mid);
//		divide(a, mid+1, ei);
//		conqure(a, si, mid, ei);
//	}
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4, 2, 8, 3, 1, 5, 7,11,6,1};
		 int n = a.length;
		    divide(a, 0, n-1);
		    for(int i = 0; i< n;i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
	}
}
