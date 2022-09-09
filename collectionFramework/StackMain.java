package collectionFramework;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Horse");
		System.out.println("Stack"+ animals);
		System.out.println(animals.peek());
		animals.pop();
		System.out.println(animals.peek());
		System.out.println(animals.empty());
		System.out.println(animals.search("Dog"));
	}

}
