public class Employé_horaire extends Employé {

    private int nombre_Heures_Travaillées;

    public Employé_horaire(int matricule, String nom, String prénom, Date date_Naissance, double prime, double taux_horaire, int nombre_Heures_Travaillées) {
        super(matricule, nom, prénom, date_Naissance, prime);
        this.nombre_Heures_Travaillées = nombre_Heures_Travaillées;
    }

    public int getNombre_Heures_Travaillées() {
        return nombre_Heures_Travaillées;
    }

    // salaire base = heures * 2 + prime
    public double calcul_Salaire() {
        double base = nombre_Heures_Travaillées * 2.0;
        return base + getPrime();
    }

    // affichage demandé
    public void Afficher() {
        System.out.println("Le matricule est : " + getMatricule());
        System.out.println("Mon nom est " + getNom());
        System.out.println("Mon prénom est " + getPrénom());
        System.out.println("Ma date de naissance est " + getDate_Naissance());
        System.out.println("Ma prime est " + (int)getPrime() + " dinars");
        System.out.println("Je suis un employé horaire");
        System.out.println("Le nombre d’heures travaillées est " + nombre_Heures_Travaillées + " heures");
        double salaire = calcul_Salaire();
        // conforme à l'exemple (sans "dinars" pour l'horaire)
        if (salaire == (long) salaire) System.out.println("Mon salaire est " + (long)salaire);
        else System.out.println("Mon salaire est " + salaire);
    }
}