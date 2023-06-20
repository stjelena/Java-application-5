package telefon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Prozor extends Frame {
	
	private Telefon telefon1;
	private Telefon telefon2;
	
	public Prozor() {
		setBounds(700, 400, 500, 600);
		setResizable(true);
		
		setTitle("Igra");
				
		populateWindow();
		pack();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setVisible(true);

	}

	private void populateWindow() {
		
		Broj broj1 = new Broj("3815256");
		Broj broj2 = new Broj("3815266");


		telefon1 = new Telefon(Color.GREEN, broj1);
		telefon2 = new Telefon(Color.YELLOW, broj2);
		
		telefon1.setSize(this.getWidth()/2, this.getHeight());
		telefon2.setSize(this.getWidth()/2, this.getHeight());
		
		add(telefon1, BorderLayout.WEST);
		add(telefon2, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		new Prozor();
	}

}
