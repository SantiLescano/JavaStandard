package clase3_for;

public class Ejercicio9 {

    /**
     * Imprimir la siguiente figura
     * @param args
     * @@@@@
     * @@@@
     * @@@
     * @@
     * @
     */
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i ;j--){
                System.out.print("@");
            }
            System.out.println();
        }     
        
    }
    
}
