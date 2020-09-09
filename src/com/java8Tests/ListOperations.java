/**
 * 
 */
package com.java8Tests;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author dangoswa
 *
 */
public class ListOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1, 4, 20, 5, 40, 43, 12, 5, 20, 32);
		System.out.println(list.stream().sorted().collect(toList()));;
		ListIterator<Integer> listIter = list.listIterator();
		
		try {
			int mod = 0;
			while(listIter.hasNext()) {
				listIter.next();
				if(++mod==2) {
					listIter.add(2);
				}
			}
			System.out.println("list >> "+list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Integer> copyList = new CopyOnWriteArrayList(List.of(1, 4, 20, 5, 40, 43, 12, 5, 20, 32));
		ListIterator<Integer> copylistIter = copyList.listIterator();
		System.out.println("copyList >> "+copyList);
		try {
			int mod = 0;
			while(copylistIter.hasNext()) {
				copylistIter.next();
				if(++mod==2) {
					copyList.add(2);
					copylistIter.add(2);
				}
			}
			System.out.println("copyList1 >> "+copyList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
