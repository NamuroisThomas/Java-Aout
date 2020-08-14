/**
 * 
 */
package Modèle;

/**
 * @author User
 *
 */
public class Evenement {

	/**
	 * @param args
	 */
	
	private Boolean eventHabilite;
	private Boolean eventChance;
	
	private De de = new De();
	
	public Boolean getEventHabi() {
		return eventHabilite;
	};
	
	public void setEventHabi(int habilite) {
		de.lancerDeVingt();
		if(de.getDeVingt() < habilite) {
			this.eventHabilite = true;
		}
		else {
			this.eventHabilite = false;
		}
	};
	public Boolean getEventChance() {
		return eventChance;
	};
	public void setEventChance(int chance) {
		de.lancerDeVingt();
		if(de.getDeVingt() < chance) {
			this.eventChance = true;
		}
		else {
			this.eventChance = false;
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
