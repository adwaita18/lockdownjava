package org.java.standalone;

import java.util.Scanner;

import org.java.functions.ArrayInputFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author prabhu
 *
 */

public class ArrayInputFunctionMain {

	private static Logger log = LoggerFactory.getLogger(ArrayInputFunctionMain.class);

	
	  static { ApplicationContext ctx = new
	  ClassPathXmlApplicationContext("classpath:/beans.xml");
	  log.info("Context Loaded");
	  
	  }
	 

	
	private static ArrayInputFunction aif;
	
	  @Autowired 	
	  ArrayInputFunctionMain(ArrayInputFunction aif){ 
		  this.aif=aif; 
		  }
	 
	public static void main(String[] args) {

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
		aif.inputArray(capacity);

	}

}
