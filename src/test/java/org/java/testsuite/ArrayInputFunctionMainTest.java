/**
 * 
 */
package org.java.testsuite;

import org.java.functions.ArrayInputFunction;
import org.junit.Test;

/**
 * @author prabhu
 *
 */

public class ArrayInputFunctionMainTest {

	ArrayInputFunction aif = new ArrayInputFunction();

	@Test
	public void testArrayInputFunction() {
		aif.inputArray(2);
	}

}
