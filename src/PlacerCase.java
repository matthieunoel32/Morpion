import java.awt.event.*;
import java.util.Observable;

public class PlacerCase extends Observable implements ActionListener {
    Plateau plateau;

    public PlacerCase(Plateau plateau){
        this.plateau = plateau;
    }

    public void actionPerformed(ActionEvent e){
        if(plateau.joueuractuel == plateau.joueur1){
            ((Case)e.getSource()).setText("X");
            plateau.joueuractuel = plateau.joueur2;
        }else {
            ((Case)e.getSource()).setText("O");
            plateau.joueuractuel = plateau.joueur1;
        }
        setChanged();
        notifyObservers(this.plateau);
    }
}
