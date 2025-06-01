import java.awt.*;
import javax.swing.*;

public class  JPanelExemple {                                                //
  public JPanelExemple() {
    JFrame fenetre = new JFrame(this.getClass().toString());                 //pour donner un titre, avec les guillemets, on peut mettre n'importe quoi .là il reprend le nom de la classe comme titre
    JPanel panneau = new JPanel();panneau.setBackground(Color.yellow);       // pour donner un font jaune 
    fenetre.getContentPane().add(panneau);
	
    for (int i=0; i<4; i++) {                                               //je construit 4 boutons dans le Pannel et qui seront dans la fenêtre
      panneau.add(new JButton("Bouton "+Integer.toString(i)));              // Jpannel règle par défaut Flowlayout de gauche à droite de haut en bas, si il y a de la place 
    }                                                                        //JFrame règle par défaut = BorderLayout on peut changer avec SetLayout
	
	 
    fenetre.pack();                                                         //
    fenetre.setVisible(true);                                             //visible, sinon c'est masqué
  }
  public static void main(String []args) {
    SwingUtilities.invokeLater(new Runnable() {                             //on attend 
        public void run() {
          new JPanelExemple();
        }
      });
  }
}
