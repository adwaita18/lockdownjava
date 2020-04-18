/**
 * 
 */
package org.java.collectionchp;

import java.util.List;
import java.util.Scanner;
import org.java.functions.ArrayIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author prabhu
 *
 */
public class ArrayListInput {

	private static Logger log = LoggerFactory.getLogger(ArrayListInput.class);

	ArrayIterator ai = new ArrayIterator();

	@SuppressWarnings("resource")
	public void arrayListInput(List<Integer> arrayList) {

		System.out.println("The list is as follows"+ arrayList);

		log.info("Please enter the way you want to iterate the array" + "\t" + "Traditional Way" + "\n" + "Via Streams");

		Scanner scan = new Scanner(System.in);
		String iterationMethod = scan.nextLine();

		switch (iterationMethod) {
		case "Traditional Way":
			ai.iterateArrayTraditionalWay(arrayList);
			break;

		case "Via Streams":
			ai.iterateArrayViaStreams(arrayList);
			break;

		default:
			log.info("No entries found");

		}

	}

}
