package ex2;

public class Peuple {
    private Homme[] pays = new Homme[100];
    private int nbreHommes = 0;


    public void naissance(Homme h) {
        if (nbreHommes < pays.length) {
            pays[nbreHommes] = h;
            nbreHommes++;
        } else {
            System.out.println("Capacité maximale atteinte.");
        }
    }
    public  void explorer( ){
        for (int i = 0; i < nbreHommes; i++) {
            pays[i].identite();
        }

    }



}
