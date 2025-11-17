 package ex10;


public abstract class Animal{

    private String nom;

    public Animal( String nom){

        this.nom = nom;

    }

    public String getNom() {
        return nom;
    }

    public abstract void manger();
    public abstract void seDeplacer();


    
}