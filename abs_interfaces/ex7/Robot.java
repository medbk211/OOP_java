package ex7;

public class Robot extends Machine implements Reparable {
    @Override
    public void demarrer() {
        System.out.println("Le robot démarre.");
    }

    @Override
    public void reparer() {
        System.out.println("Le robot est en cours de réparation.");
    }
}