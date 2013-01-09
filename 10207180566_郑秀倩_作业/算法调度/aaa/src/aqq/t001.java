package aqq;


import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;

/**
 * 用java swing画出11*19的格子，每个格子的大小是34*38
 * 
 * @author 米强
 * 
 */
public class t001 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Graphics g;
	  //  @jve:decl-index=0:visual-constraint="535,10"

	public t001(JPanel pane) {	
		super("画格子");
		initialize();
	
		getContentPane().add(pane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
        setSize(new Dimension(132, 59));
        this.setSize(new Dimension(515, 258));
			
	}
	
	

}  //  @jve:decl-index=0:visual-constraint="10,10"
	