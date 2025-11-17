public class Personne {
    // 🧱 Attributs
    public String nom;
    public String prenom;
    private String adresse;

    // 🏗️ Constructeur (init_Personne)
    public Personne(String n, String p, String a) {
        nom = n;
        prenom = p;
        adresse = a;
    }

    // 🔧 Méthode changer_Adresse
    public void changer_Adresse(String nouvelleAdresse) {
        adresse = nouvelleAdresse;
    }

    // 👤 Méthode afficher_Homme
    public void afficher_Homme() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Adresse: " + adresse);
    }
}
