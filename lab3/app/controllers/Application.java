package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	 public static Result index() {
		 
         return redirect(routes.Application.alocacao());
	 }
 
	 public static Result alocacao(){
         return ok(views.html.index.render(sistema.getPeriodos()));
         
	 }
}
