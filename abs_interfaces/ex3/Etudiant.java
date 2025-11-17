package ex3;

public class Etudiant extends Personne  {
    private String programme;

    public Etudiant(String nom, int age, String programme) {
        super(nom, age);
        this.programme = programme;
    }

    @Override
    void tarviller() {
        System.out.println("Je suis en train d'étudier le programme : " + programme);
    }

    
}
