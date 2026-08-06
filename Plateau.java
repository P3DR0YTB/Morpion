public class Plateau{
    private String[][] grille;

    public Plateau(){
        this.grille = new String[3][3];
        for(int l=0; l<grille.length;l++){
            for(int c=0; c < grille[l].length; c++){
                grille[l][c]="-";
            }
        }
    }
    public void afficher (){
System.out.println("\n     0     1     2  ");
    System.out.println("  +-----+-----+-----+");
    for (int l = 0; l < 3; l++) {
        System.out.println("  |     |     |     |");
        System.out.print(l + " ");
        for (int c = 0; c < 3; c++) {
            System.out.print("|  " + grille[l][c] + "  ");
        }
        System.out.println("|");
        System.out.println("  |     |     |     |");
        System.out.println("  +-----+-----+-----+");
    }
    }
    public boolean jouerUnCoup(int Ligne,int Colonne,String Symbole){
        if(Ligne<0 || Ligne>2){
            return false;
        }
        if (Colonne<0 || Colonne>2){
            return false;
        }
        if (!grille[Ligne][Colonne].equals("-")){
            return false;
        }
        
            grille[Ligne][Colonne]=Symbole;
            return true;
        
    }

    public boolean aGagne (String Symbole){
        for(int l=0;l<3;l++){
            if(grille[l][0].equals(Symbole)&&grille[l][1].equals(Symbole)&&grille[l][2].equals(Symbole)){
                return true;
            }
        }
        for(int c=0 ; c<3; c++){
            if(grille[0][c].equals(Symbole)&&grille[1][c].equals(Symbole)&&grille[2][c].equals(Symbole)){
                return true;
            }
        }
        if(grille[0][0].equals(Symbole)&&grille[1][1].equals(Symbole)&&grille[2][2].equals(Symbole)){
            return true;
        }
        if(grille[0][2].equals(Symbole)&&grille[1][1].equals(Symbole)&&grille[2][0].equals(Symbole)){
            return true;
        }
        else{
            return false;
        }
        
    }

    public boolean estPlein(){
        for(int l=0; l<grille.length; l++){
            for(int c=0; c<grille[l].length; c++){
                if(grille[l][c].equals("-")){
                    return false;
                }
            }
    }
    return true;



}
}