public class Bibliotheque {
    private Document[] documents;
    private int size;

    public  Bibliotheque (int capacite){
        if (capacite < 0) {

            capacite = 0;
            
        }

        this.documents = new Document[capacite];
        this.size = 0;
    }


    public void afficherDocuments(){

        if (size <= 0) {

            System.out.println(" biblio est vide !!");
        }

        for(int i=0; i < size ; i++){

            System.out.println(documents[i]);
        }

    }

    public Document document(int i){
        if ( i<0 || i<size){
            return null;
        }

        return documents[i];
    }

    public boolean ajouter(Document dc){

        if (dc == null ) {
            return false;
        }
        if (size >= documents.length) {
            return false;
        }

        documents[size++] = dc;
        return true;

    }

    public boolean supprimer(Document doc){

        if (doc == null) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (documents[i].getNumEnrg() == doc.getNumEnrg()) {

                documents[i] = documents[size - 1];
                documents[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;

    }

    public void afficherAuteurs(){

        boolean any = false;

        for(int i=0; i < size ; i++){

            if(documents[i] instanceof Livre){

                Livre livre = (Livre) documents[i];
                System.out.println(livre.getAuteur());
                any = true;
            }
        }

        if (!any) {
            System.out.println("Pas de livres dans la bibliotheque.");
        }


    }


    
}
