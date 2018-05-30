package Clase4;

public class Ejercicio1Vectoress {

    public static void main(String[] args) {

        int numeros[] = {10, 20, 5, 15, 30, 20};
        int total = 0, maximo = numeros[0], minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("indice :  " + i + "valor : " + numeros[i]);

            total += numeros[i];
            
            if(numeros[i]>maximo){
                maximo=numeros[i];
            }
            else if(numeros[i]<minimo){
                minimo=numeros[i];
            }
            int cont = 0;
         if (numeros[i]==20)cont++;   
            

        
        System.out.println("el mayor es " + maximo );
        System.out.println("El total es "+ total);
        System.out.println("el 20 aparecio: " + cont + "veces");
        
        

    }

} }
