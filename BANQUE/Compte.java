public class Compte{
    int numCompte;
    String nomProprietaire;
    private double solde;

    public Compte(int numCompte, String nomProprietaire, double soldeInitial){
        this.numCompte = numCompte;
        this.nomProprietaire = nomProprietaire;
        this.solde = soldeInitial;
    }

    public void deposer(double montant){
        if(montant > 0){
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué. Nouveau solde: " + solde);
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }

    public void retirer(double montant){
        if(montant > 0 && montant <= solde){
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué. Nouveau solde: " + solde);
        } else {
            System.out.println("Montant de retrait invalide ou fonds insuffisants.");
        }
    }

    public void consulter_Solde(){
        System.out.println(" votre  solde: " + solde);

    }
    @Override
    public String toString(){
        return "Num Compte : " + numCompte +
               "\nPropriétaire : " + nomProprietaire +
               "\nSolde : " + solde;
    }





}