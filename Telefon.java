package telefon;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;

public class Telefon extends Panel {
	
	private Color boja;
	private Broj broj;
	private Imenik imenik;
	private Tastatura tastatura;
	
	private Broj noviBroj;
	private String noviKont;
	
	private Panel bottomPanel = new Panel();
	private Panel imenikPanel = new Panel();
	private Panel bottomPanel1 = new Panel();
	private Panel bottomPanel2 = new Panel();
	private Panel ispodTast = new Panel();
	private Button dodajKontakt = new Button("Dodaj kontakt");
	private Button iskljuciTel = new Button("Iskljuci telefon");
	private boolean unos = true;
	private boolean iskljucen = false;
	
	public Telefon(Color boja, Broj broj) {
		this.boja = boja;
		this.broj = broj;
		
		this.setBackground(boja);
		this.setSize(250, 600);
				
		
		Label labelBroj = new Label(broj.toString());
		CardLayout cardLayout = new CardLayout();
		Panel tastPanel = new Panel(cardLayout);
		
		imenik = new Imenik();
		
		for (int i = 0; i<2; i++) {
			tastatura = new Tastatura(unos);
			tastPanel.add(tastatura);
			unos = !unos;
		}
		
		
		dodajKontakt.addActionListener((ae) -> {
				
				if (unos) {
					noviKont = tastatura.labelNatpis.getText();
				}
				else {
					//String strbroj = tastatura.labelNatpis.getText();
					noviBroj = new Broj(tastatura.labelNatpis.getText());
					Kontakt noviKontakt = new Kontakt(noviKont, noviBroj);
					imenik.dodajStavku(noviKontakt);
				}
				unos = !unos;
	
				tastatura.labelNatpis.setText("");
				tastatura.natpis = "";
				
				cardLayout.next(tastPanel);
				
		});
		
		iskljuciTel.addActionListener((ae) -> {
			if (iskljucen) {
				iskljuciTel.setBackground(Color.WHITE);
				iskljuciTel.setLabel("Iskljuci telefon");
			}
			else {
				iskljuciTel.setBackground(Color.RED);
				iskljuciTel.setLabel("Ukljuci telefon");
			}
			iskljucen = !iskljucen;
		});
		
		this.setSize(tastatura.getWidth(), tastatura.getHeight()*2);
	
		bottomPanel1.add(dodajKontakt);
		bottomPanel1.add(iskljuciTel);
		
		bottomPanel2.add(labelBroj);
		
		bottomPanel.add(bottomPanel2, BorderLayout.SOUTH);
		bottomPanel.add(bottomPanel1, BorderLayout.SOUTH);

		
		ispodTast.add(bottomPanel, BorderLayout.SOUTH);
		ispodTast.add(imenikPanel, BorderLayout.NORTH);
		
		add(tastPanel, BorderLayout.NORTH);
		add(ispodTast, BorderLayout.SOUTH);
		revalidate();
		
		
		
		
	}

	public Broj getBroj() {
		return broj;
	}

}
