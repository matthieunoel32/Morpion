import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class AfficherPlateau extends JFrame implements Observer {

    Plateau plateau;

    public AfficherPlateau(Plateau plateau){
        this.plateau = plateau;
        afficher();
        init(plateau.placerCase);
    }

    public void afficher(){
        this.setTitle("Morpion");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3,3));
        for(int i=0; i < plateau.listeCases.size(); i++){
            this.getContentPane().add(plateau.listeCases.get(i));
        }
        this.setVisible(true);
    }

    public void init(PlacerCase signal) {
        signal.addObserver(this);
    }


    @Override
    public void update(Observable observable, Object test) {
        revalidate();
        repaint();
    }
}
