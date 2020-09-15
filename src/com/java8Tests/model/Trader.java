/**
 * 
 */
package com.java8Tests.model;

import java.util.List;
import java.util.Objects;

/**
 * @author lenovo
 *
 */
public class Trader implements Comparable<Trader>{

	private String name;
	private String city;
	/**
	 * @param name
	 * @param city
	 */
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
	public static List<Trader> getTraderList(){
		return List.of(new Trader("Swapnil","Pune"),
				new Trader("Jk","Nagpur"),
				new Trader("Laurus","Pune"),
				new Trader("Labs","Pune"),
				new Trader("Swapnil","Pune"),
				new Trader("Paper","Nagpur"));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Trader other = (Trader) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}

	public static List<Trader> getTraderList2(){
		return List.of(new Trader("Swapnil","Pune"),
				new Trader("Jk","Paper"),
				new Trader("Balrampur","Dhampur"));
	}

	@Override
	public int compareTo(Trader o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
