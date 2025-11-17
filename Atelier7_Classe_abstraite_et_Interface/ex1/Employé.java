public class Employé {
    private int matricule;
    private String nom;
    private String prénom;
    private Date date_Naissance;
    private double prime;

    public Employé(int matricule, String nom, String prénom, Date date_Naissance, double prime) {
        this.matricule = matricule;
        this.nom = nom;
        this.prénom = prénom;
        this.date_Naissance = date_Naissance;
        this.prime = prime;
    }

    public int getMatricule() { return matricule; }
    public String getNom() { return nom; }
    public String getPrénom() { return prénom; }
    public Date getDate_Naissance() { return date_Naissance; }
    public double getPrime() { return prime; }

    @Override
    public String toString() {
        return "Employé{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", date_Naissance=" + date_Naissance +
                ", prime=" + prime +
                '}';
    }
}