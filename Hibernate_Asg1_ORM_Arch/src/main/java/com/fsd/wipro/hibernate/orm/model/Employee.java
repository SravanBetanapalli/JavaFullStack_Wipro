package com.fsd.wipro.hibernate.orm.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	
	@Column(name="Name")
	private String name;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EmpId")
	private int empid;
	
	@Column(name="Designation")
	private String designation;
	
	@Column(name="Salary")
	private float salary;

	
	
	public Employee(String name, String designation, float salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.designation = designation;
		this.salary = salary;
	}
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
