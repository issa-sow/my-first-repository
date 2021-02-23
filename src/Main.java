
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant[] students = {
				new Etudiant("Sall", "Moustapha", "Master 1", 14, 13, "LIAGE", "77 855 87 55", "XX200"),
				new Etudiant("Ndiaye", "Yoro", "Licence 3", 14, 13, "RSS", "77 469 32 01", "YY-560")
		};
		
		for(Etudiant etu : students) {
			System.out.println(etu);
		}
	}

}
