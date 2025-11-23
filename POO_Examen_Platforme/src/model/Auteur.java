package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Représente un auteur de contenus.
 */
public class Auteur {
    private String id;
    private String nom;
    private String bio;
    private List<String> contenusIds;

    public Auteur(String id, String nom, String bio) {
        this.id = id;
        this.nom = nom;
        this.bio = bio;
        this.contenusIds = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getBio() { return bio; }

    public void setBio(String bio) { this.bio = bio; }

    public void ajouterContenu(String contenuId) {
        if (!contenusIds.contains(contenuId)) contenusIds.add(contenuId);
    }

    public List<String> getContenusIds() { return contenusIds; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auteur)) return false;
        Auteur auteur = (Auteur) o;
        return Objects.equals(id, auteur.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
