
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
}
