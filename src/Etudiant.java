
public class Etudiant {
	private String nom;
	private String prenom;
	private String niveau;
	
	public Etudiant(String nom, String prenom, String niveau) {
		this.nom = nom;
		this.prenom =prenom;
		this.niveau = niveau;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getNiveau() {
		return this.niveau;
	}
	
	public String toString() {
		return "Nom : " + this.nom + "\n" + 
				"Prenom : " + this.prenom + "\n" +
				"Niveau : " + this.niveau ;
	}

}
