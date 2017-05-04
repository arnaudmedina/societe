
public class Programme {

	public static void main(String[] args) {

		Personne formateur;
		Personne programmeur;
		Refugie amadou;

		amadou = new Refugie("Amadou", "Ba");
		formateur = new Personne("Eric", "Siber");
		programmeur = new Personne("Arnaud", "Medina", 43);
		Adresse monAdresse = new Adresse("14 bis", "rue du val vert", 93100, "Sainct Denis");

		System.out.println(formateur);
		System.out.println(programmeur.toString());

		System.out.println(amadou.toString());

		amadou.regulariser("azerty");
		System.out.println(amadou.toString());
		amadou.demenager("4", "rue du chien qui fume", 75001, "Paris");
		System.out.println(amadou.toString());

		System.out.println("Après déménagement");
		amadou.regulariser("simplon");
		System.out.println(amadou.toString());

		amadou.setMonAdresse(monAdresse);
		System.out.println(amadou.toString());
		amadou.demenager("4", "rue du chien qui fume", 75001, "Paris");
		System.out.println(amadou.toString());
		/*
		 * if (amadou.equalsto(programmeur)==true)
		 * System.out.println("Amadou est le progammeur"); else
		 * System.out.println("Amadou n'est pas le progammeur");
		 */

		if (amadou == programmeur)
			System.out.println("Amadou est le progammeur");
		else
			System.out.println("Amadou n'est pas le progammeur");

		amadou = new Refugie("Arnaud", "Medina");
		amadou.setAge(43);


		if (amadou.equalsto(programmeur) )
			System.out.println("Amadou est le progammeur");
		else
			System.out.println("Amadou n'est pas le progammeur");
	}
}