public class Main {
    public static void main(String[] args) {
        // 🧍 Créer l'objet Asma de la classe Personne
        Personne asma = new Personne("Farhat", "Asma", "5 rue des oliviers Tunis");

        // 🚗 Créer un véhicule
        Vehicule savoiture = new Vehicule(
            "6200TU102", // matricule
            "Ford",      // marque
            "Fiesta",    // modèle
            4,           // puissance
            "2020-03-01",// date de production
            5,           // couleur (exemple code)
            "Essence"    // carburant
        );

        // 🔗 Relier الشخص بالسيارة
        savoiture.affecter_proprietaire(asma);

        // 🖨️ عرض الخصائص
        savoiture.afficher_Caracteristiques();
    }
}
