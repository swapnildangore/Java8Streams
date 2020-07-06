/**
 * 
 */
package com.java8Tests;

import static java.util.stream.Collectors.*;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import com.java8Tests.model.Employee;

/**
 * @author lenovo
 *
 */
public class StreamFilterMatchFind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listEmp = Employee.getEmpList();

		List<Employee> result = listEmp.stream()
								.filter(e -> e.getFirstName().equals("Sugar"))
								.sorted(Comparator.comparing(Employee::getSalary))
								.collect(toList());

		System.out.println(result);

		List<Employee> result2 = listEmp.stream()
									.filter(e -> e.getSalary() > 777776)
									.sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
									// .sorted(Comparator.comparing(Employee::getFirstName))
									.collect(toList());

		//stem.out.println(result2);

		List<String> result3 = listEmp.stream()
								.map(Employee::getFirstName)
								.distinct()
								//.filter())
								//.sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
								// .sorted(Comparator.comparing(Employee::getFirstName))
								.collect(toList());

		//System.out.println(result3);
		
		String ser = listEmp.stream().map(Employee::getFirstName).collect(joining(","));
		
		System.out.println(ser);
		
		OptionalLong maxSalary = listEmp.stream().mapToLong(Employee::getSalary).max();
					
		
		maxSalary.ifPresent(l->System.out.println("Max Salary - "+l));
		
		OptionalDouble avgSalary = listEmp.stream().mapToLong(Employee::getSalary).average();
		
		//avgSalary.ifPresent(System.out::println);
		
		long sumSalary = listEmp.stream().mapToLong(Employee::getSalary).sum();
		
		//System.out.println("sumSalary- "+sumSalary);
		
		LongStream uniqueSalaries = listEmp.stream().mapToLong(Employee::getSalary).distinct();
		
		//uniqueSalaries.forEach(System.out::println);
		
		long cnt = listEmp.stream().mapToLong(Employee::getSalary).distinct().count();
		
		//System.out.println("cnt - "+cnt);
		boolean isAnyHR = listEmp.stream()
									.allMatch(e1->e1.getDepartment().getDepartmentId()==3);
		//System.out.println(isAnyHR);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares =	numbers.stream()
								.map(n -> n * n)
								.collect(toList());
		
		System.out.println(squares);
		
		List<String> words = Arrays.asList("Hello","World","Dena","Bank");
		List<String> unique = words.stream()
								.map(s->s.split(""))
								.flatMap(Arrays::stream)
								.distinct()
								.collect(toList());
								
		//System.out.println(unique);
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs =	numbers1.stream()
							.flatMap(i -> numbers2.stream()
							.map(j -> new int[]{i, j}))
							.collect(toList());
		List<int[]> pairs1 =	numbers1.stream()
								.flatMap(i -> numbers2.stream().filter(j->(i+j)%3==0).map(j -> new int[]{i, j}))
								.collect(toList());
		
		//pairs1.forEach(e1->System.out.println(e1[0]+" "+e1[1]));
		
		Optional<Employee> anyEmp = listEmp.stream()
									.filter(e -> e.getDepartment().getDepartmentId()==3)
									.findAny();
		//anyEmp.ifPresent(e1->System.out.println(e1.getFirstName()+" "+e1.getLastName()));
		
		Optional<Employee> firstEmp = listEmp.stream()
										.filter(e -> e.getDepartment().getDepartmentId()==3)
										.findFirst();
		//firstEmp.ifPresent(e1->System.out.println(e1.getFirstName()+" "+e1.getLastName()));	
	}

}
