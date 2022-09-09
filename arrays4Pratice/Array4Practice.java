package arrays4Pratice;

public class Array4Practice {
	
	static void fillPrefixSum(int arr[], int n, int prefixSum[]){
		// Fills prefix sum array
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        	System.out.println(prefixSum[i-1] + " ");
        }
        int i = 1;
        int j = n-1;
        System.out.println(prefixSum[j] - prefixSum[i]);
    }
	
	
	public static void prefixSum2D(int a[][])
	{
		int R = a.length;
		int C = a[0].length;

		int psa[][] = new int[R][C];

		psa[0][0] = a[0][0];

		// Filling first row and first column
		for (int i = 1; i < C; i++)
			psa[0][i] = psa[0][i - 1] + a[0][i];
		for (int i = 1; i < R; i++)
			psa[i][0] = psa[i - 1][0] + a[i][0];

		// updating the values in the
		// cells as per the general formula.
		for (int i = 1; i < R; i++)
			for (int j = 1; j < C; j++)

				// values in the cells of new array
				// are updated
				psa[i][j] = a[i][j] + psa[i - 1][j] + psa[i][j - 1]
							- psa[i - 1][j - 1];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++)
				System.out.print(psa[i][j] + " ");
		System.out.println();
		}
	}

	public static void main(String[] args) {
		        int arr[] = { 1,2,8,3,1,2,4 };
		        int n = arr.length;
		        int prefixSum[] = new int[n];
		        fillPrefixSum(arr, n, prefixSum);
		        
		        
//		        int a[][] = { { 1, 1, 1, 1, 1 },
//						{ 1, 1, 1, 1, 1 },
//						{ 1, 1, 1, 1, 1 },
//						{ 1, 1, 1, 1, 1 } };
//			prefixSum2D(a);
	}

}