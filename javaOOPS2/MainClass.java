package javaOOPS2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien obj = new Alien();
		obj.sayHello();
		Alien.isMemberOfEarth = true;
		Alien.speak();
		add(3,5);
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	}
	
	class Alien{
		static boolean isMemberOfEarth = false;
		int legs;
		
		static void speak() {
			System.out.println("alien speaks");
		}
		
		void sayHello() {
			System.out.println("alien says hello");
		}
	}
