package javaOOPS1;
	class one2{
		public static void showA() {
			System.out.println("I am A method");
		}
	class two2 extends one2{
		public static void showB() {
			System.out.println("I am B method");
		}
	}
	class three2 extends one2{
		public static void showC() {
			System.out.println("I am C method");
		}
	}
	}
	public class hirerachyInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one2 o = new one2();
		o.showA();
	}

}
