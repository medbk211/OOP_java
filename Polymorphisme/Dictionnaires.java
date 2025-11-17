
public class Dictionnaires extends Document{

     enum Langeu{
        FRANCAIS,
        ANGLAIS,
        ESPAGNOL,
        ALLEMAND
    }

    private Langeu langue;

    public Dictionnaires(int numEnrg, String titre, Langeu langue){
        super(numEnrg, titre);
        this.langue = langue;
    }

    public Langeu getLangue(){
        return langue;
    }

    @Override
    public String toString(){
        return "Dictionnaires [langue=" + langue + ", numEnrg=" +
                getNumEnrg() + ", titre=" + getTitre() + "]";

    }


    
}
