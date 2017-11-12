// Monde � animer
import java.awt.*;
public class MondeAnime {
    // Taille du monde
    public static int LARGEURMONDE = 400;
    public static int HAUTEURMONDE = 400;
    // Entit�s du monde � animer
    private BotSCEntiteRebondissante bot1 = new BotSCEntiteRebondissante(0,100,100,150,5,0);
    private BotSCEntiteRebondissante bot2 = new BotSCEntiteRebondissante(100,100,75,100,-10,5);
    private ItiSCEntiteRebondissante iti1 = new ItiSCEntiteRebondissante(200,300,80,80,6,6);
    private ItiSCEntiteRebondissante iti2 = new ItiSCEntiteRebondissante(200,0,50,50,0,10);

    public MondeAnime() {
    // Initialise les entit�s � animer pour la premi�re sc�ne
      bot1 = new BotSCEntiteRebondissante(0,100,100,150,5,0);
      bot2 = new BotSCEntiteRebondissante(100,100,75,100,-10,5);
      iti1 = new ItiSCEntiteRebondissante(200,300,80,80,6,6);
      iti2 = new ItiSCEntiteRebondissante(200,0,50,50,0,10);      
    }
    public void prochaineScene(){
        // Modifie les entit�s � animer pour la prochaine sc�ne
        bot1.deplacer(LARGEURMONDE, HAUTEURMONDE); 
        bot2.deplacer(LARGEURMONDE, HAUTEURMONDE); 
        iti1.deplacer(LARGEURMONDE, HAUTEURMONDE); 
        iti2.deplacer(LARGEURMONDE, HAUTEURMONDE);
    }
    public void paint(Graphics g){
        // Dessine la sc�ne
        bot1.paint(g); bot2.paint(g); iti1.paint(g); iti2.paint(g);
    }
}