package org.java.functions;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author prabhu
 *
 */
public class StringInputFunction {

	private static Logger log = LoggerFactory.getLogger(StringInputFunction.class);

	StringFunctions strFun = new StringFunctions();

	public void inputString(String str) {

		log.info("The string entered from the user is [{}]", str);

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		log.info("Please choose one operation from  below given choices"+ "\n");
		
		System.out.println("pallindrome, reverse, anagram, wordcount,findduplicate");
		
		String stringToCheck = scan.nextLine();

		switch (stringToCheck) {
		case "pallindrome":
			strFun.checkPallindrome(str);
			break;
		default:
			log.info("NO entries made");

		}
	}

}
