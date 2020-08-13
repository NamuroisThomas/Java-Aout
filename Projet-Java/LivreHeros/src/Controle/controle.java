/**
 * 
 */
package Controle;

import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;

import Mod�le.de;
import Mod�le.evenement;
import Mod�le.heros;
import Mod�le.numVolet;
import View.*;

/**
 * @author User
 *
 */
public class controle {

	/**
	 * @param args
	 * @return 
	 */

	/* lancement des view*/
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void debutPartie() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newPerso debut = new newPerso();
					debut.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet1 frame = new Volet1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet2 frame = new Volet2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet3 frame = new Volet3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet4 frame = new Volet4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet5() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet5 frame = new Volet5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet6() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet6 frame = new Volet6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet7() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet7 frame = new Volet7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet8() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet8 frame = new Volet8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet9() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet9 frame = new Volet9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet10() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet10 frame = new Volet10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet11() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet11 frame = new Volet11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet12() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet12 frame = new Volet12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet13() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet13 frame = new Volet13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet14() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet14 frame = new Volet14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet15() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet15 frame = new Volet15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Volet16() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volet16 frame = new Volet16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/*lancement Mod�le*/
	public int lancerDeSix() {
		de lancer = new de();
		lancer.lancerDeSix();
		return lancer.getDeSix();
	}
	
	public void creerFiche(String nom, String endu, String habi, String chance) throws FileNotFoundException {
		heros nouveau = new heros();
		nouveau.creer(nom, endu, habi, chance);
	}
	
	public void sauvegardeVolet(String volet) throws FileNotFoundException {
		numVolet num = new numVolet();
		num.setVolet(volet);
		num.sauvegarder();

	}
	
	public void chargerPartie() throws IOException {
		numVolet num = new numVolet();
		num.charger(num.getVolet());
	}
	
	public String prendreNom() throws FileNotFoundException {
		heros perso = new heros();
		perso.recupPerso();
		return	perso.getNom();
	}
	public String prendreEndurance() throws FileNotFoundException {
		heros perso = new heros();
		perso.recupPerso();
		return	perso.getEndurance();
	}
	
	public String prendreHabilite() throws FileNotFoundException {
		heros perso = new heros();
		perso.recupPerso();
		return	perso.getHabilite();
	}
	
	public String prendreChance() throws FileNotFoundException {
		heros perso = new heros();
		perso.recupPerso();
		return perso.getChance();
	};
	
	public int evenementChance() throws FileNotFoundException {
		evenement chance = new evenement();
		chance.lancerChance();
		return chance.getResultatChance();
	}
	
	public int evenementHabilite() throws FileNotFoundException {
		evenement habilite = new evenement();
		habilite.lancerHabilite();
		return habilite.getResultatHabilite();
		
	}
	
	public void modifierEndurance(int modif) throws FileNotFoundException {
		heros modifier = new heros();
		modifier.modifierEndurance(modif);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		controle launch = new controle();
		launch.start();
	}

}
