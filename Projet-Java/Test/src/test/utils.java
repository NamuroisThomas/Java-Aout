/**
 * 
 */
package test;

import java.io.*;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			Scanner dsc = new Scanner(new File("rawData.txt"));
			PrintStream diskWriter = new PrintStream("cooked.txt");
			double unitPrice, total;
			int quantity;
			unitPrice = dsc.nextDouble();
			quantity = dsc.nextInt();
			total = unitPrice * quantity;
			diskWriter.println(total);
			dsc.close();
			diskWriter.close();
	}

}
