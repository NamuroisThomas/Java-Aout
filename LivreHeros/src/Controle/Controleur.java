/**
 * 
 */
package Controle;

import java.awt.EventQueue;
import java.io.FileNotFoundException;

import Modèle.*;
import View.*;

/**
 * @author User
 *
 */
public class Controleur {

	/**
	 * @param args
	 */
	
	Héros personnage = new Héros();
	Volet volet = new Volet();
	Evenement event = new Evenement();
	De de = new De();
	
	/**
	 * Ici se trouverons toutes les méthodes de Controle qui impliques les Vues
	 * */
	public void lancerJeu() {
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
	
	public void creationPersonnage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newPerso frame = new newPerso();
					frame.setVisible(true);
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
	
	
	
	
	
	/**
	 * Ici se trouverons toutes les méthodes de controle qui implique les Modèles
	 * @throws FileNotFoundException 
	 * */
	public void creerPersonnage(String nom, int endu, int habi, int chance) throws FileNotFoundException {
		personnage.creerPersonnage(nom, endu, habi, chance);
	};
	
	public int lancerDeSix() {
		de.lancerDeSix();
		return de.getDeSix();
	};
	
	public String prendreNom() {
		return personnage.getNom();
	};
	
	public int prendreEndurance() {
		return personnage.getEndurance();
	};
	
	public void modifierEndurance(int perte) {
		personnage.setEndurance(personnage.getEndurance() - perte);
	}
	
	public int prendreHabilite() {
		return personnage.getHabilite();
	};
	
	public int prendreChance() {
		return personnage.getChance();
	};
	
	public void sauvegarde(int numVolet) throws FileNotFoundException {
		volet.sauvegarder(numVolet);
		personnage.sauverPersonnage();
	};
	
	public void charger() throws FileNotFoundException {
		personnage.recupPersonnage();
		volet.charger();
	}
	
	public Boolean eventHabilite() {
		event.setEventHabi(personnage.getHabilite());
		return event.getEventHabi();
	}
	
	public Boolean eventChance() {
		event.setEventHabi(personnage.getHabilite());
		return event.getEventHabi();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Controleur controle = new Controleur();
		controle.lancerJeu();
	}

}
