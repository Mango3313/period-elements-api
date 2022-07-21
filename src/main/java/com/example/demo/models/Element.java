package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Element {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "group_value")
	private String group;
	private String period;
	private String atomicNumber;
	private String atomicMass;
	private String symbol;
	private String name;
	
	public Element() {
		
	}

	public Element(Integer id, String group, String period, String atomicNumber, String atomicMass, String symbol,
			String name) {
		super();
		this.id = id;
		this.group = group;
		this.period = period;
		this.atomicNumber = atomicNumber;
		this.atomicMass = atomicMass;
		this.symbol = symbol;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getAtomicNumber() {
		return atomicNumber;
	}

	public void setAtomicNumber(String atomicNumber) {
		this.atomicNumber = atomicNumber;
	}

	public String getAtomicMass() {
		return atomicMass;
	}

	public void setAtomicMass(String atomicMass) {
		this.atomicMass = atomicMass;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
