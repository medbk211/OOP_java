# Examen — Programmation Orientée Objet en Java (Avancé)

## Contexte
Vous êtes chargé(e) de concevoir et d’implémenter une **plateforme de contenus multimédias** qui gère :
- **Contenus** : `Article`, `Video`, `Podcast` (héritent d'une classe abstraite `Contenu`; certains contenus sont téléchargeables).
- **Événements** : `Evenement` (ex : webinaires, rencontres), triables par date/popularité.
- **Acteurs** : `Auteur`.
- **Fonctionnalités** : publier/cacher/afficher, aimer, télécharger, calculer popularité, recherche, tri, gestion des exceptions.

---

## Objectifs de l’examen
1. Concevoir les diagrammes UML (classes, cas d'utilisation, séquence).
2. Décrire le rôle de chaque méthode et ses invariants.
3. Implémenter l’ensemble des classes Java fournies.
4. Implémenter des exceptions personnalisées et leur gestion.
5. (Bonus) Créer une mini-application fonctionnelle `Plateforme` avec CLI minimale pour tester les fonctionnalités.

---

## Structure recommandée du projet
```
POO_Examen_Platforme/
├─ README.md
├─ EXAMEN.md               # Consignes de l'examen pour l'étudiant
├─ UML/
│  ├─ ClassDiagram.png
│  ├─ UseCaseDiagram.png
│  └─ SequenceDiagram.png
└─ src/
   ├─ App.java
   ├─ model/
   │  ├─ Auteur.java
   │  ├─ Contenu.java
   │  ├─ Article.java
   │  ├─ Video.java
   │  ├─ Podcast.java
   │  ├─ Evenement.java
   │  ├─ Plateforme.java
   │  └─ Telechargeable.java
   └─ exceptions/
      ├─ ContenuNonDisponibleException.java
      ├─ TelechargementImpossibleException.java
      └─ EvenementDateException.java
```

---

## Notes importantes pour l'étudiant
- **Langage** : Java 11+ recommandé.
- **Packaging** : Gardez les packages `model` et `exceptions`.
- **Tests** : Écrire quelques scénarios manuels dans `App.java` pour démontrer publier, aimer, télécharger, tri, et gestion d'exception.
- **UML** : Les images fournies sont des *placeholders* — dessinez les diagrammes sur papier ou avec un outil UML et remplacez les PNG.

---

## Règles d'évaluation (suggestion)
- Diagrammes UML : 25 pts
- Description des méthodes : 15 pts
- Qualité du code & commentaires : 20 pts
- Gestion des exceptions : 10 pts
- Fonctionnalité de la Plateforme (mini-projet) : 20 pts
- Bonus (interface utilisateur, tests automatisés) : 10 pts

Bonne chance !
