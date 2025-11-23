package model;

import exceptions.ContenuNonDisponibleException;
import exceptions.TelechargementImpossibleException;

/**
 * Vidéo téléchargeable.
 */
public class Video extends Contenu implements Telechargeable {
    private int dureeSeconds;
    private String resolution;
    private int nbTelechargements;

    public Video(String titre, String description, int dureeSeconds, String resolution) {
        super(titre, description);
        this.dureeSeconds = dureeSeconds;
        this.resolution = resolution;
        this.nbTelechargements = 0;
    }

    public int getDureeSeconds() { return dureeSeconds; }

    @Override
    public void telecharger() throws TelechargementImpossibleException {
        if (!visible) throw new TelechargementImpossibleException("Vidéo non publiée: " + getId());
        nbTelechargements++;
    }

    @Override
    public int calculerPopularite() {
        return super.calculerPopularite() + nbTelechargements * 2;
    }

    @Override
    public String toString() {
        return "Video: " + super.toString() + " (durée=" + dureeSeconds + "s, res=" + resolution + ", téléch=" + nbTelechargements + ")";
    }
}
