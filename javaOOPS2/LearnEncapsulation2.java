package javaOOPS2;

public class LearnEncapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj = new BankAccount();
//		obj.amount - 4;
		
		obj.setAmount(123,1000);
		System.out.println(obj.getAmount());

	}

}

class BankAccount{
	int otp=123;
	private int amount;
	
	
	public void setAmount(int opt, int amount) {
		if(otp==this.otp) {
			this.amount = amount;
		}
	}
	public int getAmount() {
		return amount;
	}
}
