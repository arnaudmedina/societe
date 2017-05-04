
public class Personne {

	private String prenom;
	private String nom;
	private int age;
	protected Adresse monAdresse;

	public Personne(String prenom, String nom) {
		super();
		setPrenom(prenom);
		setNom(nom);
	}

	public Personne(String monPrenom, String monNom, int monAge) {
		setPrenom(monPrenom);
		setNom(monNom);
		setAge(monAge);
	}

	public boolean equalsto(Personne autrePersonne) {
		if ((autrePersonne.nom == nom) && (autrePersonne.prenom == prenom) && (autrePersonne.age == age))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message;
		message = prenom + " " + nom;
		if (age != 0)
			message += " " + age + " ans";
		if ((monAdresse == null) || (monAdresse.toString().length() == 1))
			return message;
		else
			message += " " + monAdresse.toString();
		return message;
	}

	public String getPrenom() {
		return prenom;
	}

	private void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	private void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ((age > 0) && (age < 200))
			this.age = age;
	}

	public Adresse getMonAdresse() {
		return monAdresse;
	}

	public void setMonAdresse(Adresse monAdresse) {
		this.monAdresse = monAdresse;
	}

}
