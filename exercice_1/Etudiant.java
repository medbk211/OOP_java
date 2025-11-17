public class Etudiant {
    int matricule;
    String nom;
    String prenom;
    String group;

    public Etudiant(int matricule, String nom, String prenom, String group) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.group = group;
    }

    public String toString() {
        return "Etudiant{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", group='" + group + '\'' +
                '}';

    }
    void setNomPrenom(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
   void setGroup(String group){
        this.group=group;
    }
    
}
