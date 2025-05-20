import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoSwingUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DemoSwingUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Démo Interface Utilisateur - Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Menu
        JMenuBar menuBar = new JMenuBar();
		
        JMenu menuFichier = new JMenu("Fichier");
        JMenuItem itemQuitter = new JMenuItem("Quitter");
        itemQuitter.addActionListener(e -> System.exit(0));
        menuFichier.add(itemQuitter);
        menuBar.add(menuFichier);

        JMenu menuAide = new JMenu("Aide");
        JMenuItem itemAPropos = new JMenuItem("À propos");
        itemAPropos.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Démo Swing complète", "À propos", JOptionPane.INFORMATION_MESSAGE));
        menuAide.add(itemAPropos);
        menuBar.add(menuAide);

        frame.setJMenuBar(menuBar);

        JToolBar toolBar = new JToolBar();
        JButton outil1 = new JButton("🔄 Rafraîchir");
		
        outil1.setToolTipText("Rafraîchir les données");
        outil1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Données rafraîchies !"));
        toolBar.add(outil1);
        
        JButton outil2 = new JButton("💾 Sauvegarder");
        outil2.setToolTipText("Sauvegarder les informations");
        outil2.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Données sauvegardées !"));
        toolBar.add(outil2);

        frame.add(toolBar, BorderLayout.NORTH);

        JTabbedPane onglets = new JTabbedPane();

        onglets.addTab("FlowLayout", createFlowLayoutPanel());
        onglets.addTab("BorderLayout", createBorderLayoutPanel());
        onglets.addTab("GridLayout", createGridLayoutPanel());
        onglets.addTab("BoxLayout", createBoxLayoutPanel());
        onglets.addTab("Formulaire", createFormPanel());
        onglets.addTab("Tableau", createTablePanel());
        onglets.addTab("CardLayout", createCardLayoutPanel());
        onglets.addTab("Dessin", createDrawingPanel());

        frame.add(onglets, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static JPanel createFlowLayoutPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        JButton btn = new JButton("Clique-moi");
        btn.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Bouton cliqué!"));
        panel.add(new JButton("Bouton 1"));
        panel.add(btn);
        panel.add(new JButton("Bouton 3"));
        return panel;
    }

    private static JPanel createBorderLayoutPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JButton("Nord"), BorderLayout.NORTH);
        panel.add(new JButton("Sud"), BorderLayout.SOUTH);
        panel.add(new JButton("Est"), BorderLayout.EAST);
        panel.add(new JButton("Ouest"), BorderLayout.WEST);
        panel.add(new JButton("Centre"), BorderLayout.CENTER);
        return panel;
    }

    private static JPanel createGridLayoutPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 3));
        for (int i = 1; i <= 6; i++) {
            panel.add(new JButton("Bouton " + i));
        }
        return panel;
    }

    private static JPanel createBoxLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Nom:"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("Mot de passe:"));
        panel.add(new JPasswordField(15));
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(new JButton("Connexion"));
        return panel;
    }

    private static JPanel createFormPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        String[] labels = {"Nom:", "Prénom:", "Email:", "Pays:"};
        String[] values = {"", "", "", "France"};
        JTextField[] fields = new JTextField[labels.length];

        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            panel.add(new JLabel(labels[i]), gbc);
            gbc.gridx = 1;
            fields[i] = new JTextField(values[i], 15);
            panel.add(fields[i], gbc);
        }

        gbc.gridx = 0;
        gbc.gridy = labels.length;
        gbc.gridwidth = 2;
        JButton btnEnvoyer = new JButton("Envoyer");
        btnEnvoyer.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Formulaire envoyé !"));
        panel.add(btnEnvoyer, gbc);
        return panel;
    }

    private static JPanel createTablePanel() {
        String[] colonnes = {"Nom", "Prénom", "Âge"};
        Object[][] donnees = {
                {"Durand", "Paul", 34},
                {"Dupont", "Marie", 28},
                {"Lemoine", "Jean", 45}
        };
        JTable table = new JTable(donnees, colonnes);
        return new JPanel(new BorderLayout()) {{
            add(new JScrollPane(table), BorderLayout.CENTER);
        }};
    }

    private static JPanel createCardLayoutPanel() {
        JPanel cards = new JPanel(new CardLayout());
        String[] noms = {"Carte 1", "Carte 2", "Carte 3"};

        for (String nom : noms) {
            JPanel card = new JPanel();
            card.add(new JLabel(nom));
            cards.add(card, nom);
        }

        JComboBox<String> combo = new JComboBox<>(noms);
        combo.addActionListener(e -> {
            CardLayout cl = (CardLayout) cards.getLayout();
            cl.show(cards, (String) combo.getSelectedItem());
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(combo, BorderLayout.NORTH);
        panel.add(cards, BorderLayout.CENTER);
        return panel;
    }

    private static JPanel createDrawingPanel() {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(50, 50, 100, 100);
                g.setColor(Color.RED);
                g.drawString("Zone de dessin", 60, 40);
            }
        };
    }
}
