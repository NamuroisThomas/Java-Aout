/**
 * 
 */
package Modèle;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import Controle.Controleur;
import View.Accueil;

/**
 * @author User
 *
 */
public class Volet {

	/**
	 * @param args
	 */
	private int numVolet;
	private Controleur controle = new Controleur();
	
	private int getNumVolet() {
		return numVolet;
	};
	
	private void setNumVolet(int volet) {
		this.numVolet = volet;
	};
	
	public void sauvegarder(int volet) throws FileNotFoundException {
		PrintStream ps = new PrintStream("SauvegardeVolet");
		setNumVolet(volet);
		ps.println(numVolet);
		ps.close();
		
	};
	
	public void charger() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SauvegardeVolet"));
		setNumVolet(sc.nextInt());
		
		if(numVolet == 1) {controle.Volet1();}
		else if(numVolet == 2) {controle.Volet2();}
		else if(numVolet == 3) {controle.Volet3();}
		else if(numVolet == 4) {controle.Volet4();}
		else if(numVolet == 5) {controle.Volet5();}
		else if(numVolet == 6) {controle.Volet6();}
		else if(numVolet == 7) {controle.Volet7();}
		else if(numVolet == 8) {controle.Volet8();}
		else if(numVolet == 9) {controle.Volet9();}
		else if(numVolet == 10) {controle.Volet10();}
		else if(numVolet == 11) {controle.Volet11();}
		else if(numVolet == 12) {controle.Volet12();}
		else if(numVolet == 13) {controle.Volet13();}
		else if(numVolet == 14) {controle.Volet14();}
		else if(numVolet == 15) {controle.Volet15();}
		else if(numVolet == 16) {controle.Volet16();}
		else {System.out.println("aucune partie en cours");};
		
		sc.close();
		
	};

	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
