package services;

import métier.Compte;
import utilitaires.ValidationUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CompteService {

	private Map<String , Compte> comptes = new HashMap<>();
	
	public String genererCodeCompte() {
        Random rand = new Random();
        String code;

        do {
            int nombre = rand.nextInt(90000) + 10000; 
            code = "CPT-" + nombre;
        } while (comptes.containsKey(code)); 

        return code;
    }

    public void ajouterCompte(Compte compte) {
        if (ValidationUtils.validerCode(compte.getCode())) {
            comptes.put(compte.getCode(), compte);
            System.out.println("`````` Compte ajouté avec succès: " + compte.getCode() + " ``````");
        } else {
            System.out.println("Code invalide !");
        }
    }
	
	public Compte chercherCompte(String code) {
		return comptes.get(code);
	}
	
	public Map<String , Compte> getComptes() {
		return comptes ;
	}
}
