public class Date {
    int jour;
    int mois;
    int annee;

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public String toString() {
        return "Date{" +
                "jour=" + jour +
                ", mois=" + mois +
                ", annee=" + annee +
                '}';
    }
    void setjour(int jour){
        this.jour=jour;
    }
    void setmois(int mois){
        this.mois=mois;
    }
    void setannee(int annee){
        this.annee=annee;
    }



}
