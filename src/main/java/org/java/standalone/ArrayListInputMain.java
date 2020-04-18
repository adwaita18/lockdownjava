/**
 * 
 */
package org.java.standalone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.java.collectionchp.ArrayListInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author prabhu
 *
 */
public class ArrayListInputMain {

	private static Logger log = LoggerFactory.getLogger(ArrayListInputMain.class);

	static ArrayListInput ali = new ArrayListInput();

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		log.info("Please enter the size of the array list you want to create and display");

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		List<Integer> arrayInputList = new ArrayList<>();

		log.info("The size of the array will be [{}]", size);

		System.out.println("Please start entering the elements into array");

		for (int i = 0; i < size; i++) {
			arrayInputList.add(scan.nextInt());
		}

		ali.arrayListInput(arrayInputList);

	}

}
