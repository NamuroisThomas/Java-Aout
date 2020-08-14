/**
 * 
 */
package Modèle;

/**
 * @author User
 *
 */
public class De {

	/**
	 * @param args
	 */
	
	private int deSix;
	private int deVingt;
	
	/**
	 * Méthodes*/
	
	public int getDeSix() {
		return deSix;
	};
	
	private void setDeSix(int de) {
		this.deSix = de;
	};
	
	public void lancerDeSix() {
		setDeSix((int)(1+ 6*Math.random()));
	};
	
	public int getDeVingt() {
		return deVingt;
	};
	
	private void setDeVingt(int de) {
		this.deVingt = de;
	};
	
	public void lancerDeVingt() {
		setDeVingt((int)(1+ 20*Math.random()));
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
