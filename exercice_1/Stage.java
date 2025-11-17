public class Stage {
    private static int nbStage = 0;
    private int numStage;
    private Etudiant etud;
    private Date dateSoutenance;
    private double noteSoutenance;
    private double noteRapport;
    private String entreprise;

    // Constructeur
    public Stage(Etudiant e, double ns, double nr, String entreprise) {
        nbStage++;
        this.numStage = nbStage;
        this.etud = e;
        this.noteSoutenance = ns;
        this.noteRapport = nr;
        this.entreprise = entreprise;
    }

    // Méthodes set
    public void setDateSoutenance(Date d) {
        this.dateSoutenance = d;
    }

    public void setResultat(double noteRapport, double noteSoutenance) {
        this.noteRapport = noteRapport;
        this.noteSoutenance = noteSoutenance;
    }

    // Vérification de validation
    public boolean estValide() {
        double moyenne = (noteSoutenance * 0.4) + (noteRapport * 0.6);
        return moyenne >= 10;
    }

    // Affichage
    public void affiche() {
        System.out.println("Stage n°" + numStage);
        System.out.println("Étudiant : " + etud.toString());
        System.out.println("Entreprise : " + entreprise);
        System.out.println("Date de soutenance : " + (dateSoutenance != null ? dateSoutenance.toString() : "Non définie"));
        System.out.println("Note soutenance : " + noteSoutenance);
        System.out.println("Note rapport : " + noteRapport);
        System.out.println("Stage validé : " + (estValide() ? "Oui" : "Non"));
    }
}
