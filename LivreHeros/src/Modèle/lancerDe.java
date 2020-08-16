/**
 * 
 */
package Mod�le;

/**
 *Cette classe permet de g�n�rer un nombre allant de 1 � 6.
 *Correspond � un d� � six faces.
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
	 * lorsque la classe est utilis�e, un nombre allant de 1 � 6 est g�n�rer.
	 * Le nombre g�n�r� est directement pass� en param�tre de la fonction setDe().
	 * 
	 * */
	public lancerDe() {
		setDe((int)(1+ 6*Math.random()));
	}

	//Accesseurs
	
	/**
	 * Fourni la valeur du lanc� de d� fait pr�c�demment.
	 * 
	 * @return de La valeur du lancer de D�
	 * */
	public int getDe() {
		return de;
	}
	
	/**
	 * Donne � de la valeur qui est pass� en param�tre.
	 * 
	 * @param de La valeur du lancer de D� 
	 * */
	private void setDe(int de) {
		this.de = de;
	}
	
	//M�thode Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
