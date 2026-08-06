import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

    boolean rejouer = true;
    Scanner scanner = new Scanner (System.in);
do{
    Joueur J1 = new Joueur("Pierre","X");
    Joueur J2 = new Joueur("IA", "0");
    Joueur joueurActuel = J1;

    Plateau plateau = new Plateau();
    Ecran ecran = new Ecran();
    ecran.afficherEcranAccueil();
    boolean partieFinie = false;

while(!partieFinie){
    int ligne = -1;
    int colonne = -1;
    System.out.println(joueurActuel.getNom()    +" à toi de jouer");
    System.out.println("Entrez la ligne 0,1 ou 2");
    ligne = scanner.nextInt();
    System.out.println("Entrez la colonne 0,1 ou 2");
    colonne = scanner.nextInt();
    boolean coupValide = plateau.jouerUnCoup(ligne, colonne, joueurActuel.getSymbole());
    plateau.afficher();
    if(coupValide){
        if (plateau.estPlein()){
            plateau.afficher();
            System.out.println("Match nul ! Le plateau est plein.");
            partieFinie = true;
            ecran.afficherEcranEgalite();
        }

        if (plateau.aGagne(joueurActuel.getSymbole())){
        System.out.println("Félicitations " + joueurActuel.getNom() + " ! Tu as gagné !");
        partieFinie = true;
        ecran.afficherEcranVictoire(joueurActuel);

        }
    else {
        if (joueurActuel == J1) {
            joueurActuel = J2;
        } else {
            joueurActuel = J1;
        }
    }
} else {
    System.out.println("Coup invalide ou case occupée, réessaie !");
}
    //plateau.afficher();
    }
System.out.println("Appuie sur [R] pour Recommencer une partie ou [Q] pour Quitter :");
            
            scanner.nextLine(); // Nettoie le retour à la ligne restant en mémoire après scanner.nextInt()
            String choix = scanner.nextLine().trim();

            if (!choix.equalsIgnoreCase("R")) {
                rejouer = false; // Si le joueur ne retape pas "R" ou "r", on sort de la boucle
            }

         } while (rejouer);

        System.out.println("\nMerci d'avoir joué ! À bientôt !");
        scanner.close();



}






}

