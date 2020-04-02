import java.util.ArrayList;

public class Plateau {
    public ArrayList<Case> listeCases;
    public String joueur1;
    public String joueur2;
    public String joueuractuel;
    public PlacerCase placerCase;
    public VerifierVictoire verifierVictoire;

    public Plateau(){
        listeCases = new ArrayList<Case>();
        joueur1 = "Joueur 1";
        joueur2 = "Joueur 2";
        joueuractuel = joueur1;
        placerCase = new PlacerCase(this);
        creerCases();
        VerifierVictoire verifierVictoire = new VerifierVictoire(this);
    }

    void creerCases(){
        for(int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                Case case1 = new Case(x,y);
                case1.addActionListener(placerCase);
                listeCases.add(case1);
            }
        }
    }
}
