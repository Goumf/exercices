import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ExempleActionPartagee extends JFrame {

    public ExempleActionPartagee() {
        super("Exemple Action partagée");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new FlowLayout());

        // Création de l'action
        Action sauvegarderAction = new AbstractAction("Sauvegarder", new ImageIcon(("save.gif"))) {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Fichier sauvegardé !");
            }
        };

        // Définir des propriétés
        sauvegarderAction.putValue(Action.SHORT_DESCRIPTION, "Enregistrer le fichier");
        sauvegarderAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        // Bouton avec l'action
        JButton btnSave = new JButton(sauvegarderAction);
        getContentPane().add(btnSave);

        // Barre de menus
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFichier = new JMenu("Fichier");
        JMenuItem itemSave = new JMenuItem(sauvegarderAction);
        menuFichier.add(itemSave);
        menuBar.add(menuFichier);
        setJMenuBar(menuBar);

        // Raccourci clavier global
        JRootPane root = getRootPane();
        root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put((KeyStroke) sauvegarderAction.getValue(Action.ACCELERATOR_KEY), "save");
        root.getActionMap().put("save", sauvegarderAction);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ExempleActionPartagee().setVisible(true));
    }
}
