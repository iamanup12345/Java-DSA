package collectionFramework;

import java.util.Arrays;

public class ArrayAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
//		int[] numbers = {16, 2, 32, 15, 76, 17};
//		int index = Arrays.binarySearch(numbers, 2);
//		System.out.println("The index of element 4 in the array is : " + index);
		
		Integer[] number = {16, 2, 32, 15, 76, 17};
		Arrays.sort(number);
		
        Arrays.parallelSort(number);
//        // 8192
//        
		for(int i: number) {
			System.out.println(i + " ");
		}
//		
		Arrays.fill(number, 12);
		for(int i: number) {
			System.out.println(i + " ");
		}
		
	}

}
