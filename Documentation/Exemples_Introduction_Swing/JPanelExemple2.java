import java.awt.*;
import javax.swing.*;

public class  JPanelExemple2 {
  public JPanelExemple2() {
    JFrame fenetre = new JFrame(this.getClass().toString());                                  //titre 
    JPanel panneau1 = new JPanel();                                                      
    panneau1.setBackground(Color.BLACK);                                                      //couleur noir - additionnée à mon panneau 
    fenetre.getContentPane().add(panneau1);                                                    //j'ajoute 4 boutons
    for (int i=0; i<4; i++) {
      panneau1.add(new JButton("Bouton "+Integer.toString(i)));
    }
    JPanel panneau2 = new JPanel();                                                           // je crée un deuxième tableau rouge avec des dimensions données 
    panneau2.setBackground(Color.RED);
    panneau2.setPreferredSize(new Dimension(200,200));
    panneau1.add(panneau2);
    for (int i=0; i<5; i++) {                                                                 //ajout de 5 labels
      panneau2.add(new JLabel("Label "+Integer.toString(i)));
    }
    fenetre.pack();
    fenetre.setVisible(true);
  }
  public static void main(String []args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new JPanelExemple2();
        }
      });
  }
}
