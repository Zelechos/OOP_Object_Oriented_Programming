/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/POO_Programacion_Orientada_A_Objetos
 */
package MetodoConstructor;


public class Main {
    
    public static void main(String[] args) {
    
    //Array para probar mis instancias 
    String[] lista = {"HTML","CSS","JAVASCRIPT","JAVA","NODE JS"};

    //Podemos Instanciar Nuestros Objetos con cualquier constructor
    Programador Instance = new Programador("Argus", "Aphocraphex", 99);
    Programador Instance1 = new Programador(lista,"Senior", "Backend", 34);
    Programador Instance2 = new Programador("Axel", "Rose", "Master", lista, 100);
    
    //Y mostramos los datos de nuestros objetos
    System.out.println(Instance.DataC1());
    System.out.println(Instance1.DataC3());
    System.out.println(Instance2.DataC2());
    
    
    
    //Aqui creamos una instancia con el constructor por defecto para luego llenar los dato
    Programador Instance3 = new Programador();
    
    //Pedimos los datos que tendran los objetos
    Instance3.PedirDataC1();
        
    //Aqui mostramos los datos de lkos objetos
    System.out.println(Instance3.DataC1());

    }
    
    
}
