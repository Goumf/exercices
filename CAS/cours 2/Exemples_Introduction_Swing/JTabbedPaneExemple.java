import java.awt.*;
import javax.swing.*;

public class  JTabbedPaneExemple {
  public static void addPanneau(JTabbedPane tp,String onglet,
                                String texte) {                                           //pour construire plusieurs onglets. J'ai un modèle qui me permet de créer des panneaux, qui sont tous les mêmes.
    JPanel panneau = new JPanel();
    JLabel etiquette = new JLabel("<html>"+texte+"</html>");                              // il suffit de créer un panneau pour ajouter un onglet 
    etiquette.setToolTipText(" Partout");
    tp.addTab(onglet,etiquette);
  }

  public JTabbedPaneExemple() {                                                            //le constructeur dans lequel il y a le JFrame que je crée
    JFrame fenetre = new JFrame(this.getClass().toString());   
    JTabbedPane panneau = new JTabbedPane();                                               //j'amène le JTAbbedpan et j'additionne un panneau qui englobe plusieurs panneux
    addPanneau(panneau,"n°1","Les bons crus font les bonnes cuites.");        //on peut lui donner un titre, un no etc
    addPanneau(panneau,"n°2","J’ai toujours été surpris qu’un record battu ne se soit jamais plaint.");
    addPanneau(panneau,"n°3","Rien ne sert de penser, il faut réfléchir avant.");
    fenetre.getContentPane().add(panneau);
    fenetre.pack();
    fenetre.setVisible(true);

  }
  public static void main(String []args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new JTabbedPaneExemple();
        }
      });
  }
}
