package loja2d;
import java.awt.event.*;

import javax.swing.JOptionPane;

class TimerListener implements ActionListener{

	static int sekondat = 30;//	new Integer(JOptionPane.showInputDialog("Zgjedh kohezgjatjen e lojes(ne sekonda)")).intValue();
    public void actionPerformed(ActionEvent evt){ 
    	Loja.koha.setText("Koha e mbetur: "+sekondat);
    	sekondat--;
    	
    	if(sekondat < 0 ){
    		Loja.koha.setText("Koha perfundoi");
    		Loja.timer.stop();
    		Loja.rezultati.setEditable(false);

    	//	return;
    	}

    }
    
}
