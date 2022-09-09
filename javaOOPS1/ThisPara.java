package javaOOPS1;

class Sample1{
	void fun(Sample1 obj) {
		System.out.println("Received the object");
		}
	void foo(){
		fun(this);
		}
	}
public class ThisPara {
	public static void main(String args[]){
		Sample1 s = new Sample1();
		s.foo();
		}
	}