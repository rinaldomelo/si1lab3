package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	static private SistemaPlanejamentoDisciplinas sistema = new SistemaPlanejamentoDisciplinas();
	static private String erro = "";
	
	 static Form<Disciplina> disciplinaForm = Form.form(Disciplina.class);
	 
	 
	 public static Result index() {
		 
		 return ok(views.html.index.render(sistema.getPeriodos(), sistema.getCatalogo(), erro));
	 }
 
	 public static Result alocacao(){
         return ok(views.html.index.render(sistema.getPeriodos(), sistema.getCatalogo(), erro));
         
	 }
}
