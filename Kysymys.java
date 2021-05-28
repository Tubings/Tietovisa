package tietovisa;

public class Kysymys {
	String kysy;
	String vastaus;
	String selitys;

	public Kysymys(String kysy, String vastaus, String selitys) {
		this.kysy = kysy;
		this.vastaus = vastaus;
		this.selitys = selitys;
	}

	public static Kysymys[] array() {
		// 5. Kysymyksen kaikki osat on tallennettu t‰nne ja se palauttaa ne pyydet‰ess‰. T‰ss‰ luokassa olleet asiat olisivat voineet
		//olla toisessa metodissa, mutta halusin harjoitella luokkien v‰listen metodien k‰yttˆ‰, joten ne on t‰‰ll‰.
		String i1 = "\nMill‰ n‰ist‰ maista on isoin pinta-ala?\n" + "(a)Ukraina (b)Yhdistynyt Kuningaskunta (c)Ruotsi";
		String i2 = "\nMill‰ n‰ist‰ maista ei ole rajaa Saksan kanssa?\n" + "(a)Töekki (b)Tanska (c)Slovakia";
		String i3 = "\nMik‰ n‰ist‰ maista ei ole EU j‰senmaa?\n" + "(a)Kreikka (b)Sveitsi (c)Kypros";
		String i4 = "\nMik‰ on pinta-alaltaan suurin maa?\n" + "(a)Ven‰j‰ (b)Kanada (c)Kiina";
		String i5 = "\nMik‰ on Uzbekistanin p‰‰kaupunki?\n" + "(a)Duöanbe (b)Toshkent (c)Aögabat";
		Kysymys[] kysymys = { new Kysymys(i1, "a", "Oikea vastaus oli Ukraina, jonka pinta-ala on 603 628 km≤."),
				new Kysymys(i2, "c", "N‰ist‰ maista ainoastaan Slovakialla ei ole rajaa Saksan kanssa."),
				new Kysymys(i3, "b",
						"Vaikka Sveitsill‰ on monia sopimuksia EU:n kanssa,\nk‰ytt‰‰ euroa ja on osallisena Schengen alueessa se ei silti ole EU:n j‰senmaa."),
				new Kysymys(i4, "a",
						"Ven‰j‰n pinta-ala  on 17 098 242 km≤ joka on 7†113†572 km≤ isompi kuin seuraavaksi suurin maa, Kanada."),
				new Kysymys(i5, "b",
						"Uzbekistanin p‰‰kaupunki on Toshkent. Aögabat on Turkmenistanin p‰‰kaupunki ja Duöanbe on Tadûikistanin p‰‰kaupunki. "), };

		return kysymys;
	}

}
