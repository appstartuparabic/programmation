/*
 * Exercice : dessiner plusieurs bonhommes avec sous-classes
 */

package LivreJava;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PlusieursObjetsSousClasses extends JFrame {

    public PlusieursObjetsSousClasses() {
        super("Exemple avec trois classes indépendantes");
    }
   
    public void paint (Graphics g) {
        Keny unBonhommeKeny = new Keny(100,100,100,200);
        unBonhommeKeny.paint(g);
        unBonhommeKeny.setX(50);
        unBonhommeKeny.setY(50);
        unBonhommeKeny.setLargeur(50);
        unBonhommeKeny.setHauteur(100);
        unBonhommeKeny.paint(g);
        unBonhommeKeny.setX(30);
        unBonhommeKeny.setY(30);
        unBonhommeKeny.setLargeur(10);
        unBonhommeKeny.setHauteur(20);
        unBonhommeKeny.paint(g);
        
        Bot unBonhommeBot = new Bot(200,200,10,20);
        unBonhommeBot.paint(g);
        unBonhommeBot.setX(150);
        unBonhommeBot.setY(400);
        unBonhommeBot.setLargeur(15);
        unBonhommeBot.setHauteur(30);
        unBonhommeBot.paint(g);
        unBonhommeBot.setX(300);
        unBonhommeBot.setY(50);
        unBonhommeBot.setLargeur(40);
        unBonhommeBot.setHauteur(80);
        unBonhommeBot.paint(g);
        
        Iti unBonhommeIti = new Iti(150,200,40,80);
        unBonhommeIti.paint(g);
        unBonhommeIti.setX(50);
        unBonhommeIti.setY(350);
        unBonhommeIti.setLargeur(100);
        unBonhommeIti.setHauteur(200);
        unBonhommeIti.paint(g);
        unBonhommeIti.setX(300);
        unBonhommeIti.setY(300);
        unBonhommeIti.setLargeur(60);
        unBonhommeIti.setHauteur(120);
        unBonhommeIti.paint(g);

    }

    public static void main (String args[]) {
        PlusieursObjetsSousClasses leFrame =  new PlusieursObjetsSousClasses();
        leFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leFrame.setSize(400,600);
        leFrame.setVisible(true);
    }
}