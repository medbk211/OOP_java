public class Employé_salarié extends Employé {
    public enum Tgrade {
        cadre,
        exécutant
    }
    private Tgrade grade;

    public Employé_salarié(int matricule, String nom, String prénom, Date date_Naissance, double prime, Tgrade grade) {
        super(matricule, nom, prénom, date_Naissance, prime);
        this.grade = grade;
    }

    public Tgrade getGrade() {
        return grade;
    }

    // calcul salaire : SB selon grade + prime
    public double calcul_Salaire() {
        double sb = (grade == Tgrade.cadre) ? 700.0 : 200.0;
        return sb + getPrime();
    }

    // affichage demandé
    public void Afficher() {
        System.out.println("Le matricule est : " + getMatricule());
        System.out.println("Mon nom est " + getNom());
        System.out.println("Mon prénom est " + getPrénom());
        System.out.println("Ma date de naissance est " + getDate_Naissance());
        System.out.println("Ma prime est " + (int)getPrime() + " dinars");
        System.out.println("Je suis un employé salarié");
        System.out.println("Mon grade est " + (grade == Tgrade.cadre ? "cadre" : "exécutant"));
        double salaire = calcul_Salaire();
        // afficher comme dans l'exemple avec "dinars"
        if (salaire == (long) salaire) System.out.println("Mon salaire est " + (long)salaire + " dinars");
        else System.out.println("Mon salaire est " + salaire + " dinars");
    }

    @Override
    public String toString() {
        return "Employé_salarié{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}
