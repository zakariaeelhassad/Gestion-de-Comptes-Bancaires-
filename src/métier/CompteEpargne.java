package métier;

public class CompteEpargne extends Compte {
	private double touxInteret ;
	
	public CompteEpargne(String code , double solde , double touxInteret) {
		super(code , solde );
		this.touxInteret = touxInteret ;
	}
	
	public boolean retirer(double montant) {
		if(solde - montant >= 0) {
			solde -= montant ;
			return true ;
		} else {
			return false;
		}
	}
	
	public double calculerInteret() {
		return solde * touxInteret / 100 ;
	}
	
	public void afficherDetails() {
		System.out.println("Compte Epargne - Code: " + code 
				+ ", Solde: " + solde 
				+ ", Intérêt: " + calculerInteret());
	}
}
