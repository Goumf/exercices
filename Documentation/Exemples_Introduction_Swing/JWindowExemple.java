import javax.swing.*;

public class JWindowExemple  implements Runnable {    //elle a fait un runnable et elle lance tout depuis là. 
    public void run() {
	JWindow maJWindow = new JWindow();
	maJWindow.setSize(500,500);
	maJWindow.setVisible(true);
    }
    public static void main(String []argv) {
	SwingUtilities.invokeLater(new JWindowExemple());	
    }
}