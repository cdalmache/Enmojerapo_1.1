/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.encapsumodujerarpoli;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class EncaModuJeraPoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto=new Scanner(System.in);
         System.out.print("INGRESE UN SISTEMA: ");
        String sistema=objeto.next();
        System.out.print("INGRESE EL OBJETO: ");
        String pieza=objeto.next();        
        System.out.print("INGRESE EL TIPO DE OBJETO: ");
        String tipo=objeto.next();      
        System.out.println("INGRESE LOS REQUERIMIENTO FUNCIONALES:");
            String requerimiento=objeto.next();              
            String requerimiento2=objeto.next();               
            String requerimiento3=objeto.next();                  
            String requerimiento4=objeto.next();
        System.out.println("INGRESE LAS FUNCIONES: ");
            String fun1=objeto.next();
            String frequerimiento=objeto.next();           
            String fun2=objeto.next();
            String frequerimiento2=objeto.next();               
            String fun3=objeto.next();
            String frequerimiento3=objeto.next();                  
            String fun4=objeto.next();
            String frequerimiento4=objeto.next();
        System.out.println("INGRESE LOS MODULOS: ");  
        String modulo1=objeto.next();
        String modulo2=objeto.next();
        String modulo3=objeto.next(); 
        
        System.out.println("TABLA DE ENCAPSULAMIENTO: ");
         System.out.println("SU SISTEMA ES : "+sistema);
        System.out.println("OBJETO.......ATRIBUTOS.............FUNCIONES");
        System.out.print(""+pieza);
        System.out.print("_____1.-"+requerimiento);
        System.out.print("______"+fun1);
        System.out.println(" "+frequerimiento);
        System.out.print("_________2. "+requerimiento2);
        System.out.print("_________2.-"+fun2);
        System.out.println(" "+frequerimiento2);
        System.out.print("_________3. "+requerimiento3);
        System.out.print("_________3.-"+fun3);
        System.out.println(" "+frequerimiento3);
        System.out.print("_________4. "+requerimiento4);
        System.out.print("_________4.-"+fun4);
        System.out.println(" "+frequerimiento4);              
          
        System.out.println("SUS MODULOS SON : ");
         System.out.println("1.- "+modulo1);
         System.out.println("2.- "+modulo2);
         System.out.println("3.- "+modulo3);
        
    }
    
}
