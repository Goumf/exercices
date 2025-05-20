import javax.swing.*;

public class JFrameExemple{
	
	
	
    
    public static void main(String []argv) {
	//SwingUtilities.invokeLater(new JFrameExemple());
      SwingUtilities.invokeLater(() -> {
            // Création de la fenêtre
            JFrame maJFrame = new JFrame("Me voici!");
            
            // Définir la taille de la fenêtre
            maJFrame.setSize(400, 300);
            
            // Fermer l'application quand on clique sur la croix
            maJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Centrer la fenêtre à l'écran
            maJFrame.setLocationRelativeTo(null);
            
            // Rendre la fenêtre visible
            maJFrame.setVisible(true);
        });
    }	
    
}