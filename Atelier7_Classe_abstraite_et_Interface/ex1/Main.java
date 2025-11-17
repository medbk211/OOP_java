

public class Main {
    public static void main(String[] args) {
        // employé salarié : matricule 432, Ben chaaben Ali, 05/08/1980, prime 200, grade cadre
        Employé_salarié emp1 = new Employé_salarié(
                432,
                "Ben chaaben",
                "Ali",
                new Date(5, 8, 1980),
                200,
                Employé_salarié.Tgrade.cadre
        );

        // employé horaire : matricule 400, Saidane ahmed, 05/08/1978, prime 100, 192 heures
        Employé_horaire emp2 = new Employé_horaire(
                400,
                "Saidane",
                "ahmed",
                new Date(5, 8, 1978),
                100,
                2.0, // taux_horaire (non utilisé, base fixe 2)
                192
        );

        emp1.Afficher();
        System.out.println(); // séparateur
        emp2.Afficher();
    }
}