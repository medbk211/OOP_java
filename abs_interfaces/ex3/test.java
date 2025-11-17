package ex3;

//Classe abstraite + constructeurs

public class test {
    public static void main(String[] args) {
        Personne prof = new Professeur("Mme Dupont", 40, "Mathématiques");
        Personne etu = new Etudiant("Jean", 20, "Informatique");

        prof.sePresenter();
        prof.tarviller();

        etu.sePresenter();
        etu.tarviller();
    }
}
