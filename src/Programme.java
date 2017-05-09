
public class Programme {

	public static void main(String[] args) {

		Personne formateur;
		Personne programmeur;
		Refugie amadou;
		Adresse monAdresse;

		amadou = new Refugie("Amadou", "Ba");
		formateur = new Personne("Eric", "Siber");
		programmeur = new Personne("Arnaud", "Medina", 43);
		monAdresse = new Adresse("14 bis", "rue du val vert", 93100, "Sainct Denis");

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

		if (amadou == programmeur)
			System.out.println("Amadou est le progammeur");
		else
			System.out.println("Amadou n'est pas le progammeur");

		amadou = new Refugie("Arnaud", "Medina");
		Refugie amadou2 = new Refugie("Arnaud", "Medina");


		if (amadou.equals(amadou2))
			System.out.println("Amadou est égal au programmeur");
		else
			System.out.println("Amadou n'est pas égal au programmeur");
		
		// ETAPE 14 : un refugié non régularisé ne peut pas déménager
		System.out.println("///////////////////////////////////////////////////////////////////////////");	
		amadou = new Refugie("Amadou", "Ba", 14, false);
		amadou.demenager("12", "rue de la paix", 75004, "Paris");
		System.out.println("Si tout va bien, Amadou n'a pas pu déménager ! Il n'a pas d'adresse ");
		System.out.println(amadou.toString());

		System.out.println("On régularise Amadou et on réessaye ");
		amadou.regulariser("simplon");
		amadou.demenager("12", "rue de la paix", 75004, "Paris");
		System.out.println(amadou.toString());
	}
}