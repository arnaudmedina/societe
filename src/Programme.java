
public class Programme {

	public static void main(String[] args) {

		Personne formateur;
		Personne programmeur;

		formateur = new Personne("Eric", "Siber");
		programmeur = new Personne("Arnaud", "Medina", 43);

		System.out.println(formateur.toString());
		System.out.println(programmeur.toString());

	}

}
