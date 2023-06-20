package telefon;

public class GNePostoji extends Exception {
	public String toString(){
		return "Zadato ime/broj se ne nalazi u imeniku!";
	}
}