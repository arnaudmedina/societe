
public class Refugie extends Personne {
	boolean bRegularise;

	// constructeur prenom nom
	public Refugie(String prenom, String nom) {
		super(prenom, nom);
		setRegularise(false);
	}
	
	// constructeur prenom nom age
	public Refugie(String monPrenom, String monNom, int monAge) {
		super(monPrenom, monNom, monAge);
		setRegularise(false);
	}

	// constructeur prenom nom age statutRegularise
	public Refugie(String monPrenom, String monNom, int monAge, boolean estRegularise) {
		super(monPrenom, monNom, monAge);
		setRegularise(estRegularise);
	}

	// constructeur prenom nom age statutRegularise adresse
	public Refugie(String monPrenom, String monNom, int monAge, boolean estRegularise, Adresse monadrese) {
		super(monPrenom, monNom, monAge);
		setRegularise(estRegularise);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message;
		message = super.toString();
		message += bRegularise ? ", est regularise" : ", n'est pas régularisé.";
		return message;
	}

	// Méthode régulariser avec un mot de passe
	public boolean regulariser(String pass) {
		boolean bRetour = false;
		
		if (pass.equals("simplon")) {
			setRegularise(true);
			bRetour = true;
		}
		return bRetour;
	}


	// getters et setters pour le booléen régularise
	public boolean isRegularise() {
		return bRegularise;
	}

	public void setRegularise(boolean estRegularise) {
		this.bRegularise = estRegularise;
	}
	
	public boolean setMonAdresse(Adresse monAdresse) {
		boolean operationOk;
		
		if (bRegularise){
			this.monAdresse = monAdresse;
			operationOk = true;
		}
		else
			operationOk = false;
		return operationOk;
	}
	
}
