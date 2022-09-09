package arrays1;

public class ArraysMain {
	
	public static int secondlargest(int a[]) {
		if(a.length < 2) return -1;
		int largest = 0;
		int secondLargest = -1;
		for(int i = 1;i<a.length;i++) {
			if(a[i] > a[largest]) {
				secondLargest = largest;
				largest = i;
			}
			else if(a[i] < a[largest]){
				if(secondLargest == -1 || a[i] > a[secondLargest]) {
					secondLargest = i;
				}	
			}
		}
		return secondLargest;
	}
	
	
	public static int maxOf(int a[]) {
		if(a.length == 0) return -1;
		int maxIndex = 0;
		for(int i = 1;i<a.length;i++) {
			if(a[i]> a[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	

	
	public static int delete(int a[], int key) {
		int i = 0;
		int n = a.length;
		for(;i<n;i++) {
			if(a[i] == key) {
				break;
			}
		}
		if(i==n) return n;
		for(int j =i; j< n-1;j++) {
			a[j] = a[j+1];
		}
		return n-1;
	}
	
	
	public static int duplicate(int a[]) {
		int n = a.length;
		for(int i =0;i<n-1;i++) {
			for(int j =i;j<n;j++) {
			if(a[i]!=a[j]) {
				a[j+1] = a[i];
		 }
		}
	  }
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 1, 4, 6 ,5};
		int key = 6;
		
		int index = secondlargest(a);
		System.out.println(a[index]);
		
		
//		int index = maxOf(a);
//		System.out.println(index);
//		System.out.println(a[index]);
		
		
//		delete(a, key);
//		for(int e: a) {
//			System.out.println(e+ " ");
//		}
			
		
//		int index = duplicate(a);
//		System.out.println(index);
//		System.out.println(a[index]);
//		
		
//		int res = -1;
////		search for key
//		for(int i = 0; i<a.length; i++) {
//			if(a[i]==key) {
//				res = i;
//				break;
//			}
//		}
//		if(res == -1) {
//			System.out.println("Not found");
//		}
//		else {
//			System.out.println("Key is present at" + res);
//		}

	}

}
