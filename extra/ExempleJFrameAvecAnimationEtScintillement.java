// Tentative d'animation par it�ration d'affichage et effacement
// Effet de scintillement
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ExempleJFrameAvecAnimationEtScintillement extends JFrame {

    // Constantes pour la taille de la fenetre et du Bot
    private static final int LARGEURFENETRE = 400;
    private static final int HAUTEURFENETRE = 400;
    private static final int LARGEURBOT = LARGEURFENETRE/4;
    private static final int HAUTEURBOT = HAUTEURFENETRE/3;
    

    public ExempleJFrameAvecAnimationEtScintillement() {
        super("Exemple d'animation avec effacement : scintillement");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(LARGEURFENETRE,HAUTEURFENETRE);
        this.setVisible(true);
    }
   
    // Méthode qui dessine un Bot dans un objet Graphics g
    // à l'échelle dans un rectangle englobant de paramètres x,y,largeur,hauteur
    public void paintBot (Graphics g, int x, int y, int largeur, int hauteur) {
        g.setColor(Color.green);
        g.fillOval(x,y,largeur,hauteur/2); // La tête

        g.setColor(Color.black);
        g.fillRect(x+largeur/4,y+hauteur/8,largeur/10,hauteur/20); // L'oeil gauche
        g.fillRect(x+largeur*3/4-largeur/10,y+hauteur/8,largeur/10,hauteur/20); // L'oeil droit
        g.drawLine(x+largeur/4,y+hauteur*3/8,x+largeur*3/4,y+hauteur*3/8); // La bouche
        
        g.setColor(Color.red);
        g.fillRect(x,y+hauteur/2,largeur,hauteur/2); // Le corps
    }

    public void paint (Graphics g) {
        super.paint(g);
        for(int x=0; x<=LARGEURFENETRE-LARGEURBOT; x = x + 5){
            paintBot(g,x,HAUTEURFENETRE-2*HAUTEURBOT,LARGEURBOT,HAUTEURBOT);
            try {
                Thread.sleep(50);
            }
            catch(InterruptedException uneException){
                System.out.println(uneException.toString()); 
            }
            g.clearRect(x,HAUTEURFENETRE-2*HAUTEURBOT,LARGEURBOT,HAUTEURBOT);
        }
    }

    public static void main (String args[]) {
        new ExempleJFrameAvecAnimationEtScintillement();
    }
}
