public class Ecran {
    public void afficherEcranAccueil() {
    System.out.println("======================================================================");
    System.out.println("  __  __  ____  _____  _____ _____  ____  _   _ ");
    System.out.println(" |  \\/  |/ __ \\|  __ \\|  __ \\_   _|/ __ \\| \\ | |");
    System.out.println(" | \\  / | |  | | |__) | |__) || | | |  | |  \\| |");
    System.out.println(" | |\\/| | |  | |  _  /|  ___/ | | | |  | | . ` |");
    System.out.println(" | |  | | |__| | | \\ \\| |    _| |_| |__| | |\\  |");
    System.out.println(" |_|  |_|\\____/|_|  \\_\\_|   |_____|\\____/|_| \\_|");
    System.out.println("                                                ");
    System.out.println("======================================================================");
    System.out.println("               Bienvenue dans le jeu du Morpion by Pierre Bouteloup !                  ");
    System.out.println("======================================================================\n");
}

public void afficherEcranVictoire(Joueur joueur) {
    System.out.println("\n======================================================================");
    System.out.println(" __     _____ _____ _______ ____ _____ _____  ______ ");
    System.out.println(" \\ \\   / /_ _/ ____|__   __/ __ \\_   _|  __ \\|  ____|");
    System.out.println("  \\ \\_/ / | | |       | | | |  | || | | |__) | |__   ");
    System.out.println("   \\   /  | | |       | | | |  | || | |  _  /|  __|  ");
    System.out.println("    | |  _| |_|____   | | | |__| || |_| | \\ \\| |____ ");
    System.out.println("    |_| |_____\\_____| |_|  \\____/|_____|_|  \\_\\______|");
    System.out.println("                                                      ");
    System.out.println("======================================================================");
    System.out.println("       FÉLICITATIONS " + joueur.getNom().toUpperCase() + " ! TU AS REMPORTÉ LA PARTIE !");
    System.out.println("======================================================================\n");
}
public void afficherEcranDefaite(Joueur joueur) {
    System.out.println("\n======================================================================");
    System.out.println("  _____  ______ _____  ______   _______ ______ ");
    System.out.println(" |  __ \\|  ____|  __ \\|  ____| / /  ___|  ____|");
    System.out.println(" | |  | | |__  | |__) | |__   / /| |_  | |__   ");
    System.out.println(" | |  | |  __| |  _  /|  __| / / |  _| |  __|  ");
    System.out.println(" | |__| | |____| | \\ \\| |___/ /  | |   | |____ ");
    System.out.println(" |_____/|______|_|  \\_\\______/_/   |_|   |______|");
    System.out.println("                                               ");
    System.out.println("======================================================================");
    System.out.println("       DOMMAGE " + joueur.getNom().toUpperCase() + " ! TU AS PERDU LA PARTIE...");
    System.out.println("======================================================================\n");
}

public void afficherEcranEgalite() {
    System.out.println("\n======================================================================");
    System.out.println("  ______ _____            _     _____ _______ ______ ");
    System.out.println(" |  ____/ ____|  /\\      | |   |_   _|__   __|  ____|");
    System.out.println(" | |__ | |  __  /  \\     | |     | |    | |  | |__   ");
    System.out.println(" |  __|| | |_ |/ /\\ \\    | |     | |    | |  |  __|  ");
    System.out.println(" | |___| |__| / ____ \\   | |____ _| |_   | |  | |____ ");
    System.out.println(" |______\\_____/_/    \\_\\  |______|_____|  |_|  |______|");
    System.out.println("                                                      ");
    System.out.println("======================================================================");
    System.out.println("                 MATCH NUL ! PERSONNE N'A GAGNÉ.                  ");
    System.out.println("======================================================================\n");
}
}
