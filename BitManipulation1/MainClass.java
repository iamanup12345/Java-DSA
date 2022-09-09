package BitManipulation1;

import java.util.Scanner;

public class MainClass {
	
	static int getBit(int n, int pos) {
		int bitMask = 1<<pos;	
		if((bitMask & n) == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	static int setBit(int n, int pos) {
		int bitMask = 1<<pos;	
		return bitMask | n;
	}
	
	static int clearBit(int n, int pos) {
		 int bitMask = 1<<pos;
	     int newBitMask = ~(bitMask);
	     int newNumber = newBitMask & n;
	     return newNumber;

	}
  
    static int updateBit(int n, int pos){
   int bitMask = 1<<pos;
	Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
   if(oper == 1) {
       //set
       int newNumber = bitMask | n;
       return newNumber;
   } else {
    //clear
    int newBitMask = ~(bitMask);
    int newNumber = newBitMask & n;
    return newNumber;
   }
    }
    
    static boolean isPowerOfTwo(int n) {
    	return (n!=0)&&((n&(n-1))==0);
    }
    
    static int toogleIthBit(int n, int i) {
    	int BitMask = 1<<i;
    	return n^BitMask;
    }
    
    static int countSetBits(int n) {
    	int count = 0;
    	while(n > 0) {
    		if((n & 1) == 1) {
    			count++;
    		}
    		n = n>>1;
    	}
    	return count;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(getBit(5,3));
//		System.out.println(setBit(5,1));
//		System.out.println(clearBit(5,2));
//		System.out.println(updateBit(5,2));
//		System.out.println(isPowerOfTwo(32));
//		System.out.println(toogleIthBit(6, 2));
		System.out.println(countSetBits(15));
	}

}
