/**
 * 
 */
package Controle;

import java.awt.EventQueue;
import java.io.FileNotFoundException;

import Mod�le.*;
import View.*;

/**
 * Cette classe permet le lancement et le fonctionnement de l'application 
 * et la liaison entre les classes du package View et Mod�les.
 * 
 * @author Namurois Thomas
 *
 */
public class Controleur {

	/**
	 * @param args
	 */
	private static H�ros [] personnage;
	private Volet volet = new Volet();
	private Evenement event;
	private lancerDe de;
	
	//M�thodes de lancement des views
	
	/**
	 * Permet le lancement de la view correspondant � l'accueil.
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
	 * Permet le lancement de la view correspondant � la cr�ation d'un personnage.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 1.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 2.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 3.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 4.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 5.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 6.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 7.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 8.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 9.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 10.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 11.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 12.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 13.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 14.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 15.
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
	 * Permet le lancement de la view correspondant au Volet/la situation num�ro 16.
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
	
	
	
	
	
	//M�thodes de lancement des Mod�les
	
	/**
	 * Cr�� un objet h�ros avec les valeurs donn�es en param�tre.
	 * L'objet est ins�r� � la position 0 du tableau personnage.
	 * Lance la m�thode .sauverPersonnage() de l'objet � la position 0 de l'arrays
	 * 
	 *  @param nom - nom du personnage / end - son endurance / habi - son habilit� / chance - sa chance
	 * */
	public void creerPersonnage(String nom, int endu, int habi, int chance) throws FileNotFoundException {
		personnage[0] = new H�ros(nom, endu, habi, chance);
		personnage[0].sauverPersonnage();
	};
	
	/**
	 * Correspond au lanc� d'un d� six (cr�ation d'un objet de).
	 * Return la valeur du lanc� (un nombre allant de 1 � 6).
	 * 
	 * @return de.getDe() - La valeur du lancer de d�
	 * */
	public int lancerDeSix() {
		de = new lancerDe();
		return de.getDe();
	};
	
	/**
	 * Retrun le nom du personnage � la position 0 de l'arrays personnage.
	 * 
	 * @return personnage[0].getNom(); - Nom du personnage
	 * */
	public String prendreNom() throws FileNotFoundException {
		return personnage[0].getNom();
	};
	
	/**
	 * Retrun l'endurance du personnage � la position 0 de l'arrays personnage.
	 * 
	 * @return personnage[0].getEndurance(); - Endurance du personnage
	 * */
	public int prendreEndurance() throws FileNotFoundException {
		return personnage[0].getEndurance();
	};
	
	/**
	 * Modifier la valeur de l'endurance en la diminuant par la valeur pass� en param�tre.
	 * Sauvegarde dans le fichier .txt du personnage la nouvelle valeur d'endurance.
	 * 
	 * @param perte - nombre � soustraire de l'endurance du personnage
	 * */
	public void modifierEndurance(int perte) throws FileNotFoundException {
		personnage[0].setEndurance(personnage[0].getEndurance() - perte);
		personnage[0].sauverPersonnage();
	}
	
	/**
	 * Retrun l'habilit� du personnage � la position 0 de l'arrays personnage.
	 * 
	 * @return personnage[0].getHabilite(); - Habilit� du personnage
	 * */
	public int prendreHabilite() throws FileNotFoundException {
		return personnage[0].getHabilite();
	};
	
	
	/**
	 * Retrun la chance du personnage � la position 0 de l'arrays personnage.
	 * 
	 * @return personnage[0].getChance(); - Chance du personnage
	 * */
	public int prendreChance() throws FileNotFoundException {
		return personnage[0].getChance();
	};
	
	/**
	 * Permet la sauvegarde de la progression dans le jeu en sauvegardant la valeur pass� en param�tre.
	 * Lance la sauvegarde des informations du personnage � la position 0 de l'arrays personnage.
	 * 
	 * @param numVolet - num�ro du Volet ou nous sommes.
	 * */
	public void sauvegarde(int numVolet) throws FileNotFoundException {
		volet.sauvegarder(numVolet);
		personnage[0].sauverPersonnage();
	};
	
	/**
	 * G�n�re un h�ros dans l'array personnage � la position 0.
	 * Remplace le h�ros par celui du joueur en r�cup�rant les donn�es.
	 * Charge le Volet correspondant � la sauvegarde.
	 * 
	 * */
	public void charger() throws FileNotFoundException {
		personnage[0] = new H�ros("",0,0,0);
		personnage[0].recupPersonnage();
		volet.charger();
	}
	
	
	/**
	 * Cr�ation d'un �v�nement jet d'habilit�.
	 * Prend la valeur de l'habilit� du personnage en position 0 de l'arrays personnage.
	 * Cr�� un nouvelle �v�nement avec en param�tre la valeur de l'habilit�.
	 * Retourne true si le jet est r�ussi et false si le jet est rat�.
	 * 
	 * @return event.getResultat() - true si le jet est r�ussi et false si le jet est rat�.
	 * */
	public Boolean eventHabilite() {
		event = new Evenement(personnage[0].getHabilite());
		return event.getResultats();
	}
	
	/**
	 * Cr�ation d'un �v�nement jet de chance.
	 * Prend la valeur de la chance du personnage en position 0 de l'arrays personnage.
	 * Cr�� un nouvelle �v�nement avec en param�tre la valeur de la chance.
	 * Retourne true si le jet est r�ussi et false si le jet est rat�.
	 * 
	 * @return event.getResultat() - true si le jet est r�ussi et false si le jet est rat�.
	 * */
	public Boolean eventChance() {
		event = new Evenement(personnage[0].getHabilite());
		return event.getResultats();
	}
	
	
	//M�thode main
	/**
	 * La m�thode main la cr�ation d'un nouveau contr�leur et lance le jeu.
	 * Au lancement un nouvel arrays personnage est cr��.
	 * */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Controleur controle = new Controleur();
		controle.lancerJeu();
		personnage = new H�ros[1];
	}

}
