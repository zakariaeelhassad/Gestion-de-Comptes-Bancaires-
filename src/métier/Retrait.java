package métier;

public class Retrait extends Operation{
	private String destination;

	public Retrait(double montant , String destination) {
		super(montant);
		this.destination = destination ;
	}
	
	public String toString() {
		return "" ;
	}
}
