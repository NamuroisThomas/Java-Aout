/**
 * 
 */
package Modèle;

/**
 *Cette classe permet de générer un nombre allant de 1 à 6.
 *Correspond à un dé à six faces.
 * 
 * @author Namurois Thomas
 *
 */
public class lancerDe {

	/**
	 * 
	 * @param args
	 */
	
	private int de;
	
	//Constructeur
	/**
	 * LancerDe est le constructeur de la classe lanceDe.
	 * lorsque la classe est utilisée, un nombre allant de 1 à 6 est générer.
	 * Le nombre généré est directement passé en paramètre de la fonction setDe().
	 * 
	 * */
	public lancerDe() {
		setDe((int)(1+ 6*Math.random()));
	}

	//Accesseurs
	
	/**
	 * Fourni la valeur du lancé de dé fait précédemment.
	 * 
	 * @return de La valeur du lancer de Dé
	 * */
	public int getDe() {
		return de;
	}
	
	/**
	 * Donne à de la valeur qui est passé en paramètre.
	 * 
	 * @param de La valeur du lancer de Dé 
	 * */
	private void setDe(int de) {
		this.de = de;
	}
	
	//Méthode Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
