
public class Personne {
	private String nom;
	private String prenom;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String toString() {
		return "\t" + "Bonsoir M/Mm :)" + "\n" +
				"\t" + "Nom : " + this.nom + "\n" +
				"\t" + "Prenom : " + this.prenom + "\n" ;
	}
}
