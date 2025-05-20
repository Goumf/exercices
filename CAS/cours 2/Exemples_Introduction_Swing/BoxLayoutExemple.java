import javax.swing.*;
import java.awt.*;

public class BoxLayoutExemple implements  Runnable {
  public void run() {
    JFrame fenetre = new JFrame(this.getClass().toString());
    fenetre.getContentPane().setLayout(new BoxLayout(fenetre.getContentPane(),
                                                     BoxLayout.Y_AXIS));                   //la je lui dis d'aligner par Y
    for (int i=0; i<10; i++) {
      JButton b = new JButton("Bouton "+i);
      fenetre.getContentPane().add(b);
    }
    fenetre.pack(); // rangement «optimal»
    fenetre.setVisible(true);
  }
  public static void main(String []argv) {
    SwingUtilities.invokeLater(new BoxLayoutExemple());	
  }
}
