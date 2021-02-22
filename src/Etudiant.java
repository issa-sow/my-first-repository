
public class Etudiant {
	private String nom;
	private String prenom;
	private String niveau;
	private double note1;
	private double note2;
	private double moy;
	
	public Etudiant(String nom, String prenom, String niveau, double note1, double note2) {
		this.nom = nom;
		this.prenom =prenom;
		this.niveau = niveau;
		this.note1 = note1;
		this.note2 = note2;
		this.moy = calculMoy();
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
	
	public double getNote1() {
		return this.note1;
	}
	
	public double getNote2() {
		return this.note2;
	}
	
	public double calculMoy() {
		return (this.note1 + this.note2) / 2;
	}
	
	public String toString() {
		return "Nom : " + this.nom + "\n" + 
				"Prenom : " + this.prenom + "\n" +
				"Niveau : " + this.niveau + "\n" +
				"Note 1 : " + this.note1 + "\n" + 
				"Note 2 : " + this.note2 + "\n" + 
				"Moyenne : " + this.moy;
	}

}
