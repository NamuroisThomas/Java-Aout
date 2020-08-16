/**
 * 
 */
package Modèle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Cette classe permet l'enregistrement et la gestion des informations du personnage créé 
 * nécessaire à l'histoire.
 * 
 * @author Namurois Thomas
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
	
	//Constructeur
	/**
	 * Constructeur de la classe Héros
	 * Prend en paramètre les différentes valeurs du personnage pour le créer.
	 * Met en paramètre de setNom() le nom donné en paramètre.
	 * Met en paramètre de setEndurance() l'endurance passé en paramètre + 20
	 * Met en paramètre de setHabilite() l'habilité passé en paramètre + 10
	 * Met en parmètre de setChance() la chance passé en paramètre.
	 * Lance la sauvegarde du personnage en lançant la méthode sauverPersonnage().
	 * 
	 * @param nom endu habi chance Les informations du personnage créer.
	 */
	public Héros(String nom, int endu, int habi, int chance) throws FileNotFoundException {
		setNom(nom);
		setEndurance(endu + 20);
		setHabilite(habi + 10 );
		setChance(chance);
	};
	
	 //Accesseurs
	
	/**
	 * Fourni la valeur pour le nom du personnage.
	 * 
	 * @return nom Le nom du personnage.
	 */
	public String getNom() {
		return nom;
	};
	
	/**
	 * Le nom du personnage devient celui indiqué dans le String 
	 * passé en paramètre.
	 * 
	 * @param nom Le nouveau nom du personnage.
	 */
	public void setNom(String nom) {
		this.nom = nom;
	};
	
	/**
	 * Fourni la valeur de l'endurance du personnage.
	 * 
	 * @return endurance L'endurance du personnage.
	 */
	public int getEndurance() {
		return endurance;
	};
	
	/**
	 * L'endurance du personnage prend la valeur de
	 * l'(int) passé en paramètre.
	 * 
	 * @param endu La nouvelle valeur de endurance
	 */
	public void setEndurance(int endu) {
		this.endurance = endu;
	};
	
	/**
	 * Fourni la valeur de l'habilite du personnage.
	 * 
	 * @return habilite L'habilité du personnage.
	 */
	public int getHabilite() {
		return habilite;
	};
	
	/**
	 * L'habilité du personnage prend la valeur de 
	 * l'(int) passé en paramètre.
	 * 
	 * @param habi La nouvelle valeur de habilite.
	 */
	public void setHabilite(int habi) {
		this.habilite = habi;
	};
	
	/**
	 * Fourni la valeur de la chance du personnage.
	 * 
	 * @return chance La chance du personnage.
	 */
	public int getChance() {
		return chance;
	};
	
	/**
	 * La chance du personnage prend la valkeur de 
	 * l'(int) passé en paramètre.
	 * 
	 * @param chance La nouvelle valeur de chance.
	 */
	public void setChance(int chance) {
		this.chance =  chance;
	};
	
	//Méthodes
	
	
	/**
	 * Lance l'écriture des différentes infos du personnage dans un fichier .txt .
	 */
	public void sauverPersonnage() throws FileNotFoundException {
		PrintStream ps = new PrintStream("Héros");
		ps.println(this.nom);
		ps.println(this.endurance);
		ps.println(this.habilite);
		ps.println(this.chance);
		ps.close();
		
	};
	
	/**
	 * Lance la lecture du fichier .txt contenant les informations du personnage.
	 */
	public void recupPersonnage() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Héros"));
		setNom(sc.nextLine());
		setEndurance(sc.nextInt());
		setHabilite(sc.nextInt());
		setChance(sc.nextInt());
		sc.close();
	};
	

	//Méthode Main
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	}

}
