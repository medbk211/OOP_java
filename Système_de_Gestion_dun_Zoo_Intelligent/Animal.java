public abstract class Animal{
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public abstract void manger();
    public abstract void seDeplacer();
    
    
    public void info() {
        System.out.println("Animal{name='" + name + "', age=" + age + "}");
    }

}