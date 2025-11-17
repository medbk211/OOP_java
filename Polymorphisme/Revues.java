public class Revues extends Document{
    private int mois;
    private int annee;

    public Revues( int numEnrg, String titre, int mois, int annee){
        super(numEnrg, titre);
        this.mois = mois;
        this.annee = annee;
    }

    public int getMois(){
        return mois;
    }
    public int getAnnee(){
        return annee;
    }

    @Override   
    public String toString(){
        return "Revues [mois=" + mois + ", annee=" + annee + ", numEnrg=" + getNumEnrg() + ", titre=" + getTitre() +
                "]";    
    }


    
}
