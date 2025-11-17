package ex1;

public class Chien extends Animal{

    Chien(String name, int age){
        super(name, age);
    }

    @Override
    void faireSon() {
        System.out.println(name + " aboie: Woof Woof!");
    }
    
}
