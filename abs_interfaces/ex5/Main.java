package ex5;

public class Main {
    public static void main(String[] args) {
        Forme[] formes = {
            new Cercle(2.0),
            new Rectangle(3.0, 4.0),
            new Cercle(1.5)
        };

        for (Forme f : formes) {
            System.out.printf("%s aire = %.4f%n", f.toString(), f.aire());
        }
    }
}