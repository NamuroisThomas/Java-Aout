/**
 * 
 */
package Mod�le;

/**
 * @author User
 *
 */
public class de {

	/**
	 * @param args
	 */
	int deSix;
	int deVingt;
	
	/**
	 * 
	 */
	public int getDeSix() {
		return deSix;
	}
	
	public void setDeSix(int de) {
		this.deSix = de;
	}
	
	public void lancerDeSix() {
		deSix = ((int)(Math.random() * 6 +1));
		setDeSix(deSix);
	}
	
	public int getDeVingt() {
		return deVingt;
	}
	
	public void setDeVingt(int de) {
		this.deVingt = de;
	}
	
	public void lancerDeVingt() {
		deVingt = ((int)(Math.random() * 20 +1));
		setDeVingt(deVingt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
