

public class Programme {

	public static void main(String[] args) {

		Personne formateur;
		Personne programmeur;
		Refugie amadou;
		
		amadou = new Refugie("Amadou", "Ba");
		formateur = new Personne("Eric", "Siber");
		programmeur = new Personne("Arnaud", "Medina", 43);

		System.out.println(formateur.toString());
		System.out.println(programmeur.toString());

		System.out.println(amadou.toString());

	}

}
