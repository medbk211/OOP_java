package vente;

public class ProduitLivre extends produit {
    private String adresseLivraison;
    private int distance;

    // Constructeur
    public ProduitLivre(int reference, String marque, String adresseLivraison) {
        super(reference, marque);
        this.adresseLivraison = adresseLivraison;
    }

    // Getters & setters
    public String getAdresseLivraison() { return adresseLivraison; }
    public void setAdresseLivraison(String adresseLivraison) { this.adresseLivraison = adresseLivraison; }

    public int getDistance() { return distance; }
    public void setDistance(int distance) { this.distance = distance; }

    // Type camion selon la distance
    public int typeCamion() {
        if (distance <= 25)
            return 1;
        else if (distance <= 100)
            return 2;
        else
            return 3;
    }

    // Calcul du coût de transport
    public double calculerCoutTransport() {
        int type = typeCamion();
        switch (type) {
            case 1: return 7.5 * distance;
            case 2: return 20.85 * distance;
            case 3: return 30.75 * distance;
            default: return 0;
        }
    }

   
    @Override
    public void afficher() {
        System.out.println(toString() +
                ", Adresse livraison: " + adresseLivraison +
                ", Distance: " + distance +
                ", Type camion: " + typeCamion() +
                ", Coût transport: " + calculerCoutTransport());
    }
}
