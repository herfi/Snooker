import java.io.IOException;
import java.util.Scanner;

public class Snooker {
	
	
	static int eingabe = 0;
	static boolean istRot = true;
	static boolean spielerSchalter = true;
	static Kugel[] kugel = new Kugel[8];
	static Spieler spieler1 = new Spieler("Horst");
	static Spieler spieler2 = new Spieler("Joke");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		for(int i = 0; i <8; i++) {
			
			
			kugel[i] = new Kugel(i);

			
			
		}
		

		
		while (true) {
		 System.out.println("Spieler1:"+spieler1.getPunkte()+"		aktiver Spieler:"+ aktiverSpieler().getName() +"		Spieler2:"+spieler2.getPunkte()+"\n"
		 				  + "1: rot\n"
		 				  + "2: farbe\n"
		 				  + "3: foul\n"
		 				  + "4: nichts\n"
		 				  + "5: Spieler wechsel");

	     int eingabe = sc.nextInt();

		 
		 switch (eingabe) {
		 
		 case 1: kugel[1].anzahlVerringern();
		 		 aktiverSpieler().setPunkte(kugel[1].getWert());

		 break;
		 case 2: 
			
		 break;
		 case 3:	System.out.println("Welche Kugel?");
		 			int eingabe2 = sc.nextInt();
		 			spielerWechsel();
		 			if (!(eingabe2 >= 8 || eingabe2 <= -1 )) {
		 				aktiverSpieler().setPunkte(kugel[eingabe2].getFoulpunkte());}
		 break;
		 case 4:
		 break;
		 case 5: spielerWechsel();
		 break;
		 }
		}
	
	
	
	}
	
	public static Spieler aktiverSpieler() {
		
		if (spielerSchalter) {
			return spieler1;
		}
		else {
			return spieler2;
		
		}
			
		}
	
	
	public static void spielerWechsel() {
		
		if (spielerSchalter) {
			spielerSchalter = false;
		}
		else {
			spielerSchalter = true;
		
		}
			
		}
}

