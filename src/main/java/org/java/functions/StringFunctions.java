package org.java.functions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author prabhu
 *
 */
public class StringFunctions {
	
	private static Logger log = LoggerFactory.getLogger(StringFunctions.class); 
	public void checkPallindrome(String str) {
		
		StringBuffer strbuff= new StringBuffer(str);
		String reversedString =strbuff.reverse().toString();
		if (str.equals(reversedString)) {
			log.info("Given String is a Pallindrome");
		}
		else {
			log.info("Given String is not a Pallindrome");
		}
	}

}
