public interface Rechargeable {
    void recharger();
    default void etat() {
        System.out.println("L'objet rechargeable est en bon état.");
    }
}
