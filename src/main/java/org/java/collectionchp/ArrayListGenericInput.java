/**
 * 
 */
package org.java.collectionchp;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author prabhu
 *
 */
public class ArrayListGenericInput {
	
	 private static Logger log = LoggerFactory.getLogger(ArrayListGenericInput.class);

	public <T> void genericArrayInput(List<T> genericArrayList) {
		
		log.info("Now displaying the array");

		for (T genArrList : genericArrayList) {
			System.out.println("\n"+genArrList);

		}

	}
}
