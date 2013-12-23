package models;

import java.util.ArrayList;
import java.util.List;

//CONTROLER: SistemaPlanejamentoDisiciplinas eh a classe responsavel por controlar o sistema
public class SistemaPlanejamentoDisciplinas {
	
	static private List<Periodo> periodos;
	static private CatalogoDeDisciplinas catalogo;
	
	public SistemaPlanejamentoDisciplinas(){
		setPeriodos(new ArrayList<Periodo>());
		catalogo = new CatalogoDeDisciplinas();
		setPrimeiroPeriodo();
	}

	private void setPrimeiroPeriodo() {
		Periodo primeiro = new Periodo();
		
		try{
			for (int i = 0; i < 6; i++) {
				primeiro.adicionaDisiciplina(catalogo.getDisciplinas().get(i));
				catalogo.getDisciplinas().get(i).setAlocada();
			}
		}catch (Exception e){
			
		}
	}

	public static List<Periodo> getPeriodos() {
		return periodos;
	}

	public static void setPeriodos(List<Periodo> periodos) {
		SistemaPlanejamentoDisciplinas.periodos = periodos;
	}
	
	public List<Disciplina> getCatalogo(){
        return catalogo.getDisciplinas();
	}
	
	public void adicionaDisciplinaNoPeriodo(Disciplina disciplina, int periodo) throws Exception{
		int indice = catalogo.disciplinaID(disciplina.getNome());
		if(periodos.size() <= periodo){
			Periodo novoPeriodo = new Periodo();
			periodos.add(novoPeriodo);
			adicionaDisciplinaNoPeriodo(disciplina, periodo);
		}
		else{
			periodos.get(periodo).adicionaDisiciplina(disciplina);
			disciplina.setAlocada();
		}
	}

}
