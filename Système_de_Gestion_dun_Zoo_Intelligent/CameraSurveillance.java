public class CameraSurveillance extends Appareil implements Rechargeable {
    public CameraSurveillance(String nom) {
        super(nom);
    }

    @Override
    public void allumer() {
        System.out.println("La caméra de surveillance est allumée.");
    }

    @Override
    public void recharger() {
        System.out.println("La caméra de surveillance est en cours de recharge.");
    }
}