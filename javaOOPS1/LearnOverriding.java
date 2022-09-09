package javaOOPS1;

class Mic{
    void printInfo(){
        System.out.println("Welcome to Default Mic Info");
    }
}

class Boya extends Mic{
void printInfo(){
    System.out.println("Welcome to Boya Mic Info");
}
}

public class LearnOverriding {
    public static void main(String[] args) {
        Mic m1 = new Mic();
        Boya b1 = new Boya();

        m1.printInfo();
        b1.printInfo();
    }
}
