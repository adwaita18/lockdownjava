/**
 * 
 */
package org.java.functions;

import java.util.List;

/**
 * @author prabhu
 *
 */
public class ArrayIterator {

	public void iterateArrayTraditionalWay(List<Integer> arrayList) {

		for (Integer arrList : arrayList) {
			System.out.println(arrList);
		}
	}

	public void iterateArrayViaStreams(List<Integer> arrayList) {
		arrayList.stream().forEach(System.out::println);
	}

}
