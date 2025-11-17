public class Main {
    public static void main(String[] args) {
        // Création d’un étudiant
        Etudiant e1 = new Etudiant(1, "Briki", "Mohamed", "G2");

        // Création d’une date de soutenance
        Date d1 = new Date(15, 6, 2025);

        // Création d’un stage
        Stage s1 = new Stage(e1, 12.5, 9.0, "TechCorp");

        // Affectation de la date de soutenance
        s1.setDateSoutenance(d1);

        // Affichage du stage
        s1.affiche();

        // Test de validation
        if (s1.estValide()) {
            System.out.println("✅ Le stage est validé !");
        } else {
            System.out.println("❌ Le stage n’est pas validé !");
        }
    }
}
 