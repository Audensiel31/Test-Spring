# Présentation

Le but de l'exercice est l'implémentation d'un petit back-end avec Spring boot.

On partira d'un contexte simple qui est la gestion d'une liste d'élève et de leurs notes.

# Les règles métiers :
* Un élève peut avoir 0..n notes.
* Une note est forcément rattachée à un élève.
* Tous les autres champs sont obligatoires.
* Une note est entre 0 et 20.

# Le but du jeux
* Développer à partir des objets Eleve et Note un CRUD en REST (compléter les classes).
* Implémenter le service IEleveService (des services et méthodes supplémentaires peuvent être ajoutés).
* Faire en sorte que les tests unitaires fournis passent (ne rien toucher autre que les TODO) et en rajouter de sorte que les services soient couverts à 100% (pas la peine de tester le REST).
* Les jeux de données des deux tests fournis ne doivent pas être modifiés.
* Aucune exception (non custom) ne doit pouvoir être levée.
* Garantir l'intégrité des données en toute circonstance.
* Faire l'application la plus performante possible.
* Vous pouvez utiliser les librairies de votre choix.

Que la Force soit avec vous!
