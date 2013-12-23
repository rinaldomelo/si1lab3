package models;

public class PreRequisitosInsuficientesException {
	private String message = "Você não tem os prerequisitos necessários.";
    
    public String getMessage(){
            return this.message;
    }
}
