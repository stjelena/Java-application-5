package telefon;

import java.awt.GridLayout;
import java.awt.Panel;
import java.util.ArrayList;

public class ListaStavki extends Panel {
	
	protected ArrayList<Stavka> stavke;
	
	public ListaStavki() {
		stavke = new ArrayList<Stavka>();
		this.setLayout(new GridLayout(0, 1));
	}
	
	public void dodajStavku(Stavka s) {
		stavke.add(s);
		this.add(s);
	}

}
