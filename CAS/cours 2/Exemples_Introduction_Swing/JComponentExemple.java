import java.awt.*;
import javax.swing.*;

public class  JComponentExemple {
  public JComponentExemple() {
    JFrame fenetre = new JFrame(this.getClass().toString());
    JLabel etiquette = new JLabel("<html>Blablabla Blabla .</html>");
    etiquette.setOpaque(true);
    etiquette.setBackground(Color.YELLOW);
    etiquette.setForeground(Color.BLUE);
    etiquette.setFont(Font.decode("Times-36"));
    etiquette.setToolTipText("texte de Pierre Dac ou de sa sœur personne ne sait vraiment…");
    fenetre.getContentPane().add(etiquette);
    fenetre.pack();
    fenetre.setVisible(true);
  }
  public static void main(String []args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new JComponentExemple();
        }
      });
  }
}
