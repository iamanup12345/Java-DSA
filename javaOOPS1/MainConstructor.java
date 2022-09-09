package javaOOPS1;

//	class boy{
//		String name;
//		int id;
//		boy(){
//			System.out.println("I am a Programmer");
//		}
class boy{
	String name;
	int id;
	boy(String name, int id){
		this.name = name;
		this.id = id;		
	}
	}
	public class MainConstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boy d = new boy();
//		d.name = "Anup";
//		d.id = 12;
//		System.out.println(d.name);
		
		boy d = new boy("Anup Shahi", 22);
		System.out.println("My name is "+d.name+" and id is "+d.id);
	}

}
