package model;

/**
 * Article textuel.
 */
public class Article extends Contenu {
    private String texte;
    private int nbMots;

    public Article(String titre, String description, String texte) {
        super(titre, description);
        this.texte = texte;
        this.nbMots = texte == null ? 0 : texte.split("\\s+").length;
    }

    public String getTexte() { return texte; }

    @Override
    public int calculerPopularite() {
        // On valorise légèrement les articles longueurs
        return super.calculerPopularite() + Math.min(nbMots / 100, 10);
    }

    @Override
    public String toString() {
        return "Article: " + super.toString() + " (mots=" + nbMots + ")";
    }
}
