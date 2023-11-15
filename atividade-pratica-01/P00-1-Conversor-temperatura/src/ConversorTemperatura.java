public class ConversorTemperatura {
	
	public static float converte(float temperature, int option) {
		float result = 0;
		if(option == 1) {
			result = (temperature * 9/5) + 32;
		}else if(option == 2) {
			result = ((temperature - 32) * 5) / 9;
		} 
		
		return result;
	}
}
