
package Clase2switch;

import java.util.Scanner;

/**
 *
 * @author educacionit
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int n1,n2;
       int opcion;
       
       System.out.println("ingrese el primer numero: ");
       n1 = teclado.nextInt();
       
       System.out.println("Ingrese el segundo numero");
       n2=teclado.nextInt();
       
       System.out.println("ingrese operacion:\n +suma \n -resta \n *Multiplicacion \n /division");
       opcion = teclado.nextInt();
       switch(opcion){
           case 1 :
       {
           int n3;
           System.out.println("Resultado: " + (n1+n2));
       }
               break;
               
           case 2 : 
               System.out.println("Resultado: " + (n1-n2));
              break;
              
           case 3 :
               System.out.println("Resultado: " + (n1*n2));
               break;
               
           case 4:
               System.out.println("Resultado: " + (n1/n2));
              
       }
               
    }
    
}


