package métier;

public class CompteCourant extends Compte {
	private double decouvert ;
	
	public CompteCourant(String code , double solde , double decouvert) {
        super(code , solde);
        this.decouvert = decouvert ;
    }
	
	public boolean retirer(double montant) {
		if(solde - montant >= -decouvert) {
			solde -= montant ;
			return true ;
		} else {
			return false;
		}
	}
	
	public double calculerInteret() {
		return 0;
	}
	
	public void afficherDetails() {
		System.out.println("Compte Courant - Code: " + code 
				+ ", Solde: " + solde 
				+ ", Découvert autorisé: " + decouvert);
	}
}
