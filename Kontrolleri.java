package loja2d;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class Kontrolleri implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		try{
				int numri = new Integer(Loja.rezultati.getText()).intValue();
				if (Loja.n1 * Loja.n2 == numri)  {
					Loja.pergjigja.setText("Pergjigja eshte e sakte" );
					Loja.n1 = (int)(Math.random() *11);
					Loja.numri_1.setText("Numri i pare eshte " + Loja.n1+"; ");

					Loja.n2 = (int)(Math.random() *11);
					Loja.numri_2.setText("Numri i dyte eshte "+Loja.n2);
					Loja.pyetja.setText("Sa bejne  " + Loja.n1 +" * " +Loja.n2);
					Loja.pergjigja.setText("");
					Loja.rezultati.setText("");
					Loja.piket++;
					Loja.labela_piket.setText("Piket: "+ Loja.piket);

				}
				else 	{
					Loja.pergjigja.setText("Pergjigja eshte e pasakte, "+ Loja.n1 +"*"+ Loja.n2+" = " +(Loja.n1* Loja.n2));
					Loja.timer.stop();
					Loja.koha.setText("");
					Loja.rezultati.setEditable(false);
				}
			}
			catch(NumberFormatException ex) {
         JOptionPane.showMessageDialog(Loja.pergjigja, "Ju lutemi jepni nje numer te plote mes 0 dhe 100");
      }
		}
	}
