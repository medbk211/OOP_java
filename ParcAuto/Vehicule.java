public class Vehicule {
    // 🔒 Attributs
    private String matricule;
    public String marque;
    public String modele;
    private int puissance;
    private String dateDeProduction;
    private int couleur;
    public String carburant;

    // 🔗 Relation: chaque véhicule peut avoir un propriétaire
    private Personne proprietaire;

    // 🏗️ Constructeur
    public Vehicule(String m, String ma, String mo, int p, String date, int c, String carbu) {
        matricule = m;
        marque = ma;
        modele = mo;
        puissance = p;
        dateDeProduction = date;
        couleur = c;
        carburant = carbu;
    }

    // 🔧 Méthodes de changement
    public void changer_Matricule(String nouvMat) {
        matricule = nouvMat;
    }

    public void changer_Puissance(int nouvP) {
        puissance = nouvP;
    }

    public void changer_Couleur(int nouvC) {
        couleur = nouvC;
    }

    public void changer_Date(String nouvDate) {
        dateDeProduction = nouvDate;
    }

    // 👤 Affecter un propriétaire
    public void affecter_proprietaire(Personne p) {
        proprietaire = p;
    }

    // 🧾 Afficher les caractéristiques du véhicule
    public void afficher_Caracteristiques() {
        System.out.println("Matricule: " + matricule);
        System.out.println("Marque: " + marque);
        System.out.println("Modèle: " + modele);
        System.out.println("Puissance: " + puissance);
        System.out.println("Date de production: " + dateDeProduction);
        System.out.println("Couleur: " + couleur);
        System.out.println("Carburant: " + carburant);
        if (proprietaire != null) {
            System.out.println("\n--- Propriétaire ---");
            proprietaire.afficher_Homme();
        }
    }
}
