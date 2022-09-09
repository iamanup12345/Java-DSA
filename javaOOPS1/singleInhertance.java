package javaOOPS1;
	class one {
		public void showA()
		{
			System.out.println("I am A method");
		}
	}

	class two extends one {
		public void showB() { System.out.println("I am B method"); }
	}
	// Driver class
	public class singleInhertance {
		public static void main(String[] args)
		{
			one d = new one();
			d.showA();
//			d.showB();
			two g = new two();
			g.showB();
			g.showA();
		}
}
