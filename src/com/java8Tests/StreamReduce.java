/**
 * 
 */
package com.java8Tests;

import static java.util.stream.Collectors.*;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import com.java8Tests.model.Employee;

/**
 * @author lenovo
 *
 */
public class StreamReduce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> listEmp = Employee.getEmpList();
		
		OptionalInt sumSalary = listEmp.parallelStream()
							.mapToInt(Employee::getSalary)
							.reduce(Integer::sum);
		
		System.out.println(sumSalary);
		
		int sumSalarylong = listEmp.stream()
								.collect(reducing(0,Employee::getSalary,Integer::sum));
		System.out.println(sumSalarylong);
		//Cound SUM orAVG of HR people salary
		
		OptionalLong maxHrSalary = listEmp.parallelStream()
									.filter(e1->e1.getDepartment().getDepartmentId()==4)
									.mapToLong(Employee::getSalary)
									.reduce(Long::max);
		
		//maxHrSalary.ifPresent(l->System.out.println("maxHrSalary - "+l));
		
		LongStream  allHrSalaries = listEmp.parallelStream()
				.filter(e1->e1.getDepartment().getDepartmentId()==4)
				.mapToLong(Employee::getSalary);
		//allHrSalaries.forEach(i->System.out.print(" "+i));
		
		IntSummaryStatistics statistic = listEmp.stream().collect(Collectors.summarizingInt(Employee::getSalary));
		
		System.out.println(statistic);
		
		//divideBYzero();
	}

	public static void divideBYzero() {
		/*int x=0;int y=10;
		
		int z=0;
		try {
			z = y/x;
			System.out.println("before");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception");
		}*/
		
		int[] a = {1,2,053,4};
		int[][] b = {{1,2,4},{2,2,1},{0,43,8,2}};
		 	
		System.out.println(a[1]==b[2][3]);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) {
				System.out.print(" "+(b[i][j]));
			}
			System.out.println();
		}
	}
}
