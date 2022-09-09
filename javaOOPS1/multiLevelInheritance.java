package javaOOPS1;

class one1 {
	public void showA()
	{
		System.out.println("I am A method");
	}
}

class two1 extends one1 {
	public void showB() { System.out.println("I am B method"); }
}

class three1 extends two1 {
	public void showC()
	{
		System.out.println("I am C method");
	}
}

public class multiLevelInheritance {
	public static void main(String[] args)
	{
		one1 d = new one1();
		d.showA();
//		d.showB();
//		d.showC();
		
		two1 g = new two1();
		g.showA();
		g.showB();
//		g.showC();
		
		three1 f = new three1();
		f.showA();
		f.showB();
		f.showC();
	}
}

