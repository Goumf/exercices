import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class ToolBarExample implements  Runnable {
    public void run() {
	JFrame f = new JFrame(getClass().getName());
	Container c = f.getContentPane();
	c.setLayout(new BorderLayout());

	JToolBar tb = new JToolBar(SwingConstants.HORIZONTAL);
	tb.setFloatable(true);
        tb.setRollover(true);
	for (int i=0; i<6; i++) {
	    if (i==3) {
		tb.add(new JToolBar.Separator());
		continue;
	    }
	    JButton b = new JButton("Bo"+(i+1)+"!");
	    b.setToolTipText("Aide pour "+b.getText());
	    tb.add(b);
	}
	tb.addSeparator();

	c.add(tb,BorderLayout.NORTH);

	JLabel l = new JLabel("C'est cool",JLabel.CENTER);
	l.setPreferredSize(new Dimension(400,200));
	c.add(l,BorderLayout.CENTER);

	f.pack();
	f.setVisible(true);
    }
    public static void main(String [] args) {
	/*
	  javax.swing.plaf.metal.MetalLookAndFeel
	  com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
	  com.sun.java.swing.plaf.motif.MotifLookAndFeel
	  com.apple.laf.AquaLookAndFeel
	 */
	try {
	    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
	} catch(Exception e) {
	    e.printStackTrace();
	}
	SwingUtilities.invokeLater(new ToolBarExample());
    }
}
