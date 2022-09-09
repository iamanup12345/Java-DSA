package Sorting1;

public class ShellSort {
	static void shellSort(int a[]) {
		int n = a.length;
		for(int gap = (n/2); gap >= 1; gap = (gap/2)) {
			for(int j = gap; j < n; j++) {
				for(int i = j-gap; i >= 0; i= i- gap) {
					if(a[i+gap] > a[i]) {
						break;
					}
					else {
						int temp = a[i+gap];
						a[i+gap] = a[i];
						a[i] = temp;						
					}
				}
			}
		}
	}

	
	 static void print(int a[])
	    {
	        for (int i = 0; i < a.length; i++)
	            System.out.print(a[i] + " ");
	        System.out.println();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 17, 45, 75, 90, 12, 24, 2, 66 };
	 
	        // Function Call
	        shellSort(a);
	        print(a);

	}

}
