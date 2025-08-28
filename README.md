Jeu de la Vie - Implémentation Java
Implémentation console du célèbre automate cellulaire "Jeu de la Vie" de John Conway.

Règles du jeu
Toute cellule vivante ayant deux ou trois voisins vivants reste vivante à la génération suivante
Toute cellule vide ayant exactement trois voisins vivants devient vivante à la génération suivante
Toute autre cellule meurt ou reste morte
Comment exécuter
Compiler le programme :
javac JeuDeLaVie.java

2. Compiler le programme :
```bash
java JeuDeLaVie



opened@opened-ThinkPad-T470s-W10DG:~$ touch JeuDeLaVie.java
opened@opened-ThinkPad-T470s-W10DG:~$ cat JeuDeLaVie.java
opened@opened-ThinkPad-T470s-W10DG:~$ javac JeuDeLaVie.java
opened@opened-ThinkPad-T470s-W10DG:~$ java JeuDeLaVie
État actuel de la grille:
■ ■ ■ ■ □ 
□ □ ■ □ □ 
■ □ □ ■ □ 
■ □ □ ■ □ 
□ ■ ■ □ ■ 

Génération 1
État actuel de la grille:
□ ■ ■ ■ □ 
■ □ □ □ □ 
□ ■ ■ ■ □ 
■ □ □ ■ ■ 
□ ■ ■ ■ □ 

Génération 2
État actuel de la grille:
□ ■ ■ □ □ 
■ □ □ □ □ 
■ ■ ■ ■ ■ 
■ □ □ □ ■ 
□ ■ ■ ■ ■ 

Génération 3
État actuel de la grille:
□ ■ □ □ □ 
■ □ □ □ □ 
■ □ ■ ■ ■ 
■ □ □ □ □ 
□ ■ ■ ■ ■ 

Génération 4
État actuel de la grille:
□ □ □ □ □ 
■ □ ■ ■ □ 
■ □ □ ■ □ 
■ □ □ □ □ 
□ ■ ■ ■ □ 

Génération 5
État actuel de la grille:
□ □ □ □ □ 
□ ■ ■ ■ □ 
■ □ ■ ■ □ 
■ □ □ ■ □ 
□ ■ ■ □ □ 

Génération 6
État actuel de la grille:
□ □ ■ □ □ 
□ ■ □ ■ □ 
■ □ □ □ ■ 
■ □ □ ■ □ 
□ ■ ■ □ □ 

Génération 7
État actuel de la grille:
□ □ ■ □ □ 
□ ■ ■ ■ □ 
■ ■ ■ ■ ■ 
■ □ ■ ■ □ 
□ ■ ■ □ □ 

Génération 8
État actuel de la grille:
□ ■ ■ ■ □ 
■ □ □ □ ■ 
■ □ □ □ ■ 
■ □ □ □ ■ 
□ ■ ■ ■ □ 

Génération 9
État actuel de la grille:
□ ■ ■ ■ □ 
■ □ ■ □ ■ 
■ ■ □ ■ ■ 
■ □ ■ □ ■ 
□ ■ ■ ■ □ 

Génération 10
État actuel de la grille:
□ ■ ■ ■ □ 
■ □ □ □ ■ 
■ □ □ □ ■ 
■ □ □ □ ■ 
□ ■ ■ ■ □ 


Explication du code
Initialisation : La grille est initialisée avec un état aléatoire (cellules vivantes ou mortes).

Affichage : La méthode printGrid() affiche la grille actuelle en utilisant des caractères pour représenter les cellules vivantes (■) et mortes (□).

Calcul des voisins : La méthode countLiveNeighbors() compte le nombre de cellules vivantes autour de chaque cellule.

Règles du jeu : La méthode nextGeneration() applique les règles du Jeu de la Vie pour déterminer l'état de chaque cellule à la génération suivante.

Simulation : Le programme principal simule 10 générations avec une pause d'une seconde entre chaque génération.

