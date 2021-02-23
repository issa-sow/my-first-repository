
public class Departement {
	private String nomDep;
	private String tel;
	private String adresse;
	
	public Departement(String nomDep, String tel, String adresse) {
		this.nomDep = nomDep;
		this.tel = tel;
		this.adresse = adresse;
	}
	
	public String getNomDep() {
		return this.nomDep;
	}
	
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAdresse() {
		return this.adresse;
	}
	
	public void setAdresse(String adresse) {
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
