public class Livrotheque {

    private Livre[] livres;
    private int taille;

    public Livrotheque(int capacite){
        if (capacite < 0) {
            capacite =0;
            
        }

        this.livres = new Livre[capacite];
        this.taille = 0;
    }

    public void afficherLivre(){

        if(taille <= 0 ){
            System.out.println(" aucun Livre ");
        }

        for(int i = 0; i <= taille ; i++ ){
            System.out.println(livres[i]);
        }


    }

    public Livre livree (int i){

        if (i < 0 || i > taille ) {
            return null;
        }

        return livree(i);

    }

    public boolean ajouterLivre (Livre lv){
        if (lv == null) {

            return false;
            
        }

        if (taille >= livres.length ) {
            return false;
 
        }

        livres[taille++] = lv;
        return true;


    }

  public void afficherAuteurs() {
        for (int i = 0; i < taille; i++) {
            System.out.println(livres[i].getAuteur());
        }
    }

    public void afficherLivres() {
        for (int i = 0; i < taille; i++) {
            System.out.println(livres[i]);
        }
    }
    
}
