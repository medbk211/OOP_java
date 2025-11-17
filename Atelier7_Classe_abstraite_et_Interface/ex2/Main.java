package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Peuple peuple = new Peuple();
        Scanner sc = new Scanner(System.in);

        // Lire 2 personnes
        for (int i = 1; i <= 2; i++) {
            System.out.println("--- Personne " + i + " ---");
            System.out.print("Nom: ");
            String nom = sc.nextLine();
            System.out.print("Prénom: ");
            String prenom = sc.nextLine();
            
            Personne p = new Personne(nom, prenom);
            peuple.naissance(p);
        }

        // Lire 2 clients
        for (int i = 1; i <= 2; i++) {
            System.out.println("--- Client " + i + " ---");
            System.out.print("Nom: ");
            String nom = sc.nextLine();
            System.out.print("Prénom: ");
            String prenom = sc.nextLine();
            System.out.print("Numéro Client: ");
            String numeroClient = sc.nextLine();
            
            Client c = new Client(nom, prenom, numeroClient);
            peuple.naissance(c);
        }

        // Afficher tous les individus
        System.out.println("\n--- Liste des individus ---");
        peuple.explorer();
        
        sc.close();
    }
}
