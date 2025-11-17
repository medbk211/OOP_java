class Album {
   private String titre;
   private String artiste;
   private final int anneeSortie;
   private String genre;
   private int nombreCopies;
   private static int nombreLocations;
   private double prix;

   public Album (String t, String a, int annee, String g, int nC, double nL){
     this.titre = t;
     this.artiste = a;
     this.anneeSortie = annee;
     this.genre = g;
     this.nombreCopies = nC;
     nombreLocations = (int) nL;
     this.prix = 1.50;
   }

   public void setPrix(double p){
     this.prix  = p;
   }

   public double getPrix(){
    return this.prix;
   }










}
