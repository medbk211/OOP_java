package vente;

public class Main {
    public static void main(String[] args) {
        Dimension3D d = new Dimension3D(5, 3, 1);

        ProduitLivre p = new ProduitLivre(101, "Sony", "123 Rue Principale");
        p.modele= "TV 4K";
        p.setDim(d);
        p.setPoids(25.5);
        p.setPrix(1500.0);

        p.afficher();
    }
}
