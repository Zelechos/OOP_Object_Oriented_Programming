/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/POO_Programacion_Orientada_A_Objetos
 */
package Exercise_0;

import java.util.Scanner;


public class Cuenta {
    
    //Atributos
    String titular;
    float cantidad;
    
    //Metodos Constructores
    public Cuenta(){
    }
    
    public Cuenta(String titular){
        this.titular = titular;
    }

    public Cuenta(String titular, float cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    //Metodos Getters
    public float getCantidad(){
        return cantidad;
    }
    
    public String getTitular(){
        return titular;
    }
    
    //Metodos Setters
    public void setCantidad(float cantidad){
        this.cantidad = cantidad;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    //Metodo ToString
    @Override
    public String toString(){
        return "Cuenta {" + "Titular : " + titular + ", Cantidad : " + cantidad + "}" ;
    }
    
    //Ingresar una cantidad de dinero a la Cuenta
    public void Ingresar(float cantidad){
        if(cantidad < 0){
            toString();
        }else{
            this.cantidad += cantidad;
        }
    }
    
    //Retirar una cantidad de dinero de la cuenta
    public void Retirar(float cantidad){
        if(cantidad > this.cantidad){
            this.cantidad = 0; 
        }else{
            this.cantidad -= cantidad;
        }
    }
    
    //Metodo Inicial
    public void Bienvenida(){
        Menu();
    }
    
    //Metodo para verificar que tipo de cuenta precisara el usuario
    public void TipoCuenta(){
        Scanner input = new Scanner(System.in);
        String respuesta , respuesta1;
        
        System.out.print("Bienvenido a BNB desea crear un Cuenta(Y/N) : ");
        respuesta = input.nextLine();
        
        if (respuesta.equals("y") || respuesta.equals("Y")){
            System.out.print("Desea crear la cuenta con un monto Inicial(Y/N) : ");
            respuesta1 = input.nextLine();

            if(respuesta1.equals("y") || respuesta1.equals("Y")){
                System.out.print("Digite su Nombre : ");
                titular = input.nextLine();
                System.out.print("Digite el monto de Dinero : ");
                cantidad =  input.nextFloat();
            }else{
                System.out.print("Digite su Nombre : ");
                titular = input.nextLine();
            }
            
        }else{
            System.out.println("Hasta luego . . . ");
        }
        
    }
    
    //Metodo genera un menu en donde trabajaran nuestros modulos
    public void Menu(){
        Scanner input = new Scanner(System.in);
        int opcion;   
        float num;

        do{
        System.out.println("*******************MENU*******************\n  1. Crear Cuenta \n  2. Retirar Dinero  \n  3. Ingresar Dinero  \n  4. Ver Cuenta  \n  5. Salir   \n  Digite una Opcion : ");
        opcion = input.nextInt();
        switch(opcion){
            case 1 :
                TipoCuenta();
            break;
            case 2 :
                System.out.print("Digite la monto de dinero que retirar : ");
                num = input.nextFloat();
                Retirar(num);
            break;
            case 3 : 
                System.out.print("Digite la monto de dinero que ingresara : ");
                num = input.nextFloat();
                Ingresar(num);
            break;
            
            case 4 :
                System.out.println(this);
                
            break;
            case 5 :
                System.out.println("Fin del Programa Adios . . .");
            break;
            default:
                System.out.println("Al Opcion que introdujo no existe en el Menu . . . ");
            
        }
            
        
        }while(opcion != 5);
    }
    
    
    
    

    
   


    
    
    
    
    
}
