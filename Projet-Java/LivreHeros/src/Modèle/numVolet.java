/**
 * 
 */
package Mod�le;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import Controle.controle;

/**
 * @author User
 *
 */
public class numVolet {

	/**
	 * @param args
	 */
	String fichier = "Sauvegarde";
	int volet;
	controle lancer = new controle();
	
	public void setVolet(String volet) throws FileNotFoundException {
		this.volet = Integer.parseInt(volet);
	}
	
	public int getVolet() throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fichier));
		this.volet = Integer.parseInt(sc.nextLine());
		return this.volet;
	};
	
	public void sauvegarder() throws FileNotFoundException {
		PrintStream ps = new PrintStream(fichier);
		ps.println(volet);
		ps.close();
	};
	
	public void charger(int a) throws IOException {
		
		if (a == 1) {
			lancer.Volet1();
		}
		else if (a == 2) {
			lancer.Volet2();
		}
		else if (a == 3) {
			lancer.Volet3();
		}
		else if (a == 4) {
			lancer.Volet4();
		}
		else if (a == 5) {
			lancer.Volet5();
		}
		else if (a == 6) {
			lancer.Volet6();
		}
		else if (a == 7) {
			lancer.Volet7();
		}
		else if (a == 8) {
			lancer.Volet8();
		}
		else if (a == 9) {
			lancer.Volet9();
		}
		else if (a == 10) {
			lancer.Volet10();
		}
		else if (a == 11) {
			lancer.Volet11();
		}
		else if (a == 12) {
			lancer.Volet12();
		}
		else if (a == 13) {
			lancer.Volet13();
		}
		else if (a == 14) {
			lancer.Volet14();
		}
		else if (a == 15) {
			lancer.Volet15();
		}
		else if (a == 16) {
			lancer.Volet16();
		}
		else {
			System.out.println("aucune partie");
			}
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
