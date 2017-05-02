
public class Refugie extends Personne {
	boolean estRegularise;

	public boolean isEstRegularise() {
		return estRegularise;
	}

	public void setEstRegularise(boolean estRegularise) {
		this.estRegularise = estRegularise;
	}

	public Refugie(String prenom, String nom) {
		super(prenom, nom);
		setEstRegularise(false);
		// TODO Auto-generated constructor stub
	}

	public Refugie(String monPrenom, String monNom, int monAge) {
		super(monPrenom, monNom, monAge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message;
		message = super.toString();
		message += estRegularise ? ", est regularise" : ", n'est pas régularisé.";
		return message;
	}

	public boolean regulariser(String pass) {
		if (pass.contentEquals("simplon")) {
			setEstRegularise(true);
			return true;
		} else
			return false;

	}

	boolean demenager(String numeroDeVoie, String nomDeVoie, int codePostal, String ville) {
		if (estRegularise) {
			monAdresse = new Adresse(numeroDeVoie, nomDeVoie, codePostal, ville);
			return true;
		}
		return false;
	}
}
