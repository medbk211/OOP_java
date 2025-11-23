import model.*;
import exceptions.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Application minimale pour démonstration.
 */
public class App {
    public static void main(String[] args) {
        Plateforme pf = new Plateforme();

        Auteur a = new Auteur("auth1", "Lea Dubois", "Journaliste tech");
        Article art = new Article("Comprendre OOP", "Introduction avancée", "Le contenu de l'article...");
        Video vid = new Video("Tutoriel Java", "Vidéo sur Java", 600, "1080p");
        Podcast pod = new Podcast("Le podcast dev", "Discussion sur dev", 1800, "Host");

        pf.ajouterContenu(art);
        pf.ajouterContenu(vid);
        pf.ajouterContenu(pod);

        pf.publierContenu(art.getId());
        pf.publierContenu(vid.getId());
        // pod reste non publié pour tester exception

        art.aimer();
        art.aimer();
        vid.aimer();

        try {
            System.out.println(art.afficher());
            System.out.println(vid.afficher());
            // tenter d'afficher podcast non publié => exception
            System.out.println(pod.afficher());
        } catch (ContenuNonDisponibleException e) {
            System.err.println("Erreur affichage: " + e.getMessage());
        }

        try {
            pf.telechargerContenu(vid.getId());
            // tentative téléchargement podcast non publié -> exception
            pf.telechargerContenu(pod.getId());
        } catch (Exception e) {
            System.err.println("Erreur téléchargement: " + e.getMessage());
        }

        List<Contenu> top = pf.triParPopularite();
        System.out.println("Top contenus par popularité:");
        for (Contenu c : top) {
            System.out.println(" - " + c.toString() + " score=" + c.calculerPopularite());
        }

        // Evenement demo
        try {
            Evenement ev = new Evenement("ev1", "Webinaire OOP", "Session avancée", LocalDateTime.now().plusDays(7), LocalDateTime.now().plusDays(7).plusHours(2), 100);
            pf.ajouterEvenement(ev);
            System.out.println("Evenements:");
            for (Evenement e : pf.listerEvenements()) {
                System.out.println(" - " + e.getTitre());
            }
        } catch (EvenementDateException e) {
            System.err.println("Erreur événement: " + e.getMessage());
        }
    }
}
