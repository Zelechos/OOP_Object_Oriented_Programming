/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/POO_Programacion_Orientada_A_Objetos
 */
package MetodoConstructor;

import java.util.Scanner;

public class Programador {
    
    
    //Atributos
    Scanner Input;
    Programador Instance;
    String Nombre , Apellido , Nivel_de_Experiencia , Tipo_de_Programador,Tecnologias[];
    int Edad , Años_de_Experiencia;
    
    //El Primer metodo que se suele crear es el Metodo Constructor que en ocasiones puede se mas de uno
    
    //Metodo Constructor
    /*Como los dije con anterioridad puede haber mas de un metodo constructor en una clase en este caso creare dos
    - el primer metodo constructor se centrar en solo recivir los datos esenciales del Programador en este caso
    su Nombre, Apellido, Edad y nada mas. 
    - el segundo metodo constructor tendra los datos esenciales ademas de Años_de_Experiencia,Nivel_de_Experiencia , Tipo_de_Programador
    que son los datos que se necesitan para ver si cumple con los requisitos minimos de la oferta laboral de la empresa
    - el tercer metodo constructor tendra solo los datos requeridos para la entrevista tecnica como:
    Tecnologias ,Nivel_de_Experiencia , Tipo_de_Programador, Años_de_Experiencia y nada mas 
    */
    public Programador(){
        
    }
    
    //Primer Metodo Constructor de Datos esenciales
    public Programador(String Nombre ,  String Apellido , int Edad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;

    }
    
    //Segundo Metodo Constructor Con los datos para ver si cumple los requisitos
    public Programador(String Nombre , String Apellido, String Tipo_de_Programador , String[] Tecnologias, int Edad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Tipo_de_Programador = Tipo_de_Programador;
        this.Tecnologias = Tecnologias;
        this.Edad = Edad;

    }
    

    //Tercer Metodo Constructor de Datos que sirven para la entrevistea tecnica
    public Programador(String[] Tecnologias ,String Nivel_de_Experiencia ,String Tipo_de_Programador,int Años_de_Experiencia){
        this.Tecnologias = Tecnologias;
        this.Tipo_de_Programador = Tipo_de_Programador;
        this.Nivel_de_Experiencia = Nivel_de_Experiencia;
        this.Años_de_Experiencia = Años_de_Experiencia;
    }


    //Metodos
      public  void PedirDataC1(){
        Input = new Scanner(System.in);
        
        System.out.print("Introduzca su Nombre : ");
        Nombre = Input.nextLine();
        System.out.print("Introduzca su Apellido : ");
        Apellido = Input.nextLine();
        System.out.print("Introduzca su Edad : ");
        Edad = Input.nextInt();
        
        Instance = new Programador(Nombre, Apellido, Edad);
        Instance.DataC1();
    }
    
    public void PedirDataC2(){
        Input = new Scanner(System.in);
        
        System.out.print("Introduzca su Nombre : ");
        Nombre = Input.nextLine();
        System.out.print("Introduzca su Apellido : ");
        Apellido = Input.nextLine();
        System.out.print("Introduzca su que Tipo de Programador es : ");
        Tipo_de_Programador = Input.nextLine();
        //Creamos un Bucle for para llenar nuestro array de Tecnologias
        System.out.println("Digite 5 Tecnologias en las que esta especializado : ");
        for(int Rango = 0; Rango < Tecnologias.length; Rango++ ){
            System.out.print("Tecnologia "+(Rango+1)+" : ");
            Tecnologias[Rango] = Input.nextLine();
        }
        System.out.print("Introduzca su Edad : ");
        Edad = Input.nextInt();
        
       Instance = new Programador(Nombre, Apellido, Tipo_de_Programador, Tecnologias, Edad);
       Instance.DataC2();


    }
    
    
    
    public void PedirDataC3(){
        Input = new Scanner(System.in);
        
        System.out.print("Introduzca su Tipo de Programador es : ");
        Tipo_de_Programador = Input.nextLine();
        
        //Creamos un Bucle for para llenar nuestro array de Tecnologias
        System.out.print("Digite 5 Tecnologias en las que esta especializado : ");
        for(int Rango = 0; Rango < Tecnologias.length; Rango++ ){
            System.out.println("Tecnologia "+(Rango+1)+" : ");
            Tecnologias[Rango] = Input.nextLine();
        }
        
        System.out.print("Introduzca su Nivel de Experiencia: ");
        Nivel_de_Experiencia = Input.nextLine();
        System.out.print("Introduzca su Apellido : ");
        Apellido = Input.nextLine();
        System.out.print("Introduzca sus Años de Experiencia: ");
        Años_de_Experiencia = Input.nextInt();
        
        Instance = new Programador(Tecnologias, Nivel_de_Experiencia, Tipo_de_Programador, Años_de_Experiencia);
        Instance.DataC3();

    }
   
   
    
    
    
    //Metodo para Tranformar el array de tecnologias a Texto para mostrar 
    public String MostrarArray(String[] Tecnologias){
        String Texto = "";
        
        for(int Letras = 0; Letras < Tecnologias.length; Letras++){
            Texto += Tecnologias[Letras]+" , ";
        }
        return Texto;
    }
    
    
    public String DataC1(){
        return " Nombre : "+ Nombre +"\n Apellido : "+ Apellido +"\n Edad : "+ Edad ;
    }
    
    public String DataC2(){
        return " Nombre : "+ Nombre +"\n Apellido : "+ Apellido +"\n Tipo de Programador : "+ Tipo_de_Programador+ 
                "\n Tecnologias : "+ MostrarArray(Tecnologias)+"\n Edad : "+ Edad ;
    }
    
    public String DataC3(){
        return "Tipo de Programador : "+ Tipo_de_Programador+ "\n Tecnologias : "+MostrarArray(Tecnologias)+"\n Nivel de Experiencia : "+ Nivel_de_Experiencia +
                "\n Años de Experiencia : "+ Años_de_Experiencia;
    }
    
    

            
    
    
}
