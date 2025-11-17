package ex10;

public class test {
    public static void main(String[] args) {
        // Créer un tableau polymorphe d'animaux
        Animal[] animaux = {
            new Elephant("Dumbo"),
            new Lion("Simba"),
            new Oiseau("Tweety")
        };

        // Appeler les méthodes de chaque animal
        for (Animal animal : animaux) {
            System.out.println("\n--- " + animal.getNom() + " ---");
            animal.manger();
            animal.seDeplacer();
            
            // Cast vers Soignable pour appeler soigner()
            if (animal instanceof Soignable) {
                ((Soignable) animal).soigner();
            }
        }
    }
}
