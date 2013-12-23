package models;

public class LimiteDeCreditosExcedidosException extends Exception{
    
    private String message = "Limite de creditos no periodo excedido.";
    
    public String getMessage(){
            return this.message;
    }

}