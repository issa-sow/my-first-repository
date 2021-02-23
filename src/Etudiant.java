
public class Etudiant extends Personne {
	private String niveau;
	private double note1;
	private double note2;
	private double moy;
	private Departement dep;
	
	public Etudiant(String nom, String prenom, String niveau, double note1, double note2, String nomDep, String tel, String adresse) {
		super(nom, prenom);
		this.niveau = niveau;
		this.note1 = note1;
		this.note2 = note2;
		this.moy = calculMoy();
		this.dep = new Departement(nomDep, tel, adresse);
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
		return 	"[" + "\n" +
					super.toString() + 
					"\t" + "Niveau : " + this.niveau + "\n" +
					"\t" + "Note 1 : " + this.note1 + "\n" + 
					"\t" + "Note 2 : " + this.note2 + "\n" + 
					"\t" + "Moyenne : " + this.moy + "\n" +
					dep.toString() + "\n" + 
				"]" + "\n" ;
	}

}
