package vente;

public class produit {
    private int reference;
    private Dimension3D dim;
    private double poids;
    private double prix;
    String marque;
    String modele;


    public produit(int reference, String marque) {
        this.reference = reference;
        this.marque = marque;
       
    }

    public Dimension3D getDim() {
        return dim;
    }
    public void setDim(Dimension3D dim) {
        this.dim = dim;
    }

    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;

    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;

    }
    public void afficher(){
        System.out.println(this.toString());
       
    }

     @Override
    public String toString() {
        return "Réf: " + reference +
               " | Marque: " + marque +
               " | Modèle: " + modele +
               " | Dimension: " + (dim != null ? dim.toString() : "Non définie") +
               " | Poids: " + poids +
               " | Prix: " + prix;
    }     



}
