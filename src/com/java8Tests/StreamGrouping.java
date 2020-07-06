/**
 * 
 */
package com.java8Tests;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8Tests.model.Transaction;

/**
 * @author lenovo
 *
 */
public class StreamGrouping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Transaction> transactions = Transaction.getList();
		
		Map<Integer,Integer> mapSum = transactions.stream().
									collect(groupingBy(Transaction::getYear
											,summingInt(Transaction::getValue)));
		System.out.println("Sum - "+mapSum);
		
		Map<Integer,Double> mapAvg = transactions.stream().
				collect(groupingBy(Transaction::getYear
						,averagingInt(Transaction::getValue)));
		System.out.println("Avg - "+mapAvg);
		
		Map<Integer, Optional<Transaction>> mapMin = transactions.stream().
				collect(groupingBy(Transaction::getYear
						,minBy(comparingInt(Transaction::getValue))));
		System.out.println("Min - "+mapMin);
		
		Map<Integer, Optional<Transaction>> mapMax = transactions.stream().
				collect(groupingBy(Transaction::getYear
						,maxBy(comparingInt((Transaction::getValue)))));
		System.out.println("Max - "+mapMax);

		Map<Integer,Long> mapCount = transactions.stream().
									collect(groupingBy(Transaction::getYear
												,counting()));
		System.out.println("Count - "+mapCount);
		
		Map<Integer, IntSummaryStatistics> mapSummerrize = transactions.stream().
										collect(groupingBy(Transaction::getYear
												,summarizingInt(Transaction::getValue)));
		System.out.println("Summerie - "+mapSummerrize);
	}

}
