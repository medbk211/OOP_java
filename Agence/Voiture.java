public class Voiture {
    // ---------- Attributs ----------
    private int matricule;
    private String marque;
    private double prixLocation;
    private Etat etat;

    // ---------- Enum ----------
    enum Etat {
        DISPONIBLE,
        INDISPONIBLE
    }

    // ---------- Constructeur ----------
    public Voiture(int matricule, String marque, double prixLocation) {
        this.matricule = matricule;
        this.marque = marque;
        this.prixLocation = prixLocation;
        this.etat = Etat.DISPONIBLE; // état initial
    }

    // ---------- Getters ----------
    public int getMatricule() {
        return matricule;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrixLocation() {
        return prixLocation;
    }

    public Etat getEtat() {
        return etat;
    }

    // ---------- Setters ----------
    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    // ---------- Méthode estIdentique ----------
    public boolean estIdentique(Voiture v) {
        return this.matricule == v.matricule;
    }

    // ---------- Méthode toString ----------
    @Override
    public String toString() {
        return matricule + " " + marque + " " + prixLocation + " " + etat;
    }
}
