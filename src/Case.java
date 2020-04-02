import javax.swing.*;

public class Case extends JButton {
    public int x;
    public int y;

    public Case(int x, int y){
        super("");
        this.x =x;
        this.y = y;

    }

    public void setText(String texte){
        super.setText(texte);
    }
}
