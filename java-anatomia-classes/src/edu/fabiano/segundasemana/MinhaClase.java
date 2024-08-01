package edu.fabiano.segundasemana;

public class MinhaClase {

public static void main (String [] args){
    
    String primeiroNome = "Fabiano";
    String segundoNome = "Mikael";

    String nomecompleto = nomeCompleto(primeiroNome, segundoNome);
    
    System.out.println(nomecompleto);

    
} 
    
public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);

}

}
