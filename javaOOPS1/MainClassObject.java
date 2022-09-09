package javaOOPS1;;
class employee{
    int salary;
    String name;
    
    public static void walk() {
    	System.out.println("Luna is walking 3 miles");
    }
}
public class MainClassObject {
    public static void main(String[] args){
        employee Anup = new employee();
        Anup.name = "Anup Shahi";
        Anup.salary=50000;
        System.out.println(Anup.salary);
        System.out.println(Anup.name);
        employee.walk();
    }
}
