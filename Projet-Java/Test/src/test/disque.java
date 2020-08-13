package test;
/**
 * 
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author User
 *
 */
import java.io.PrintStream;
public class disque {

	/**
	 * @param args
	 */
	static PrintStream ps;
	
	
	String nom = "moi";
	int age = 18;
	int pv = 25;
	
	public void heros() {
		/*insertion dans le fichier*/
		ps.println(nom);
		ps.println(age);
		ps.println(pv);
		
		/*lecture en console*/
		
		
		
	}
	static Scanner diskScanner;
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		throws FileNotFoundException {
			
			ps = new PrintStream("Héros");
			disque perso = new disque();
			perso.heros();
			ps.close();
				
			}		
			
		}
