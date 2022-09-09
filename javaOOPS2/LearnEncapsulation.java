package javaOOPS2;

public class LearnEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secret obj = new Secret();
		obj.setData(103);
	System.out.println(obj.getData());
	}

}

class Secret{
	private int data;
	
	public void setData(int data) {
		if(data>100) {
		this.data = data;
		}
		else {
			System.out.println("Error");
		}
	}
	
	public int getData() {
		return data;
	}
}
