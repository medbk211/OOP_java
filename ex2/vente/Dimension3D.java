package vente;

import java.awt.Dimension;

public class Dimension3D extends Dimension {
    // attribut ajouté
    private int hauteur;

    // constructeur à 3 paramètres
    public Dimension3D(int largeur, int longueur, int hauteur) {
        super(largeur, longueur); // appel au constructeur de Dimension (width, height)
        this.hauteur = hauteur;
    }

    // getLongueur() retourne l’attribut height de Dimension
    public int getLongueur() {
        return height;
    }

    // getLargeur() retourne l’attribut width de Dimension
    public int getLargeur() {
        return width;
    }

    // getHauteur() retourne l’attribut hauteur de Dimension3D
    public int getHauteur() {
        return hauteur;
    }

    // aire = largeur × longueur × hauteur
    public int aire() {
        return width * height * hauteur;
    }

    // redéfinir toString()
    @Override
    public String toString() {
        return "Larg " + width + " - Lg " + height + " - Haut " + hauteur;
    }


}
