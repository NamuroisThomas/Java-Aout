/**
 * 
 */
package Modèle;

import java.io.FileNotFoundException;

/**
 * @author User
 *
 */
public class evenement {

	/**
	 * @param args
	 */
	
	int resultatChance;
	int resultatHabilite;
	
	public int getResultatChance() {
		return resultatChance;
	}
	
	public void setResultatChance(int a) {
		this.resultatChance = a;
	}
	
	public void lancerChance() throws FileNotFoundException {
		de de = new de();
		de.lancerDeVingt();
		heros recup = new heros();
		recup.recupPerso();
		if (de.getDeVingt() < Integer.parseInt(recup.getChance())) {
			setResultatChance(1);
		}
		
		else {
			setResultatChance(0);
		}
	}
	
	public int getResultatHabilite() {
		return resultatHabilite;
	}
	
	public void setResultatHabilite(int a) {
		this.resultatHabilite = a;
	}
	
	public void lancerHabilite() throws FileNotFoundException {
		de de = new de();
		de.lancerDeVingt();
		heros recup = new heros();
		recup.recupPerso();
		if (de.getDeVingt() < Integer.parseInt(recup.getHabilite())) {
			setResultatHabilite(1);
		}
		
		else {
			setResultatHabilite(0);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
