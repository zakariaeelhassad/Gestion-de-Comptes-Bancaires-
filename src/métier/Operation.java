package métier;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Operation {

	protected String numero ;
	protected LocalDate date ;
	protected double montant ;
	
	public Operation (double montant) {
		this.numero = UUID.randomUUID().toString() ;
		this.date = LocalDate.now() ;
		this.montant = montant ;
	}
	
	public abstract String toString();
}
