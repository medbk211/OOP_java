import java.util.*;


public class AgenceLocation {
    private String nom;
    private int nbreVoitures;
    private Voiture[] tabvoiture;
    private int taillemax=50;
    


    public AgenceLocation(String nom, int nbreVoitures) {
        this.nom = nom;
        this.nbreVoitures = nbreVoitures;
        this.nbreVoitures = 0;

    }

    public void ajouterVoiture(Voiture voiture){
        if (nbreVoitures < taillemax){
            tabvoiture[nbreVoitures]= voiture;
            nbreVoitures++;
            System.out.println("Voiture ajoutée. Nombre total de voitures: " + nbreVoitures);
        } else {
            System.out.println("Capacité maximale atteinte. Impossible d'ajouter une nouvelle voiture.");
        }
    }

    public Voiture louerVoiture(String marque){
        for(int i=0; i<nbreVoitures;i++){
            Voiture v = tabvoiture[i];
           if(v.getEtat() == Voiture.Etat.DISPONIBLE && v.getMarque() == marque){
                v.setEtat(Voiture.Etat.INDISPONIBLE);
                System.out.println("Voiture louée: " + marque);
                return v;
           }
        }
        System.out.println("Aucune voiture disponible pour la marque: " + marque);
        return null;

    }

    public void rendreVoiture(Voiture voiture){
        for(int i = 0 ; i < nbreVoitures; i++){
            Voiture v = tabvoiture[i];
            if (tabvoiture[i].estIdentique(voiture)) {
                 tabvoiture[i].setEtat(Voiture.Etat.DISPONIBLE);
                    System.out.println("Voiture rendue: " + voiture.getMarque());
                    return;
                
            }



        }
        System.out.println("Voiture non reconnue par l'agence: " + voiture.getMarque());
        
    }


    
}
