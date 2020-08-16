/**
 * 
 */
package Mod�le;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Cette classe permet l'enregistrement et la gestion des informations du personnage cr�� 
 * n�cessaire � l'histoire.
 * 
 * @author Namurois Thomas
 *
 */
public class H�ros {

	/**
	 * @param args
	 */
	private String nom;
	private int endurance;
	private int habilite;
	private int chance;
	
	//Constructeur
	/**
	 * Constructeur de la classe H�ros
	 * Prend en param�tre les diff�rentes valeurs du personnage pour le cr�er.
	 * Met en param�tre de setNom() le nom donn� en param�tre.
	 * Met en param�tre de setEndurance() l'endurance pass� en param�tre + 20
	 * Met en param�tre de setHabilite() l'habilit� pass� en param�tre + 10
	 * Met en parm�tre de setChance() la chance pass� en param�tre.
	 * Lance la sauvegarde du personnage en lan�ant la m�thode sauverPersonnage().
	 * 
	 * @param nom endu habi chance Les informations du personnage cr�er.
	 */
	public H�ros(String nom, int endu, int habi, int chance) throws FileNotFoundException {
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
	 * Le nom du personnage devient celui indiqu� dans le String 
	 * pass� en param�tre.
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
	 * l'(int) pass� en param�tre.
	 * 
	 * @param endu La nouvelle valeur de endurance
	 */
	public void setEndurance(int endu) {
		this.endurance = endu;
	};
	
	/**
	 * Fourni la valeur de l'habilite du personnage.
	 * 
	 * @return habilite L'habilit� du personnage.
	 */
	public int getHabilite() {
		return habilite;
	};
	
	/**
	 * L'habilit� du personnage prend la valeur de 
	 * l'(int) pass� en param�tre.
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
	 * l'(int) pass� en param�tre.
	 * 
	 * @param chance La nouvelle valeur de chance.
	 */
	public void setChance(int chance) {
		this.chance =  chance;
	};
	
	//M�thodes
	
	
	/**
	 * Lance l'�criture des diff�rentes infos du personnage dans un fichier .txt .
	 */
	public void sauverPersonnage() throws FileNotFoundException {
		PrintStream ps = new PrintStream("H�ros");
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
		Scanner sc = new Scanner(new File("H�ros"));
		setNom(sc.nextLine());
		setEndurance(sc.nextInt());
		setHabilite(sc.nextInt());
		setChance(sc.nextInt());
		sc.close();
	};
	

	//M�thode Main
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	}

}
