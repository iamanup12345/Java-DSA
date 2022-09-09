package BitManipulation1Practice;

public class BitMain {
	
	static String oddEven(int N){
        if((N & 1) == 0)
        return "even";
        else
        return "odd";
    }
	
	static void swap(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("b = "+ b + " a = "+a);
	}
	
	static int countFillep(int a, int b) {
    	int count = 0;
    	int res = a ^ b;
    	while(res!=0) {
    		if((res & 1) == 1) {
    			count++;
    		}
    		res = res>>1;
    	}
    	return count;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(oddEven(20));
//		swap(2,5);
		System.out.println(countFillep(10,20));
	}

}
