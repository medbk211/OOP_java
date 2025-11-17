import java.util.*;

class Zoo {

    private List<Animal> animaux = new ArrayList<>();
    private List<Appareil> appareils = new ArrayList<>();
    private List<Personnel> employes = new ArrayList<>();

    void ajouterAnimal(Animal a) { animaux.add(a); }
    void ajouterAppareil(Appareil a) { appareils.add(a); }
    void ajouterEmploye(Personnel p) { employes.add(p); }

    void afficherAnimaux() {
        System.out.println("\n--- ANIMAUX DU ZOO ---");
        for (Animal a : animaux) a.info();
    }

    void afficherAppareils() {
        System.out.println("\n--- APPAREILS DU ZOO ---");
        for (Appareil a : appareils) a.allumer();
    }

    void afficherEmployes() {
        System.out.println("\n--- EMPLOYÉS DU ZOO ---");
        for (Personnel p : employes) p.presentation();
    }

    void soignerTous() {
        System.out.println("\n--- SOIN DES ANIMAUX ---");
        for (Animal a : animaux)
            ((Soignable)a).soigner();
    }

    void faireCrierTous() {
        System.out.println("\n--- LES ANIMAUX CRIENT ---");
        for (Animal a : animaux)
            ((Criable)a).crier();
    }

    void faireTravaillerEmployes() {
        System.out.println("\n--- TRAVAIL DU PERSONNEL ---");
        for (Personnel p : employes)
            ((Travailleur)p).travailler();
    }
}
