package Sorting1;

public class IntersectionTwoSortedArray {
	
	static void intersectionOfTwoSortArrays(int a[], int b[]) {
		int i = 0;
		int j = 0;
		while(i<a.length && j<b.length) {
			if(i>0 && a[i] == a[i-1]) {
				i++;
				continue;
			}
			if(a[i] == b[j]) {
				System.out.println(a[i] + " ");
				i++;
				j++;
			}
			else if(a[i] > b[j]) {
				j++;
			}
            else if(a[i] < b[j]) {
				i++;
			}
		}
	}
	
	public static void printArray(int a[]) {
		for(int i = 0; i< a.length;i++) 
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 5, 6, 6, 8, 9};
		int b[] = {2, 3, 5, 6, 6, 7};
		intersectionOfTwoSortArrays(a, b);
	}

}
