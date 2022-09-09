package BitManipulation2Practice;

public class Bit2Main {
	
	 static int findPosition(int N) {
	         int count=0;
	 if((N&(N-1)) == 0){
	     while(N>0){
	         count++;
	     if(N%2 != 0){
	       return count;
	     }    
	     N/=2;    
	     }
	 }
	 return -1;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPosition(5));
	}

}
