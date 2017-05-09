
public class Personne {

	private String prenom;
	private String nom;
	private Integer age;
	protected Adresse monAdresse;
	
	// constructeur avec prenom nom
	public Personne(String prenom, String nom) {
		super();
		setPrenom(prenom);
		setNom(nom);
	}

	// constructeur avec prenom nom age
	public Personne(String monPrenom, String monNom, Integer monAge) {
		setPrenom(monPrenom);
		setNom(monNom);
		setAge(monAge);
	}

	// méthode pour comparer avec une autre personne
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Personne autrePersonne = (Personne) obj;
		
		if ((autrePersonne.nom == nom) && (autrePersonne.prenom == prenom) && (autrePersonne.age == age))
			return true;
		else
			return false;
	}


	// méthode déménager par détail d'adresse
	public boolean demenager(String numeroDeVoie, String nomDeVoie, int codePostal, String ville) {
		Adresse uneAdresse;
		boolean bDemenagementOk;
		
		uneAdresse = new Adresse (numeroDeVoie, nomDeVoie, codePostal, ville);
		bDemenagementOk = setMonAdresse(uneAdresse);
		return bDemenagementOk;
	}
	
//	// méthode déménager par adresse
//	public boolean demenager(Adresse uneAdresse) {
//		setMonAdresse(uneAdresse);
//		return true;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message;
		message = prenom + " " + nom;
		if (age != null)
			message += " " + age + " ans";
		if ((monAdresse == null) || (monAdresse.toString().length() == 1))
			return message;
		else
			message += " " + monAdresse.toString();
		return message;
	}

	// Getters et setters pour les attributs 
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
		if ((age >= 0) && (age < 200))
			this.age = age;
	}

	public Adresse getMonAdresse() {
		return monAdresse;
	}

	public boolean setMonAdresse(Adresse monAdresse) {
		this.monAdresse = monAdresse;
		return true;
	}
}
