/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/POO_Programacion_Orientada_A_Objetos
 */
package Metodos;

public class Main {

    public static void main(String[] args) {
        
        //Aqui Creamos un Objeto de Nuestra Clase Operacion
        Operacion Op =  new Operacion();
        
        //LLamamos a los Metodos del Objeto
        Op.Numbers();
        Op.Sumar();
        Op.Restar();
        Op.Multiplicar();
        Op.Division();
        Op.Showme();
     
        /*          Salida
       La Suma es : 100
       La Resta es : 98
       La Multiplicacion es : 99
       La Division es : 99
       BUILD SUCCESSFUL (total time: 9 seconds) 
       */
        
    }
    
}
