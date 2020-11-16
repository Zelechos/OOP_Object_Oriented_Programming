/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/POO_Programacion_Orientada_A_Objetos
 */
package Metodos;

import javax.swing.JOptionPane;

public class Operacion {
    
    //Atributos
    
    //Todos son de Tipo entero
    int Number1 , Number2, Suma, Resta, Multiplicacion, Division;
    
    //Metodos
    
    //Metodo para pedirle al Usuario Nuestros datos(Osea los dos numeros)
    public void Numbers(){
        Number1 = Integer.parseInt(JOptionPane.showInputDialog("Insert a Number:"));
        Number2 = Integer.parseInt(JOptionPane.showInputDialog("Insert a Number:"));
    }
    
    //Metodo para Sumar los Numeros
    public void Sumar(){
        Suma = Number1 + Number2;
    }
    
    //Metodo para Restar los Numeros
    public void Restar(){
        Resta = Number1 - Number2;        
    }
    
    //Metodo para Multiplicar los Numeros
    public void Multiplicar(){
        Multiplicacion = Number1 * Number2;
    }
    
    //Metodo para Dividir los Numeros
    public void Division(){
        Division = Number1 / Number2;
    }
    
    public void Showme(){
        System.out.println("La Suma es : "+Suma);
        System.out.println("La Resta es : "+Resta);
        System.out.println("La Multiplicacion es : "+Multiplicacion);
        System.out.println("La Division es : "+Division);
    }
    
    
}
