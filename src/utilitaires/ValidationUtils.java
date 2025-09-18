package utilitaires;

public class ValidationUtils {

	public static boolean validerCode(String code) {
        // خاصو يبدا بـ CPT- و من بعد 5 أرقام
        return code.matches("CPT-\\d{5}");
    }
	
}
