package tietovisa;

import java.util.*;

public class Tietovisa {

	public static void main(String[] args) {
		// 1. Ohjelma alkaa luomalla uuden skannerin ja tekem‰ll‰ muuttujat pelaajan nimelle ja pistem‰‰r‰lle
		Scanner lukija = new Scanner(System.in);
		String nimi;
		int pisteet = 0;

		//2. Ohjelma tervehtii k‰ytt‰j‰‰ ja pyyt‰‰ h‰nen nimens‰, joka tallennetaan nimi muuttujaan
		System.out.println("Tervetuloa pelaamaan tietovisaa!");
		System.out.print("Syˆt‰ nimesi: ");
		nimi = lukija.nextLine();

		//3. Luodaan kysymys taulukko, joka tallentaa kysymyksen, vastaukset ja selityksen miksi vastaus oli oikein.
		Kysymys[] kysymys;
		//4. K‰ytet‰‰n kysymys metodia toisesta luokasta joka hakee kysymykset.
		kysymys = Kysymys.array();
		//6. K‰ytet‰‰n testi metodia joka palauttaa pisteet.
		pisteet = testi(kysymys);
		
		//9. ohjelma kertoo viimeiseksi viel‰ pistem‰‰r‰si ja sitten sulkeutuu. Muuten ihan omaa k‰sialaa koko koodi paitsi tuo taulukon jakaminen siten ett‰ siit‰ voi
		//pyyt‰‰ tietoa laittamalla kysymys[i].kysy yms. Nimet on t‰ss‰ v‰h‰n tyhmi‰ ja ei olisi pit‰nyt kutsua kaikkea kysymykseksi, teki ongelmien ratkaisemisesta ‰rsytt‰v‰‰.
		if (pisteet == 1) {
			System.out.print("Sait " + pisteet + " pisteen " + nimi + "!");
		} else {
			if (pisteet < kysymys.length) {
				System.out.print("Sait " + pisteet + " pistett‰ " + nimi + "!");
			} else {
				System.out.print("Sait kaikki kysymykset oikein " + nimi + "!");
			}
		}

		lukija.close();
	}

	public static int testi(Kysymys[] kysymys) {
		// 7. muuttujat/lukija luodaan
		int pisteet = 0;
		Scanner lukija = new Scanner(System.in);
		//8. Ohjelma hakee kysymyksi‰ yht‰ monta kertaa kuin taulukolla on pituutta, k‰yden kysymykset l‰pi j‰rjestyksess‰ ja aina kun pelaaja vastaa oikein saa h‰n
		//pisteen. Jokaisen kysymyksen j‰lkeen tulee myˆs infoa kysymyksest‰.
		for (int i = 0; i < kysymys.length; i++) {
			System.out.println(kysymys[i].kysy);
			String vastaus = lukija.nextLine();
			if (vastaus.equals(kysymys[i].vastaus)) {
				pisteet = pisteet + 1;
				System.out.println("Oikein!");
				System.out.println(kysymys[i].selitys);
			} else {
				System.out.println("V‰‰rin!");
				System.out.println(kysymys[i].selitys);
			}
		}
		lukija.close();
		return pisteet;
	}
}
