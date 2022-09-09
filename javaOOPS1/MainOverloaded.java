package javaOOPS1;

public class MainOverloaded {
public static void main(String[] args) {
	System.out.println(1);
	MainOverloaded.main("Sumi");
	MainOverloaded.main("Sumi Shahi", 7);
	MainOverloaded d = new MainOverloaded();
	d.main("Sumi");
	d.main("Sumi Shahi", 7);
}
public static void main(String name) {
	System.out.println("my name is "+name);
}
public static void main(String fullName, int age) {
	System.out.println("my name is "+fullName+" and I am "+age+" years old");
}

}
