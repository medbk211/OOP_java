public class PorteAutomatique extends Appareil implements Rechargeable {
    public PorteAutomatique(String nom) {
        super(nom);
    }

    @Override
    public void allumer() {
        System.out.println("La porte automatique est activée.");
    }

    @Override
    public void recharger() {
        System.out.println("La porte automatique est en cours de recharge.");
    }
    
}
