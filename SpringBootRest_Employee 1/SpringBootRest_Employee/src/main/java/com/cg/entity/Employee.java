package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeeT")
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	@Column(name = "ename", nullable = false)
	private String ename;
	@Column(name = "salary", nullable = false)
	private double salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String ename, double price) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}
