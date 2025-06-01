import java.awt.*;
import javax.swing.*;

public class  JScrollPaneExemple {
  public JScrollPaneExemple() {
    JFrame fenetre = new JFrame(this.getClass().toString());                             //Frame
    Icon jardin = new ImageIcon("rasta_lion_wallpapers_2.jpg");
    JLabel image = new JLabel(jardin);                                                   //dans le scroll, on a mis un label qui contient l'image
    JScrollPane panneau = new JScrollPane(image);
    fenetre.getContentPane().add(panneau);
    panneau.setPreferredSize(new Dimension(200,200));
    fenetre.pack();
    fenetre.setVisible(true);
  }
  public static void main(String []args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new JScrollPaneExemple();
        }
      });
  }
}
