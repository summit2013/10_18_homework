package aqq;


import javax.swing.JPanel;
import javax.swing.JFrame;



import java.awt.TextField;
import java.awt.Rectangle;
import java.awt.Label;
import java.awt.Button;

public class ZA extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	public TextField t1 = null;
	public TextField t2 = null;
	public TextField t3 = null;
	public TextField t4 = null;
	public TextField t5 = null;
	public TextField t6 = null;
	public TextField t7 = null;
	public TextField t8 = null;
	public TextField t9 = null;
	public TextField t10 = null;
	public TextField t11 = null;
	public TextField t12 = null;
	private Label l1 = null;
	private Label l2 = null;
	private Label l3 = null;
	private Label l4 = null;
	private Label l5 = null;
	private Label l6 = null;
	private Label l7 = null;
	private Label l8 = null;
	private Label l9 = null;
	private Label l10 = null;
	private Button b1 = null;

	/**
	 * This is the default constructor
	 */
	public ZA() {
		super();
		initialize();
	}
	
	public static void main(String[] args)
	{ 
		ZA qq=new ZA();
		qq.initialize();
		qq.setVisible(true);
	}
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	
	private void initialize() {
		this.setSize(416, 245);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJContentPane() {
		if (jContentPane == null) {
			l10 = new Label();
			l10.setBounds(new Rectangle(200, 108, 40, 25));
			l10.setText("进程6");
			l9 = new Label();
			l9.setBounds(new Rectangle(20, 110, 40, 25));
			l9.setText("进程5");
			l8 = new Label();
			l8.setBounds(new Rectangle(200, 70, 40, 25));
			l8.setText("进程4");
			l7 = new Label();
			l7.setBounds(new Rectangle(20, 70, 40, 25));
			l7.setText("进程3");
			l6 = new Label();
			l6.setBounds(new Rectangle(200, 30, 40, 25));
			l6.setText("进程2");
			l5 = new Label();
			l5.setBounds(new Rectangle(20, 30, 40, 25));
			l5.setText("进程1");
			l4 = new Label();
			l4.setBounds(new Rectangle(320, 0, 70, 25));
			l4.setText("运行时间int");
			l3 = new Label();
			l3.setBounds(new Rectangle(246,0,70, 25));
			l3.setText("进入时间int");
			l2 = new Label();
			l2.setBounds(new Rectangle(130,0, 70, 25));
			l2.setText("运行时间int");
			l1 = new Label();
			l1.setBounds(new Rectangle(59, 0, 70, 25));
			l1.setText("进入时间int");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getT1(), null);
			jContentPane.add(getT2(), null);
			jContentPane.add(getT3(), null);
			jContentPane.add(getT4(), null);
			jContentPane.add(getT5(), null);
			jContentPane.add(getT6(), null);
			jContentPane.add(getT7(), null);
			jContentPane.add(getT8(), null);
			jContentPane.add(getT9(), null);
			jContentPane.add(getT10(), null);
			jContentPane.add(getT11(), null);
			jContentPane.add(getT12(), null);
			jContentPane.add(l1, null);
			jContentPane.add(l2, null);
			jContentPane.add(l3, null);
			jContentPane.add(l4, null);
			jContentPane.add(l5, null);
			jContentPane.add(l6, null);
			jContentPane.add(l7, null);
			jContentPane.add(l8, null);
			jContentPane.add(l9, null);
			jContentPane.add(l10, null);
			jContentPane.add(getB1(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes t1	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT1() {
		if (t1 == null) {
			t1 = new TextField();
			t1.setBounds(new Rectangle(72, 30,40, 25));
		}
		return t1;
	}

	/**
	 * This method initializes t2	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT2() {
		if (t2 == null) {
			t2 = new TextField();
			t2.setBounds(new Rectangle(140, 30, 40, 25));
		}
		return t2;
	}

	/**
	 * This method initializes t3	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT3() {
		if (t3 == null) {
			t3 = new TextField();
			t3.setBounds(new Rectangle(256,30, 40, 25));
		}
		return t3;
	}

	/**
	 * This method initializes t4	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT4() {
		if (t4 == null) {
			t4 = new TextField();
			t4.setBounds(new Rectangle(330, 30, 40, 25));
		}
		return t4;
	}

	/**
	 * This method initializes t5	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT5() {
		if (t5 == null) {
			t5 = new TextField();
			t5.setBounds(new Rectangle(72,70, 40, 25));
		}
		return t5;
	}

	/**
	 * This method initializes t6	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT6() {
		if (t6 == null) {
			t6 = new TextField();
			t6.setBounds(new Rectangle(140,70, 40, 25));
		}
		return t6;
	}

	/**
	 * This method initializes t7	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT7() {
		if (t7 == null) {
			t7 = new TextField();
			t7.setBounds(new Rectangle(256, 70, 40,25));
		}
		return t7;
	}

	/**
	 * This method initializes t8	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT8() {
		if (t8 == null) {
			t8 = new TextField();
			t8.setBounds(new Rectangle(330, 70, 40,25));
		}
		return t8;
	}

	/**
	 * This method initializes t9	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT9() {
		if (t9 == null) {
			t9 = new TextField();
			t9.setBounds(new Rectangle(72, 111, 42, 23));
		}
		return t9;
	}

	/**
	 * This method initializes t10	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT10() {
		if (t10 == null) {
			t10 = new TextField();
			t10.setBounds(new Rectangle(140, 111, 42, 23));
		}
		return t10;
	}

	/**
	 * This method initializes t11	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT11() {
		if (t11 == null) {
			t11 = new TextField();
			t11.setBounds(new Rectangle(256, 110, 40,25));
		}
		return t11;
	}

	/**
	 * This method initializes t12	
	 * 	
	 * @return java.awt.TextField	
	 */
	private TextField getT12() {
		if (t12 == null) {
			t12 = new TextField();
			t12.setBounds(new Rectangle(330, 110, 40,25));
		}
		return t12;
	}

	
	/**
	 * This method initializes b1	
	 * 	
	 * @return java.awt.Button	
	 */
	private Button getB1() {
		if (b1 == null) {
			b1 = new Button();
			b1.setBounds(new Rectangle(315, 158,55, 30));
			b1.setLabel("执行");
			b1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Aaaa b=new Aaaa();
					int qw=6,das=0;
					
					if(t1.getText()!=""&&t2.getText()!=""){
					try{b.add("1", Integer.parseInt(t1.getText()), Integer.parseInt(t2.getText()));das++;
					} catch (Exception e1) {
						qw--;// TODO Auto-generated catch block
					}
					}
					if(t3.getText()!=""&&t4.getText()!=""){
						try{b.add("2", Integer.parseInt(t3.getText()), Integer.parseInt(t4.getText()));das++;
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							qw--;
						}
						}
					if(t5.getText()!=""&&t6.getText()!=""){
						try{b.add("3", Integer.parseInt(t5.getText()), Integer.parseInt(t6.getText()));das++;
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							qw--;
						}
						}
					if(t7.getText()!=""&&t8.getText()!=""){
						try{b.add("4", Integer.parseInt(t7.getText()), Integer.parseInt(t8.getText()));das++;
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							qw--;
						}
						}
					if(t9.getText()!=""&&t10.getText()!=""){
						try{b.add("5", Integer.parseInt(t9.getText()), Integer.parseInt(t10.getText()));das++;
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							qw--;
						}
						}
					if(t11.getText()!=""&&t12.getText()!=""){
						try{b.add("6", Integer.parseInt(t11.getText()), Integer.parseInt(t12.getText()));das++;
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							qw--;
						}
						}
					System.out.println(das);
					if(qw>0){//b.fun();
				b.paintChequer();
				t001 aaa=new t001(b.pane);
				aaa.setVisible(true);
				System.out.println("进程名 到达时间 服务时间\t完成时间\t周转时间\t带权周转时间") ;
				b.print();}
					else System.out.println("quancuo");
				
				}
			});
		}
		return b1;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
