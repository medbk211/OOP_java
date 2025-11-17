

public class Date {
    private int jour;
    private int mois;
    private int année;

    public Date(int jour, int mois, int année) {
        this.jour = jour;
        this.mois = mois;
        this.année = année;
    }

    @Override
    public String toString() {
        return jour + "/" + mois + "/" + année;
    }
}