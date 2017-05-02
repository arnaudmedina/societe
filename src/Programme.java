

public class Programme {

	public static void main(String[] args) {

		Personne formateur;
		Personne programmeur;
		Refugie amadou;
		
		amadou = new Refugie("Amadou", "Ba");
		formateur = new Personne("Eric", "Siber");
		programmeur = new Personne("Arnaud", "Medina", 43);
		Adresse monAdresse = new Adresse("14 bis", "rue du val vert", 93100, "Sainct Denis");

		System.out.println(formateur.toString());
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

	}

}
