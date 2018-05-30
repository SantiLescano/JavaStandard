
package bonus;

import java.text.DecimalFormat;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("#.oo");
        
        
        int euro = 1 ;
        while(euro<=10) {
            System.out.println(euro+" euros = " + df.format (euro * 24.5) + " pesos ");
            euro++;
        }
    }
    
}
