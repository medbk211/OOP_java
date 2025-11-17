package ex2;

public class Client extends Personne implements Homme {
    private String numeroClient;

    public Client(String nom, String prenom, String numeroClient) {
        super(nom, prenom);
        this.numeroClient = numeroClient;
    }

    @Override
    public void identite() {
        super.identite();
        System.out.println("Numéro Client: " + numeroClient);
    }
    
}
