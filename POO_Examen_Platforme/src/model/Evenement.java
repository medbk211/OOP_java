package model;

import exceptions.EvenementDateException;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Représente un événement.
 */
public class Evenement implements Comparable<Evenement> {
    private String id;
    private String titre;
    private String description;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private int capacite;
    private int participants;

    public Evenement(String id, String titre, String description, LocalDateTime dateDebut, LocalDateTime dateFin, int capacite) throws EvenementDateException {
        this.id = id;
        this.titre = titre;
        this.description = description;
        if (dateFin.isBefore(dateDebut)) throw new EvenementDateException("dateFin avant dateDebut");
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.capacite = capacite;
        this.participants = 0;
    }

    public String getId() { return id; }
    public String getTitre() { return titre; }
    public LocalDateTime getDateDebut() { return dateDebut; }

    public void inscrire() throws EvenementDateException {
        if (participants >= capacite) throw new EvenementDateException("Événement complet");
        participants++;
    }

    @Override
    public int compareTo(Evenement o) {
        int cmp = this.dateDebut.compareTo(o.dateDebut);
        if (cmp != 0) return cmp;
        return Integer.compare(this.participants, o.participants);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evenement)) return false;
        Evenement that = (Evenement) o;
        return Objects.equals(id, that.id);
    }
}
