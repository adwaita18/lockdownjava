package org.java.standalone;

import java.util.Scanner;
import org.java.functions.ArrayInputFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayInputFunctionMain {

	private static Logger log = LoggerFactory.getLogger(ArrayInputFunctionMain.class);

	public static void main(String[] args) {

		ArrayInputFunction arrayObj = new ArrayInputFunction();

		log.info("Please enter the size of the array");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int capacity;
		capacity = scan.nextInt();
		if (capacity <= 0) {
			scan.reset();
			log.info("Please enter once more the size should be greater than 0");
			capacity = scan.nextInt();
		}

		scan.nextLine();
		arrayObj.inputArray(capacity);

	}

}
