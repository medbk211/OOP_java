public class Livre extends Document{
    private String auteur;
    private int nbrPages;

    public Livre(int numEnrg, String titre, String auteur, int nbrPages){
        super(numEnrg, titre);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    public String getAuteur(){
        return auteur;
    }
    public int getNbrPages(){
        return nbrPages;
    }

    @Override
    public String toString(){
        return "Livre [auteur=" + auteur + ", nbrPages=" + nbrPages + ", numEnrg=" + getNumEnrg() + ", titre=" + getTitre() +
                "]";    

    }


     
}
