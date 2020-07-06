/**
 * 
 */
package com.java8Tests;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import com.java8Tests.model.Transaction;

/**
 * @author lenovo
 *
 */
public class TransactionDomainProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Transaction> transactions = Transaction.getList();
		
		OptionalInt minTransaction = transactions.stream().mapToInt(Transaction::getValue).min();
		
		minTransaction.ifPresent(i->System.out.println("Min transaction "+i));
		
		Optional<Integer> maxTransaction = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
		maxTransaction.ifPresent(i->System.out.println("Max transaction "+i));
	
	}

}
