import services.CompteService;
import presentation.menu;

public class Main {

	public static void main(String[] args) {
		CompteService compteService = new CompteService();
        menu menu = new menu(compteService);
        menu.afficherMenu();
	}

}
