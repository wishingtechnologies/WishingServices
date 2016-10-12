package com.employee;

import java.io.Serializable;

public class Employee  implements Serializable{
	String empNmae;
	Integer empId;
	Address addr;
	public String getEmpNmae() {
		return empNmae;
	}
	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}
	@Override
	public String toString() {
		return "Employee [empNmae=" + empNmae + ", empId=" + empId + ", addr="
				+ addr + "]";
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
