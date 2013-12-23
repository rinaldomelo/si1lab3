package models;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeDisciplinas {
	
	private List<Disciplina> disciplinas;
	
	public CatalogoDeDisciplinas(){
		disciplinas = new ArrayList<Disciplina>();
		
		// disciplinas primeiro periodo
		disciplinas.add(new Disciplina("Programação I", 4));
        disciplinas.add(new Disciplina("Lab. de Programação I", 4));
        disciplinas.add(new Disciplina("Introdução a Computação", 4));
        disciplinas.add(new Disciplina("Leitura e Produção de Textos", 4));
        disciplinas.add(new Disciplina("Cálculo I", 4));
        disciplinas.add(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4));
        
        // disciplinas segundo periodo
        disciplinas.add(new Disciplina("Cálculo II", 4, listaDePreRequisitos("Cálculo I")));
        disciplinas.add(new Disciplina("Matemática Discreta", 4));
        disciplinas.add(new Disciplina("Programação II", 4, listaDePreRequisitos("Programação I, Lab. de Programação I, Introdução a Computação")));
        disciplinas.add(new Disciplina("Teoria dos Grafos", 2, listaDePreRequisitos("Programação I, Lab. de Programação I")));
        disciplinas.add(new Disciplina("Fund. de Física Clássica", 4, listaDePreRequisitos("Cálculo I, Álgebra Vetorial e Geometria Analítica")));
        disciplinas.add(new Disciplina("Lab. de Programação II", 4, listaDePreRequisitos("Programação I, Lab. de Programação I, Introdução a Computação")));
        
        //disciplinas terceiro periodo
        disciplinas.add(new Disciplina("Álgebra Linear", 4, listaDePreRequisitos("Álgebra Vetorial e Geometria Analítica")));
        disciplinas.add(new Disciplina("Probabilidade e Estatística", 4, listaDePreRequisitos("Cálculo II")));
        disciplinas.add(new Disciplina("Teoria da Computação", 4, listaDePreRequisitos("Teoria dos Grafos, Introdução a Computação, Matemática Discreta")));
        disciplinas.add(new Disciplina("Estruturas de Dados e Algoritmos", 4, listaDePreRequisitos("Teoria dos Grafos, Programação II, Lab. de Programação II")));
        disciplinas.add(new Disciplina("Fund. de Física Moderna", 4, listaDePreRequisitos("Cálculo II, Fund. de Física Clássica")));
        disciplinas.add(new Disciplina("Gerência da Informação", 4));
        disciplinas.add(new Disciplina("Lab. de Estruturas de Dados e Algoritmos", 4, listaDePreRequisitos("Teoria dos Grafos, Programação II, Lab. de Programação II")));
        
        //disciplinas quarto periodo
        disciplinas.add(new Disciplina("Métodos Estatísticos", 4, listaDePreRequisitos("Álgebra Linear, Probabilidade e Estatística")));
        disciplinas.add(new Disciplina("Paradigmas de Linguagem de Programação", 2, listaDePreRequisitos("Teoria da Computação, Estruturas de Dados e Algoritmos, Lab. de Estruturas de Dados e Algoritmos")));
        disciplinas.add(new Disciplina("Lógica Matemática", 4, listaDePreRequisitos("Teoria da Computação")));
        disciplinas.add(new Disciplina("Organização e Arquitetura de Computadores I", 4, listaDePreRequisitos("Estruturas de Dados e Algoritmos, Lab. de Estruturas de Dados e Algoritmos, Fund. de Física Moderna")));
        disciplinas.add(new Disciplina("Lab. de Organização e Arquitetura de Computadores I", 4, listaDePreRequisitos("Estruturas de Dados e Algoritmos, Lab. de Estruturas de Dados e Algoritmos, Fund. de Física Moderna")));
        disciplinas.add(new Disciplina("Engenharia de Software I", 4, listaDePreRequisitos("Programação II, Lab. de Programação II, Probabilidade e Estatística")));
        disciplinas.add(new Disciplina("Sistemas de Informação I", 4, listaDePreRequisitos("Gerência da Informação")));
        
        //disciplinas quinto periodo
        disciplinas.add(new Disciplina("Informática e Sociedade", 2));
        disciplinas.add(new Disciplina("Metodologia Científica", 4, listaDePreRequisitos("Métodos Estatísticos")));
        disciplinas.add(new Disciplina("Analises e Tecnicas de Algoritmos", 4, listaDePreRequisitos("Estruturas de Dados e Algoritmos, Lab. de Estruturas de Dados e Algoritmos, Cálculo II, Lógica Matemática")));
        disciplinas.add(new Disciplina("Compiladores", 4, listaDePreRequisitos("Paradigmas de Linguagem de Programação, Organização e Arquitetura de Computadores I, Lab. de Organização e Arquitetura de Computadores I")));
        disciplinas.add(new Disciplina("Redes de Computadores", 4, listaDePreRequisitos("Organização e Arquitetura de Computadores I, Lab. de Organização e Arquitetura de Computadores I")));
        disciplinas.add(new Disciplina("Banco de Dados I", 4, listaDePreRequisitos("Sistemas de Informação I")));
        disciplinas.add(new Disciplina("Sistemas de Informação II", 4, listaDePreRequisitos("Sistemas de Informação I")));
        disciplinas.add(new Disciplina("Lab. de Engenharia de Software", 2, listaDePreRequisitos("Engenharia de Software I")));
        
        //disciplinas sexto periodo
        disciplinas.add(new Disciplina("Sistemas Operacionais", 4, listaDePreRequisitos("Organização e Arquitetura de Computadores I, Lab. de Organização e Arquitetura de Computadores I")));
        disciplinas.add(new Disciplina("Interconexão de Redes de Computadores", 2, listaDePreRequisitos("Redes de Computadores")));
        disciplinas.add(new Disciplina("Lab. de Interconexão de Redes de Computadores", 2, listaDePreRequisitos("Redes de Computadores")));
        disciplinas.add(new Disciplina("Inteligencia Artificial I", 4, listaDePreRequisitos("Analises e Tecnicas de Algoritmos, Paradigmas de Linguagem de Programação, Métodos Estatísticos")));
        disciplinas.add(new Disciplina("Banco de Dados II", 4, listaDePreRequisitos("Banco de Dados I, Sistemas de Informação II")));
        disciplinas.add(new Disciplina("Direito e Cidadania", 4));
        disciplinas.add(new Disciplina("Optativa 1", 4));
        disciplinas.add(new Disciplina("Optativa 2", 4));
        
        //disciplinas setimo periodo
        disciplinas.add(new Disciplina("Métodos e Software Numéricos", 4, listaDePreRequisitos("Álgebra Linear, Analises e Tecnicas de Algoritmos")));
        disciplinas.add(new Disciplina("Avaliação de Desempenho de Sistemas Discretos", 4, listaDePreRequisitos("Probabilidade e Estatística")));
        disciplinas.add(new Disciplina("Projeto em Computação I", 4, listaDePreRequisitos("Lab. de Engenharia de Software, Metodologia Científica")));
        disciplinas.add(new Disciplina("Optativa 3", 4));
        disciplinas.add(new Disciplina("Optativa 4", 4));
        disciplinas.add(new Disciplina("Optativa 5", 4));
        disciplinas.add(new Disciplina("Optativa 6", 4));
        
        //disciplinas oitavo periodo
        disciplinas.add(new Disciplina("Projeto em Computação II", 6, listaDePreRequisitos("Projeto em Computação I")));
        disciplinas.add(new Disciplina("Optativa 7", 4));
        disciplinas.add(new Disciplina("Optativa 8", 4));
        disciplinas.add(new Disciplina("Optativa 9", 4));
        disciplinas.add(new Disciplina("Optativa 10", 4));
        disciplinas.add(new Disciplina("Optativa 11", 4));
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	private List<String> listaDePreRequisitos(String string) {
		List<String> preRequisitos = new ArrayList<String>();
		String[] disciplinas = string.split(", ");
		for (String disciplina : disciplinas){
			preRequisitos.add(disciplina);
		}
		return preRequisitos;
	}
	
	public int disciplinaID(String nome){
		int indice = 0;
		
		for (int i = 1; i < disciplinas.size()+1; i++) {
			if(disciplinas.get((i-1)).getNome().equals(nome)){
				indice = i;
			}
		}
		
		return indice;
	}

}
