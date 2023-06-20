package telefon;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tastatura extends Panel {
	
	String natpis = "";
	Label labelNatpis = new Label(natpis);
	
	Panel buttons = new Panel();
	
	//protected boolean unosTeksta = false;
	
	public Tastatura(boolean unosTeksta) {
		
		
		
		buttons.setLayout(new GridLayout(4, 3));
		Button button1;
		Button button2;
		Button button3;
		Button button4;
		Button button5;
		Button button6;
		Button button7;
		Button button8;
		Button button9;
		Button button10;
		Button button11;
		Button button12;
		
		if (unosTeksta) {
			button1 = new Button();
			button2 = new Button("ABC");
			button3 = new Button("DEF");
			button4 = new Button("GHI");
			button5 = new Button("JKL");
			button6 = new Button("MNO");
			button7 = new Button("PQRS");
			button8 = new Button("TUV");
			button9 = new Button("WXYZ");
			button10 = new Button();
			button11 = new Button("_");
			button12 = new Button();
			
			
			button2.addMouseListener(new MouseAdapter() {
				
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount()%3 == 1)
						natpis = natpis.concat("A");
					if (e.getClickCount()%3 == 2) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("B");
					}
					if (e.getClickCount()%3 == 0) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("C");
					}
					labelNatpis.setText(natpis);
				}
			});
			
			button3.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if (e.getClickCount()%3 == 1)
						natpis = natpis.concat("D");
					if (e.getClickCount()%3 == 2) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("E");
					}
					if (e.getClickCount()%3 == 0) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("F");
					}
					labelNatpis.setText(natpis);
				}
				
			});
			
			button4.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount()%3 == 1)
						natpis = natpis.concat("G");
					if (e.getClickCount()%3 == 2) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("H");
					}
					if (e.getClickCount()%3 == 0) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("I");
					}
					labelNatpis.setText(natpis);
				}
			});
			
			button5.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount()%3 == 1)
						natpis = natpis.concat("J");
					if (e.getClickCount()%3 == 2) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("K");
					}
					if (e.getClickCount()%3 == 0) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("L");
					}
					labelNatpis.setText(natpis);
				}
			});
			
			button6.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount()%3 == 1)
						natpis = natpis.concat("M");
					if (e.getClickCount()%3 == 2) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("N");
					}
					if (e.getClickCount()%3 == 0) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("O");
					}
					labelNatpis.setText(natpis);
				}
			});
			
			button7.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount()%4 == 1)
						natpis = natpis.concat("P");
					if (e.getClickCount()%4 == 2) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("Q");
					}
					if (e.getClickCount()%4 == 3) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("R");
					}
					if (e.getClickCount()%4 == 0) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("S");
					}
					labelNatpis.setText(natpis);
				}
			});
			
			button8.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount()%3 == 1)
						natpis = natpis.concat("T");
					if (e.getClickCount()%3 == 2) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("U");
					}
					if (e.getClickCount()%3 == 0) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("V");
					}
					labelNatpis.setText(natpis);
				}
			});
			
			button9.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount()%4 == 1)
						natpis = natpis.concat("W");
					if (e.getClickCount()%4 == 2) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("X");
					}
					if (e.getClickCount()%4 == 3) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("Y");
					}
					if (e.getClickCount()%4 == 0) {
						natpis = natpis.substring(0, natpis.length()-1);
						natpis = natpis.concat("Z");
					}
					labelNatpis.setText(natpis);
					
				}
			});
			
			button11.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					natpis = natpis + " ";
					System.out.println(natpis);
				}
			});
			
			
		}
		else {
			button1 = new Button("1");
			button2 = new Button("2");
			button3 = new Button("3");
			button4 = new Button("4");
			button5 = new Button("5");
			button6 = new Button("6");
			button7 = new Button("7");
			button8 = new Button("8");
			button9 = new Button("9");
			button10 = new Button("*");
			button11 = new Button("0");
			button12 = new Button("+");
			
			button1.addActionListener((ae) -> {
				natpis = natpis.concat(button1.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button2.addActionListener((ae) -> {
				natpis = natpis.concat(button2.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button3.addActionListener((ae) -> {
				natpis = natpis.concat(button3.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button4.addActionListener((ae) -> {
				natpis = natpis.concat(button4.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button5.addActionListener((ae) -> {
				natpis = natpis.concat(button5.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button6.addActionListener((ae) -> {
				natpis = natpis.concat(button6.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button7.addActionListener((ae) -> {
				natpis = natpis.concat(button7.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button8.addActionListener((ae) -> {
				natpis = natpis.concat(button8.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button9.addActionListener((ae) -> {
				natpis = natpis.concat(button9.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button10.addActionListener((ae) -> {
				natpis = natpis.concat(button10.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button11.addActionListener((ae) -> {
				natpis = natpis.concat(button11.getLabel().toString());
				labelNatpis.setText(natpis);
			});
			button12.addActionListener((ae) -> {
				natpis = natpis.concat(button12.getLabel().toString());
				labelNatpis.setText(natpis);
			});
		}
		
		
		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		buttons.add(button5);
		buttons.add(button6);
		buttons.add(button7);
		buttons.add(button8);
		buttons.add(button9);
		buttons.add(button10);
		buttons.add(button11);
		buttons.add(button12);
		
		this.add(labelNatpis, BorderLayout.NORTH);
		this.add(buttons, BorderLayout.SOUTH);
		
		
		this.setVisible(true);
		
	}

}
