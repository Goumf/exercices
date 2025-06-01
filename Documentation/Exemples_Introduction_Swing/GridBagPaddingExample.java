import javax.swing.*;
import java.awt.*;

public class GridBagPaddingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple ipadx / ipady");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        Container c = frame.getContentPane();
        c.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Premier bouton sans padding
        gbc.gridx = 0;
        gbc.gridy = 0;
        c.add(new JButton("Normal"), gbc);

        // Deuxième bouton avec padding interne
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 30;  // 30px horizontal de padding interne
        gbc.ipady = 10;  // 10px vertical
        c.add(new JButton("Avec Padding"), gbc);

        frame.setVisible(true);
    }
}
