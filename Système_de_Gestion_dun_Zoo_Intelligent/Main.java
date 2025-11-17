public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

         // Animaux
        zoo.ajouterAnimal(new Lion("Simba", 5));
        zoo.ajouterAnimal(new Elephant("Dumbo", 10));
        zoo.ajouterAnimal(new Oiseau("Tweety", 1));

        // Appareils
        zoo.ajouterAppareil(new CameraSurveillance("Caméra 1"));
        zoo.ajouterAppareil(new PorteAutomatique("Porte Entrée"));

        // Employés
        zoo.ajouterEmploye(new Veterinaire("Dr. Hichem"));
        zoo.ajouterEmploye(new AgentSecurite("Aymen"));

        // Afficher les informations
        zoo.afficherAnimaux();
        zoo.afficherAppareils();
        zoo.afficherEmployes();

        // Actions
        zoo.soignerTous();
        zoo.faireCrierTous();
        zoo.faireTravaillerEmployes();
    }   
}
