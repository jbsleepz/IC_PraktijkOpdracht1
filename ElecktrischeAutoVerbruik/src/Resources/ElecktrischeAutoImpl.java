package Resources;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "ElecktrischeAuto")
public class ElecktrischeAutoImpl implements EleckTrischeAutoInterface {
	private ElecktrischeAuto autootje = new ElecktrischeAuto();
	private String message = "";
	
	@WebMethod(operationName= "BerekenVerbruik")
	public String berekenVerbruikElecktrischeAuto(int beginPunt, int eindPunt, double verbruikKWH){
		
		double waarde = autootje.berekenVerbruikElecktrischeAuto(beginPunt, eindPunt, verbruikKWH);
		if (waarde <=0 ){
			message = "De ingevoerde waardes mogen niet mingetallen of 0 zijn";
		} else {
			message = "Er is voor : " + waarde + " verbruikt aan KWH";
		}
		return message;
	}
	
	@WebMethod(operationName= "addGebruiker")
	public String addVerbruikAuto(String eigenaar, String auto, double verbruik, int kilometerStand){
		String message = "";
		if(verbruik > 0){
			message = autootje.addVerbuikAuto(eigenaar, auto, verbruik, kilometerStand);
		} else {
			message = "Verbruik van een auto mag niet < 0 zijn.";
		}
		return message;
	}

}
