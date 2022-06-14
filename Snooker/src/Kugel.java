
public class Kugel {

	private String farbe;
	private int wert;
	private int anzahl = 1;
	
	
	Kugel(int wert){
		this.wert = wert;
		
		switch(wert) {
		
		case 0: farbe = "weiss";
		break;
		case 1: farbe = "rot";
				anzahl = 15;
		break;
		case 2: farbe = "gelb";
		break;
		case 3: farbe = "gruen";
		break;
		case 4: farbe = "braun";
		break;
		case 5: farbe = "blau";
		break;
		case 6: farbe = "pink";
		break;
		case 7: farbe = "schwarz";
		break;
		
		}
	}
	public void anzahlVerringern() {
		if (anzahl != 0) {
			anzahl--;
		}
		else {
			System.out.println("Keine Kugel mehr");
		}
	}
		
	
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
	public int getFoulpunkte() {
		int foulpunkte = wert;
		
		if (foulpunkte < 4) {
			foulpunkte = 4;
			
		}
		return foulpunkte;
	}
	public int getWert() {
		return wert;
	}
	
	
}
