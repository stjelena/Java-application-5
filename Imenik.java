package telefon;

public class Imenik extends ListaStavki {
	
	public Imenik() {
		super();
	}
	
	@Override
	public void dodajStavku(Stavka s) {
		if (s instanceof Kontakt)
			super.dodajStavku(s);
	}
	
	public String dohvImeKorisnika(Broj broj) throws GNePostoji {
		for (int i = 0; i < stavke.size(); i++) {
			if (stavke.get(i).tekst.toString() == broj.toString())
				return stavke.get(i).naslov.getText();
		}
		throw new GNePostoji();
	}
	
	public Broj dohvBrojKorisnika(String ime) throws GNePostoji{
		for (int i = 0; i < stavke.size(); i++) {
			if (stavke.get(i).naslov.toString() == ime){
				String br = stavke.get(i).tekst.toString();
				return new Broj(br);
			}
		}
		throw new GNePostoji();
	}

}
