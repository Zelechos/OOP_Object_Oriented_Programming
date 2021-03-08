/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/POO_Programacion_Orientada_A_Objetos
 */
package Metodos;

import javax.swing.JOptionPane;

public class Operacion {
    
    //Atributos
    
    //Todos son de Tipo entero
    int Number1 , Number2, Suma, Resta, Multiplicacion, Division, Exponente;
    
    //Metodos
    
    //Metodos para activar todos los metodos
    public void Activate(){
        Numbers();
        Sumar();
        Restar();
        Multiplicar();
        Division();
        Exponente();
        Showme();
    }
    
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
        int Mayor = Comparacion();
        Resta = Mayor - Verificador(Mayor);        
    }
    
    //Metodo para Multiplicar los Numeros
    public void Multiplicar(){
        Multiplicacion = Number1 * Number2;
    }
    
    //Metodo para Dividir los Numeros
    public void Division(){
        int Mayor = Comparacion();
        Division = Mayor / Verificador(Mayor);
    }
    
    //Metodo para Elevar como exponente el menor al Mayor
    public void Exponente(){
        int Mayor = Comparacion();
        Exponente = (int)Math.pow(Mayor, Verificador(Mayor));
    }
    
    //Comparamos Los numeros
    public int Comparacion(){
        
        if(Number1 > Number2){
            return Number1;
        }else{
            return Number2;
        }
        
    }

    //Verificar cual es el Numero Mayor
    public int Verificador(int Numero){
        if(Numero == Number1){
            return Number2;
        }else{
            return Number1;
        }
    }
    
    
    
    public void Showme(){
        System.out.println("La Suma es : "+Suma);
        System.out.println("La Resta es : "+Resta);
        System.out.println("La Multiplicacion es : "+Multiplicacion);
        System.out.println("La Division es : "+Division);
        System.out.println("El Exponente es : "+Exponente);
    }
    
    
}
