package ex3;

public class Professeur extends Personne {

    private String matiere;

    public Professeur(String nom, int age, String matiere) {
        super(nom, age);
        this.matiere = matiere;
    }

    @Override
    void tarviller() {
        System.out.println("Je suis en train d'enseigner la matière : " + matiere);
    }
    
}
