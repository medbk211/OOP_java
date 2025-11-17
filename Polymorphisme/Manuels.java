public class Manuels  extends Livre{
    private int niveau;

    public Manuels(int numEnrg, String titre, String auteur, int nbrPages, int niveau){
        super(numEnrg, titre, auteur, nbrPages);
        this.niveau = niveau;
    }

    public int getNiveau(){
        return niveau;
    }

    @Override
    public String toString(){
        return "Manuels [niveau=" + niveau + ", numEnrg=" + getNumEnrg() + ", titre=" + getTitre() +
                ", auteur=" + getAuteur() + ", nbrPages=" + getNbrPages() + "]";
    }
    
}
