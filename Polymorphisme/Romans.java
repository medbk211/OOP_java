public class Romans extends Livre{
    
    public enum PrixLitteraire {
    GONCOURT(1),
    RENAUDOT(2),
    FEMINA(3),
    MEDICIS(4);

    private final int code;

    PrixLitteraire(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

    private PrixLitteraire prxLitt;


    public Romans(int numEnrg, String titre, String auteur, int nbrPages, PrixLitteraire prxLitt){
        super(numEnrg, titre, auteur, nbrPages);
        this.prxLitt = prxLitt;
    }

    public PrixLitteraire getPrxLitt(){
        return prxLitt;
    }
    @Override
    public String toString(){
        return "Romans [prxLitt=" + prxLitt + ", numEnrg=" + getNumEnrg() + ", titre=" + getTitre() +
                ", auteur=" + getAuteur() + ", nbrPages=" + getNbrPages() + "]";
    }
}
