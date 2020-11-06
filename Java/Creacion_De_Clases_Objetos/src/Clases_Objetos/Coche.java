/*
 * @Author : Pragmatic Coder
 * @Repositorio : Desconocido
 */
package Clases_Objetos;

public class Coche {
    
    //Atributos de la Clase Coche
    String Color;
    String Marca;
    int Km;
    
    //Metodo main()
    public static void main(String[] args) {
        
        //Dentro de el Metodo main crearemos Objetos de la Clase Coche
        //Nota: Una Clase Puede Tener N Objetos
        
        Coche Auto0 = new Coche(); //Nuestro Objeto es el Auto0
        
        //Aqui llenamos los Atributos de mi Objeto Auto0
        Auto0.Color = "Rojo";
        Auto0.Marca = "Mercedes";
        Auto0.Km = 0 ;
        
        //Aqui mostramos los Valores que tienen los Atributos de mi Objeto
        System.out.println("El color del Auto0 es : "+Auto0.Color);
        System.out.println("La Marca del Auto0 es : "+Auto0.Marca);
        System.out.println("El Kilometraje del Auto0 es : "+Auto0.Km);
        
        
        /*              Salida
        run:
            El color del Auto0 es : Rojo
            La Marca del Auto0 es : Mercedes
            El Kilometraje del Auto0 es : 0
            BUILD SUCCESSFUL (total time: 0 seconds)
       */
        
        System.out.println("***************************************");
        
        // A continuacion crearemos otro Objeto de la Clase Coche
        
        Coche Auto1 = new Coche();//Nuestro Objeto es el Auto1
        
        //Nuevamente llenamos los Atributos de mi Objeto
        Auto1.Color = "Azul";
        Auto1.Marca = "Audi";
        Auto1.Km = 10;
        
        //Ahora mostramos el resultado
        System.out.println("El color del Auto1 es : "+Auto1.Color);
        System.out.println("La Marca del Auto1 es : "+Auto1.Marca);
        System.out.println("El Kilometraje del Auto1 es : "+Auto1.Km);
        
          
        /*              Salida
        run:
            El color del Auto0 es : Rojo
            La Marca del Auto0 es : Mercedes
            El Kilometraje del Auto0 es : 0
            ***************************************
            El color del Auto1 es : Azul
            La Marca del Auto1 es : Audi
            El Kilometraje del Auto1 es : 10
        
            BUILD SUCCESSFUL (total time: 0 seconds)
       */
        
    }
    
}
