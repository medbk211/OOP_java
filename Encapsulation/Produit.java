public class Produit {

    private String nom;
    private double prix;

    public void setPrix(double p){
        if (p > 0) {
            this.prix = p;
            
        }else{
            System.out.println("Prix invalide !!");
        }
    }

    public double getPrix() {
    return prix;
   }
 
    public void setNom(String n){
        this.nom = n;
    }

    public String getNom(){
        return nom;
    }
    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Prix : " + prix);
    }

    public static void main( String[] args){

        Produit p1 = new Produit();

        p1.setNom("Clavier");
        p1.setPrix(-10);
        p1.setPrix(150);
        p1.afficher();

    }

    
}