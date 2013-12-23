package models;

import java.util.ArrayList;
import java.util.List;

//o nome da Classe eh "Periodo" por que faz sentido no contexto do sistema.
public class Periodo {
	
	// CREATOR: Periodo eh feito de disciplinas e tem o numero total de creditos nele.
	
	private List<Disciplina> disciplinas;
	private int creditos = 0;
	
	public Periodo(){
		disciplinas = new ArrayList<Disciplina>();
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public int getCreditos(){
		return creditos;
	}
	
	public void adicionaDisiciplina(Disciplina disciplina) throws LimiteDeCreditosExcedidosException{
		if((creditos + disciplina.getCreditos()) <= 28){
			disciplinas.add(disciplina);
		}
		else{
			throw new LimiteDeCreditosExcedidosException();
		}
	}

	
	
}
