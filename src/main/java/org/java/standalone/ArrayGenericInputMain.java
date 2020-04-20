/**
 * 
 */
package org.java.standalone;

import java.util.ArrayList;
import java.util.Scanner;
import org.java.collectionchp.ArrayListGenericInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author prabhu
 *
 */
public class ArrayGenericInputMain {

	 private static Logger log = LoggerFactory.getLogger(ArrayGenericInputMain.class);
	 
	public static void main(String[] args) {
		
		ArrayListGenericInput algi = new ArrayListGenericInput();
		
		ArrayList genList = new ArrayList<>();
		int size =0;
		Scanner scan = new Scanner(System.in);
		
		log.info("Please enter the size of the array");
		
		
		size= scan.nextInt();
		
		log.info("Please enter the values in the array");
		
		for(int i=0;i<size;i++) {
			genList.add(scan.next());
		}
		
		algi.genericArrayInput(genList);
	}

}
