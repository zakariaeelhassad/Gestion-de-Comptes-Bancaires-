package utilitaires;

public class ValidationUtils {

	public static boolean validerCode(String code) {
   
        return code.matches("CPT-\\d{5}");
    }
	
}
