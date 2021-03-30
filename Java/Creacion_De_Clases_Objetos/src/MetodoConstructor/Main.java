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
    System.out.println(Instance.DataC1()+"\n-------------------------------------------------");
    System.out.println(Instance1.DataC3()+"\n-------------------------------------------------");
    System.out.println(Instance2.DataC2()+"\n-------------------------------------------------");
    
    
    
    //Aqui creamos algunas instancias del la clase Programador para luego llenar los datos
    Programador Instance3 = new Programador();
    Programador Instance4 = new Programador();
    Programador Instance5 = new Programador();
    Programador Instance6 = new Programador();
    
    //Pedimos los datos que tendran los objetos
    Instance3.PedirDataC1();
    Instance4.PedirDataC2();
    Instance5.PedirDataC3();
    Instance6.PedirDataC4();
        
    
    }
    
    
}
