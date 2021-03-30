/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/POO_Programacion_Orientada_A_Objetos
 */
package Parametros_Argumentos;

import javax.swing.JOptionPane;

public class OperacionPlus {
    
    //Atributos
    
    //Declaracion de Variables Todos son de Tipo entero
    int Number1 , Number2, Suma, Resta, Multiplicacion, Division, Exponente,NumbersNow[];
    
    //Metodos
    
    //Metodos para activar todos los metodos
    public void Activate(){
        NumbersNow = Numbers();
        Number1 = NumbersNow[0];
        Number2 = NumbersNow[1];
        Showme(Number1,Number2);
    }
    
    //Aqui Creamos nuestros metodos con parametros
    //Metodo para pedirle al Usuario Nuestros datos(Osea los dos numeros)
    public int[] Numbers(){
        int NumbersList[] = new int[2];
        
        for(int Rango = 0; Rango < NumbersList.length; Rango++){
            NumbersList[Rango] = Integer.parseInt(JOptionPane.showInputDialog("Insert a Number:"));
        }
        
        return NumbersList;
    }
    
    //Metodo para Sumar los Numeros
    public int Sumar(int Number1 ,int Number2){
        Suma = Number1 + Number2;
        return Suma;
    }
    
    //Metodo para Restar los Numeros
    public int Restar(int Number1 ,int Number2){
        int Mayor = Comparacion(Number1 ,Number2);
        Resta = Mayor - Verificador(Mayor);        
        return Resta;
    }
    
    //Metodo para Multiplicar los Numeros
    public int Multiplicar(int Number1 ,int Number2){
        Multiplicacion = Number1 * Number2;
        return Multiplicacion;
    }
    
    //Metodo para Dividir los Numeros
    public int Division(int Number1 ,int Number2){
        int Mayor = Comparacion(Number1 ,Number2);
        Division = Mayor / Verificador(Mayor);
        return Division;
    }
    
    //Metodo para Elevar como exponente el menor al Mayor
    public int Exponente(int Number1 ,int Number2){
        int Mayor = Comparacion(Number1 ,Number2);
        Exponente = (int)Math.pow(Mayor, Verificador(Mayor));
        return Exponente;
    }
    
    //Metodo para Hayar el factorial del Numero
    public int Factorial(int Number1){
        
        if(Number1 == 0){
            return 1;
        }else{
            return Number1 * Factorial(Number1 - 1);
        }
        
    }
    
    //Metodo para Generar un Array con numeros aleatorios con los dos numeros como extremos
    public String Aleatorios(int Number1 , int Number2 , int Cantidad){
        int [] NumAleatorios = new int[Cantidad];
        String Mensaje = "";
        for(int Iterador = 0; Iterador<Cantidad ; Iterador++){
                    
            NumAleatorios[Iterador] = (int)(Number1 + (Math.random() * Number2));
            
            if(Iterador == 0 ){
                Mensaje += "["+NumAleatorios[Iterador];
            }
            
            
            if(Iterador == 9){
                Mensaje += "-"+NumAleatorios[Iterador]+"]";
                break;
            }
            
            if(Iterador < 8 ){
                Mensaje += "-"+NumAleatorios[Iterador];
            }


        }
        
        return Mensaje;
    }
    
    //Comparamos Los numeros
    public int Comparacion(int Number1 ,int Number2){
        
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
    
    
    
    public void Showme(int Number1, int Number2){
        //Aqui ponemos los Argumentos de Nuestro Metodos
        System.out.println("La Suma es : "+ Sumar(Number1,Number2));
        System.out.println("La Resta es : "+Restar(Number1,Number2));
        System.out.println("La Multiplicacion es : "+Multiplicar(Number1,Number2));
        System.out.println("La Division es : "+Division(Number1,Number2));
        System.out.println("El Exponente es : "+Exponente(Number1,Number2));
        System.out.println("El Factorial es : "+Factorial(Number1));
        System.out.println("El Array de Numeros Aleatorios es : "+Aleatorios(Number1, Number2, 10));
    }
    
    
}

        
        
        
        
        
