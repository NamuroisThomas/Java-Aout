/**
 * 
 */
package Mod�le;

/**
 * La classe Evenement est utilis� lorsque, pendant l'aventure, le h�ros va doit faire un jet
 * de d� et comparer le r�sultats avec l'une des statistiques engager.
 * 
 * @author Namurois Thomas
 *
 */
public class Evenement {

	/**
	 * 
	 * @param args
	 */
	private boolean resultats;
	private lancerDeVingt de = new lancerDeVingt();
	
	//Constructeur
	/**
	 * Lorsqu'un �v�nement est lanc�, le constructeur prend en param la valeur de la stat de personnage � comparer.
	 * Si statPerso est plus petit que le lancer de d� initialiser par new lancerDeVingt, resultats sera �gal a true et donc l'action sera r�ussite.
	 * Si statPerso est plus grand que le lancer de d� initialiser par new lancerDeVingt, resultats sera �gal a true et donc l'action sera rat�.
	 * 
	 *@param statperso La statistique (habilite ou chance) � comparer avec un lancer de d�.
	 **/
	public Evenement(int statPerso) {
		if(statPerso < de.getDeVingt()) {
			setResultats(true);
		}
		else {
			setResultats(false);
		};
	}
	
	//Accesseurs
	/**
	 * La valeur pass� en param�tre devient la valeur de resultats.
	 * 
	 * @param b La valeur que va prendre resultats.
	 * */
	
	private void setResultats(boolean b) {
		this.resultats = b;		
	}

	/**
	 * Fourni la valeur de resultats ce qui permet de savoir si un jet de d� est r�ussi ou non.
	 * 
	 * @return resultats la valeur de resultats.
	 * */
	public boolean getResultats() {
		return resultats;
	}
	
	//M�thode main
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}







}
