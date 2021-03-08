/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/POO_Programacion_Orientada_A_Objetos
 */
package Exercise_0;
/*
     1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
     El titular será obligatorio y la cantidad es opcional. Crea tres constructores que cumpla lo anterior.
      Crea sus métodos get, set y toString.

   Tendrá dos métodos especiales:
   ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
   retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa
   la cantidad de la cuenta pasa a ser 0.
 */

public class Main {

    public static void main(String[] args) {

        //Cuenta Tarjeta = new Cuenta();
        //Tarjeta.Bienvenida();
        
        
        
        //Testeando con instancias de objetos que tengan paramatros
        Cuenta cuenta_1 = new Cuenta("Pragmatic Coder");
        Cuenta cuenta_2 = new Cuenta("Ether", 300);
         
        //Ingresa dinero en las cuentas
        cuenta_1.Ingresar(300);
        cuenta_2.Ingresar(400);
         
        //Retiramos dinero en las cuentas
        cuenta_1.Retirar(500);
        cuenta_2.Retirar(100);
        
        
        System.out.println(cuenta_1); // 0 
        System.out.println(cuenta_2); // 600
    }
    
}
