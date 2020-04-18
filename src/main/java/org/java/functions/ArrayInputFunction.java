package org.java.functions;

import java.util.Arrays;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author prabhu
 *
 */
public class ArrayInputFunction {

	private static Logger log = LoggerFactory.getLogger(ArrayInputFunction.class);

	public void inputArray(int size) {

		log.info("Now creating the array of size [{}]", size);
		int inputArray[] = new int[size];
		log.info("\n"+"Array Created Successfully" + "\t"+"Please enter only [{}] elments in the array", size);

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < size; i++) {
			inputArray[i] = scan.nextInt();
		}

		display(inputArray);

	}

	public void display(int[] inputArray) {

		System.out.println("The array" + Arrays.toString(inputArray));
		

	}

}
