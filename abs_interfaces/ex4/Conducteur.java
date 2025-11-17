package ex4;

public interface Conducteur {
    void conduire();

    default void stop() {
        System.out.println("Arrêt du véhicule.");
    }

    
}
