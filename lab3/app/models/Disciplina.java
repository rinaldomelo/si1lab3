package models;

import java.util.List;

import play.data.validation.Constraints.Required;

//o nome da Classe eh "Período" por que faz sentido no contexto do sistema.
public class Disciplina {
	
	@Required
	private String nome;

	@Required
	private int periodo;
	
	private int creditos;
	private List<String> preRequisitos;
	private boolean alocada;

	/*
	 * construtor para as disciplinas sem pre-requisitos
	 */
	public Disciplina(String nome, int creditos) {
		this.nome = nome;
		this.creditos = creditos;
	}
	
	/*
	 * construtor para as disciplinas com pre-requisitos
	 */
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
	
	public boolean getAlocada(){
		return alocada;
	}
	
	public int getPeriodo(){
		return periodo;
	}

	public void adicionaPreRequisitos(String preRequisito){
		preRequisitos.add(preRequisito);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public void setAlocada(){
		if (this.alocada == false){
			this.alocada = true;
		}
		else{
			this.alocada = false;	
		}
	}
	
	public void setPreRequisitos(List<String> preRequisitos){
		this.preRequisitos = preRequisitos;
	}
	
	public void setPeriodo(int periodo){
        this.periodo = periodo;
	}

	public boolean equals(Object obj) {
        if (obj instanceof Disciplina) {
                Disciplina disc = (Disciplina) obj;
                if (getNome().equals(disc.getNome()))
                        return true;
        }
        return false;
	}
}
