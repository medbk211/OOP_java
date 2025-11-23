package model;

import exceptions.TelechargementImpossibleException;

/**
 * Podcast téléchargeable.
 */
public class Podcast extends Contenu implements Telechargeable {
    private int dureeSeconds;
    private String hote;
    private int nbTelechargements;

    public Podcast(String titre, String description, int dureeSeconds, String hote) {
        super(titre, description);
        this.dureeSeconds = dureeSeconds;
        this.hote = hote;
        this.nbTelechargements = 0;
    }

    @Override
    public void telecharger() throws TelechargementImpossibleException {
        if (!visible) throw new TelechargementImpossibleException("Podcast non publié: " + getId());
        nbTelechargements++;
    }

    @Override
    public int calculerPopularite() {
        return super.calculerPopularite() + nbTelechargements * 2;
    }

    @Override
    public String toString() {
        return "Podcast: " + super.toString() + " (durée=" + dureeSeconds + "s, hôte=" + hote + ", téléch=" + nbTelechargements + ")";
    }
}
