import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;

public class GroupLayoutExemple implements Runnable {

  // Tableau de chaînes représentant les labels des boutons (3 lignes × 4 colonnes)
  static private String[][] s = {
    { "Haricot", "Salade", "Petit pois", "Carotte" },
    { "Roquefort", "Fourme d'ambert", "Bleu d'auvergne", "Carotte" },
    { "Filet", "Macreuse", "Araignée", "Carotte" }
  };

  public void run() {
    // Création de la fenêtre principale
    JFrame fenetre = new JFrame(this.getClass().toString());

    // Récupération du conteneur de la fenêtre
    Container c = fenetre.getContentPane();

    // Définition du layout : GroupLayout permet d'organiser les composants en groupes parallèles/séquentiels
    GroupLayout groupLayout = new GroupLayout(c);
    c.setLayout(groupLayout);

    // Création d'un tableau de boutons basé sur le tableau de chaînes `s`
    JButton[][] b = new JButton[s.length][s[0].length];
    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < s[i].length; j++) {
        b[i][j] = new JButton(s[i][j]); // Création du bouton avec texte
      }
    }

    // ---------------------------
    // Configuration du layout HORIZONTAL
    // ---------------------------

    // Groupe horizontal principal : une suite de colonnes
    SequentialGroup hsg = groupLayout.createSequentialGroup();

    for (int i = 0; i < s.length; i++) {
      // Chaque colonne est un groupe parallèle (les boutons sont empilés verticalement dans cette colonne)
      ParallelGroup pg = groupLayout.createParallelGroup();
      for (int j = 0; j < s[i].length; j++) {
        pg.addComponent(b[i][j]); // Ajout de chaque bouton de la ligne
      }
      hsg.addGroup(pg); // Ajout de cette colonne au groupe horizontal
    }

    // Appliquer ce groupe horizontal au layout
    groupLayout.setHorizontalGroup(hsg);

    // ---------------------------
    // Configuration du layout VERTICAL
    // ---------------------------

    // Groupe vertical principal : une suite de lignes
    SequentialGroup vsg = groupLayout.createSequentialGroup();

    for (int j = 0; j < s[0].length; j++) {
      // Chaque ligne est un groupe parallèle (les boutons sont alignés horizontalement dans cette ligne)
      ParallelGroup pg = groupLayout.createParallelGroup();
      for (int i = 0; i < s.length; i++) {
        pg.addComponent(b[i][j]); // Ajout de chaque bouton de la colonne
      }
      vsg.addGroup(pg); // Ajout de cette ligne au groupe vertical
    }

    // Appliquer ce groupe vertical au layout
    groupLayout.setVerticalGroup(vsg);

    // Ajustement automatique de la taille de la fenêtre selon les composants
    fenetre.pack();

    // Affichage de la fenêtre
    fenetre.setVisible(true);
  }

  public static void main(String[] argv) {
    // Lancement de l'interface graphique dans le thread dédié (bonnes pratiques Swing)
    SwingUtilities.invokeLater(new GroupLayoutExemple());
  }
}
