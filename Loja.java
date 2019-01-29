package loja2d;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Loja extends JFrame  implements ActionListener {
	static Timer timer = new Timer(1000,new TimerListener());
	static int n1  ;
	static JLabel numri_1 ;

	static int n2 ;
	static JLabel numri_2 ;

	static JLabel pyetja ;
	static JTextField rezultati = new JTextField();
	static JLabel pergjigja= new JLabel();
	static JLabel koha = new JLabel();
	Font font = new Font("Segoe Print",Font.BOLD,20);
	static int piket =0 ;
	static JLabel labela_piket = new JLabel("Piket: "+ piket);
	public Loja() {
		timer.start();

		n1 = (int)(Math.random() *11);
		numri_1 = new JLabel("Numri i pare eshte " + n1+"; ");
		numri_1.setForeground(Color.WHITE);
		numri_1.setFont(font);
		numri_1.setBounds(20,10,250,20);

		n2 = (int)(Math.random() *11);
		numri_2= new JLabel("Numri i dyte eshte "+n2);
		numri_2.setForeground(Color.white);
		numri_2.setFont(font);
		numri_2.setBounds(260,10,400,20);


		pyetja= new JLabel("Sa bejne  " + n1 +" * " +n2);
		pyetja.setForeground(Color.white);
		pyetja.setFont(font);
		pyetja.setBounds(65,60,200,20);


		pergjigja.setForeground(Color.white);
		pergjigja.setFont(font);
		pergjigja.setBounds(45,120,405,35);

		rezultati.setFont(font);
		rezultati.setForeground(new Color(0,100,0));
		rezultati.setBounds(270,60,65,25);



		koha.setFont(new Font("Agency FB", Font.BOLD, 17));
		koha.setForeground(Color.white);
		koha.setBounds(15, 222, 150, 50);

		labela_piket.setFont(new Font("Agency FB", Font.BOLD, 17));
		labela_piket.setForeground(Color.white);
		labela_piket.setBounds(15, 200, 150, 50);

		JButton butoniPergjigju = new JButton("Pergjigju");
		butoniPergjigju.setBounds(345,60, 90,25);
		butoniPergjigju.addActionListener(new Kontrolleri());

		JButton luajPerseri = new JButton("Luaj perseri?");
		luajPerseri.setBounds(250,220 ,120 , 30);
		luajPerseri.addActionListener(this);

		 JButton b = new JButton("Mbylle lojen");
		 b.setBounds(375,220,100,30);
		 b.setBackground(Color.red);
		 b.setOpaque(true);
		 b.setForeground(Color.WHITE);
		 b.addActionListener(new KontrolleriMbyll());

		Container c= getContentPane();

		c.setBackground(new Color(0,100,0));
		c.setLayout(null); //Vendosja e komponenteve me layout absolut

		c.add(numri_1);
		c.add(numri_2);

		c.add(pyetja) ;
		c.add(rezultati);
		c.add(pergjigja);

		c.add(butoniPergjigju);
		getRootPane().setDefaultButton(butoniPergjigju); // Kontrolli ne shtypjen e tastit Enter i ipet butonit "Pergjigju"

		c.add(koha);
		c.add(labela_piket);
		c.add(luajPerseri);
		c.add(b);

		setSize(510,300);
		setTitle("Cik Cak tabela e shumezimit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		n1 = (int)(Math.random() *11);
		numri_1.setText("Numri i pare eshte " + n1+"; ");

		n2 = (int)(Math.random() *11);
		numri_2.setText("Numri i dyte eshte "+n2);
		pyetja.setText("Sa bejne  " + n1 +" * " +n2);

		timer.stop();
		koha.setText("");

		pergjigja.setText("");
		rezultati.setText("");
		//TimerListener.sekondat=new Integer(JOptionPane.showInputDialog("Zgjedh kohezgjatjen e lojes(ne sekonda)")).intValue();
		TimerListener.sekondat = 30 ;
		piket=0;
		labela_piket.setText("Piket:"+piket);
		timer.restart();
		rezultati.setEditable(true);
		rezultati.requestFocusInWindow();
		repaint();

	}

		public static void main(String[] args){
			new Loja();

		}
}
