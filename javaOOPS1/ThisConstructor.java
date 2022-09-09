package javaOOPS1;

class Sample{
	Sample() {
		System.out.println("In default constructor");
		}
	Sample(int a) {
		System.out.println("In Parameterised constructor");
		}
	Sample(int a, int b) {
		this();
		System.out.println("In Parameterised constructor");
		}
	}
public class ThisConstructor {
	public static void main(String args[]){
		Sample s = new Sample(10,20);
		}
	}