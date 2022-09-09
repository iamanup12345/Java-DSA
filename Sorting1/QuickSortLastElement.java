package Sorting1;

public class QuickSortLastElement {
	
	static int partition(int a[], int l , int h) {
		int pivot = a[h];
		int i = l-1;
		for(int j=l; j<h; j++) {
			if(a[j] < pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}	
		}
		i++;
		int temp = a[i];
		a[i] = pivot;
		a[h] = temp;
		return i;
	}
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
		 int a[] = {4, 2, 8, 3, 1, 5, 7,11,6};
		 int n = a.length;
		    System.out.println("Before Sorting");
		    printArray(a);
		    quickSort(a, 0, n-1);
		    System.out.println("After Sorting");
		    printArray(a);

        }
	}
