package test1Flatlaf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class calculatrice extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
    private JLabel lblResultat;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 */
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		
		//UIManager.setLookAndFeel(new FlatLightLaf());
		//UIManager.setLookAndFeel(new FlatDarkLaf());
		UIManager.setLookAndFeel(new FlatDarculaLaf());
		//UIManager.setLookAndFeel(new FlatIntelliJLaf());
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatrice frame = new calculatrice();
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
	public calculatrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("txtNombre1 : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 29, 117, 29);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(122, 34, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTxtnombre = new JLabel("txtNombre2 : ");
		lblTxtnombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTxtnombre.setBounds(22, 97, 117, 29);
		contentPane.add(lblTxtnombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 97, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
	    lblResultat = new JLabel("Resultat :");
		lblResultat.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResultat.setBounds(162, 175, 117, 29);
		contentPane.add(lblResultat);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
                    double a = Double.parseDouble(textField .getText());
                    double b = Double.parseDouble(textField_1.getText());
                    double resultat = a + b;
                    lblResultat.setText("Résultat : " + resultat);
                } catch (NumberFormatException ex) {
                    lblResultat.setText("Entrées invalides !");
				
			    }
			}
			
		});
		btnNewButton.setBounds(275, 132, 85, 21);
		contentPane.add(btnNewButton);
	}
}
