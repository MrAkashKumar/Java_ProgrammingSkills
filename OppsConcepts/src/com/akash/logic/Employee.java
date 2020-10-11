package com.akash.logic;

public class Employee {
	
	private String employeeName;
	private String employeeAddress;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeAddress == null) {
			if (other.employeeAddress != null)
				return false;
		} else if (!employeeAddress.equals(other.employeeAddress))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}
	
	

}
