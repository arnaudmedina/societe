

public class Adresse {
	String numeroDeVoie;
	String nomDeVoie;
	int codePostal;
	String ville;
	/**
	 * @param numeroDeVoie
	 * @param nomDeVoie
	 * @param codePostal
	 * @param ville
	 */
	public Adresse() {
	}

	public Adresse(String numeroDeVoie, String nomDeVoie, int codePostal, String ville) {
		this.numeroDeVoie = numeroDeVoie;
		this.nomDeVoie = nomDeVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "";
		message = numeroDeVoie + " " + nomDeVoie + "\n" + codePostal + " " + ville; 
		return message;
	}
	
	public String getNumeroDeVoie() {
		return numeroDeVoie;
	}
	public void setNumeroDeVoie(String numeroDeVoie) {
		this.numeroDeVoie = numeroDeVoie;
	}
	public String getNomDeVoie() {
		return nomDeVoie;
	}
	public void setNomDeVoie(String nomDeVoie) {
		this.nomDeVoie = nomDeVoie;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

}
