/**
 * 
 */
package com.java8Tests.model;

/**
 * @author lenovo
 *
 */
public class Department {
	
	private int departmentId;
	private String departmentName;
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + "]";
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
