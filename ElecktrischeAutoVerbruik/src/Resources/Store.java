package Resources;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Store {

	private FileWriter file;
	PrintWriter pw;

	public void OpenFileVerbruik() {
		try {
			file = new FileWriter("ElecktrischeAutoVerbruik.txt", true);
		} catch (Exception e) {
			System.out.println("Er gaat iets mis.... file is niet aangemaakt");
		}
	}

	public void OpenFileGebruiker() {
		try {
			file = new FileWriter("ElecktrischeAutoGebruiker.txt", true);
		} catch (Exception e) {
			System.out.println("Er gaat iets mis.... file is niet aangemaakt");
		}
	}

	public void writeDataToFileVerbruik(int beginPunt, int eindPunt, double verbruikKWH, double waarde) {
		pw = new PrintWriter(file);
		pw.println(" BeginPunt: " + beginPunt + " EindPunt: " + eindPunt + " Verbruik KWH " + verbruikKWH
				+ " TotaalVerbruikt : " + waarde);
	}

	public void writeDataToFileGebruiker(String eigenaar, String auto, double verbruik, int kilometerStand) {
		pw = new PrintWriter(file);
		pw.println("Naam : " + eigenaar + " auto : " + auto + " verbuik auto : " + verbruik + " Kilometerstand "
				+ kilometerStand);
	}

	public void closeFile() {
		try {
			file.close();
		} catch (IOException e) {
			System.out.println("Er gaat iets mis.... file is niet gesloten");
		}
	}

	public FileWriter getFile() {
		return file;
	}

	public void setFile(FileWriter file) {
		this.file = file;
	}
}
