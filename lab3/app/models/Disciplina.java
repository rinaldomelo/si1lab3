package models;

import java.util.List;

public class Disciplina {

	private String nome;
	private int creditos;
	private List<String> preRequisitos;

	
	
	public Disciplina(String nome, int creditos, List<String> preRequisitos) {
		this.nome = nome;
		this.creditos = creditos;
		this.preRequisitos = preRequisitos;
	}

	public String getNome() {
		return nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public List<String> getPreRequisitos() {
		return preRequisitos;
	}

}
