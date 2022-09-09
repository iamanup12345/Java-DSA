package javaOOPS1;
class Computer {
	String name;
	int id;
	int price;
	Computer(String name, int id, int price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	 public Computer(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
}

public class MainConstuctorOverloaded {
    public static void main(String[] args) {
//      Computer com1 = new Computer("Dell", 1, 222);
//      System.out.println("The name of Computer is "+com1.name+" and its id and price is "+com1.id+" and "+com1.price);
    	Computer com2 = new Computer(222, "Dell");
    	System.out.println(com2.id);
    	System.out.println(com2.name);
    	System.out.println(com2.price);
    }
}