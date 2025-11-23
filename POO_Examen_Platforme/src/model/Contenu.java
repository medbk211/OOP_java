package model;

import exceptions.ContenuNonDisponibleException;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Classe abstraite représentant un contenu.
 */
public abstract class Contenu {
    protected final String id;
    protected String titre;
    protected String description;
    protected LocalDateTime datePublication;
    protected boolean visible;
    protected int likes;
    protected int vues;

    public Contenu(String titre, String description) {
        this.id = UUID.randomUUID().toString();
        this.titre = titre;
        this.description = description;
        this.visible = false;
        this.likes = 0;
        this.vues = 0;
        this.datePublication = null;
    }

    public String getId() { return id; }
    public String getTitre() { return titre; }
    public String getDescription() { return description; }
    public boolean isVisible() { return visible; }
    public int getLikes() { return likes; }
    public int getVues() { return vues; }

    public void publier() {
        this.visible = true;
        this.datePublication = LocalDateTime.now();
    }

    public void cacher() {
        this.visible = false;
    }

    public void aimer() {
        this.likes++;
    }

    public void incrementerVues() {
        this.vues++;
    }

    /**
     * Affiche ou retourne la représentation du contenu.
     * @throws ContenuNonDisponibleException si le contenu n'est pas visible/publie
     */
    public String afficher() throws ContenuNonDisponibleException {
        if (!visible) throw new ContenuNonDisponibleException("Le contenu n'est pas disponible pour affichage: " + id);
        incrementerVues();
        return toString();
    }

    /**
     * Calculer un score de popularité. Méthode overridable.
     */
    public int calculerPopularite() {
        // Formule simple par défaut
        return likes * 3 + vues * 1;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s (likes=%d, vues=%d)", id, titre, description, likes, vues);
    }
}
