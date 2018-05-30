/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3_for;

/**
 *
 * @author Win
 */
public class Ejercicio11Opc2 {

    /**
     * Imprimir la siguiente figura:
     * @@@@@
     * @@@
     * @
     * @@@
     * @@@@@
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 5; i >= -5; i -= 2) {
            if (i != -1) {
                for (int j = 1; j < Math.abs(i); j++) {
                    System.out.print("@");
                }
                System.out.println("@");
            }
        }
    }

}
