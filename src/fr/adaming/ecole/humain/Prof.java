package fr.adaming.ecole.humain;

public class Prof extends Humain {
 String diplome ;
 int salaire ;
 
 
 
 // constructeur usig filds
 
	public Prof() {
	super();
	// TODO Auto-generated constructor stub
	}





	public Prof(int salaire) {
		super();
		this.salaire = salaire;
	}





	public Prof(String diplome, int salaire) {
		super();
		this.diplome = diplome;
		this.salaire = salaire;
	}





	public void enseigne() {
		System.out.println("j'enseigne ......");
	}





	@Override
	public String toString() {
		return "Prof [diplome=" + diplome + ", salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom + ", age="
				+ age + ", adresse=" + adresse + ", sex=" + sex + "]";
	}
	
	
	
	
}
