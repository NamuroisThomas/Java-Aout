/**
 * 
 */
package Modèle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Héros {

	/**
	 * @param args
	 */
	private String nom;
	private int endurance;
	private int habilite;
	private int chance;
	
	/**
	 * Méthodes
	 * */
	public String getNom() {
		return nom;
	};
	
	public void setNom(String nom) {
		this.nom = nom;
	};
	
	public int getEndurance() {
		return endurance;
	};
	
	public void setEndurance(int endu) {
		this.endurance = endu;
	};
	
	public int getHabilite() {
		return habilite;
	};
	
	public void setHabilite(int habi) {
		this.habilite = habi;
	};
	
	public int getChance() {
		return chance;
	};
	
	public void setChance(int chance) {
		this.chance =  chance;
	};
	
	public void creerPersonnage(String nom, int endu, int habi, int chance) throws FileNotFoundException {
		setNom(nom);
		setEndurance(endu + 20);
		setHabilite(habi + 10 );
		setChance(chance);
		sauverPersonnage();
	};
	
	public void sauverPersonnage() throws FileNotFoundException {
		PrintStream ps = new PrintStream("Héros");
		ps.println(this.nom);
		ps.println(this.endurance);
		ps.println(this.habilite);
		ps.println(this.chance);
		ps.close();
		
	};
	
	public void recupPersonnage() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Héros"));
		setNom(sc.nextLine());
		setEndurance(sc.nextInt());
		setHabilite(sc.nextInt());
		setChance(sc.nextInt());
		sc.close();
	};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	}

}
