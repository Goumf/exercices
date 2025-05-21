package test1Flatlaf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import com.formdev.flatlaf.*;

public class testFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		UIManager.setLookAndFeel(new FlatLightLaf());
		//UIManager.setLookAndFeel(new FlatDarkLaf());
		//UIManager.setLookAndFeel(new FlatDarcutLaf());
		//UIManager.setLookAndFeel(new FlatIntelliLaf());
		
		EventQueue.invokeLater(new Runnable() {                     //attends que tout soit fini avant d'aller plus loin 
			public void run() {
				try {
					testFrame frame = new testFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);                                  //va la positionner à cet endroit
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
