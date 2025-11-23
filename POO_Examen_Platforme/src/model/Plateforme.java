package model;

import exceptions.ContenuNonDisponibleException;
import exceptions.TelechargementImpossibleException;
import exceptions.EvenementDateException;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Gestion de la plateforme — contenus et événements.
 */
public class Plateforme {
    private Map<String, Contenu> contenus;
    private Map<String, Evenement> evenements;

    public Plateforme() {
        this.contenus = new HashMap<>();
        this.evenements = new HashMap<>();
    }

    public void ajouterContenu(Contenu c) {
        contenus.put(c.getId(), c);
    }

    public void supprimerContenu(String id) {
        contenus.remove(id);
    }

    public Contenu chercherParId(String id) {
        return contenus.get(id);
    }

    public List<Contenu> chercherParTitre(String q) {
        String lower = q.toLowerCase();
        return contenus.values().stream()
                .filter(c -> c.getTitre().toLowerCase().contains(lower))
                .collect(Collectors.toList());
    }

    public List<Contenu> triParPopularite() {
        return contenus.values().stream()
                .sorted(Comparator.comparingInt(Contenu::calculerPopularite).reversed())
                .collect(Collectors.toList());
    }

    public void publierContenu(String id) {
        Contenu c = contenus.get(id);
        if (c != null) c.publier();
    }

    public void telechargerContenu(String id) throws ContenuNonDisponibleException, TelechargementImpossibleException {
        Contenu c = contenus.get(id);
        if (c == null) throw new ContenuNonDisponibleException("Contenu introuvable: " + id);
        if (!(c instanceof model.Telechargeable)) throw new TelechargementImpossibleException("Ce contenu n'est pas téléchargeable");
        try {
            ((model.Telechargeable)c).telecharger();
        } catch (TelechargementImpossibleException e) {
            throw e;
        }
    }

    public void ajouterEvenement(Evenement ev) throws EvenementDateException {
        // simple vérification de conflit : pas deux événements avec mêmes dates exactes
        for (Evenement e : evenements.values()) {
            if (e.getDateDebut().equals(ev.getDateDebut())) throw new EvenementDateException("Conflit de date");
        }
        evenements.put(ev.getId(), ev);
    }

    public List<Evenement> listerEvenements() {
        List<Evenement> l = new ArrayList<>(evenements.values());
        Collections.sort(l);
        return l;
    }
}
