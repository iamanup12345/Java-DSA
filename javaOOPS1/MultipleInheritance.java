package javaOOPS1;

interface I1 {
	public void show();
}

interface I2 {
	public void display();
}

class Test implements I1, I2 {
   public void show()
	{
		System.out.println("Geeks");
	}

	public void display() {
		System.out.println("for");
		}
}


public class MultipleInheritance {
	public static void main(String[] args)
	{
		Test c = new Test();
		c.show();
		c.display();
	}
}
