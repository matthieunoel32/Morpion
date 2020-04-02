public class Morpion {
        AfficherPlateau afficherPlateau;
        Plateau plateau;

        public Morpion(){
            plateau = new Plateau();
            afficherPlateau = new AfficherPlateau(plateau);
        }

        public static void main (String args[]) {
            Morpion morpion = new Morpion();
        }



}
