package TestMethodes;

import Resources.ElecktrischeAutoImpl;

public class TestMethodesElecktrischeAutoServices {

	public static void main(String[] args) {
		ElecktrischeAutoImpl autootje = new ElecktrischeAutoImpl();
		
		//hieronder staan 3 testcases voor het testen van de methode "berekenVerbuikElecktrischeAuto", de gegevens zullen moeten worden
		//Weggeschreven naar een textfile "ElecktischeAutoVerbruik" en worden getoond.
		System.out.println(autootje.berekenVerbruikElecktrischeAuto(50, 245, 0.55));
		System.out.println(autootje.berekenVerbruikElecktrischeAuto(300, 500, 0.55));
		System.out.println(autootje.berekenVerbruikElecktrischeAuto(432, 652, 0.55));
		// foutmelding moet eruit komen.
		System.out.println(autootje.berekenVerbruikElecktrischeAuto(432, 652, -0.32));
		System.out.println(autootje.berekenVerbruikElecktrischeAuto(432, 652, -0.91));
		
		//hieronder staan 3 testcases voor het testen van de methode "addVerbuikAuto", de gegevens zullen moeten worden
		//Weggeschreven naar een textfile "ElecktrishceAutoGebruiker" en worden getoond.
		System.out.println(autootje.addVerbruikAuto("JoukeBouwe", "Lotus", 0.4, 24562));
		System.out.println(autootje.addVerbruikAuto("Piet", "BMW", 0.2, 142562));
		System.out.println(autootje.addVerbruikAuto("Jantje", "Bugatti", 0.1, 94213));
		//foutmelding komt hieruit
		System.out.println(autootje.addVerbruikAuto("Jantje", "Bugatti", 0, 94213));
		System.out.println(autootje.addVerbruikAuto("Jantje", "Bugatti", -2, 94213));
		
	}

}