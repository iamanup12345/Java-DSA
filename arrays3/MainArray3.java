package arrays3;

import java.util.HashSet;
import java.util.Set;

public class MainArray3 {
	
	static boolean subArrayWithZeroSum(int a[]) {
		int n = a.length;
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i = 1; i < n ; i++) {
			sum += a[i];
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}
	static void transposeOfMatrix(int a[][]) {
		int n = a.length;
		for(int i = 0;i<n;i++) {
			for(int j = i;j<n;j++) {
				int swap = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = swap;
			}
		}
	}
	
	static void  printMatrix(int a[][]) {
		int n = a.length;
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n ; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	static void rotateMatrix(int a[][]) {
		int n = a.length;
		transposeOfMatrix(a);
		for(int i = 0; i<n;i++) {
			for (int j =0;j<n/2;j++) {
				int swap = a[i][j];
				a[i][j] = a[i][n-j-1];
				a[i][n-j-1] = swap;
			}
		}
	}
	
	static boolean searchInMatrix(int a[][], int key) {
		int row = 0;
		int col = a.length-1;
		while(row<a.length && col >=0) {
			if(a[row][col]== key) {
				return true;
			}
			else if (key > a[row][col]) {
				row++;
			}
			else {
				col--;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
//		int a[] = {2,3,5,4,-6,5,1,-1};
//		System.out.println(subArrayWithZeroSum(a));
		
		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		printMatrix(a);
		transposeOfMatrix(a);
		printMatrix(a);
		
//		int a[][] = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		printMatrix(a);
//		rotateMatrix(a);
//		printMatrix(a);
		
//		int a[][] = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		int key = 4;
//		boolean index = searchInMatrix(a, key);
//		System.out.println(index);
		
}
}