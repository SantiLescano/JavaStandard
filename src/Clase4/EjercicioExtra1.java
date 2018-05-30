
package Clase4;

import java.util.Arrays;


public class EjercicioExtra1 {

    
    public static void main(String[] args) {
         
        int original []={1002,104,309,500} ;
        int copia[]=new int [original.length];
        int copia2[]=new int [original.length];
        
        for(int i =0 ; i< original.length ; i++) {
            copia[i]=original[i];
            
        }
         System.out.println("son iguales?:" + Arrays.equals( original, copia ));              
         System.arraycopy(original,0, copia2 ,0, original.length);
         System.out.println("son iguales?:"+ Arrays.equals ( original, copia2));
         Arrays.sort(original);
         System.out.println("son iguales?:"+ Arrays.equals ( original, copia2));
         
        
    }
    
}
