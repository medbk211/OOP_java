package ex1;

abstract class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void faireSon();

    void manger(){
        System.out.println(name + " est en train de manger.");
    }
}