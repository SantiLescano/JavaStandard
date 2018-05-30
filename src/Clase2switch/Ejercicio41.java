
package Clase2switch;

import java.util.Scanner;

/**
 *
 * @author educacionit
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int n1,n2;
       char opcion;
       
       System.out.println("ingrese el primer numero: ");
       n1 = teclado.nextInt();
       
       System.out.println("Ingrese el segundo numero");
       n2=teclado.nextInt();
       
       System.out.println("ingrese operacion:\n +suma \n -resta \n *Multiplicacion \n /division");
       opcion = teclado.next().charAt(0);
       switch(opcion){
           case '+' :
       {
           int n3;
           System.out.println("Resultado: " + (n1+n2));
       }
               break;
               
           case '-' : 
               System.out.println("Resultado: " + (n1-n2));
              break;
              
           case '*' :
               System.out.println("Resultado: " + (n1*n2));
               break;
               
           case '/':
               System.out.println("Resultado: " + (n1/n2));
              
       }
               
    }
    
}


