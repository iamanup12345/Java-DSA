package arrays3Practice;

import java.util.HashMap;
import java.util.Map;

public class Array3Practice {
	static int majorityElement(int a[]) {
		int curElement = -1;
		int count = 0;
		for(int i = 0; i<a.length; i++) {
			if(count == 0) {
				curElement = a[i];
				count = 1;
			}
			else {
				if(a[i] == curElement) {
					count ++;
				}
				else {
					count --;
				}
			}
		}
		int finalCount = 0;
		for(int e: a) {
			if(e == curElement) {
				finalCount ++;
			}
		}
		if (finalCount > a.length/2) {
			return curElement;
		}else {
			return -1;
		}
	}
	
	static int longestOnes(int a[]) {
		int curCount = 0;
		int maxCount = 0;
		
		for(int e: a) {
			if(e==0) {
				maxCount = Math.max(maxCount, curCount);
				curCount = 0;
			}else {
				curCount++;
			}
		}
		maxCount = Math.max(maxCount, curCount);
		return maxCount;
	}

	static int largestSubWithEqual0and1(int a[]) {
		int n = a.length;
		int prefixSum[] = new int[a.length];
		prefixSum[0] = a[0] == 0 ? -1 : 1;
		for(int i=1; i<n; i++) {
			prefixSum[i] = a[i] == 0 ?
					prefixSum[i-1]-1: prefixSum[i-1]+1;			
		}
		Map<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for(int i=0; i<n;i++) {
		if(map.containsKey(prefixSum[i])) {
			ans = Math.max(ans, i-map.get(prefixSum[i]));
		}
		else {
			map.put(prefixSum[i],i);
		}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a [] = {1,2,1,2,2,2,2,1,1,2};
//		System.out.println(majorityElement(a));
		
		int a [] = {1,1,1,0,1,1,1,1,0,0,0,1};
//		System.out.println(longestOnes(a));
		
		System.out.println(largestSubWithEqual0and1(a));
	}

}
