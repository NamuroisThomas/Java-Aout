/**
 * 
 */
package Modèle;

/**
 * La classe Evenement est utilisé lorsque, pendant l'aventure, le héros va doit faire un jet
 * de dé et comparer le résultats avec l'une des statistiques engager.
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
	 * Lorsqu'un évènement est lancé, le constructeur prend en param la valeur de la stat de personnage à comparer.
	 * Si statPerso est plus petit que le lancer de dé initialiser par new lancerDeVingt, resultats sera égal a true et donc l'action sera réussite.
	 * Si statPerso est plus grand que le lancer de dé initialiser par new lancerDeVingt, resultats sera égal a true et donc l'action sera raté.
	 * 
	 *@param statperso La statistique (habilite ou chance) à comparer avec un lancer de dé.
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
	 * La valeur passé en paramètre devient la valeur de resultats.
	 * 
	 * @param b La valeur que va prendre resultats.
	 * */
	
	private void setResultats(boolean b) {
		this.resultats = b;		
	}

	/**
	 * Fourni la valeur de resultats ce qui permet de savoir si un jet de dé est réussi ou non.
	 * 
	 * @return resultats la valeur de resultats.
	 * */
	public boolean getResultats() {
		return resultats;
	}
	
	//Méthode main
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}







}
