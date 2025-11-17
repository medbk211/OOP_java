public class Voiture {
    private String marque;
    private int annee;

    public void setMarque(String m) {
        marque = m;
    }

    public void setAnnee(int a) {
        annee = a;
    }

    public String getMarque() {
        return marque;
    }

    public int getAnnee() {
        return annee;
    }

    public void afficher() {
        System.out.println("Marque : " + marque + " | Année : " + annee);
    }
}
