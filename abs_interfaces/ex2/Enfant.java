package ex2;



class Enfant implements Playable {
    private String nom;

    public Enfant(String nom) {
        this.nom = nom;
    }

    @Override
    public void jouer() {
        System.out.println(nom + " est en train de jouer.");
    }
}
