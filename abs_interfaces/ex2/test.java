package ex2;
//Interface de base
public class test {
    public static void main(String[] args) {
        Enfant enfant1 = new Enfant("Alice");
        Enfant enfant2 = new Enfant("Bob");

        enfant1.jouer();
        enfant2.jouer();
    }
}
