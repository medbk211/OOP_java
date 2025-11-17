public class Chat {
    private int age;
    private double poids;
    private String nom;

    // Constructeur
    public Chat(int age, double poids, String nom) {
        this.age = age;
        this.poids = poids;
        this.nom = nom;
    }

    // Méthodes SetAge
    public void SetAge(int nvAge) {
        this.age = nvAge;
    }

    public void SetAge() {
        age++;
    }

    // Getter pour l'âge
    public int GetAge() {
        return age;
    }

    // Setter et Getter pour le poids
    public void SetPoids(double nvPoid) {
        this.poids = nvPoid;
    }

    public double GetPoids() {
        return poids;
    }

    // Changer le nom du chat
    public void ChangerNom(String nvNom) {
        this.nom = nvNom;
    }

    // Miaouller
    public void Miaouller() {
        System.out.println("Miaou, Miaou");
    }

    // Afficher les informations du chat
    public void afficheChat() {
        System.out.println("Bonjour, je suis le chat " + nom);
        Miaouller();
        System.out.println("J’ai " + age + " mois");
        System.out.println("Je pèse " + poids + " Kg");
    }

    // Programme principal pour tester
    public static void main(String[] args) {
        Chat c1 = new Chat(6, 3.5, "Minou");
        c1.afficheChat();

        c1.SetAge(); // incrémente l'âge
        c1.SetPoids(4.0);
        c1.ChangerNom("Tigrou");

        System.out.println("\nAprès modification :");
        c1.afficheChat();
    }
}
