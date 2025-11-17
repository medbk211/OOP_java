public class Main {
    public static void main(String[] args) {

        // 🔹 Créer un compte A
        Compte A = new Compte(4576001, "Toumi Youssef", 850.175);
        System.out.println("=== Compte A initial ===");
        System.out.println(A);

        // 🔹 Retirer 100 dinars
        A.retirer(100);
        System.out.println("\nAprès retrait de 100 dt :");
        A.consulter_Solde();

        // 🔹 Déclarer un deuxième compte B et affecter A à B
        Compte B = A;

        // 🔹 Déposer 200 dinars dans B
        B.deposer(200);

        // 🔹 Afficher les deux comptes
        System.out.println("\n=== Compte A ===");
        System.out.println(A);
        System.out.println("\n=== Compte B ===");
        System.out.println(B);

        // 🔍 Remarquez :
        System.out.println("\n⚠️ Remarque : A et B pointent vers le même objet !");
    }
}
