package Searching1;

public class LinearSearch {
	  public static int linearSearch(int a[], int number) {
	  int n = a.length;

	  for (int i = 0; i < n; i++) {
	    if (a[i] == number)
	    return i;
	  }
	  return -1;
	  }

	  public static void main(String args[]) {
	  int a[] = { 2, 4, 0, 1, 9 };
	  int number = 1;

	  int result = linearSearch(a, number);

	  if (result == -1)
	    System.out.print("Element not found");
	  else
	    System.out.print("Element found at index: " + result);
	  }
	}