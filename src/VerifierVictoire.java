import java.util.Observable;
import java.util.Observer;

public class VerifierVictoire implements Observer {
    Plateau plateau;

    public VerifierVictoire(Plateau plateau){
        this.plateau = plateau;
        init(plateau.placerCase);
        verifier();
    }

    public void verifier(){
        System.out.println("verifivation");
    }

    public void init(PlacerCase signal){
        signal.addObserver(this);
    }


    @Override
    public void update(Observable observable, Object test) {
        verifier();
    }
}
