/**
 * 
 */
package Controle;

import java.awt.EventQueue;
import java.io.FileNotFoundException;

import Modèle.*;
import View.*;

/**
 * Cette classe permet le lancement et le fonctionnement de l'application 
 * et la liaison entre les classes du package View et Modèles.
 * 
 * @author Namurois Thomas
 *
 */
public class Controleur {

	/**
	 * @param args
	 */
	private static Héros [] personnage;
	private Volet volet = new Volet();
	private Evenement event;
	private lancerDe de;
	
	//Méthodes de lancement des views
	
	/**
	 * Permet le lancement de la view correspondant à l'accueil.
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
	
	/**
	 * Permet le lancement de la view correspondant à la création d'un personnage.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 1.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 2.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 3.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 4.
	 * */
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
	
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 5.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 6.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 7.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 8.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 9.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 10.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 11.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 12.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 13.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 14.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 15.
	 * */
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
	
	/**
	 * Permet le lancement de la view correspondant au Volet/la situation numéro 16.
	 * */
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
	
	
	
	
	
	//Méthodes de lancement des Modèles
	
	/**
	 * Créé un objet héros avec les valeurs données en paramètre.
	 * L'objet est inséré à la position 0 du tableau personnage.
	 * Lance la méthode .sauverPersonnage() de l'objet à la position 0 de l'arrays
	 * 
	 *  @param nom - nom du personnage / end - son endurance / habi - son habilité / chance - sa chance
	 * */
	public void creerPersonnage(String nom, int endu, int habi, int chance) throws FileNotFoundException {
		personnage[0] = new Héros(nom, endu, habi, chance);
		personnage[0].sauverPersonnage();
	};
	
	/**
	 * Correspond au lancé d'un dé six (création d'un objet de).
	 * Return la valeur du lancé (un nombre allant de 1 à 6).
	 * 
	 * @return de.getDe() - La valeur du lancer de dé
	 * */
	public int lancerDeSix() {
		de = new lancerDe();
		return de.getDe();
	};
	
	/**
	 * Retrun le nom du personnage à la position 0 de l'arrays personnage.
	 * 
	 * @return personnage[0].getNom(); - Nom du personnage
	 * */
	public String prendreNom() throws FileNotFoundException {
		return personnage[0].getNom();
	};
	
	/**
	 * Retrun l'endurance du personnage à la position 0 de l'arrays personnage.
	 * 
	 * @return personnage[0].getEndurance(); - Endurance du personnage
	 * */
	public int prendreEndurance() throws FileNotFoundException {
		return personnage[0].getEndurance();
	};
	
	/**
	 * Modifier la valeur de l'endurance en la diminuant par la valeur passé en paramètre.
	 * Sauvegarde dans le fichier .txt du personnage la nouvelle valeur d'endurance.
	 * 
	 * @param perte - nombre à soustraire de l'endurance du personnage
	 * */
	public void modifierEndurance(int perte) throws FileNotFoundException {
		personnage[0].setEndurance(personnage[0].getEndurance() - perte);
		personnage[0].sauverPersonnage();
	}
	
	/**
	 * Retrun l'habilité du personnage à la position 0 de l'arrays personnage.
	 * 
	 * @return personnage[0].getHabilite(); - Habilité du personnage
	 * */
	public int prendreHabilite() throws FileNotFoundException {
		return personnage[0].getHabilite();
	};
	
	
	/**
	 * Retrun la chance du personnage à la position 0 de l'arrays personnage.
	 * 
	 * @return personnage[0].getChance(); - Chance du personnage
	 * */
	public int prendreChance() throws FileNotFoundException {
		return personnage[0].getChance();
	};
	
	/**
	 * Permet la sauvegarde de la progression dans le jeu en sauvegardant la valeur passé en paramètre.
	 * Lance la sauvegarde des informations du personnage à la position 0 de l'arrays personnage.
	 * 
	 * @param numVolet - numéro du Volet ou nous sommes.
	 * */
	public void sauvegarde(int numVolet) throws FileNotFoundException {
		volet.sauvegarder(numVolet);
		personnage[0].sauverPersonnage();
	};
	
	/**
	 * Génère un héros dans l'array personnage à la position 0.
	 * Remplace le héros par celui du joueur en récupérant les données.
	 * Charge le Volet correspondant à la sauvegarde.
	 * 
	 * */
	public void charger() throws FileNotFoundException {
		personnage[0] = new Héros("",0,0,0);
		personnage[0].recupPersonnage();
		volet.charger();
	}
	
	
	/**
	 * Création d'un événement jet d'habilité.
	 * Prend la valeur de l'habilité du personnage en position 0 de l'arrays personnage.
	 * Créé un nouvelle événement avec en paramètre la valeur de l'habilité.
	 * Retourne true si le jet est réussi et false si le jet est raté.
	 * 
	 * @return event.getResultat() - true si le jet est réussi et false si le jet est raté.
	 * */
	public Boolean eventHabilite() {
		event = new Evenement(personnage[0].getHabilite());
		return event.getResultats();
	}
	
	/**
	 * Création d'un événement jet de chance.
	 * Prend la valeur de la chance du personnage en position 0 de l'arrays personnage.
	 * Créé un nouvelle événement avec en paramètre la valeur de la chance.
	 * Retourne true si le jet est réussi et false si le jet est raté.
	 * 
	 * @return event.getResultat() - true si le jet est réussi et false si le jet est raté.
	 * */
	public Boolean eventChance() {
		event = new Evenement(personnage[0].getHabilite());
		return event.getResultats();
	}
	
	
	//Méthode main
	/**
	 * La méthode main la création d'un nouveau contrôleur et lance le jeu.
	 * Au lancement un nouvel arrays personnage est créé.
	 * */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Controleur controle = new Controleur();
		controle.lancerJeu();
		personnage = new Héros[1];
	}

}
