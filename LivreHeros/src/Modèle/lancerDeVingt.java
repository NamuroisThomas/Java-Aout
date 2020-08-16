/**
 * 
 */
package Modèle;

/**
 *Cette classe permet de générer un nombre allant de 1 à 20.
 *Correspond à un dé à vingt faces.
 * 
 * @author Namurois Thomas
 *
 */
public class lancerDeVingt {

	/**
	 * 
	 * @param args
	 */
	private int deVingt;
	
	//Constructeur
	
	/**
	 * LancerDe est le constructeur de la classe lanceDeVingt.
	 * lorsque la classe est utilisée, un nombre allant de 1 à 20 est générer.
	 * Le nombre généré est directement passé en paramètre de la fonction setDeVingt().
	 * 
	 * */
	public lancerDeVingt() {
		setDeVingt((int)(1+ 20*Math.random()));
	}

	//Accesseurs
	
	/**
	 * Fourni la valeur du lancé de dé fait précédemment.
	 * 
	 * @return deVingt La valeur du lancer de Dé
	 * */
	
	public int getDeVingt() {
		return deVingt;
	}
	
	/**
	 * Donne à deVingt la valeur qui est passé en paramètre.
	 * 
	 * @param deVingt La valeur du lancer de Dé 
	 * */
	private void setDeVingt(int deVingt) {
		this.deVingt = deVingt;
	}
	
	//Méthode main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
