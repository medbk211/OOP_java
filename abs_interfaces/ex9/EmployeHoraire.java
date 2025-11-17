package ex9;

public class EmployeHoraire extends Employe {
    private double heures;
    private double tauxHoraire;

    public EmployeHoraire(String nom, String id, double heures, double tauxHoraire) {
        super(nom, id);
        this.heures = heures;
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
        return heures * tauxHoraire;
    }

    @Override
    public void afficherDetails() {
        System.out.printf("Employé horaire: %s (id=%s) heures=%.2f taux=%.2f salaire=%.2f%n",
            nom, id, heures, tauxHoraire, calculerSalaire());
    }
}