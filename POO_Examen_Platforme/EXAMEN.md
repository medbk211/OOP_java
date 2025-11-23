# Examen — Programmation Orientée Objet (Java) — Plateforme Multimédia

## Contexte (à lire attentivement)
Une plateforme en ligne publie et organise des contenus multimédias : articles, vidéos, podcasts, et organise également des événements (webinaires, tables rondes). Chaque contenu est créé par un auteur. Certaines vidéos et podcasts peuvent être téléchargés.

Vous devrez concevoir UML, implémenter les classes Java, gérer les exceptions métier, et proposer une mini-application démonstrative.

---

## Classes demandées (description synthétique)
- `Auteur` : informations sur l'auteur (nom, bio, listes de contenus publiés).
- `Contenu` (abstraite) : propriétés communes (id, titre, description, datePublication, visible, likes, vues). Méthodes abstraites/communes : afficher(), publier(), cacher(), aimer(), calculerPopularite().
- `Article` : extends `Contenu` — champs spécifiques : texte, nbMots.
- `Video` : extends `Contenu`, implements `Telechargeable` — champs : duree, resolution, nbTelechargements.
- `Podcast` : extends `Contenu`, implements `Telechargeable` — champs : duree, hote, nbTelechargements.
- `Telechargeable` (interface) : méthode `telecharger()` qui peut lancer `TelechargementImpossibleException`.
- `Evenement` : champs (id, titre, description, dateDebut, dateFin, lieux, capacite, participants). Implémente `Comparable<Evenement>` (compareTo par dateDebut ou popularité).
- `Plateforme` : gère listes de contenus et d'événements. Méthodes : ajouterContenu(), supprimerContenu(), chercherParTitre(), triParPopularite(), triParDate(), ajouterEvenement(), inscrireParticipant(), etc.

---

## Exceptions personnalisées
- `ContenuNonDisponibleException` : levée si on tente d'afficher/télécharger un contenu non publié ou masqué.
- `TelechargementImpossibleException` : levée si le contenu n'est pas téléchargeable ou si autre contrainte empêche le téléchargement.
- `EvenementDateException` : levée si les dates d'un événement sont invalides (dateFin < dateDebut) ou en conflit avec les règles.

---

## Méthodes (à documenter dans votre README et à implémenter)
Pour chaque méthode ci-dessous, dans votre examen vous devrez expliquer :
- Le rôle fonctionnel
- Les paramètres et valeurs de retour
- Les exceptions levées et pourquoi
- Les invariants ou préconditions/postconditions importantes

Liste (non exhaustive — à compléter) :
- `Contenu#publier()` : rend visible le contenu, fixe la datePublication.
- `Contenu#cacher()` : rend le contenu non visible.
- `Contenu#afficher()` : retourne une représentation (ou affiche) le contenu — lance `ContenuNonDisponibleException` si pas publié.
- `Contenu#aimer()` : incrémente compteur de likes.
- `Contenu#calculerPopularite()` : formule de popularité (exemple : `likes * 3 + vues * 1 + nbTelechargements * 2`), override possible.
- `Telechargeable#telecharger()` : effectue un comptage + retourne un flux simulé ou path ; peut lancer `TelechargementImpossibleException`.
- `Evenement#compareTo(Evenement e)` : compare par dateDebut (prim) puis par popularité (second).
- `Plateforme#ajouterContenu(Contenu c)` : validation puis ajout.
- `Plateforme#triParPopularite()` : retourne une liste triée des contenus par `calculerPopularite()`.
- `Plateforme#chercherParTitre(String titre)` : recherche floue / contains.
- `Plateforme#ajouterEvenement(Evenement ev)` : vérifie cohérence des dates, capacité.
- `Plateforme#inscrireParticipant(Evenement ev, String participant)` : gestion des inscriptions, exceptions si complet.
