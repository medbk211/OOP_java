package ex9;

public class test {
    public static void main(String[] args) {
        Employe emp1 = new EmployeHoraire("Mohamed", "H001", 160, 15.0);
        System.out.println("Salaire de " + emp1.nom + ": " + emp1.calculerSalaire());

        Employe emp = new EmployeFixe("Alice", "M001", 5000);
        emp.calculerSalaire();
        ((Affichable) emp).afficherDetails();
    }
}
