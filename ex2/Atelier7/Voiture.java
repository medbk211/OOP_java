package Atelier7;

public class Voiture {

    private String matricule;
    private String marque;
    private Double prixLocation;
    private enum Etat{
        Disponible,
        Louee,
        
    }


   

    // Constructeur
    public Voiture(String matricule, String marque, Double prixLocation) {
        this.matricule = matricule;
        this.marque = marque;
        this.prixLocation = prixLocation;
    }
    // Getters & setters
   public Etat getEtat() {
        return Etat.Disponible;
    }

    public void setEtat(Etat etat) {
        etat = Etat.Louee;
    }

    

   
        

    

    
}
