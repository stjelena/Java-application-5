package telefon;

public class Broj {
	
	private String kod;
	private String pozivni;
	private String brojPretplatnika;
	
	public Broj(String string, String string2, String string3) {
		kod = string;
		pozivni = string2;
		brojPretplatnika = string3;
	}
	
	public boolean uIstojDrz(Broj broj) {
		return kod == broj.kod;
	}
	
	public boolean uIstojMrezi(Broj broj) {
		return kod == broj.kod && pozivni == broj.pozivni;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Broj)) {
			return false;
		}
		Broj broj = (Broj)obj;
		return this.kod == broj.kod && this.pozivni == broj.pozivni
				&& this.brojPretplatnika == broj.brojPretplatnika;
	}
	
	@Override
	public String toString() {
		return "+" + kod + " " + pozivni + " " + brojPretplatnika;
	}
	
	public Broj(String broj) {
		char[] ch1 = new char[3];
		char[] ch2 = new char[2];
		char[] ch3 = new char[10];
		for (int i = 0; i<3; i++) {
			ch1[i] = broj.charAt(i);
		}
		for (int i = 3; i<5; i++) {
			ch2[i-3] = broj.charAt(i);
		}
		for (int i = 5; i<broj.length(); i++) {
			ch3[i-5] = broj.charAt(i);
		}
		kod = new String(ch1);
		pozivni = new String(ch2);
		brojPretplatnika = new String(ch3);
		
		
	}
	
	public static void main(String[] args) {
		Broj br = new Broj("3810600599200");
		System.out.println(br);
	}

}
