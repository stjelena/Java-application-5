package telefon;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.BoxLayout;

public class Stavka extends Panel {
	
	Label naslov;
	Label tekst;
	
	public Stavka(Object naslov, Object tekst) {
		this.naslov = new Label(naslov.toString());
		this.tekst = new Label(tekst.toString());
		
		this.setLayout(new GridLayout(2, 1));
		
		add(this.naslov);
		add(this.tekst);
		
		setVisible(true);
		
	}
	
	public void promeniNaslov(String n) {
		naslov.setText(n);
	}

}
