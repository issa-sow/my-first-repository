
public class Departement {
	private String nomDep;
	private String tel;
	private String adresse;
	
	public Departement(String nomDep, String tel, String adresse) {
		this.nomDep = nomDep;
		this.tel = tel;
		this.adresse = adresse;
	}
	
	public String toString() {
		return "\t" + "Departement { " + "\n" +
				"\t\t" + "Nom departement : " + this.nomDep + "\n" + 
				"\t\t" + "Téléphone : " + this.tel + "\n" + 
				"\t\t" + "Adresse : " + this.adresse + "\n" +
				"\t" + "}" ; 
	}
}
