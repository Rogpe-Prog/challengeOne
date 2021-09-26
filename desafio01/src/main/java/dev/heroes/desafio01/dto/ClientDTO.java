package dev.heroes.desafio01.dto;

import java.io.Serializable;
import java.time.Instant;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String cpf;
	private Double income;
	private Instant birthData;
	private Integer children;
	
	public ClientDTO() {
	}

	public ClientDTO(String name, String cpf, Double income, Instant birthData, Integer children) {
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthData = birthData;
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBirthData() {
		return birthData;
	}

	public void setBirthData(Instant birthData) {
		this.birthData = birthData;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
}
