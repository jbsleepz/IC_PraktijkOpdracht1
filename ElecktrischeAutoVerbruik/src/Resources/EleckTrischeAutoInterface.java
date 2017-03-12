package Resources;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "ElecktrischeAuto")
public interface EleckTrischeAutoInterface {
	
	@WebMethod(operationName= "BerekenVerbruik")
	public String berekenVerbruikElecktrischeAuto(int beginPunt, int eindPunt, double verbruikKWH);
	
	@WebMethod(operationName= "addVebruikAuto")
	public String addVerbruikAuto(String eigenaar, String auto, double verbruik, int kilometerStand);
}
