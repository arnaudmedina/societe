
public class Personne {

	String prenom;

	String nom;
	int age;

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message;
		message = prenom + " " + nom;
		if (age != 0)
			message += " " + age;
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

}
