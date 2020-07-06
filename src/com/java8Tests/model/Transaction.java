/**
 * 
 */
package com.java8Tests.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author lenovo
 *
 */
public class Transaction {

	private final Trader trader;
	private final int year;
	private final int value;
	/**
	 * @param trader
	 * @param year
	 * @param value
	 */
	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	/**
	 * @return the trader
	 */
	public Trader getTrader() {
		return trader;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [trader, year=" + year + ", value=" + value + "]";
	}
	
	public static List<Transaction> getList(){
		Trader raoul = new Trader("Raoul", "Cambridge");		
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
		new Transaction(brian, 2011, 300),
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(alan, 2012, 950)
		);
		
		return transactions;
	}
	
}
