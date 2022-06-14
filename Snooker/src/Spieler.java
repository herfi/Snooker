
public class Spieler {
	

	String name;
	int punkte = 0;
	
	Spieler(String name){
		
		this.name = name;
		
	}
	
	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int punkte) {
		this.punkte += punkte;
	}

	public String getName() {
		return name;
	}
	
	
}
