package javaOOPS1;

class person{
	int age;
	String name;
	void walk() {
		System.out.println(name + "is walking");
	}
	
	void walk(int steps) {
		System.out.println("Animal walked "+steps+" steps");
	}
	
	static int count;
	public person() {
//		this("random",20);
		count++;
		System.out.println("calling the constructor");
	}
	
	person(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		walking(this);
	}
	
	void walking(person obj) {
		System.out.println(name+ " is walking");
		age+=10;
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		person a1 = new person();
		person a2 = new person("Sumi",25);
//		a1.name = "Anup";
//		a1.age = 4;
//		a1.walk(5);
		System.out.println(a2.name+ " " +a2.age);
		System.out.println(person.count);
//		System.out.println(a1.name +" "+ a1.age);
//		System.out.println(a2.name);
	}

}
