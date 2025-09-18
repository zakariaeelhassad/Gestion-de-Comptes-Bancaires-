package presentation;

import métier.*;
import services.CompteService;
import java.util.Scanner;

public class menu {
	
	private CompteService compteService ;
	private Scanner sc = new Scanner(System.in);
	
	public menu(CompteService compteService) {
		this.compteService = compteService ;
	}
	
	public void afficherMenu() {
		int choix ;
		do {
			System.out.println("\n---------------- MENU BANQUE ----------------");
	        System.out.println("1. Créer Compte Courant");
	        System.out.println("2. Créer Compte Epargne");
	        System.out.println("3. Verser");
	        System.out.println("4. Retirer");
	        System.out.println("5. Virement");
	        System.out.println("6. Consulter solde");
	        System.out.println("7. Consulter opérations");
	        System.out.println("8. Afficher détails compte");
	        System.out.println("0. Quitter");
	        System.out.print("Choix: ");
	        choix = sc.nextInt();
	        sc.nextLine(); 
	        
	        switch(choix) {
	        case 1 : creerCompteCourant();
	        		break ;
	        case 2 : creerCompteEpargne();
	        		break ;
	        case 3 : virsement();
	        		break ;	
	        default : System.out.println("jnlezf");
	        		break;
	        }
		} while (choix != 0);
        
	}
	
	private void creerCompteCourant() {
		String code = compteService.genererCodeCompte();
    	System.out.print("Entre le solde :");
    	double solde = sc.nextDouble();
    	System.out.print("Découvert autorisé: ");
    	double decouvert = sc.nextDouble();
    	sc.nextLine();
    	compteService.ajouterCompte(new CompteCourant(code , solde , decouvert));
    	System.out.println("compte courant créé ");
    }
	
	private void creerCompteEpargne() {
		String code = compteService.genererCodeCompte();
		System.out.print("Entre le solde :");
    	double solde = sc.nextDouble();
    	System.out.print("Entre toux interet :");
    	double toux = sc.nextDouble();
    	sc.nextLine();
    	compteService.ajouterCompte(new CompteEpargne(code , solde , toux));
    	System.out.println("compte Epargne créé ");
	}
	
	private void virsement() {
		System.out.print("Entre le code :");
		String code = sc.nextLine();
		
		Compte compte = compteService.chercherCompte(code);
		if(compte != null) {
			System.out.print("entre le montant : ");
			double montant = sc.nextDouble();
			compte.verser(montant);
            System.out.println("Versement effectué !");
        } else {
            System.out.println("Compte introuvable !");
        }

	}

}
