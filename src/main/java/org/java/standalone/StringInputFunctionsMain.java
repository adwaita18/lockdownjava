package org.java.standalone;

import java.util.Scanner;
import org.java.functions.StringInputFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author prabhu
 *
 */
public class StringInputFunctionsMain {
	
	private static Logger log = LoggerFactory.getLogger(StringInputFunctionsMain.class);

	public static void main(String[] args) {
		log.info("Please enter a string of your choice");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
	 String usersString = scan.nextLine();
	 
		StringInputFunction sif = new StringInputFunction();
		sif.inputString(usersString);

	}

}
