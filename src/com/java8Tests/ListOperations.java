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
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8Tests.model.Trader;

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
		//verifyDeepCopyOrShallow();
		//deepCopyList();
		//listIntersection();
		listUnion();
	}
	/**
	 * Original list and list after filter are different. If add any element in 
	 * original list , it doesn't reflect in filtered list and vice versa.
	 * However elements from original list are not copied. If you make any change
	 * in filter list elements , it will be reflected in original list.
	 */
	static void verifyDeepCopyOrShallow() {
		List<Trader> listOrig = Trader.getTraderList();
		System.out.println("listOrig seize >> "+listOrig.size());
		List<Trader> filtered = listOrig.stream()
				.filter(trader->"Pune".equals(trader.getCity()))
				.collect(Collectors.toList());
		System.out.println("filtered seize >> "+filtered.size());
		filtered.get(0).setCity("Nagput");
		filtered.add(new Trader("Dhampur", "Balrampur"));	
		System.out.println("listOrig 1 seize >> "+listOrig.size());
		System.out.println("filtered 1 seize >> "+filtered.size());
		System.out.println("filtered >> "+filtered);
		System.out.println("listOrig >> "+listOrig);
	}
	
	static void deepCopyList() {
		List<Trader> listOrig = Trader.getTraderList();
		System.out.println("listOrig seize >> "+listOrig.size());
		List<Trader> filtered = listOrig.stream()
				.filter(trader->"Pune".equals(trader.getCity()))
				.map(trader->copyTrader(trader))
				.collect(Collectors.toList());
		System.out.println("filtered seize >> "+filtered.size());
		filtered.get(0).setCity("Nagput");
		filtered.add(new Trader("Dhampur", "Balrampur"));	
		System.out.println("listOrig 1 seize >> "+listOrig.size());
		System.out.println("filtered 1 seize >> "+filtered.size());
		System.out.println("filtered >> "+filtered);
		System.out.println("listOrig >> "+listOrig);
	}
	
	static void listIntersection() {
		List<Trader> listOrig1 = Trader.getTraderList();
		List<Trader> listOrig2 = Trader.getTraderList2();
		
		List<Trader> commonsList =  listOrig1.stream()
				.filter(listOrig2::contains)
				.distinct()
				.collect(Collectors.toList());
		System.out.println("commonsList>> "+commonsList);
	}
	
	static void listUnion() {
		List<Trader> listOrig1 = Trader.getTraderList();
		List<Trader> listOrig2 = Trader.getTraderList2();
		
		System.out.println(listOrig1.size()+" "+listOrig2.size());
		
		List<Trader> unionList = Stream.concat(listOrig1.stream(), listOrig2.stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println("size >> "+unionList.size());
		System.out.println("unionList>> "+unionList);
	}
	
	static void testFailFastAndFailSafe() {
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
	
	public static Trader copyTrader(Trader original){
	    return new Trader(original.getName(), original.getCity());
	}
}
