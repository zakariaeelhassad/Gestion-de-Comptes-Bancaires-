package métier;

import java.util.ArrayList;
import java.util.List;

public abstract class Compte {

	private String code;
    protected double solde;
    protected List<Operation> listeOperations;
    
    public Compte(String code, double solde) {
        this.code = code ;
        this.solde = solde;
        this.listeOperations = new ArrayList();
    }
    
    public String getCode() {
    	return code ;
    }
    
    public double getSolde() {
    	return solde ;
    }
    
    public List<Operation> getListeOpiration(){
    	return listeOperations ;
    }
    
    public abstract boolean retirer(double montant);

    public abstract double calculerInteret();

    public abstract void afficherDetails();
    
    public void verser(double montant) {
    	solde += montant ;
    	listeOperations.add(new Versement(montant , "dépot"));
    }
    
    public void virement(Compte destnataire , double montant) {
    	if(this.retirer(montant)) {
    		destinataire.verser(montant);
            return true;
        }
        return false;
    }
}
