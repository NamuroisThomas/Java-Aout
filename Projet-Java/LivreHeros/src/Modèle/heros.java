/**
 * 
 */
package Mod�le;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class heros {

	/**
	 * @param args
	 */
	String nom;
	String endurance;
	String habilite;
	String chance; 
	
	public void creer(String nom ,String endu ,String habi ,String chance) throws FileNotFoundException {
		this.nom = nom;
		this.endurance = String.valueOf(Integer.parseInt(endu)+20);
		this.habilite = String.valueOf(Integer.parseInt(habi)+10);
		this.chance = String.valueOf(Integer.parseInt(chance));
		
		PrintStream ps = new PrintStream("H�ros");
		ps.println(this.nom);
		ps.println(this.endurance);
		ps.println(this.habilite);
		ps.println(this.chance);
		ps.close();

	}
	
	public void recupPerso() throws FileNotFoundException {
		Scanner recup = new Scanner(new File("H�ros"));
		nom = recup.nextLine();
		endurance = recup.nextLine();
		habilite = recup.nextLine();
		chance = recup.nextLine();
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getEndurance() {
		return endurance;
	}
	
	public String getHabilite() {
		return habilite;
	}
	
	public String getChance() {
		return chance;
	}
	
	public void modifierEndurance(int modif) throws FileNotFoundException {
		recupPerso();
		endurance = String.valueOf(Integer.parseInt(endurance)- modif);
		
		PrintStream ps = new PrintStream("H�ros");
		ps.println(this.nom);
		ps.println(this.endurance);
		ps.println(this.habilite);
		ps.println(this.chance);
		ps.close();
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	}

}
