package ex1;

public class Chat extends Animal{

    Chat(String name, int age){
        super(name, age);
    }

    @Override
    void faireSon() {
        System.out.println(name + " miaule: Meow Meow!");
    }
    
}
