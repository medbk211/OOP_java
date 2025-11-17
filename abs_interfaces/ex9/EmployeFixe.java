package ex9;

public class EmployeFixe extends Employe {
    private double salaireFixe;

    public EmployeFixe(String nom, String id, double salaireFixe) {
        super(nom, id);
        this.salaireFixe = salaireFixe;
    }

    @Override
    public double calculerSalaire() {
        return salaireFixe;
    }

    @Override
    public void afficherDetails() {
        System.out.printf("Employé fixe: %s (id=%s) salaire=%.2f%n", nom, id, calculerSalaire());
    }
}
