package métier;

public class Versement extends Operation{
	private String source;
	
	public Versement(double montant , String source) {
		super(montant);
		this.source = source ;
	}
	
	public String toString() {
		return "" ;
	}
}

