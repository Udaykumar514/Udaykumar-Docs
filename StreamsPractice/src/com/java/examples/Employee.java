package com.java.examples;

public class Employee {
	
	private int edi;
	private String ename;
	private double esalarty;
	
	public Employee(int edi, String ename, double esalarty) {
		super();
		this.edi = edi;
		this.ename = ename;
		this.esalarty = esalarty;
	}
	
	public int getEdi() {
		return edi;
	}
	public void setEdi(int edi) {
		this.edi = edi;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalarty() {
		return esalarty;
	}
	public void setEsalarty(double esalarty) {
		this.esalarty = esalarty;
	}
	
	
	
	
	

}
