package String1;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		a.concat(" HI");
		StringBuilder b = new StringBuilder("Hello");
//		b.append(" HI");
		b.replace(0, 3, "CATS");
//		b.reverse();
//		System.out.println(a);
		System.out.println(b);
	}

}
