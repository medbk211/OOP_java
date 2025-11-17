public abstract class Personnel {
    private String nom;
   

    public Personnel(String nom) {
        this.nom = nom;
       
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void presentation();
     

   
}