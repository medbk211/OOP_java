
public class main {

    public static void main(String[] args) {

        System.out.println(" hello TP5 !");

        Bibliotheque biblo = new Bibliotheque(10);

        biblo.ajouter(new Livre(1, "java", "Yann hackl", 605));
        biblo.ajouter(new Dictionnaires(2, "English", Dictionnaires.Langeu.ANGLAIS));
        biblo.ajouter(new Romans(3, "Le club des incorrigibles optimistes", "Jean-Michel Guenassia", 770, Romans.PrixLitteraire.GONCOURT));
        biblo.ajouter(new Revues(4, "Pour la science", 10, 2009));
        biblo.ajouter( new Manuels(5, "junior tennis", " mark vale", 60, 1));


        biblo.afficherAuteurs();

        biblo.afficherDocuments();


        




      



    }
}