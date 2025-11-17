public class Document{
    private int numEnrg;
    private String titre;

    public Document(int numEnrg, String titre){
        this.numEnrg = numEnrg;
        this.titre = titre;
    }

    public int getNumEnrg(){
        return numEnrg;
    }
    public String getTitre(){
        return titre;
    }

    @Override
    public String toString(){
        return "Document [numEnrg=" + numEnrg + ", titre=" + titre + "]";
    }



}