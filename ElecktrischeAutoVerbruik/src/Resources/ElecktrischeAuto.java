package Resources;

public class ElecktrischeAuto {
	private String eigenaar;
	private String Auto;
	private double verbruik;
	private int KilometerStand;
	private Store store = new Store();

	public ElecktrischeAuto() {

	}

	public ElecktrischeAuto(String eigenaar, String auto, double verbruik, int kilometerStand) {
		this.eigenaar = eigenaar;
		Auto = auto;
		this.verbruik = verbruik;
		KilometerStand = kilometerStand;
	}

	// berekend het verbruik van een elecktrische auto aan de hand van Begin en eindpunt van de kilometerteller * verbruikKWH
	// Schrijft als de waardes correct zijn de gegevens weg naar textfile.
	public double berekenVerbruikElecktrischeAuto(int beginPunt, int eindPunt, double verbruikKWH) {
		double waarde = 0;
		if (beginPunt >= 0 || eindPunt > 0 || verbruikKWH > 0) {
			waarde = ((eindPunt - beginPunt) * verbruikKWH);
			store.OpenFileVerbruik();
			store.writeDataToFileVerbruik(beginPunt, eindPunt, verbruikKWH, Math.round(waarde));
			store.closeFile();
		}
		return Math.round(waarde);
	}

	//Geeft de waardes van de auto en de gebruiker terug, ook schrijft hij deze waardes weg naar een textFile.
	public String addVerbuikAuto(String eigenaar, String auto, double verbruik, int kilometerStand) {
		String gebruiker = "Naam : " + eigenaar + " auto : " + auto + " verbuik auto : " + verbruik + " Kilometerstand "
				+ kilometerStand;
		store.OpenFileGebruiker();
		store.writeDataToFileGebruiker(eigenaar, auto, verbruik, kilometerStand);
		store.closeFile();
		return gebruiker;
	}

	public String getEigenaar() {
		return eigenaar;
	}

	public void setEigenaar(String eigenaar) {
		this.eigenaar = eigenaar;
	}

	public String getAuto() {
		return Auto;
	}

	public void setAuto(String auto) {
		Auto = auto;
	}

	public double getVerbruik() {
		return verbruik;
	}

	public void setVerbruik(double verbruik) {
		this.verbruik = verbruik;
	}

	public int getKilometerStand() {
		return KilometerStand;
	}

	public void setKilometerStand(int kilometerStand) {
		KilometerStand = kilometerStand;
	}

}