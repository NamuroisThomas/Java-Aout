/**
 * 
 */
package Mod�le;

/**
 *Cette classe permet de g�n�rer un nombre allant de 1 � 20.
 *Correspond � un d� � vingt faces.
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
	 * lorsque la classe est utilis�e, un nombre allant de 1 � 20 est g�n�rer.
	 * Le nombre g�n�r� est directement pass� en param�tre de la fonction setDeVingt().
	 * 
	 * */
	public lancerDeVingt() {
		setDeVingt((int)(1+ 20*Math.random()));
	}

	//Accesseurs
	
	/**
	 * Fourni la valeur du lanc� de d� fait pr�c�demment.
	 * 
	 * @return deVingt La valeur du lancer de D�
	 * */
	
	public int getDeVingt() {
		return deVingt;
	}
	
	/**
	 * Donne � deVingt la valeur qui est pass� en param�tre.
	 * 
	 * @param deVingt La valeur du lancer de D� 
	 * */
	private void setDeVingt(int deVingt) {
		this.deVingt = deVingt;
	}
	
	//M�thode main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
