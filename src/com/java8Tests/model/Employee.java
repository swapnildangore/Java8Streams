/**
 * 
 */
package com.java8Tests.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lenovo
 *
 */
public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	private long mobileNo;
	private int salary;
	private Department department;
	/**
	 * @param empId
	 * @param firstName
	 * @param lastName
	 * @param mobileNo
	 * @param salary
	 * @param department
	 */
	public Employee(int empId, String firstName, String lastName, long mobileNo, int salary, Department department) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.salary = salary;
		this.department = department;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the mobileNo
	 */
	public long getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public static List<Employee> getEmpList(){
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1001, "Swapnil", "Dangore", 1212121212, 999999,new Department(1, "SALES")));
		list.add(new Employee(1002, "Jk", "Paper", 1111111111, 888888,new Department(2, "ICT")));
		list.add(new Employee(1003, "Piramal", "Enterprises", 2020202020, 777777,new Department(3, "HR")));
		list.add(new Employee(1004, "Jk", "Agree", 1010101010, 666666,new Department(4, "IT PRODUCT")));
		list.add(new Employee(1005, "Hdfc", "Bank", 1000000001, 555555,new Department(5, "IT SERVICES")));
		list.add(new Employee(1006, "Icici", "Bank", 2000000001, 444444,new Department(1, "IT")));
		list.add(new Employee(1007, "State", "Bankofindia", 1000000002, 222222,new Department(4, "IT PRODUCT")));
		list.add(new Employee(1008, "Yes", "Bank", 2000000004, 333333,new Department(2, "ICT")));
		list.add(new Employee(1009, "Harita", "Seating", 9999999999l, 222222,new Department(4, "IT PRODUCT")));
		list.add(new Employee(1011, "Zen", "Tech", 8888888888l, 212121,new Department(5, "IT SERVICES")));
		list.add(new Employee(1012, "Jain", "Irrigation", 7777777777l, 123456,new Department(4, "IT SERVICES")));
		list.add(new Employee(1013, "Avanti", "Feeds", 6666666666l, 654345,new Department(4, "IT PRODUCT")));
		list.add(new Employee(1014, "Laurus", "Labs", 5555555555l, 100000,new Department(5, "IT SERVICES")));
		list.add(new Employee(1055, "Mps", "Ltd", 4444444444l, 765894,new Department(1, "SALES")));
		list.add(new Employee(1066, "Premier", "Explosives", 3333333333l, 234564,new Department(1, "SALES")));
		list.add(new Employee(1077, "Sugar", "Dhampur", 2222222222l, 376236,new Department(5, "IT SERVICES")));
		list.add(new Employee(1088, "Sugar", "Balrampur", 2000000003, 873456,new Department(3, "HR")));
		list.add(new Employee(1099, "Graphite", "India", 1231231234, 238535,new Department(5, "IT SERVICES")));
		list.add(new Employee(1021, "Graphite", "Heg", 1234123412, 752574,new Department(4, "IT PRODUCT")));
		list.add(new Employee(1031, "Swapnil", "Tatamoters", 1234512345, 246324,new Department(1, "SALES")));
		list.add(new Employee(1041, "Swapnil", "Venkeys", 2121212121, 753356,new Department(4, "IT PRODUCT")));
		
		return list;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNo="
				+ mobileNo + ", salary=" + salary + ", department=" + department + "]";
	}
	
}
